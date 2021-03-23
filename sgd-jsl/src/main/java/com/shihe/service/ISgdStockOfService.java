package com.shihe.service;

import com.shihe.pojo.SgdStockOf;
import com.baomidou.mybatisplus.extension.service.IService;
import com.shihe.pojo.dto.StockPEG;

import java.io.IOException;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author shihe
 * @since 2021-02-19
 */
public interface ISgdStockOfService extends IService<SgdStockOf> {

    StockPEG getPeg(SgdStockOf code) throws IOException;
}
