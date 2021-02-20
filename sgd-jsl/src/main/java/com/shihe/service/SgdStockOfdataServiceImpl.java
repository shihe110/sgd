package com.shihe.service;

import com.shihe.pojo.SgdStockOfdata;
import com.shihe.mapper.SgdStockOfdataMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author shihe
 * @since 2021-02-20
 */
@Service
public class SgdStockOfdataServiceImpl extends ServiceImpl<SgdStockOfdataMapper, SgdStockOfdata> implements ISgdStockOfdataService {

    @Autowired
    private SgdStockOfdataMapper sgdStockOfdataMapper;

    @Override
    public List<SgdStockOfdata> getStocksOfMine() {
        List<SgdStockOfdata> list = sgdStockOfdataMapper.getStockOfMine();
        return list;
    }
}
