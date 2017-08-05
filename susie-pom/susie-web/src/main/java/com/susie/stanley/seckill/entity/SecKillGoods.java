package com.susie.stanley.seckill.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SecKillGoods implements Serializable{
    @Id
    private String id;

    /**
     * 剩余库存
     */
    private Integer remainNum;

    /**
     * 秒杀商品名称
     */
    private String goodsName;

}
