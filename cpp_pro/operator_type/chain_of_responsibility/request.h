//
// Created by 姜瑜 on 2022/8/16.
//

#ifndef CPP_PRO_REQUEST_H
#define CPP_PRO_REQUEST_H

#include<string>
#include<iostream>

namespace operator_type {
    using namespace std;
    enum class RequestType {
        REQ1,
        REQ2,
        REQ3
    };

    class Request {
    private:
        string desc;
        RequestType type;
    public:
        Request(string desc, RequestType type);

        RequestType get_type();

        string get_desc();
    };
}
#endif //CPP_PRO_REQUEST_H
