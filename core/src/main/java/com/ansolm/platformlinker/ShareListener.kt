package com.ansolm.platformlinker


interface ShareListener {
    fun onStart(authorize: Authorize)
    fun onSuccess(authorize: Authorize)
    fun onFail(authorize: Authorize, errorCode: Int)
    fun onCancel(authorize: Authorize)
}