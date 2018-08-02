package com.deloitte.shop.test.mytest.service.impl;

import com.deloitte.shop.test.mytest.entity.Pay_form;
import com.deloitte.shop.test.mytest.mapper.IFormPay;
import com.deloitte.shop.test.mytest.service.IPayform;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PayformImpl implements IPayform{

    @Autowired
    private IFormPay iFormPay;

    @Override
    public Pay_form getPayformById(int id) {
        return iFormPay.getPayformById(id);
    }

    @Override
    public Boolean addPayform(String order_num) {
        return iFormPay.addPayform(order_num);
    }

    @Override
    public Boolean updatePayform(Pay_form pay_form) {
        return iFormPay.updatePayform(pay_form);
    }

    @Override
    public List<Pay_form> getAllPayform() {
        return iFormPay.getAllPayform();
    }

    //订单支付生成（标志位的更改）
    @Override
    public Boolean formPay(Pay_form pay_form) {
        try {
            if(pay_form.getPay()==0){//判断是否需要支付，标志位是pay，0：未支付；1：已经支付过了
                pay_form.setPay(1);
            }
            return true;
        }catch (Exception e){
            return false;//表示已经支付过了。
        }
    }
}
