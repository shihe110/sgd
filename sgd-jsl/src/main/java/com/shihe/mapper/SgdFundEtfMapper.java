package com.shihe.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shihe.pojo.SgdFundEtf;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author shihe
 * @since 2021-02-07
 */
public interface SgdFundEtfMapper extends BaseMapper<SgdFundEtf> {

    List<SgdFundEtf> orderByPeList(@Param("orderKey") String orderKey);
}
