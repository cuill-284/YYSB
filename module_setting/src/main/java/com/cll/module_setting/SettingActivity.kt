package com.cll.module_setting

import com.alibaba.android.arouter.facade.annotation.Route
import com.cll.lib_base.base.BaseActivity
import com.cll.lib_base.helper.ARouterHelper

@Route(path = ARouterHelper.PATH_SETTING)
class SettingActivity : BaseActivity() {

    override fun getLayoutId(): Int = R.layout.activity_setting

    override fun getTitleText(): String = "Setting"

    override fun isShowBack(): Boolean = true

    override fun initView() {
    }
}