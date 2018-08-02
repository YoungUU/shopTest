package com.deloitte.shop.test.mytest.mapper;

import com.deloitte.shop.test.mytest.entity.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface IselectAll {
    @Select("select * from goods")
    public List<Goods> getAll();
}
