package org.aerogear.akow.example.test

import org.aerogear.akow.dsl.base.appium
import org.aerogear.akow.example.test.pageobjects.android.MainAndroidScreen
import org.aerogear.sdk_e2e_tests.BuildConfig

val appium = appium(BuildConfig.APPIUM_SERVER_URL) {
    applications {
        androidAPKApplication(BuildConfig.TEST_APK, "org.aerogear.mobile.example") {
            capabilities {
            }
            screens {
                +MainAndroidScreen()
            }
        }

    }
}