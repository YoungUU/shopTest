package com.deloitte.shop.test.mytest.entity;

public class Pay_form {
    private int id;
    private String order_num;
    private int pay;

    @Override
    public String toString() {
        return "Pay_form{" +
                "id=" + id +
                ", order_num='" + order_num + '\'' +
                ", pay=" + pay +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrder_num() {
        return order_num;
    }

    public void setOrder_num(String order_num) {
        this.order_num = order_num;
    }

    public int getPay() {
        return pay;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }
}
