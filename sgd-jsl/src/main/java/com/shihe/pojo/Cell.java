/**
  * Copyright 2021 bejson.com 
  */
package com.shihe.pojo;
import java.util.Date;

/**
 * Auto-generated: 2021-02-04 17:36:32
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Cell {

    private String fund_id;
    private String fund_nm;
    private String index_id;
    private String fee;
    private String m_fee;
    private String t_fee;
    private int creation_unit;
    private String issuer_nm;
    private String urls;
    private String eval_flg;
    private long amount;
    private String unit_total;
    private String unit_incr;
    private String price;
    private String volume;
    private Date last_dt;
    private String last_time;
    private String increase_rt;
    private String estimate_value;
    private String last_est_time;
    private String discount_rt;
    private String fund_nav;
    private Date nav_dt;
    private String index_nm;
    private String index_increase_rt;
    private String pe;
    private String pb;
    private Date idx_price_dt;
    private int owned;
    private int holded;
    public void setFund_id(String fund_id) {
         this.fund_id = fund_id;
     }
     public String getFund_id() {
         return fund_id;
     }

    public void setFund_nm(String fund_nm) {
         this.fund_nm = fund_nm;
     }
     public String getFund_nm() {
         return fund_nm;
     }

    public void setIndex_id(String index_id) {
         this.index_id = index_id;
     }
     public String getIndex_id() {
         return index_id;
     }

    public void setFee(String fee) {
         this.fee = fee;
     }
     public String getFee() {
         return fee;
     }

    public void setM_fee(String m_fee) {
         this.m_fee = m_fee;
     }
     public String getM_fee() {
         return m_fee;
     }

    public void setT_fee(String t_fee) {
         this.t_fee = t_fee;
     }
     public String getT_fee() {
         return t_fee;
     }

    public void setCreation_unit(int creation_unit) {
         this.creation_unit = creation_unit;
     }
     public int getCreation_unit() {
         return creation_unit;
     }

    public void setIssuer_nm(String issuer_nm) {
         this.issuer_nm = issuer_nm;
     }
     public String getIssuer_nm() {
         return issuer_nm;
     }

    public void setUrls(String urls) {
         this.urls = urls;
     }
     public String getUrls() {
         return urls;
     }

    public void setEval_flg(String eval_flg) {
         this.eval_flg = eval_flg;
     }
     public String getEval_flg() {
         return eval_flg;
     }

    public void setAmount(long amount) {
         this.amount = amount;
     }
     public long getAmount() {
         return amount;
     }

    public void setUnit_total(String unit_total) {
         this.unit_total = unit_total;
     }
     public String getUnit_total() {
         return unit_total;
     }

    public void setUnit_incr(String unit_incr) {
         this.unit_incr = unit_incr;
     }
     public String getUnit_incr() {
         return unit_incr;
     }

    public void setPrice(String price) {
         this.price = price;
     }
     public String getPrice() {
         return price;
     }

    public void setVolume(String volume) {
         this.volume = volume;
     }
     public String getVolume() {
         return volume;
     }

    public void setLast_dt(Date last_dt) {
         this.last_dt = last_dt;
     }
     public Date getLast_dt() {
         return last_dt;
     }

    public void setLast_time(String last_time) {
         this.last_time = last_time;
     }
     public String getLast_time() {
         return last_time;
     }

    public void setIncrease_rt(String increase_rt) {
         this.increase_rt = increase_rt;
     }
     public String getIncrease_rt() {
         return increase_rt;
     }

    public void setEstimate_value(String estimate_value) {
         this.estimate_value = estimate_value;
     }
     public String getEstimate_value() {
         return estimate_value;
     }

    public void setLast_est_time(String last_est_time) {
         this.last_est_time = last_est_time;
     }
     public String getLast_est_time() {
         return last_est_time;
     }

    public void setDiscount_rt(String discount_rt) {
         this.discount_rt = discount_rt;
     }
     public String getDiscount_rt() {
         return discount_rt;
     }

    public void setFund_nav(String fund_nav) {
         this.fund_nav = fund_nav;
     }
     public String getFund_nav() {
         return fund_nav;
     }

    public void setNav_dt(Date nav_dt) {
         this.nav_dt = nav_dt;
     }
     public Date getNav_dt() {
         return nav_dt;
     }

    public void setIndex_nm(String index_nm) {
         this.index_nm = index_nm;
     }
     public String getIndex_nm() {
         return index_nm;
     }

    public void setIndex_increase_rt(String index_increase_rt) {
         this.index_increase_rt = index_increase_rt;
     }
     public String getIndex_increase_rt() {
         return index_increase_rt;
     }

    public void setPe(String pe) {
         this.pe = pe;
     }
     public String getPe() {
         return pe;
     }

    public void setPb(String pb) {
         this.pb = pb;
     }
     public String getPb() {
         return pb;
     }

    public void setIdx_price_dt(Date idx_price_dt) {
         this.idx_price_dt = idx_price_dt;
     }
     public Date getIdx_price_dt() {
         return idx_price_dt;
     }

    public void setOwned(int owned) {
         this.owned = owned;
     }
     public int getOwned() {
         return owned;
     }

    public void setHolded(int holded) {
         this.holded = holded;
     }
     public int getHolded() {
         return holded;
     }

    @Override
    public String toString() {
        return "Cell{" +
                "fund_id='" + fund_id + '\'' +
                ", fund_nm='" + fund_nm + '\'' +
                ", index_id='" + index_id + '\'' +
                ", fee='" + fee + '\'' +
                ", m_fee='" + m_fee + '\'' +
                ", t_fee='" + t_fee + '\'' +
                ", creation_unit=" + creation_unit +
                ", issuer_nm='" + issuer_nm + '\'' +
                ", urls='" + urls + '\'' +
                ", eval_flg='" + eval_flg + '\'' +
                ", amount=" + amount +
                ", unit_total='" + unit_total + '\'' +
                ", unit_incr='" + unit_incr + '\'' +
                ", price='" + price + '\'' +
                ", volume='" + volume + '\'' +
                ", last_dt=" + last_dt +
                ", last_time='" + last_time + '\'' +
                ", increase_rt='" + increase_rt + '\'' +
                ", estimate_value='" + estimate_value + '\'' +
                ", last_est_time='" + last_est_time + '\'' +
                ", discount_rt='" + discount_rt + '\'' +
                ", fund_nav='" + fund_nav + '\'' +
                ", nav_dt=" + nav_dt +
                ", index_nm='" + index_nm + '\'' +
                ", index_increase_rt='" + index_increase_rt + '\'' +
                ", pe='" + pe + '\'' +
                ", pb='" + pb + '\'' +
                ", idx_price_dt=" + idx_price_dt +
                ", owned=" + owned +
                ", holded=" + holded +
                '}';
    }
}