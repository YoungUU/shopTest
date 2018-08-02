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
public interface IGoodsBook {

    @Select("select * from good_form where id=#{id}")
    public Goods_form getGoodformById(int id);

    @Insert("insert into good_form(goods_id,goods_num,order_num)" +
            "values(#{goods_id},#{goods_num},#{order_num})")
    public Boolean addGoodsform(Goods_form goods_form);

    @Update("update good_form\n" +
            "set goods_id=#{goods_id},goods_num=#{goods_num},order_num=#{order_num}\n" +
            "where id=#{id}")
    public Boolean updateGoodsform(Goods_form goods_form);

    @Select("select * from good_form where order_num=#{order_num}")
    public List<Goods_form> getGoodformByOrdernum(String order_num);
}
