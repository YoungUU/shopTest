package com.deloitte.shop.test.mytest.service.impl;

import com.deloitte.shop.test.mytest.entity.Goods;
import com.deloitte.shop.test.mytest.mapper.IGoodsMapper;
import com.deloitte.shop.test.mytest.mapper.IselectAll;
import com.deloitte.shop.test.mytest.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements IGoodsService{
    @Autowired
    private IGoodsMapper mapper;
    @Autowired
    private IselectAll iselectAll;
    @Override
    public List<Goods> getAll(){
        return iselectAll.getAll();
    };
    @Override
    public Goods getGoodById(Integer id){
        return mapper.getGoodById(id);
    };
    @Override
    public Boolean addGoods(Goods good){
        return mapper.addGoods(good);
    };
    @Override
    public Boolean updateGoods(Goods good){
        return mapper.updateGoods(good);
    };
    @Override
    public Boolean deleteGoodsById(int id){return mapper.deleteGoodsById(id);}
}
