package com.cssl.controller;

import com.cssl.pojo.Product_details;
import com.cssl.service.searchService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @program: taoshopping01
 * @Date: 2018/9/13 15:41
 * @Author: misliu
 * @Description:
 */

/**
 * s.html搜索页面
 */
@Controller
public class searchController {

    @Autowired
    private searchService seaService;

    //显示 主页面
    @RequestMapping("/showAll")
    public String showAll(HttpSession session,Integer index,String all,String pd_price,String pd_id,Integer vd_id,
    Integer pb_id,Integer pt_id){
        session.setAttribute("pt",seaService.findByPt()); //类型
        session.setAttribute("pb",seaService.findByPb()); //品牌
        session.setAttribute("vd",seaService.findByVd()); //地区

        Product_details proD = new Product_details();
        proD.setVd_id(vd_id);      //卖家地区
        proD.setPb_id(pb_id);      //商品品牌
        proD.setPt_id(pt_id);      //商品类型

        if(index==null){
            index = 1;
        }
        Page pages = null;
        if(pd_price!=""&&pd_price!=null){     //最热销
            pages =  PageHelper.startPage(index,10,"pd_price");
        }
        if(pd_id!=""&&pd_id!=null){           //最新品
            pages =  PageHelper.startPage(index,10,"pd_id");
        }
        if(all!=""&&all!=null){               //默认
            pages =  PageHelper.startPage(index,10,"pd_id");
        }else {
            pages =  PageHelper.startPage(index,10);
        }
        List<Product_details> list =  seaService.findByPd(proD);
        session.setAttribute("pd",list);
        session.setAttribute("index",index);
        session.setAttribute("pages",pages);
        return "s";
    }

    @RequestMapping("/ss")
    public String slsl(){
        System.out.println("12121");
        return "user/shopping-cart";
    }
}
