package com.dragon.gongfu.product;

import com.dragon.gongfu.product.entity.BrandEntity;
import com.dragon.gongfu.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class GongfuProductApplicationTests {

    @Autowired
    private BrandService brandService;

    @Test
    void contextLoads() {
    }

    @Test
    public void testInsert(){
        BrandEntity entity = new BrandEntity();
        entity.setName("哈哈哈");
        brandService.save(entity);
        System.out.printf("保存成功");
    }


}
