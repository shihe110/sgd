package com.shihe.pojo;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author shihe
 * @since 2021-02-07
 */
public class SgdFundEtf extends Model<SgdFundEtf> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String id;

    /**
     * 基金id
     */
    private String fundId;

    /**
     * 基金名称
     */
    private String fundNm;

    /**
     * 追踪指数
     */
    private String indexId;

    /**
     * 托管费
     */
    private String fee;

    /**
     * 管理费
     */
    private String mFee;

    /**
     * 委托费
     */
    private String tFee;

    /**
     * 最小申赎-万份
     */
    private Integer creationUnit;

    /**
     * 基金公司
     */
    private String issuerNm;

    /**
     * 基金网址
     */
    private String urls;

    /**
     * eval_flg
     */
    private String evalFlg;

    /**
     * 份额-万份
     */
    private Long amount;

    /**
     * 规模-亿
     */
    private String unitTotal;

    /**
     * 规模变化-亿
     */
    private String unitIncr;

    /**
     * 现价
     */
    private String price;

    /**
     * 成交额-万
     */
    private String volume;

    /**
     * 时间
     */
    private Date lastDt;

    /**
     * 收盘时间
     */
    private String lastTime;

    /**
     * 涨幅
     */
    private String increaseRt;

    /**
     * 估值
     */
    private String estimateValue;

    /**
     * 最后估值时间
     */
    private String lastEstTime;

    /**
     * 溢价率
     */
    private String discountRt;

    /**
     * 净值
     */
    private String fundNav;

    /**
     * 净值日期
     */
    private Date navDt;

    /**
     * 追踪指数名称
     */
    private String indexNm;

    /**
     * 指数涨幅
     */
    private String indexIncreaseRt;

    /**
     * PE
     */
    private String pe;

    /**
     * PB
     */
    private String pb;

    /**
     * etf价格时间
     */
    private Date idxPriceDt;

    /**
     * owned
     */
    private Integer owned;

    /**
     * holded
     */
    private Integer holded;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFundId() {
        return fundId;
    }

    public void setFundId(String fundId) {
        this.fundId = fundId;
    }

    public String getFundNm() {
        return fundNm;
    }

    public void setFundNm(String fundNm) {
        this.fundNm = fundNm;
    }

    public String getIndexId() {
        return indexId;
    }

    public void setIndexId(String indexId) {
        this.indexId = indexId;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public String getmFee() {
        return mFee;
    }

    public void setmFee(String mFee) {
        this.mFee = mFee;
    }

    public String gettFee() {
        return tFee;
    }

    public void settFee(String tFee) {
        this.tFee = tFee;
    }

    public Integer getCreationUnit() {
        return creationUnit;
    }

    public void setCreationUnit(Integer creationUnit) {
        this.creationUnit = creationUnit;
    }

    public String getIssuerNm() {
        return issuerNm;
    }

    public void setIssuerNm(String issuerNm) {
        this.issuerNm = issuerNm;
    }

    public String getUrls() {
        return urls;
    }

    public void setUrls(String urls) {
        this.urls = urls;
    }

    public String getEvalFlg() {
        return evalFlg;
    }

    public void setEvalFlg(String evalFlg) {
        this.evalFlg = evalFlg;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getUnitTotal() {
        return unitTotal;
    }

    public void setUnitTotal(String unitTotal) {
        this.unitTotal = unitTotal;
    }

    public String getUnitIncr() {
        return unitIncr;
    }

    public void setUnitIncr(String unitIncr) {
        this.unitIncr = unitIncr;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public Date getLastDt() {
        return lastDt;
    }

    public void setLastDt(Date lastDt) {
        this.lastDt = lastDt;
    }

    public void setNavDt(Date navDt) {
        this.navDt = navDt;
    }

    public void setIdxPriceDt(Date idxPriceDt) {
        this.idxPriceDt = idxPriceDt;
    }

    public String getLastTime() {
        return lastTime;
    }

    public void setLastTime(String lastTime) {
        this.lastTime = lastTime;
    }

    public String getIncreaseRt() {
        return increaseRt;
    }

    public void setIncreaseRt(String increaseRt) {
        this.increaseRt = increaseRt;
    }

    public String getEstimateValue() {
        return estimateValue;
    }

    public void setEstimateValue(String estimateValue) {
        this.estimateValue = estimateValue;
    }

    public String getLastEstTime() {
        return lastEstTime;
    }

    public void setLastEstTime(String lastEstTime) {
        this.lastEstTime = lastEstTime;
    }

    public String getDiscountRt() {
        return discountRt;
    }

    public void setDiscountRt(String discountRt) {
        this.discountRt = discountRt;
    }

    public String getFundNav() {
        return fundNav;
    }

    public void setFundNav(String fundNav) {
        this.fundNav = fundNav;
    }

    public String getIndexNm() {
        return indexNm;
    }

    public void setIndexNm(String indexNm) {
        this.indexNm = indexNm;
    }

    public String getIndexIncreaseRt() {
        return indexIncreaseRt;
    }

    public void setIndexIncreaseRt(String indexIncreaseRt) {
        this.indexIncreaseRt = indexIncreaseRt;
    }

    public String getPe() {
        return pe;
    }

    public void setPe(String pe) {
        this.pe = pe;
    }

    public String getPb() {
        return pb;
    }

    public void setPb(String pb) {
        this.pb = pb;
    }

    public Integer getOwned() {
        return owned;
    }

    public void setOwned(Integer owned) {
        this.owned = owned;
    }

    public Integer getHolded() {
        return holded;
    }

    public void setHolded(Integer holded) {
        this.holded = holded;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Date getNavDt() {
        return navDt;
    }

    public Date getIdxPriceDt() {
        return idxPriceDt;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "SgdFundEtf{" +
        "id=" + id +
        ", fundId=" + fundId +
        ", fundNm=" + fundNm +
        ", indexId=" + indexId +
        ", fee=" + fee +
        ", mFee=" + mFee +
        ", tFee=" + tFee +
        ", creationUnit=" + creationUnit +
        ", issuerNm=" + issuerNm +
        ", urls=" + urls +
        ", evalFlg=" + evalFlg +
        ", amount=" + amount +
        ", unitTotal=" + unitTotal +
        ", unitIncr=" + unitIncr +
        ", price=" + price +
        ", volume=" + volume +
        ", lastDt=" + lastDt +
        ", lastTime=" + lastTime +
        ", increaseRt=" + increaseRt +
        ", estimateValue=" + estimateValue +
        ", lastEstTime=" + lastEstTime +
        ", discountRt=" + discountRt +
        ", fundNav=" + fundNav +
        ", navDt=" + navDt +
        ", indexNm=" + indexNm +
        ", indexIncreaseRt=" + indexIncreaseRt +
        ", pe=" + pe +
        ", pb=" + pb +
        ", idxPriceDt=" + idxPriceDt +
        ", owned=" + owned +
        ", holded=" + holded +
        "}";
    }
}
