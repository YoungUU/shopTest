package com.deloitte.shop.test.mytest.entity;

public class Goods_form {

    private int id;
    private int goods_id;
    private int goods_num;
    private String order_num;

    @Override
    public String toString() {
        return "Goods_form{" +
                "id=" + id +
                ", goods_id=" + goods_id +
                ", goods_num=" + goods_num +
                ", order_num='" + order_num + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(int goods_id) {
        this.goods_id = goods_id;
    }

    public int getGoods_num() {
        return goods_num;
    }

    public void setGoods_num(int goods_num) {
        this.goods_num = goods_num;
    }

    public String getOrder_num() {
        return order_num;
    }

    public void setOrder_num(String order_num) {
        this.order_num = order_num;
    }
}
