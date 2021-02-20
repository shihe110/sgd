package com.shihe.mapper;

import com.shihe.pojo.SgdStockOfdata;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author shihe
 * @since 2021-02-20
 */
public interface SgdStockOfdataMapper extends BaseMapper<SgdStockOfdata> {

    List<SgdStockOfdata> getStockOfMine();
}
