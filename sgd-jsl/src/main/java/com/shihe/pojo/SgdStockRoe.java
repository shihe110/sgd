package com.shihe.pojo;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author shihe
 * @since 2021-02-10
 */
public class SgdStockRoe extends Model<SgdStockRoe> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private Integer id;

    /**
     * stock代码
     */
    private String sCode;

    /**
     * stock名称
     */
    private String sName;

    /**
     * 价格
     */
    private BigDecimal price;

    /**
     * 涨幅
     */
    private String increRange;

    /**
     * 成交额-万
     */
    private String deal;

    /**
     * 市值-亿
     */
    private BigDecimal mPrice;

    /**
     * PE-TTM
     */
    private String peTtm;

    /**
     * pe温度
     */
    private String peTemp;

    /**
     * pb
     */
    private String pb;

    /**
     * pb温度
     */
    private String pbTemp;

    /**
     * 五年平均股息率
     */
    private String stockRtFive;

    /**
     * 股息率TTM
     */
    private String stockRt;

    /**
     * 静态股息率
     */
    private String stockRtStatic;

    /**
     * 波动率
     */
    private String upLownRt;

    /**
     * 最新年报roe
     */
    private String roeLatest;

    /**
     * 5年平均
     */
    private String roeFive;

    /**
     * 5年营收复合增长
     */
    private String inFiveRt;

    /**
     * 5年利润复合增长
     */
    @TableField("Pro_five_rt")
    private String proFiveRt;

    /**
     * 5年现金流复合增长
     */
    private String moneyFiveRt;

    /**
     * 5年分红率复合增长
     */
    private String aFiveRt;

    /**
     * 净利润同比增长
     */
    @TableField("Net_profit")
    private String netProfit;

    /**
     * 有息负债率
     */
    private String liabilitiesRt;

    /**
     * 质押比例
     */
    private String pledgeRt;

    /**
     * 行业
     */
    private String industry;

    /**
     * 行业2
     */
    private String industryAnther;

    /**
     * 记录日期
     */
    private LocalDate tipYear;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getIncreRange() {
        return increRange;
    }

    public void setIncreRange(String increRange) {
        this.increRange = increRange;
    }

    public String getDeal() {
        return deal;
    }

    public void setDeal(String deal) {
        this.deal = deal;
    }

    public BigDecimal getmPrice() {
        return mPrice;
    }

    public void setmPrice(BigDecimal mPrice) {
        this.mPrice = mPrice;
    }

    public String getPeTtm() {
        return peTtm;
    }

    public void setPeTtm(String peTtm) {
        this.peTtm = peTtm;
    }

    public String getPeTemp() {
        return peTemp;
    }

    public void setPeTemp(String peTemp) {
        this.peTemp = peTemp;
    }

    public String getPb() {
        return pb;
    }

    public void setPb(String pb) {
        this.pb = pb;
    }

    public String getPbTemp() {
        return pbTemp;
    }

    public void setPbTemp(String pbTemp) {
        this.pbTemp = pbTemp;
    }

    public String getStockRtFive() {
        return stockRtFive;
    }

    public void setStockRtFive(String stockRtFive) {
        this.stockRtFive = stockRtFive;
    }

    public String getStockRt() {
        return stockRt;
    }

    public void setStockRt(String stockRt) {
        this.stockRt = stockRt;
    }

    public String getStockRtStatic() {
        return stockRtStatic;
    }

    public void setStockRtStatic(String stockRtStatic) {
        this.stockRtStatic = stockRtStatic;
    }

    public String getUpLownRt() {
        return upLownRt;
    }

    public void setUpLownRt(String upLownRt) {
        this.upLownRt = upLownRt;
    }

    public String getRoeLatest() {
        return roeLatest;
    }

    public void setRoeLatest(String roeLatest) {
        this.roeLatest = roeLatest;
    }

    public String getRoeFive() {
        return roeFive;
    }

    public void setRoeFive(String roeFive) {
        this.roeFive = roeFive;
    }

    public String getInFiveRt() {
        return inFiveRt;
    }

    public void setInFiveRt(String inFiveRt) {
        this.inFiveRt = inFiveRt;
    }

    public String getProFiveRt() {
        return proFiveRt;
    }

    public void setProFiveRt(String proFiveRt) {
        this.proFiveRt = proFiveRt;
    }

    public String getMoneyFiveRt() {
        return moneyFiveRt;
    }

    public void setMoneyFiveRt(String moneyFiveRt) {
        this.moneyFiveRt = moneyFiveRt;
    }

    public String getaFiveRt() {
        return aFiveRt;
    }

    public void setaFiveRt(String aFiveRt) {
        this.aFiveRt = aFiveRt;
    }

    public String getNetProfit() {
        return netProfit;
    }

    public void setNetProfit(String netProfit) {
        this.netProfit = netProfit;
    }

    public String getLiabilitiesRt() {
        return liabilitiesRt;
    }

    public void setLiabilitiesRt(String liabilitiesRt) {
        this.liabilitiesRt = liabilitiesRt;
    }

    public String getPledgeRt() {
        return pledgeRt;
    }

    public void setPledgeRt(String pledgeRt) {
        this.pledgeRt = pledgeRt;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getIndustryAnther() {
        return industryAnther;
    }

    public void setIndustryAnther(String industryAnther) {
        this.industryAnther = industryAnther;
    }

    public LocalDate getTipYear() {
        return tipYear;
    }

    public void setTipYear(LocalDate tipYear) {
        this.tipYear = tipYear;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "SgdStockRoe{" +
        "id=" + id +
        ", sCode=" + sCode +
        ", sName=" + sName +
        ", price=" + price +
        ", increRange=" + increRange +
        ", deal=" + deal +
        ", mPrice=" + mPrice +
        ", peTtm=" + peTtm +
        ", peTemp=" + peTemp +
        ", pb=" + pb +
        ", pbTemp=" + pbTemp +
        ", stockRtFive=" + stockRtFive +
        ", stockRt=" + stockRt +
        ", stockRtStatic=" + stockRtStatic +
        ", upLownRt=" + upLownRt +
        ", roeLatest=" + roeLatest +
        ", roeFive=" + roeFive +
        ", inFiveRt=" + inFiveRt +
        ", proFiveRt=" + proFiveRt +
        ", moneyFiveRt=" + moneyFiveRt +
        ", aFiveRt=" + aFiveRt +
        ", netProfit=" + netProfit +
        ", liabilitiesRt=" + liabilitiesRt +
        ", pledgeRt=" + pledgeRt +
        ", industry=" + industry +
        ", industryAnther=" + industryAnther +
        ", tipYear=" + tipYear +
        "}";
    }
}
