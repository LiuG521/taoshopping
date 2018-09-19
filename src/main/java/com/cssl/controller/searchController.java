package com.cssl.controller;

import com.cssl.pojo.Product_details;
import com.cssl.service.searchService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServlet;
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
    public String showAll(HttpSession session,String index,String pd_price,String pd_id,Integer vd_id,
    Integer pb_id,Integer pt_id){
        session.setAttribute("pt",seaService.findByPt()); //类型
        session.setAttribute("pb",seaService.findByPb()); //品牌
        session.setAttribute("vd",seaService.findByVd()); //地区

        System.out.println("index01:"+pb_id);
        Product_details proD = new Product_details();
        proD.setVd_id(vd_id);      //卖家地区
        proD.setPb_id(pb_id);      //商品品牌
        proD.setPt_id(pt_id);      //商品类型
        List<Page> pages = PageHelper.startPage(1,10);
        List<Product_details> list =  seaService.findByPd(proD);
        System.out.println("index02:"+list.size());
        session.setAttribute("pd",list);
        session.setAttribute("pages",pages);
//        session.setAttribute("vd",seaService.findByVd()); //地区
        return "s";
    }
}
