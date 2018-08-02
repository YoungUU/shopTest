package com.deloitte.shop.test.mytest.service;

import com.deloitte.shop.test.mytest.entity.Goods_form;
import com.deloitte.shop.test.mytest.entity.Pay_form;

import java.util.List;

public interface IGoodsform {
    //简单的操作
    public Goods_form getGoodformById(int id);
    public Boolean updateGoodsform(Goods_form goods_form);

    /**
     * 订单支付生成
     * 需要good_form表和pay_form表联合操作
     */
    public Boolean formCreate(List <Goods_form> Goods_forms );

    //订单查询
    public List<Goods_form> formSelect(Pay_form pay_form);

    //获取随机数
    public String getRandomString();
}
