package com.cssl.pojo;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

/**
 * 商品类型表
 */
@Setter
@Getter
public class Product_type implements Serializable {
        private Integer pt_id;                  //品牌类型
        private String pt_name;                 //类型名称
        private List<Product_brand> pblist;     //商品品牌集合
        private List<Product_details> pdlist;   //商品详情
}
