package com.springboot_b.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author 闫天宇
 * @date 2019/6/21-13:39
 */
@Component
@ConfigurationProperties(prefix = "persion")
public class Persion {
    private Date brith;
    private String name;

    @Override
    public String toString() {
        return "Persion{" +
                "brith=" + brith +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBrith() {
        return brith;
    }

    public void setBrith(Date brith) {
        this.brith = brith;
    }
}
