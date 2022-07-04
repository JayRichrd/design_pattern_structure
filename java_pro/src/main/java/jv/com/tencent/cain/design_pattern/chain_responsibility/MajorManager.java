package jv.com.tencent.cain.design_pattern.chain_responsibility;

/**
 * @author : jiangyu
 * @date : 2020/8/8
 * @desc : xxx
 */
public class MajorManager extends AbstractManager {

    public MajorManager(String name) {
        super(name);
    }

    @Override
    void handleRequest(Request request) {
        if (request.getRequestType() == Request.REQUEST_TYPE_VACATION && request.getRequestCount() <= 5) {
            System.out.println(request.getRequestContent() + ", " + request.getRequestCount() + ", " + name + "已批准");
        } else if (superior != null) {
            superior.handleRequest(request);
        }
    }
}
