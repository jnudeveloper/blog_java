package com.blog.domain;

import com.blog.thrift.domain.TQuery;

import java.util.List;
import java.util.Map;

public class Query {
    /*TODO 类型需要再考虑*/
    private String where;

    private int limit;
    private int offset;
    private Map<String, String> orderBy;
    private List<String> select;
    private String selectOption;
    private boolean distinct;
    private List<String> from;
    private List<String> groupBy;

    /*TODO 类型需要再考虑*/
    private String join;

    /*TODO 类型需要再考虑*/
    private String having;

    /*TODO 类型需要再考虑*/
    private String union;

    private Map<String, String> params;


    public Query(TQuery query){
        this.where = query.where;
        this.limit = query.limit;
        this.offset = query.offset;
        this.orderBy = query.orderBy;
        this.select = query.select;
        this.selectOption = query.selectOption;
        this.distinct = query.distinct;
        this.from = query.fromTable;
        this.groupBy = query.groupBy;
        this.join = query.join;
        this.having = query.having;
        this.union = query.unions;
        this.params = query.params;
    }

    public String getWhere() {
        return where;
    }

    public void setWhere(String where) {
        this.where = where;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public Map<String, String> getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(Map<String, String> orderBy) {
        this.orderBy = orderBy;
    }

    public List<String> getSelect() {
        return select;
    }

    public void setSelect(List<String> select) {
        this.select = select;
    }

    public String getSelectOption() {
        return selectOption;
    }

    public void setSelectOption(String selectOption) {
        this.selectOption = selectOption;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public List<String> getFrom() {
        return from;
    }

    public void setFrom(List<String> from) {
        this.from = from;
    }

    public List<String> getGroupBy() {
        return groupBy;
    }

    public void setGroupBy(List<String> groupBy) {
        this.groupBy = groupBy;
    }

    public String getJoin() {
        return join;
    }

    public void setJoin(String join) {
        this.join = join;
    }

    public String getHaving() {
        return having;
    }

    public void setHaving(String having) {
        this.having = having;
    }

    public String getUnion() {
        return union;
    }

    public void setUnion(String union) {
        this.union = union;
    }

    public Map<String, String> getParams() {
        return params;
    }

    public void setParams(Map<String, String> params) {
        this.params = params;
    }

}
