package com.cssl.controller;

import com.cssl.pojo.Product_details;
import com.cssl.pojo.Product_introduce;
import com.cssl.pojo.Product_type;
import com.cssl.service.Product_detailsService;
import com.cssl.service.Product_introduceService;
import com.cssl.service.Product_typeService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/9/12.
 */

@Controller
public class Product_typeController {
        @Autowired
        private Product_typeService pts;
        @Autowired
        private Product_detailsService pds;
        @Autowired
        private Product_introduceService pis;

        //登录上来就查询所有信息
        @RequestMapping("/sel_product_type")
        public String sel_product_type(Model model){
                System.out.println("进来了");
                List<Product_type> listpt=pts.sel_product_type();
                model.addAttribute("Product_typelist",listpt);
                for(int i=0;i<listpt.size();i++){
                     System.out.println("PT_id"+listpt.get(i).getPt_id());
                        listpt.get(i).setPdlist(pds.sellistpdbypt_id(listpt.get(i).getPt_id()));
                        System.out.println(listpt.get(i).getPdlist());
                }
                return "index";
        }

        //点击商品查询商品详细信息
        @RequestMapping("/selpdbypt_id")
        public String selpdbypt_id(Model model,Integer pd_id){
                Product_details pd=pds.selpdbypd_id(pd_id);
                List<Product_introduce> listpi=pis.sellistpibypd_id(pd.getPd_id());
                pd.setList_pi(listpi);
                for (Product_introduce pu:pd.getList_pi()) {
                        System.out.println("商品简介"+pu.getPi_imgs());
                }
                System.out.println("商品地区为"+pd.getVd().getVd_name());
                model.addAttribute("product_details",pd);
                return "details.html";
        }



}
