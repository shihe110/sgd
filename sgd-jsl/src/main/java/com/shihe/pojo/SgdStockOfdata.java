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
 * @since 2021-02-20
 */
public class SgdStockOfdata extends Model<SgdStockOfdata> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String id;

    /**
     * 代码
     */
    private String sCode;

    /**
     * 名称
     */
    private String sName;

    /**
     * 今开
     */
    private String priceJk;

    /**
     * 昨收
     */
    private String priceZs;

    /**
     * 现价
     */
    private String price;

    /**
     * 今最高
     */
    private String priceTop;

    /**
     * 今最低
     */
    private String priceLow;

    /**
     * 成交数量（股）
     */
    private String dealSnum;

    /**
     * 成交额（元）
     */
    private String dealMoney;

    /**
     * 日期
     */
    private LocalDate sDate;
    /**
     * 涨幅
     */
    private double priceRise;

    public double getPriceRise() {
        return priceRise;
    }

    public void setPriceRise(double priceRise) {
        this.priceRise = priceRise;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getPriceJk() {
        return priceJk;
    }

    public void setPriceJk(String priceJk) {
        this.priceJk = priceJk;
    }

    public String getPriceZs() {
        return priceZs;
    }

    public void setPriceZs(String priceZs) {
        this.priceZs = priceZs;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPriceTop() {
        return priceTop;
    }

    public void setPriceTop(String priceTop) {
        this.priceTop = priceTop;
    }

    public String getPriceLow() {
        return priceLow;
    }

    public void setPriceLow(String priceLow) {
        this.priceLow = priceLow;
    }

    public String getDealSnum() {
        return dealSnum;
    }

    public void setDealSnum(String dealSnum) {
        this.dealSnum = dealSnum;
    }

    public String getDealMoney() {
        return dealMoney;
    }

    public void setDealMoney(String dealMoney) {
        this.dealMoney = dealMoney;
    }

    public LocalDate getsDate() {
        return sDate;
    }

    public void setsDate(LocalDate sDate) {
        this.sDate = sDate;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "SgdStockOfdata{" +
        "id=" + id +
        ", sCode=" + sCode +
        ", sName=" + sName +
        ", priceJk=" + priceJk +
        ", priceZs=" + priceZs +
        ", price=" + price +
        ", priceTop=" + priceTop +
        ", priceLow=" + priceLow +
        ", dealSnum=" + dealSnum +
        ", dealMoney=" + dealMoney +
        ", sDate=" + sDate +
        ", priceRise=" + priceRise +
        "}";
    }
}
