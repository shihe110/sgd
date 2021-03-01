package com.shihe.service;

import com.shihe.pojo.SgdStockOfdata;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author shihe
 * @since 2021-02-20
 */
public interface ISgdStockOfdataService extends IService<SgdStockOfdata> {

    List<SgdStockOfdata> getStocksOfMine();

    List<SgdStockOfdata> listOfMyStocks(List<String> cs);
}
