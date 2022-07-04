package jv.com.tencent.cain.design_pattern.chain_responsibility;

/**
 * @author : jiangyu
 * @date : 2020/8/8
 * @desc : xxx
 */
public abstract class AbstractManager {
    protected String name;
    protected AbstractManager superior;

    public AbstractManager(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSuperior(AbstractManager superior) {
        this.superior = superior;
    }

    abstract void handleRequest(Request request);
}
