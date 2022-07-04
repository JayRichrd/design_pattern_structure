package jv.com.tencent.cain.design_pattern.chain_responsibility;

/**
 * @author : jiangyu
 * @date : 2020/8/8
 * @desc : xxx
 */
public class BossManager extends AbstractManager {
    public BossManager(String name) {
        super(name);
    }

    @Override
    void handleRequest(Request request) {
        if (request.getRequestType() == Request.REQUEST_TYPE_VACATION) {
            if (request.getRequestCount() <= 7) {
                System.out.println(request.getRequestContent() + ", " + request.getRequestCount() + ", " + name + "已批准");
            } else {
                System.out.println(request.getRequestContent() + ", " + request.getRequestCount() + ", " + name + "已拒绝");
            }
        } else if (request.getRequestType() == Request.REQUEST_TYPE_RAISE_SALARY) {
            if (request.getRequestCount() <= 1500) {
                System.out.println(request.getRequestContent() + ", " + request.getRequestCount() + ", " + name + "已批准");
            } else {
                System.out.println(request.getRequestContent() + ", " + request.getRequestCount() + ", " + name + "已拒绝");
            }
        }
    }
}
