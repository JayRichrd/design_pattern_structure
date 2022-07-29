#include "creator/singleton.h"

int main() {
    using namespace std;
    cout << "===============================singleton test=====================================" << endl;
    creator_type::Singleton &instance1 = creator_type::Singleton::get_instance();
    cout << "instance1: " << &instance1 << endl;
    creator_type::Singleton &instance2 = creator_type::Singleton::get_instance();
    cout << "instance2: " << &instance2 << endl;
    return 0;
}
