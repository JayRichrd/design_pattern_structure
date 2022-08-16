//
// Created by 姜瑜 on 2022/8/16.
//

#ifndef CPP_PRO_ABS_HANDLER_H
#define CPP_PRO_ABS_HANDLER_H

#include "request.h"

namespace operator_type {
    class abs_handler {
    private:
        abs_handler *next;
    protected:
        virtual void process_req(Request request) = 0;

        virtual bool check_request(Request request) = 0;

    public:
        abs_handler(abs_handler &next);

        abs_handler();

        void add_next(abs_handler &next);

        void handle_request(Request request);
    };
}
#endif //CPP_PRO_ABS_HANDLER_H
