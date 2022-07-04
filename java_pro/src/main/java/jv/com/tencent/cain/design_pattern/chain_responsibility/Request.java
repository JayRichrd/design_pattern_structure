package jv.com.tencent.cain.design_pattern.chain_responsibility;

/**
 * @author : jiangyu
 * @date : 2020/8/8
 * @desc : xxx
 */
public class Request {
    public static final int REQUEST_TYPE_VACATION = 1;
    public static final int REQUEST_TYPE_RAISE_SALARY = 2;
    private int requestType;
    private String requestContent;
    private int requestCount;

    public Request(int requestType, String requestContent, int requestCount) {
        this.requestType = requestType;
        this.requestContent = requestContent;
        this.requestCount = requestCount;
    }

    public void setRequestType(int requestType) {
        this.requestType = requestType;
    }

    public void setRequestContent(String requestContent) {
        this.requestContent = requestContent;
    }

    public void setRequestCount(int requestCount) {
        this.requestCount = requestCount;
    }

    public int getRequestType() {
        return requestType;
    }

    public String getRequestContent() {
        return requestContent;
    }

    public int getRequestCount() {
        return requestCount;
    }
}
