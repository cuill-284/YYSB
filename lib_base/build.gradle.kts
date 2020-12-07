//引用插件
plugins {
    id("com.android.library")
    kotlin("android")
    kotlin("android.extensions")
}

android {
    compileSdkVersion(AppConfig.compileSdkVersion)
    buildToolsVersion(AppConfig.buildToolsVersion)

    defaultConfig {
        minSdkVersion(AppConfig.minSdkVersion)
        targetSdkVersion(AppConfig.targetSdkVersion)
        versionCode = AppConfig.versionCode
        versionName = AppConfig.versionName
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

}

dependencies {
    api(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

    //Kotlin基础库
    api(DependenciesConfig.STD_LIB)
    //Android标准库
    api(DependenciesConfig.APP_COMPAT)
    //Kotlin核心库
    api(DependenciesConfig.KTX_CORE)
    //约束布局
    api(DependenciesConfig.CONSTRAINT_LAYOUT)

    //EventBus
    api(DependenciesConfig.EVENT_BUS)
    //ARouter
    api(DependenciesConfig.AROUTER)
    //RecyclerView
    api(DependenciesConfig.RECYCLERVIEW)
    //AndPermissions
    api(DependenciesConfig.AND_PERMISSIONS)
    //ViewPager
    api(DependenciesConfig.VIEWPAGER)
    api(DependenciesConfig.MATERIAL)
    //Lottie
    api(DependenciesConfig.LOTTIE)
    //刷新
    api(DependenciesConfig.REFRESH_KERNEL)
    api(DependenciesConfig.REFRESH_HEADER)
    api(DependenciesConfig.REFRESH_FOOT)
    //图表
    api(DependenciesConfig.CHART)

    //引入Jar与AAR
    api(files("libs/BaiduLBS_Android.jar"))
    api(files("libs/IndoorscapeAlbumPlugin.jar"))


    api(project(":lib_network"))
    api(project(":lib_voice"))

}
