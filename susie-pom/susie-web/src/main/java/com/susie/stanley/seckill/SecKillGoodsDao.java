package com.susie.stanley.seckill;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface SecKillGoodsDao extends JpaRepository<SecKillGoods,String>{

    @Query("update sec_goods g set g.remain_num = g.remain_num - ?2 where g.id=?1")
    @Modifying(clearAutomatically = true)
    @Transactional
    int reduceStock(String id,Integer remainNum);

}
