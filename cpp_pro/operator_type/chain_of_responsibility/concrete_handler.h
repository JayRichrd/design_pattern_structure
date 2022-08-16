//
// Created by 姜瑜 on 2022/8/16.
//

#ifndef CPP_PRO_CONCRETE_HANDLER_H
#define CPP_PRO_CONCRETE_HANDLER_H

#include "abs_handler.h"

namespace operator_type {
    class handler_1 : public abs_handler {
    protected:
        void process_req(Request request) override;
        bool check_request(Request request) override;
    };

    class handler_2 : public abs_handler{
    protected:
        void process_req(Request request) override;

        bool check_request(Request request) override;
    };
}
#endif //CPP_PRO_CONCRETE_HANDLER_H
