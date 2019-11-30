package com.ppt.gmall.pms;

import com.ppt.gmall.pms.entity.Brand;
import com.ppt.gmall.pms.entity.Product;
import com.ppt.gmall.pms.service.BrandService;
import com.ppt.gmall.pms.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
class GmallPmsApplicationTests {

    @Autowired
    ProductService productService;
    @Autowired
    BrandService brandService;
    @Test
     public  void contextLoads(){
        Brand brand = brandService.getById(52);
//        brand.setName("嘀嘀嘀sss");

        System.out.println(brand.getName());
    }

}
