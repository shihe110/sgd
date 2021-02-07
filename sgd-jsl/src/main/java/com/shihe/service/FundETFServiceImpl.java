package com.shihe.service;

import com.shihe.mapper.FundETFMapper;
import com.shihe.pojo.FundETF;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName FundETFServiceImpl
 * @Description TODO
 * @Author admin
 * @Date 2021-02-07 9:59
 * @Version 1.0
 */
@Service
public class FundETFServiceImpl implements FundETFService{

    @Autowired
    private FundETFMapper fundETFMapper;

    @Override
    public void add(FundETF etf) {
        fundETFMapper.add(etf);
    }
}
