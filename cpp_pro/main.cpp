#include "creator/singleton.h"
#include "operator_type/chain_of_responsibility/abs_handler.h"
#include "operator_type/chain_of_responsibility/concrete_handler.h"

int main() {
    using namespace std;
    cout << "===============================singleton test=====================================" << endl;
    creator_type::Singleton &instance1 = creator_type::Singleton::get_instance();
    cout << "instance1: " << &instance1 << endl;
    creator_type::Singleton &instance2 = creator_type::Singleton::get_instance();
    cout << "instance2: " << &instance2 << endl;
    cout << "===============================chain of responsibility test=====================================" << endl;
    operator_type::handler_1 handler1;
    operator_type::handler_2 handler2;
    handler1.add_next(handler2);
    auto *request = new operator_type::Request("req1", operator_type::RequestType::REQ1);
    handler1.handle_request(*request);
    delete request;
    return 0;
}
