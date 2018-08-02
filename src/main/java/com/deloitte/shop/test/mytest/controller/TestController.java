package com.deloitte.shop.test.mytest.controller;


import com.deloitte.shop.test.mytest.entity.Goods;
import com.deloitte.shop.test.mytest.entity.Goods_form;
import com.deloitte.shop.test.mytest.entity.Pay_form;
import com.deloitte.shop.test.mytest.service.IGoodsService;
import com.deloitte.shop.test.mytest.service.IGoodsform;
import com.deloitte.shop.test.mytest.service.IPayform;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class TestController {
    @Autowired
    private IGoodsform iGoodsform;
    @Autowired
    private IGoodsService iGoodsService;
    @Autowired
    private IPayform iPayform;

    /**
     *
     * @IGoodService
     */

    //得到所有商品
    @RequestMapping(value = "/login")
    public String getAllGoods(Map<String,Object> map){
        System.out.println("进入index方法");
        List<Goods> list = iGoodsService.getAll();
        map.put("list",list);
        return "index";
    };

    @RequestMapping(value = "/delgood")
    public ModelAndView delGoods(HttpServletRequest request){
        iGoodsService.deleteGoodsById(Integer.parseInt(request.getParameter("id")));

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/login");
        return modelAndView;
    };

    //增加商品
    @RequestMapping(value = "/addgood")
    public ModelAndView addGoods(HttpServletRequest request){

        //封装出来一个Goods对象
        Goods goods = new Goods();
        goods.setName(request.getParameter("name"));
        goods.setStock((Integer.parseInt(request.getParameter("stock"))));//将String强转成int
        goods.setIntro(request.getParameter("intro"));
        goods.setPrice((Double.parseDouble(request.getParameter("price"))));
        //System.out.println(goods.toString());

        //调用添加商品方法。
        iGoodsService.addGoods(goods);


        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/login");
        return modelAndView;
    }

    //通过Id查询商品
    @RequestMapping(value = "/getGoodById")
    public void getGoodById(Integer id){
        iGoodsService.getGoodById(id);
    }


    /**
     * IGoodsform
     */
    //通过Id查询二级表单
    @RequestMapping(value = "/formId")
    public Goods_form getGoodformById(int id){
        return  iGoodsform.getGoodformById(id);
    }

    //更新二级表单
    @RequestMapping(value = "/updateform")
    public Boolean updateGoodsform(Goods_form goods_form){
        return  iGoodsform.updateGoodsform(goods_form);
    }

    //表单生成，一二级表单一起生成
    @RequestMapping(value = "/formCreate")
    public Boolean formCreate(List <Goods_form> Goods_forms ){
        return iGoodsform.formCreate(Goods_forms);
    }

    //根据一级表单的ordernum得到所有对应的二级表单
    @RequestMapping(value = "/formSelect")
    public List<Goods_form> formSelect(Pay_form pay_form){
        return iGoodsform.formSelect(pay_form);
    }

    /**
     *Ipayform
     */
    //通过id得到一级表单
    @RequestMapping(value = "/PayformId")
    public Pay_form getPayformById(int id){
        return iPayform.getPayformById(id);
    }

    //修改一级表单属性
    @RequestMapping(value = "/updatepayform")
    public Boolean updatePayform(Pay_form pay_form){
        return iPayform.updatePayform(pay_form);
    }

    //订单支付
    @RequestMapping("/pay")
    public Boolean formPay(Pay_form pay_form){
        return iPayform.formPay(pay_form);
    }
}
