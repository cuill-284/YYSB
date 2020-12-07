package com.cll.lib_voice.impl

import org.json.JSONObject


/**
 * FileName: OnAsrResultListener
 * Founder: LiuGuiLin
 * Profile: 语音识别的接口
 */
interface OnAsrResultListener {

    //唤醒准备就绪
    fun wakeUpReady()

    //开始说话
    fun asrStartSpeak()

    //停止说话
    fun asrStopSpeak()

    //唤醒成功
    fun wakeUpSuccess(result: JSONObject)

    //更新话术
    fun updateUserText(text: String)

   //在线识别结果
    fun asrResult(result: JSONObject)

    //语义识别结果
    fun nluResult(nlu: JSONObject)

    //错误
    fun voiceError(text: String)
}