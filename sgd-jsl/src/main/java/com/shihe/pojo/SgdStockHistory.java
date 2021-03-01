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
 * @since 2021-02-24
 */
public class SgdStockHistory extends Model<SgdStockHistory> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private String id;

    /**
     * 日期
     */
    private LocalDate sDate;

    /**
     * 代码
     */
    private String sCode;

    /**
     * 开盘
     */
    private Double priceOpen;

    /**
     * 最高
     */
    private Double priceTop;

    /**
     * 最低
     */
    private Double priceLow;

    /**
     * 收盘
     */
    private Double priceClose;

    /**
     * 成交量
     */
    private String dealAmount;

    /**
     * 成交额
     */
    private String dealNum;

    /**
     * 涨跌额
     */
    private String incre;

    /**
     * 涨幅
     */
    private String increRt;

    /**
     * 缩
     */
    private String suo;

    /**
     * 高低差
     */
    private String hiLow;

    /**
     * 指数
     */
    private String marketIndex;

    /**
     * 市场涨跌
     */
    private String marketIncr;

    /**
     * userid
     */
    private String userId;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getsDate() {
        return sDate;
    }

    public void setsDate(LocalDate sDate) {
        this.sDate = sDate;
    }

    public String getsCode() {
        return sCode;
    }

    public void setsCode(String sCode) {
        this.sCode = sCode;
    }

    public Double getPriceOpen() {
        return priceOpen;
    }

    public void setPriceOpen(Double priceOpen) {
        this.priceOpen = priceOpen;
    }

    public Double getPriceTop() {
        return priceTop;
    }

    public void setPriceTop(Double priceTop) {
        this.priceTop = priceTop;
    }

    public Double getPriceLow() {
        return priceLow;
    }

    public void setPriceLow(Double priceLow) {
        this.priceLow = priceLow;
    }

    public Double getPriceClose() {
        return priceClose;
    }

    public void setPriceClose(Double priceClose) {
        this.priceClose = priceClose;
    }

    public String getDealAmount() {
        return dealAmount;
    }

    public void setDealAmount(String dealAmount) {
        this.dealAmount = dealAmount;
    }

    public String getDealNum() {
        return dealNum;
    }

    public void setDealNum(String dealNum) {
        this.dealNum = dealNum;
    }

    public String getIncre() {
        return incre;
    }

    public void setIncre(String incre) {
        this.incre = incre;
    }

    public String getIncreRt() {
        return increRt;
    }

    public void setIncreRt(String increRt) {
        this.increRt = increRt;
    }

    public String getSuo() {
        return suo;
    }

    public void setSuo(String suo) {
        this.suo = suo;
    }

    public String getHiLow() {
        return hiLow;
    }

    public void setHiLow(String hiLow) {
        this.hiLow = hiLow;
    }

    public String getMarketIndex() {
        return marketIndex;
    }

    public void setMarketIndex(String marketIndex) {
        this.marketIndex = marketIndex;
    }

    public String getMarketIncr() {
        return marketIncr;
    }

    public void setMarketIncr(String marketIncr) {
        this.marketIncr = marketIncr;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "SgdStockHistory{" +
        "id=" + id +
        ", sDate=" + sDate +
        ", sCode=" + sCode +
        ", priceOpen=" + priceOpen +
        ", priceTop=" + priceTop +
        ", priceLow=" + priceLow +
        ", priceClose=" + priceClose +
        ", dealAmount=" + dealAmount +
        ", dealNum=" + dealNum +
        ", incre=" + incre +
        ", increRt=" + increRt +
        ", suo=" + suo +
        ", hiLow=" + hiLow +
        ", marketIndex=" + marketIndex +
        ", marketIncr=" + marketIncr +
        ", userId=" + userId +
        "}";
    }
}
