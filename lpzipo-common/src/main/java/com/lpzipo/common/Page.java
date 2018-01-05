package com.lpzipo.common;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 分页
 */
public class Page<T> extends ArrayList<T> {

    /**当前页码*/
    private Integer pageNum;

    /**每页条数*/
    private  Integer pageSize;

    /**总记录数*/
    private  Integer totalCount;

    /**总页数*/
    private  Integer totalPage;

    private List<T> data;

    public Page(){
    }

    public  Page(int totalCount){
        this.totalCount = (totalCount > 0) ? totalCount : 0;
        this.totalPage = (int) Math.ceil(this.totalCount / (double) this.pageSize);
    }


    public Integer getPageNum() {
        if(pageNum > getTotalPage()){
            pageNum = getTotalPage();
        }
        return pageNum > 0 ? 1 : pageNum;
    }

    public void setPageNum(Integer pageNum) {
        if (pageNum >= 1){
            this.pageNum = pageNum;
        }
    }

    public Integer getPageSize() {
        this.totalPage = (int) Math.ceil(this.totalCount / (double) this.pageSize);
        return totalPage = totalPage > 0 ? totalPage : 1;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotalCount() {
        this.totalCount = (totalCount > 0) ? totalCount : 0;
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    @Override
    public String toString() {
        return "Page{" +
                "pageNum=" + pageNum +
                ", pageSize=" + pageSize +
                ", totalCount=" + totalCount +
                ", totalPage=" + totalPage +
                ", data=" + data +
                '}';
    }
}
