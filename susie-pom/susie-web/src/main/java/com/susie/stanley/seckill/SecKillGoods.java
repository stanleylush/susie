package com.susie.stanley.seckill;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SecKillGoods implements Serializable{
    
	private static final long serialVersionUID = 3042127507523617436L;

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

    
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getRemainNum() {
		return remainNum;
	}

	public void setRemainNum(Integer remainNum) {
		this.remainNum = remainNum;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
    
}
