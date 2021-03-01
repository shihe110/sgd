package com.shihe.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author shihe
 * @since 2021-02-08
 */
public class SgdStock extends Model<SgdStock> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 股票代码
     */
    private String stockCode;

    /**
     * 股票名称
     */
    private String stockName;

    /**
     * 东财网址
     */
    private String website;

    /**
     * 资金流
     */
    private String moneyFlow;

    /**
     * 资金流网址
     */
    private String moneyFlowWebsite;

    /**
     * 数据
     */
    private String stockData;

    /**
     * 数据网址
     */
    private String stockDataWebsite;

    /**
     * 最新价
     */
    private Double lastPrice;

    /**
     * 涨跌幅
     */
    private String upDownRange;

    /**
     * 涨跌额
     */
    private Double upDownNum;

    /**
     * 成交量-万手
     */
    private String dealAmount;

    /**
     * 成交额-亿
     */
    private String dealMoney;

    /**
     * 振幅
     */
    private String amplitude;

    /**
     * 最高
     */
    private Double top;

    /**
     * 最低
     */
    private Double low;

    /**
     * 今收
     */
    private Double todayPrice;

    /**
     * 昨收
     */
    private Double yesPrice;

    /**
     * 换手率
     */
    private String changeRt;

    /**
     * 动态市盈率
     */
    private Double pe;

    /**
     * 总市值
     */
    private String totalMaketValue;

    /**
     * 日期
     */
    private LocalDate importDate;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getMoneyFlow() {
        return moneyFlow;
    }

    public void setMoneyFlow(String moneyFlow) {
        this.moneyFlow = moneyFlow;
    }

    public String getMoneyFlowWebsite() {
        return moneyFlowWebsite;
    }

    public void setMoneyFlowWebsite(String moneyFlowWebsite) {
        this.moneyFlowWebsite = moneyFlowWebsite;
    }

    public String getStockData() {
        return stockData;
    }

    public void setStockData(String stockData) {
        this.stockData = stockData;
    }

    public String getStockDataWebsite() {
        return stockDataWebsite;
    }

    public void setStockDataWebsite(String stockDataWebsite) {
        this.stockDataWebsite = stockDataWebsite;
    }

    public Double getLastPrice() {
        return lastPrice;
    }

    public void setLastPrice(Double lastPrice) {
        this.lastPrice = lastPrice;
    }

    public String getUpDownRange() {
        return upDownRange;
    }

    public void setUpDownRange(String upDownRange) {
        this.upDownRange = upDownRange;
    }

    public Double getUpDownNum() {
        return upDownNum;
    }

    public void setUpDownNum(Double upDownNum) {
        this.upDownNum = upDownNum;
    }

    public String getDealAmount() {
        return dealAmount;
    }

    public void setDealAmount(String dealAmount) {
        this.dealAmount = dealAmount;
    }

    public String getDealMoney() {
        return dealMoney;
    }

    public void setDealMoney(String dealMoney) {
        this.dealMoney = dealMoney;
    }

    public String getAmplitude() {
        return amplitude;
    }

    public void setAmplitude(String amplitude) {
        this.amplitude = amplitude;
    }

    public Double getTop() {
        return top;
    }

    public void setTop(Double top) {
        this.top = top;
    }

    public Double getLow() {
        return low;
    }

    public void setLow(Double low) {
        this.low = low;
    }

    public Double getTodayPrice() {
        return todayPrice;
    }

    public void setTodayPrice(Double todayPrice) {
        this.todayPrice = todayPrice;
    }

    public Double getYesPrice() {
        return yesPrice;
    }

    public void setYesPrice(Double yesPrice) {
        this.yesPrice = yesPrice;
    }

    public String getChangeRt() {
        return changeRt;
    }

    public void setChangeRt(String changeRt) {
        this.changeRt = changeRt;
    }

    public Double getPe() {
        return pe;
    }

    public void setPe(Double pe) {
        this.pe = pe;
    }

    public String getTotalMaketValue() {
        return totalMaketValue;
    }

    public void setTotalMaketValue(String totalMaketValue) {
        this.totalMaketValue = totalMaketValue;
    }

    public LocalDate getImportDate() {
        return importDate;
    }

    public void setImportDate(LocalDate importDate) {
        this.importDate = importDate;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "SgdStock{" +
        "id=" + id +
        ", stockCode=" + stockCode +
        ", stockName=" + stockName +
        ", website=" + website +
        ", moneyFlow=" + moneyFlow +
        ", moneyFlowWebsite=" + moneyFlowWebsite +
        ", stockData=" + stockData +
        ", stockDataWebsite=" + stockDataWebsite +
        ", lastPrice=" + lastPrice +
        ", upDownRange=" + upDownRange +
        ", upDownNum=" + upDownNum +
        ", dealAmount=" + dealAmount +
        ", dealMoney=" + dealMoney +
        ", amplitude=" + amplitude +
        ", top=" + top +
        ", low=" + low +
        ", todayPrice=" + todayPrice +
        ", yesPrice=" + yesPrice +
        ", changeRt=" + changeRt +
        ", pe=" + pe +
        ", totalMaketValue=" + totalMaketValue +
        ", importDate=" + importDate +
        "}";
    }
}
