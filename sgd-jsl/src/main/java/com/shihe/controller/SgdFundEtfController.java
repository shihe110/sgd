package com.shihe.controller;


import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.shihe.pojo.SgdFundEtf;
import com.shihe.pojo.SgdIndexEtf;
import com.shihe.service.ISgdFundEtfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.List;
import java.util.UUID;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author shihe
 * @since 2021-02-07
 */
@Controller
@RequestMapping("/sgdFundEtf")
public class SgdFundEtfController {

    @Autowired
    private ISgdFundEtfService iSgdFundEtfService;

    @RequestMapping("/hello1")
    public String hello(){
        return "/hello";
    }

    @RequestMapping("/hello2")
    public ModelAndView hello2(){

        ModelAndView mv = new ModelAndView();
        mv.setViewName("/hello");

        return mv;
    }

    @RequestMapping({"/","/index"})
    @ResponseBody
    public List<SgdFundEtf> index(){
        List<SgdFundEtf> sgdFundEtfs = iSgdFundEtfService.list();
        return sgdFundEtfs;
    }
    @RequestMapping("/pe")
    @ResponseBody
    public List<SgdFundEtf> orderByPe(String orderKey){
        List<SgdFundEtf> sgdFundEtfs = iSgdFundEtfService.orderByPeList(orderKey);
        return sgdFundEtfs;
    }
    @RequestMapping("/fundEtfList")
    public ModelAndView etfList(Page p){
        IPage<SgdFundEtf> page = iSgdFundEtfService.page(new Page<>(1, 100));
        List<SgdFundEtf> list = page.getRecords();
        ModelAndView mv = new ModelAndView("/fundEtf/list");
        mv.addObject("list",list)
        .addObject("curPage",1)
        .addObject("pageSize",100);
        return mv;
    }

    @RequestMapping("/editor")
    public ModelAndView editor(){
        IPage<SgdFundEtf> page = iSgdFundEtfService.page(new Page<>(1, 100));
        List<SgdFundEtf> list = page.getRecords();
        ModelAndView mv = new ModelAndView("/editor/editormd");
        mv.addObject("list",list)
                .addObject("curPage",1)
                .addObject("pageSize",100);
        return mv;
    }


    //博客图片上传问题
    @RequestMapping("/file/upload")
    @ResponseBody
    public JSONObject fileUpload(@RequestParam(value = "editormd-image-file", required = true) MultipartFile file, HttpServletRequest request) throws IOException {
        //上传路径保存设置

        //获得SpringBoot当前项目的路径：System.getProperty("user.dir")
        String path = System.getProperty("user.dir") + "/upload/";

        //按照月份进行分类：
        Calendar instance = Calendar.getInstance();
        String month = (instance.get(Calendar.MONTH) + 1) + "月";
        path = path + month;

        File realPath = new File(path);
        if (!realPath.exists()) {
            realPath.mkdirs();
        }

        //上传文件地址
        System.out.println("上传文件保存地址：" + realPath);

        //解决文件名字问题：我们使用uuid;
        String filename = "pg-" + UUID.randomUUID().toString().replaceAll("-", "") + ".jpg";
        File newfile = new File(realPath, filename);
        //通过CommonsMultipartFile的方法直接写文件（注意这个时候）
        file.transferTo(newfile);

        //给editormd进行回调
        JSONObject res = new JSONObject();
        res.put("url", "/upload/" + month + "/" + filename);
        res.put("success", 1);
        res.put("message", "upload success!");

        return res;
    }

    public static void main(String[] args) {
        String a = "风湖里、光湖里、照湖里、学湖里、景湖里、馨达园、府湖里、金杭大厦、时代公寓、龙兴里、美湖里、照湖西里、龙腾里\n" +
                "长治里小学==、兴业家园、长江里、临江里、长治里、怀安西里、英俊名邸、鼎域名邸、长宁里、苏堤东里、苏堤公寓、民建北里、春晓花园、金潭花园、苏堤西里、民建里、星澜园、永川里\n" +
                "义兴里小学==、义兴里、义兴南里、西湖里1-6号楼及楼下所有平房、花港里1-8号楼、9-12号楼、平湖东里、平湖西里、兴泰北里、兴泰南里\n" +
                "南开小学==、三潭东里、航天北里、卧龙南里、风荷园、荣迁东里、荣迁西里、卧龙北里、龙井里、飞云东里、风荷东园、南丰里、馨名园、星环里、华章里、天环里、深蓝公寓、白堤东里、地环里、月环里、三潭西里、日环里、万维花园、苏堤东里、卧龙东里、西冷里、翠峰里、学府花园、清新园、兴泰园、航宇公寓、华鹊里、石化楼、食品楼\n" +
                "宜宾里小学==、雅安东里、宜宾东里、沱江里、禧顺花园、云龙里、泊江东里、桂荷园、博雅轩人才公寓、会泽园、康定里、宜宾西里、咸阳南里、祥平园、宜宾北里、雅江里、赛德广场、长虹楼、云龙南里、东川里、清江里\n" +
                "川府里小学==、景园里、莲安里、川北里、易川里、晴川花园、泾水园、田川里、貌川里、西昌里、川南里、川南公寓、金川西里、乐至里、汶川里、昔阳东里、昔阳南里、雅川家园、川东里、园川里、昔阳里、金川里、宁强里、雅庭苑、正阳里、洪雅里、沐川里\n" +
                "师大南开附小==、雅安西里、罗江西里、嘉陵东里、云阳西里、金平东里、南江东里、咸阳北里、南江西里、嘉陵南里、云阳东里、罗江东里、嘉陵北里、江安里、长江公寓\n" +
                "华宁道小学==、华宁南里1-22号楼、华宁北里1-20号楼、横江里1-12号楼、盈江里1-20号楼、楚雄道8号院、盈江西里1-14号楼、瑞丽园1-21号楼\n" +
                "华夏小学==、金环里、盈江东里、美丽心殿、金冠里、晋宁北里、昌宁北里、昌宁南里、堤北里、淦江东里、淦江西里、保山南里、堤南里、金典花园、堤中里、金宇里、云轩公寓、龙川里、保山北里、翰雅园、金杰里、金云里、隆鹏园、龙陵里、塞纳公馆";
        String[] split = a.split("、");
        for (String s : split) {
            System.out.println(s);
        }

    }

}

