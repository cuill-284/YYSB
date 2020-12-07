package com.cll.module_joke

import com.alibaba.android.arouter.facade.annotation.Route
import com.cll.lib_base.base.BaseActivity
import com.cll.lib_base.helper.ARouterHelper

@Route(path = ARouterHelper.PATH_JOKE)
class JokeActivity  : BaseActivity() {
    override fun getLayoutId(): Int = R.layout.activity_joke

    override fun getTitleText(): String = "Joke"

    override fun isShowBack(): Boolean = true

    override fun initView() {
    }
}