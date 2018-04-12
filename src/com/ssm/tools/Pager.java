package com.ssm.tools;

import com.ssm.pojo.Product;

import java.util.List;

/**
 * Created by Maze on 2018-04-12.
 */
public class Pager {
    private int pageNo;
    private int pageSize;
    private int pageCount;
    private int totalCount;
    private List<Product> plist;
    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public List<Product> getPlist() {
        return plist;
    }

    public void setPlist(List<Product> plist) {
        this.plist = plist;
    }
}
