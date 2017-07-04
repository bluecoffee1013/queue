package com.bluecoffee.queue.dto;

import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * Created by qianlong on 2017/7/4.
 */
public class PageResult<T> extends BaseResult {

    long total = 0;

    int pageSize = 1;

    List<T> rows;

    public PageResult(List<T> rows){
        PageInfo pageInfo = new PageInfo(rows);
        this.total = pageInfo.getTotal();
        this.pageSize = pageInfo.getPageSize();
        this.rows = rows;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}
