package jv.com.tencent.cain.design_pattern.visitor;


import java.util.ArrayList;
import java.util.List;

/**
 * @author : jiangyu
 * @date : 2020/8/22
 * @desc : xxx
 */
public class ObjectStruct {
    private List<Element> elementList = new ArrayList();

    public void attach(Element element) {
        elementList.add(element);
    }

    public void detach(Element element) {
        elementList.remove(element);
    }

    public void accept(Visitor visitor) {
        for (Element element : elementList) {
            element.accept(visitor);
        }
    }
}
