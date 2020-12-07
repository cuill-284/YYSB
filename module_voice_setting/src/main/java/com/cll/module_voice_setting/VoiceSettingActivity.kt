package com.cll.module_voice_setting

import com.alibaba.android.arouter.facade.annotation.Route
import com.cll.lib_base.base.BaseActivity
import com.cll.lib_base.helper.ARouterHelper

@Route(path = ARouterHelper.PATH_VOICE_SETTING)
class VoiceSettingActivity : BaseActivity() {


    override fun getLayoutId(): Int = R.layout.activity_voice_setting

    override fun getTitleText(): String = "VoiceSetting"

    override fun isShowBack(): Boolean = true

    override fun initView() {
    }
}