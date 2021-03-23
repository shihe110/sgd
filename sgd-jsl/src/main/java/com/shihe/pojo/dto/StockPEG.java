package com.shihe.pojo.dto;

/**
 * @ClassName StockSEG
 * @Description TODO
 * @Author admin
 * @Date 2021-03-05 22:28
 * @Version 1.0
 */
public class StockPEG {
    private String code;
    private String name;
    private String peg;
    private String avgPeg;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPeg() {
        return peg;
    }

    public void setPeg(String peg) {
        this.peg = peg;
    }

    public String getAvgPeg() {
        return avgPeg;
    }

    public void setAvgPeg(String avgPeg) {
        this.avgPeg = avgPeg;
    }
}

