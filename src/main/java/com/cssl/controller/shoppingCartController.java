package com.cssl.controller;

/**
 * @program: taoshopping01
 * @Date: 2018/9/22 15:19
 * @Author: misliu
 * @Description:
 */

import com.cssl.pojo.Product_details;
import com.cssl.pojo.taoShopCar;
import com.cssl.service.Product_detailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * 购物车
 */
@Controller
public class shoppingCartController {


    @Autowired
    private Product_detailsService proDet;


    //添加到购物车
    @ResponseBody
    @RequestMapping("addShopCar")
    public String getShopCar(String pd_id, Integer pd_count, HttpSession session){
        //根据商品id 获取商品信息
        Product_details pd =  proDet.selpdbypd_id(Integer.valueOf(pd_id));
        //获取session中的购物车信息
        Object obj = session.getAttribute("shopCar");
        //创建购物车对象
        taoShopCar tpCar = new taoShopCar();
        //把商品放入购物车
        tpCar.setEp(pd);
        //创建购物车总金额
        double sumMoney = 0;
        if(obj==null){     //购物车为空时
            //创建一个购物车
            List<taoShopCar> listCar = new ArrayList<taoShopCar>();
            listCar.add(tpCar);
            double xiaoji = tpCar.getXiaoji();
            Integer count = listCar.size();
            session.setAttribute("count",count);      //购物车的数量
            session.setAttribute("shopCar",listCar); //购物车的商品
            session.setAttribute("sumMoney",xiaoji);  //总金额
            System.out.println("空购物车");
        }else{             //购物车不为空
            System.out.println("非空购物车");
            List<taoShopCar> listCar = (List<taoShopCar>)obj;
            Integer count = (Integer)session.getAttribute("count");
            sumMoney = (Double) session.getAttribute("sumMoney");

            boolean flag = false;                       //标记 是否是新产品
            for (taoShopCar taoShopCar : listCar) {     //找到相同的产品
                if(taoShopCar.getEp().getPd_id()==Integer.valueOf(pd_id)){
                    taoShopCar.setNumber(taoShopCar.getNumber()+1);        //增加数量
                    sumMoney = taoShopCar.getEp().getPd_price()+sumMoney;  //增加价格
                    session.setAttribute("count",count);
                    session.setAttribute("sumMoney",sumMoney);
                    System.out.println("产品相同!!");
                    flag = true;
                    break;
                }
            }

            if(!flag){  //新产品
                tpCar.setNumber(1);
                count = count+1;
                sumMoney = sumMoney + tpCar.getEp().getPd_price();
                listCar.add(tpCar);
                session.setAttribute("count",count);
                session.setAttribute("sumMoney",sumMoney);
                System.out.println("new产品!!");

            }
        }
        String count = (String) session.getAttribute("count").toString();
        return count;
    }

    //购物车显示页面
    @RequestMapping("showShopCar")
    public String showShopCar(){    //显示shopCar页面信息





        return "user/shopping-cart";
    }
}
