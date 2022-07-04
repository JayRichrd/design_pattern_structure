package jv.com.tencent.cain.design_pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cainjiang
 * @date 2020/5/7
 */
public class Composite extends Component {
    public static final String TAG = "Composite";

    List<Component> children = new ArrayList<>();

    public Composite() {
    }

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        System.out.println(TAG + "#" + "add# " + "component: " + component.toString());
        children.add(component);
    }

    @Override
    public void remove(Component component) {
        if (children.remove(component)) {
            System.out.println(TAG + "#" + "remove# " + "component: " + component.toString());
        }
    }

    @Override
    public void display(int depth) {
        StringBuilder depthBuilder = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            depthBuilder.append("-");
        }
        depthBuilder.append(name);
        System.out.println(depthBuilder);
        for (Component component : children) {
            component.display(depth + 1);
        }
    }
}
