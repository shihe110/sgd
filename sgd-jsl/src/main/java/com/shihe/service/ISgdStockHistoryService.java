package com.shihe.service;

import com.shihe.pojo.SgdStockHistory;
import com.baomidou.mybatisplus.extension.service.IService;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author shihe
 * @since 2021-02-24
 */
public interface ISgdStockHistoryService extends IService<SgdStockHistory> {

    String getResult(List<String> stocks) throws IOException;
}
