package com.cll.yysb

import com.cll.lib_base.base.BaseActivity
import com.cll.lib_base.helper.ARouterHelper
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    override fun getLayoutId(): Int = R.layout.activity_main

    override fun getTitleText(): String = " Main "

    override fun isShowBack(): Boolean  = false

    override fun initView() {
        main_button.setOnClickListener {
            //跨module跳转activity
            ARouterHelper.startActivity(ARouterHelper.PATH_APP_MANAGER)
        }
    }

}
