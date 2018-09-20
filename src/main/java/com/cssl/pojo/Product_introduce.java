package com.cssl.pojo;

import lombok.Getter;
import lombok.Setter;

/**
 * 商品介绍表
 */

@Getter
@Setter
public class Product_introduce {
        private int pi_id; 	    //商品详情
        private String pi_imgs;	//商品图片详细介绍
        private int pd_id;        //商品id
}
