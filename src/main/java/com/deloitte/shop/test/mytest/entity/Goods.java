package com.deloitte.shop.test.mytest.entity;

public class Goods {
    private Integer id;
    private String name;
    private Double price;
    private String intro;
    private String outDate;
    private Integer stock;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", intro='" + intro + '\'' +
                ", outDate='" + outDate + '\'' +
                ", stock=" + stock +
                '}';
    }

    public Goods() {
    }

    public Goods(Integer id, String name, Double price, String intro, String outDate, Integer stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.intro = intro;
        this.outDate = outDate;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getOutDate() {
        return outDate;
    }

    public void setOutDate(String outDate) {
        this.outDate = outDate;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

}
