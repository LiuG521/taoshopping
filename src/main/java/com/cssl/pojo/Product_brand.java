package com.cssl.pojo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 商品品牌表
 */
@Getter
@Setter
public class Product_brand {
        private Integer pb_id;	          //商品品牌id
        private String pb_name;   	  //品牌名称
        private String pb_img;	      //品牌图片
        List<Product_details> pdlist; //商品信息List
}
