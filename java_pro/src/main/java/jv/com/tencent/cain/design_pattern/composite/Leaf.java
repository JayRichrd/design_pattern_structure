package jv.com.tencent.cain.design_pattern.composite;

/**
 * @author cainjiang
 * @date 2020/5/7
 */
public class Leaf extends Component {
    public static final String TAG = "Leaf";

    public Leaf() {
    }

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        System.out.println(TAG + "#" + "add# " + "can't add componet to leaf.");
    }

    @Override
    public void remove(Component component) {
        System.out.println(TAG + "#" + "remove# " + "can't remove componet from leaf.");
    }

    @Override
    public void display(int depth) {
        StringBuilder depthBuilder = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            depthBuilder.append("-");
        }
        depthBuilder.append(name);
        System.out.println(depthBuilder);
    }
}
