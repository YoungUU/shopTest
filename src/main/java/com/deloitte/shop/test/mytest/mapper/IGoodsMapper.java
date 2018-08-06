package com.deloitte.shop.test.mytest.mapper;

import com.deloitte.shop.test.mytest.entity.Goods;
import org.apache.ibatis.annotations.*;

@Mapper
public interface IGoodsMapper {

    @Select("select * from goods where id=#{id}")
    public Goods getGoodById(Integer id);

    @Insert("insert into goods(id,name,price,intro,outDate,stock)" +
            "values(null,#{name},#{price},#{intro},#{outDate},#{stock})")
    public Boolean addGoods(Goods good);

    @Update("update goods\n" +
            "set name=#{name},price=#{price},intro=#{intro},outDate=#{outDate},stock=#{stock}\n" +
            "where id=#{id}")
    public Boolean updateGoods(Goods good);

    @Select("delete from goods where id=#{id}")
    public Boolean deleteGoodsById(int id);
}
