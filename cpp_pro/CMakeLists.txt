cmake_minimum_required(VERSION 3.22)
project(cpp_pro)

set(CMAKE_CXX_STANDARD 11)

add_executable(cpp_pro
        main.cpp
        creator/singleton.h
        operator_type/chain_of_responsibility/request.cpp
        operator_type/chain_of_responsibility/request.h
        operator_type/chain_of_responsibility/abs_handler.cpp
        operator_type/chain_of_responsibility/abs_handler.h
        operator_type/chain_of_responsibility/concrete_handler.cpp
        operator_type/chain_of_responsibility/concrete_handler.h
        )
