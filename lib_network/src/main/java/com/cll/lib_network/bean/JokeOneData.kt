package com.cll.lib_network.bean


/**
 * FileName: JokeOneData
 * Founder: LiuGuiLin
 * Profile: 随机笑话
 */

data class JokeOneData(
    val error_code: Int,
    val reason: String,
    val result: List<Result>
)

data class Result(
    val content: String,
    val hashId: String,
    val unixtime: Int
)
