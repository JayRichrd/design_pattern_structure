//
// Created by 姜瑜 on 2022/7/30.
//

#ifndef CPP_PRO_SINGLETON_H
#define CPP_PRO_SINGLETON_H

#include <iostream>

namespace creator_type {
    using namespace std;

    /**
     * lazy load singleton
     */
    class Singleton {
    private:
        // 私有化构造函数
        Singleton() {
            cout << "call singleton constructor." << endl;
        }

    public:
        ~ Singleton() {
            cout << "call singleton destructor." << endl;
        }

        /**
         * 禁止拷贝与赋值
         */
        Singleton(const Singleton &) = delete;

        Singleton &operator=(const Singleton &) = delete;

        // 获取单例实例对象
        static Singleton &get_instance() {
            static Singleton instance;
            return instance;
        }
    };
}

#endif //CPP_PRO_SINGLETON_H
