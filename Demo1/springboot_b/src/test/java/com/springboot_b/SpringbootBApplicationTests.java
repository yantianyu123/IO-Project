package com.springboot_b;

import com.springboot_b.entity.Persion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootBApplicationTests {

    @Autowired
    Persion persion;
    @Autowired
    ApplicationContext ioc;

    @Test
    public void contextLoads() {
        System.out.println(ioc.containsBean("dao"));
        System.out.println(persion);
}

}
