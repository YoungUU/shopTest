package com.deloitte.shop.test.mytest.mapper;

import com.deloitte.shop.test.mytest.entity.Goods;
import com.deloitte.shop.test.mytest.entity.Goods_form;
import com.deloitte.shop.test.mytest.entity.Pay_form;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface IFormPay {

    @Select("select * from pay_form where id=#{id}")
    public Pay_form getPayformById(int id);

    @Insert("INSERT into pay_form (order_num,pay)\n" +
            "            values(#{order_num},0)")
    public Boolean addPayform(String order_num);

    @Update("update pay_form\n" +
            "set order_num=#{order_num},pay=#{pay}\n" +
            "where id=#{id}")
    public Boolean updatePayform(Pay_form pay_form);

    @Select("select * from pay_form")
    public List<Pay_form> getAllPayform();
}
