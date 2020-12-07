package com.cll.lib_base.service

import android.app.IntentService
import android.app.Notification
import android.content.Intent
import android.os.Build
import com.cll.lib_base.helper.NotificationHelper
import com.cll.lib_base.helper.SoundPoolHelper
import com.cll.lib_base.helper.`fun`.AppHelper
import com.cll.lib_base.helper.`fun`.CommonSettingHelper
import com.cll.lib_base.helper.`fun`.ConsTellHelper
import com.cll.lib_base.utils.AssetsUtils
import com.cll.lib_base.utils.L
import com.cll.lib_base.utils.SpUtils
import com.cll.lib_voice.words.WordsTools


/**
 * FileName: InitService
 * Founder: LiuGuiLinInitService
 * Profile: 初始化服务
 */
class InitService : IntentService(InitService::class.simpleName) {

    override fun onCreate() {
        super.onCreate()
        L.i("初始化开始")

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForeground(999, NotificationHelper.bindInitService("正在运行"))
        }
    }

    override fun onHandleIntent(intent: Intent?) {
        L.i("执行初始化操作")

        SpUtils.initUtils(this)
        WordsTools.initTools(this)
        SoundPoolHelper.init(this)

        AppHelper.initHelper(this)
        CommonSettingHelper.initHelper(this)
        ConsTellHelper.initHelper(this)
        AssetsUtils.initUtils(this)
    }

    override fun onDestroy() {
        super.onDestroy()
        L.i("初始化完成")
    }

}