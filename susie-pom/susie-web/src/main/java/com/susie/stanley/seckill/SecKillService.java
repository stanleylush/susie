package com.susie.stanley.seckill;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

public class SecKillService {
	@Autowired
    SecKillGoodsDao secKillGoodsDao;

    @Autowired
    SecKillOrderDao secKillOrderDao;

    /**
     * 程序启动时：
     * 初始化秒杀商品，清空订单数据
     */
    @PostConstruct
    public void initSecKillEntity(){
        secKillGoodsDao.deleteAll();
        secKillOrderDao.deleteAll();
        SecKillGoods secKillGoods = new SecKillGoods();
        secKillGoods.setId("123456");
        secKillGoods.setGoodsName("秒杀产品");
        secKillGoods.setRemainNum(10);
        secKillGoodsDao.save(secKillGoods);
    }

    /**
     * 购买成功,保存订单
     * @param consumer
     * @param goodsId
     * @param num
     */
    public void generateOrder(String consumer, String goodsId, Integer num) {
        secKillOrderDao.save(new SecKillOrder(consumer,goodsId,num));
    }
}
