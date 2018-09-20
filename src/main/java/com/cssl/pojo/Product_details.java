package com.cssl.pojo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 商品详情表
 */
@Getter
@Setter
public class Product_details {
        private Integer pd_id; 	             //商品id
        private Integer pt_id;	             //商品类_商品类型
        private Integer pb_id;	             //商品品牌_品牌id
        private Product_brand pb;	         //商品品牌_品牌id
        private String pd_name;	             //商品名称
        private Integer vd_id;  	         //卖家地区
        private Vendor_district vd;  	     //卖家地区
        private Integer pd_weight;  	     //商品重量
        private double pd_price; 	         //商品价格
        private Integer pd_count;   	     //商品数量
        private Integer pd_if;  	         //商品是否打折（int）
        private Double pd_discount;          //折扣力度;
        private String pd_img;	             //商品图片
        private String vd_name;              //地区名称
        private List<Product_introduce> list_pi;   //商品介绍
}
