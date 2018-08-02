package com.deloitte.shop.test.mytest.service.impl;

import com.deloitte.shop.test.mytest.entity.Goods_form;
import com.deloitte.shop.test.mytest.entity.Pay_form;
import com.deloitte.shop.test.mytest.mapper.IFormPay;
import com.deloitte.shop.test.mytest.mapper.IGoodsBook;
import com.deloitte.shop.test.mytest.service.IGoodsform;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class GoodsformImpl implements IGoodsform{

    @Autowired
    private IGoodsBook book;
    @Autowired
    private IFormPay iFormPay;

    //根据订单表的订单号查询物品表单。
    @Override
    public Goods_form getGoodformById(int id) {
        return book.getGoodformById(id);
    }

    @Override
    public Boolean updateGoodsform(Goods_form goods_form) {
        return book.updateGoodsform(goods_form);
    }



    //随机数函数，length为随机生成函数的位数
    public String getRandomString(){
        int length = 10;
        String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random=new Random();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<length;i++){
            int number=random.nextInt(62);
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }

    /**
     * 订单生成
     * 需要good_form表和pay_form表联合操作
     */
    //good_pay和good_form表单生成
    @Override
    public Boolean formCreate(List <Goods_form> Goods_forms ) {
        try {
            String order_num = getRandomString();//拿到一个随机数作为唯一编码
            iFormPay.addPayform(order_num);
            for(Goods_form goods_form : Goods_forms) {//将订单表的ID赋值给详细商品订单信息的订单ID值
                goods_form.setOrder_num(order_num);
                book.addGoodsform(goods_form);
            }
            return true;
        }catch (Exception E)
        {
            return false;
        }

    }

    //根据订单号得到详细的订单信息。
    @Override
    public List<Goods_form> formSelect(Pay_form pay_form) {
        return book.getGoodformByOrdernum(pay_form.getOrder_num());
    }
}
