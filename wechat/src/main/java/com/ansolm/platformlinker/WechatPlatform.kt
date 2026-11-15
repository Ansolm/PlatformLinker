package com.ansolm.platformlinker

class WechatPlatform : WechatApiPlatform() {

    companion object {
        @JvmStatic
        val instance = WechatPlatform()
    }
}