package com.shihe.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shihe.mapper.SgdFundEtfMapper;
import com.shihe.pojo.SgdFundEtf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author shihe
 * @since 2021-02-07
 */
@Service
public class SgdFundEtfServiceImpl extends ServiceImpl<SgdFundEtfMapper, SgdFundEtf> implements ISgdFundEtfService {

    @Autowired
    private SgdFundEtfMapper sgdFundEtfMapper;

    @Override
    public List<SgdFundEtf> orderByPeList(String orderKey) {
        List<SgdFundEtf> orderlist = sgdFundEtfMapper.orderByPeList(orderKey);
        return orderlist;
    }
}
