package com.deloitte.shop.test.mytest.service;

import com.deloitte.shop.test.mytest.entity.Goods;

import java.util.List;

public interface IGoodsService {
    //简单的操作
    public List<Goods> getAll();
    public Goods getGoodById(Integer id);
    public Boolean addGoods(Goods good);
    public Boolean updateGoods(Goods good);
    public Boolean deleteGoodsById(int id);
}
