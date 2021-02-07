/**
  * Copyright 2021 bejson.com 
  */
package com.shihe.pojo;
import java.util.List;

/**
 * Auto-generated: 2021-02-04 17:36:32
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class JsonRootBean {

    private int page;
    private List<Rows> rows;
    public void setPage(int page) {
         this.page = page;
     }
     public int getPage() {
         return page;
     }

    public void setRows(List<Rows> rows) {
         this.rows = rows;
     }
     public List<Rows> getRows() {
         return rows;
     }

}