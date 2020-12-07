package com.cll.module_app_manager

import com.alibaba.android.arouter.facade.annotation.Route
import com.cll.lib_base.base.BaseActivity
import com.cll.lib_base.helper.ARouterHelper

@Route(path = ARouterHelper.PATH_APP_MANAGER)
class AppManagerActivity : BaseActivity() {
    override fun getLayoutId(): Int = R.layout.activity_app_manager

    override fun getTitleText(): String = "AppManager"

    override fun isShowBack(): Boolean = true

    override fun initView() {

    }

}