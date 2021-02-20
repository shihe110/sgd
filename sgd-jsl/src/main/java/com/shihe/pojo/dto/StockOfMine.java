package com.shihe.pojo.dto;

import java.time.LocalDate;
import java.util.Date;

/**
 * @ClassName StockOfMine
 * @Description TODO
 * @Author admin
 * @Date 2021-02-20 17:17
 * @Version 1.0
 */
public class StockOfMine {
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
     * 现价
     */
    private String price;

    /**
     * 日期
     */
    private Date sDate;
    /**
     * 涨幅
     */
    private String priceRise;

    public StockOfMine() {
    }

    public StockOfMine(String id, String sCode, String sName, String price, Date sDate, String priceRise) {
        this.id = id;
        this.sCode = sCode;
        this.sName = sName;
        this.price = price;
        this.sDate = sDate;
        this.priceRise = priceRise;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Date getsDate() {
        return sDate;
    }

    public void setsDate(Date sDate) {
        this.sDate = sDate;
    }

    public String getPriceRise() {
        return priceRise;
    }

    public void setPriceRise(String priceRise) {
        this.priceRise = priceRise;
    }
}
