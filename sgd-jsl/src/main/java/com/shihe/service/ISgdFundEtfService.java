package com.shihe.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shihe.pojo.SgdFundEtf;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author shihe
 * @since 2021-02-07
 */
public interface ISgdFundEtfService extends IService<SgdFundEtf> {

    List<SgdFundEtf> orderByPeList(String desc);
}
