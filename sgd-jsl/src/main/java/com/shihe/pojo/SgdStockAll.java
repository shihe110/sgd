package com.shihe.pojo;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author shihe
 * @since 2021-02-19
 */
public class SgdStockAll extends Model<SgdStockAll> {

    private static final long serialVersionUID = 1L;

    /**
     * 股票代码
     */
    private String sCode;

    /**
     * 股票名称
     */
    private String sName;

    /**
     * 市场sh-沪、sz-深
     */
    private String sMarket;

    /**
     * 板块
     */
    private String sType;

    /**
     * 数据时间
     */
    private LocalDate sDate;


    public String getsCode() {
        return sCode;
    }

    public void setsCode(String sCode) {
        this.sCode = sCode;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsMarket() {
        return sMarket;
    }

    public void setsMarket(String sMarket) {
        this.sMarket = sMarket;
    }

    public String getsType() {
        return sType;
    }

    public void setsType(String sType) {
        this.sType = sType;
    }

    public LocalDate getsDate() {
        return sDate;
    }

    public void setsDate(LocalDate sDate) {
        this.sDate = sDate;
    }

    @Override
    protected Serializable pkVal() {
        return this.sCode;
    }

    @Override
    public String toString() {
        return "SgdStockAll{" +
        "sCode=" + sCode +
        ", sName=" + sName +
        ", sMarket=" + sMarket +
        ", sType=" + sType +
        ", sDate=" + sDate +
        "}";
    }
}
