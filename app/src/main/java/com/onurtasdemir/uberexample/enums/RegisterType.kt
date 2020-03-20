package com.onurtasdemir.uberexample.enums

enum class RegisterType {
    SUCCESSFUL{
        override fun toString(): String {
            return "İşlem Başarılı"
        }
    },
    ERROR{
        override fun toString(): String {
            return "Hata"
        }
    }
}