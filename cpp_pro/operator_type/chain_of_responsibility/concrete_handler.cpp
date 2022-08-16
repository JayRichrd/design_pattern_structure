//
// Created by 姜瑜 on 2022/8/16.
//

#include "concrete_handler.h"
#include "request.h"
#include<iostream>

namespace operator_type {
    using namespace std;

    void handler_1::process_req(operator_type::Request request) {
        cout << "handle request 1: description: " << request.get_desc() << endl;
    }

    bool handler_1::check_request(operator_type::Request request) {
        return request.get_type() == RequestType::REQ1;
    }

    void handler_2::process_req(Request request) {
        cout << "handle request 2: description: " << request.get_desc() << endl;
    }

    bool handler_2::check_request(Request request) {
        return request.get_type() == RequestType::REQ2;
    }
}
