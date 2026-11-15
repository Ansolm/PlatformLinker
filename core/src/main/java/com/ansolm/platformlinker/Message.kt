package com.ansolm.platformlinker


interface Message {
    fun check()
    fun authorize(): Authorize
    fun checkParameter() {
        try {
            check()
        } catch (e: Exception) {
            PlatformLog.usageShare()
            throw  e
        }
    }
}