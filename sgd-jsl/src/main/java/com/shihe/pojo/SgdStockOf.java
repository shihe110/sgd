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
public class SgdStockOf extends Model<SgdStockOf> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private String id;

    /**
     * 用户id
     */
    private String userId;

    /**
     * 股票代码
     */
    private String sCode;

    /**
     * 自选时间
     */
    private LocalDate sDate;

    /**
     * 沪深
     * @return
     */
    private String sMarket;

    public String getsMarket() {
        return sMarket;
    }

    public void setsMarket(String sMarket) {
        this.sMarket = sMarket;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getsCode() {
        return sCode;
    }

    public void setsCode(String sCode) {
        this.sCode = sCode;
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
        return "SgdStockOf{" +
        "id=" + id +
        ", userId=" + userId +
        ", sCode=" + sCode +
        ", sDate=" + sDate +
        ", sMarket=" + sMarket +
        "}";
    }
}
