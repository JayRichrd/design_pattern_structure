//
// Created by 姜瑜 on 2022/8/16.
//

#include "request.h"
namespace operator_type {
    Request::Request(string desc, RequestType type) : desc(desc), type(type) {
    }

    RequestType Request::get_type() {
        return type;
    }

    string Request::get_desc() {
        return desc;
    }
}
