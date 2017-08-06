package com.susie.stanley.seckill;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class SecKillOrder implements Serializable {
    
	private static final long serialVersionUID = -122284184253757479L;

	SecKillOrder(String consumer, String goodsId, Integer num){
		this.consumer = consumer;
		this.goodsId = goodsId;
		this.num = num;
	}
	
	@Id
    @GeneratedValue(generator = "PKUUID")
    @Column(length = 20)
    private String id; // UUID.randomUUID().toString

    //用户名称
    private String consumer;

    //秒杀产品编号
    private String goodsId;

    //购买数量
    private Integer num;

	public String getConsumer() {
		return consumer;
	}

	public void setConsumer(String consumer) {
		this.consumer = consumer;
	}

	public String getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

    
}
