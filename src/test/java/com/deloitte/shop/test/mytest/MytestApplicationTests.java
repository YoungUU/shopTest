package com.deloitte.shop.test.mytest;

import com.deloitte.shop.test.mytest.entity.Goods;
import com.deloitte.shop.test.mytest.entity.Goods_form;
import com.deloitte.shop.test.mytest.entity.Pay_form;
import com.deloitte.shop.test.mytest.service.IGoodsService;
import com.deloitte.shop.test.mytest.service.IGoodsform;
import com.deloitte.shop.test.mytest.service.IPayform;
import com.deloitte.shop.test.mytest.service.impl.GoodsServiceImpl;
import com.deloitte.shop.test.mytest.service.impl.GoodsformImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MytestApplicationTests {

	@Autowired
	private IGoodsService service;
	@Autowired
	private IGoodsform iGoodsform;
	@Autowired
	private IPayform iPayform;
	@Test
	public void testIGoodsService() {

		/**
		 * 测试GoodService
		 */
		//1.测试根据getGoodById。
		/*System.out.println(service);*/
//		Goods goods = service.getGoodById(2);
//		System.out.println(goods.toString());

		//2.测试updateGoods。
//		Goods goods = service.getGoodById(5);
//		System.out.println(goods.toString());
//		goods.setStock(80);
//		Boolean updateGoodsBl = service.updateGoods(goods);
//		System.out.println(updateGoodsBl);

		//3.测试addGoods。
//		Goods goods = new Goods(null,"手表", (double)288, "正版卡西欧", "never", 23);
//		Boolean addGoodsBl = service.addGoods(goods);
//		System.out.println(addGoodsBl);

		//4.测试List<Goods> getAll()
		List<Goods> goods = service.getAll();
		for(Goods good:goods){
			System.out.println(good.toString());
		}

	}


	/**
	 * 测试IPayform实现类的具体功能
	 */
	@Test
	public void testIPayform(){
		//1.测试getPayformById(int id);
//		Pay_form pay_form = new Pay_form();
//		pay_form = iPayform.getPayformById(2);
//		System.out.println(pay_form.toString());

		//2.测试addPayform
//		GoodsformImpl goodsform = new GoodsformImpl();
//		String str = goodsform.getRandomString();
//		Boolean isSuccess = iPayform.addPayform(str);
//		System.out.println(isSuccess);

		//3.测试updatePayform
		//用select获取一个payform对象
//		Pay_form pay_form = new Pay_form();
//		pay_form = iPayform.getPayformById(2);
//		pay_form.setOrder_num("牛皮啊怎么修改都行");
//		Boolean isSuccess = iPayform.updatePayform(pay_form);
//		System.out.println(isSuccess);

		//4.测试getAllPayform()
//		List<Pay_form> pay_forms = iPayform.getAllPayform();
//		for(Pay_form payForm:pay_forms){
//			System.out.println(payForm.toString());
//		}
	}

	@Test
	public void testIGoodsBook(){
//		1.测试getGoodformById和Uodategood_form;
//		Goods_form goods_form = iGoodsform.getGoodformById(2);
//		goods_form.setGoods_num(666);
//		Boolean isSuccess = iGoodsform.updateGoodsform(goods_form);
//		System.out.println(isSuccess);

		//2.测试formCreateList <Goods_form> Goods_forms
//		List<Goods_form> list = new ArrayList<>();
//		for (int i = 0;i<2;i++){
//			Goods_form goods_form = new Goods_form();
//			goods_form = iGoodsform.getGoodformById(i+3);
//			list.add(goods_form);
//		}
//		Boolean isSuccess = iGoodsform.formCreate(list);
//		System.out.println(isSuccess);

		//3.测试List<Goods_form> formSelect(Pay_form pay_form)
		List<Goods_form> list = new ArrayList<>();
		list = iGoodsform.formSelect(iPayform.getPayformById(7));
		for(Goods_form goods_form:list){
		System.out.println(goods_form.toString());
		}

	}

}
