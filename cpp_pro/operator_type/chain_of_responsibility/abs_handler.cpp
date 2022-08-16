//
// Created by 姜瑜 on 2022/8/16.
//

#include "abs_handler.h"
#include<iostream>

namespace operator_type {
    using namespace std;

    abs_handler::abs_handler(abs_handler &next) : next(&next) {
    }

    abs_handler::abs_handler() : next(nullptr) {
    }

    void abs_handler::add_next(abs_handler &next) {
        this->next = &next;
    }

    void abs_handler::handle_request(Request request) {
        if (check_request(request)) {
            process_req(request);
        } else if (next != nullptr) {
            this->next->handle_request(request);
        } else {
            cout << "nothing to do" << endl;
        }
    }
}
