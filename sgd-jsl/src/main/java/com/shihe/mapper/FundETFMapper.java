package com.shihe.mapper;

import com.shihe.pojo.FundETF;
import org.apache.ibatis.annotations.Mapper;

/**
 * @InterfaceName FundETFMapper
 * @Description TODO
 * @Author admin
 * @Date 2021-02-07 9:59
 * @Version 1.0
 */
@Mapper
public interface FundETFMapper {
    void add(FundETF etf);
}
