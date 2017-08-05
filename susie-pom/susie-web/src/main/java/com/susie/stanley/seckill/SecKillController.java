package com.susie.stanley.seckill;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class SecKillController {
	@Autowired
    SecKillGoodsDao secKillGoodsDao;
    @Autowired
    SecKillService secKillService;

    /**
     * 普通写法
     * @param consumer
     * @param goodsId
     * @return
     */
    @RequestMapping("/seckill.html")
    @ResponseBody
    public String SecKill(String consumer,String goodsId,Integer num) throws InterruptedException {
        //查找出用户要买的商品
        SecKillGoods goods = secKillGoodsDao.findOne(goodsId);
        //如果有这么多库存
        if(goods.getRemainNum()>=num){
            //模拟网络延时
            Thread.sleep(1000);
            //先减去库存
            secKillGoodsDao.reduceStock(goodsId, num);
            //保存订单
            secKillService.generateOrder(consumer,goodsId,num);
            return "购买成功";
        }
        return "购买失败,库存不足";
    }
}
