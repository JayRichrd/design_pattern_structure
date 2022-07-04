package jv.com.tencent.cain.design_pattern.chain_responsibility;

import static jv.com.tencent.cain.design_pattern.chain_responsibility.Request.REQUEST_TYPE_RAISE_SALARY;
import static jv.com.tencent.cain.design_pattern.chain_responsibility.Request.REQUEST_TYPE_VACATION;

/**
 * @author : jiangyu
 * @date : 2020/8/8
 * @desc : xxx
 */
public class ChainResponsibilityDesignPattern {
    public static void main(String[] args) {
        AbstractManager boss = new BossManager("总经理");
        AbstractManager majorManager = new MajorManager("副经理");
        majorManager.setSuperior(boss);
        AbstractManager commonManager = new CommonManager("总监");
        commonManager.setSuperior(majorManager);

        Request request1 = new Request(REQUEST_TYPE_VACATION, "请假", 3);
        Request request2 = new Request(REQUEST_TYPE_RAISE_SALARY, "涨薪", 2000);
        commonManager.handleRequest(request1);
        commonManager.handleRequest(request2);
    }
}
