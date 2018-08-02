package com.deloitte.shop.test.mytest.service;

import com.deloitte.shop.test.mytest.entity.Pay_form;

import java.util.List;

public interface IPayform {
    //简单的操作
    public Pay_form getPayformById(int id);
    public Boolean addPayform(String string);
    public Boolean updatePayform(Pay_form pay_form);
    public List<Pay_form> getAllPayform();
    public Boolean formPay(Pay_form pay_form);
}
