package jv.com.tencent.cain.design_pattern.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : jiangyu
 * @date : 2020/2/10
 * @desc : xxx
 */
public class Product {
    List<String> parts = new ArrayList<>();

    public void addPart(String part) {
        parts.add(part);
    }

    public void show() {
        System.out.println("---产品创建---");
        for (String part : parts) {
            System.out.println(part);
        }
    }
}
