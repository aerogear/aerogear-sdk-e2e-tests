package org.aerogear.sdk_e2e_tests

import org.aerogear.akow.dsl.base.appium
import org.aerogear.akow.example.test.pageobjects.android.MainAndroidScreen
import org.aerogear.sdk_e2e_tests.pageobjects.android.AuthStartAndroidScreen
import org.aerogear.sdk_e2e_tests.pageobjects.android.AuthenticatedAndroidScreen
import org.aerogear.sdk_e2e_tests.pageobjects.android.KeycloakLoginAndroidScreen
import org.aerogear.sdk_e2e_tests.pageobjects.unimportant.ChromeIntroAndroidScreen
import org.aerogear.sdk_e2e_tests.pageobjects.unimportant.SetPINDialogAndroidScreen

val appium = appium(BuildConfig.APPIUM_SERVER_URL) {
    applications {
        androidAPKApplication(BuildConfig.TEST_APK, "org.aerogear.mobile.example") {
            capabilities {
            }
            screens {
                +MainAndroidScreen()
                +AuthStartAndroidScreen()
                +SetPINDialogAndroidScreen()
                +ChromeIntroAndroidScreen()
                +KeycloakLoginAndroidScreen()
                +AuthenticatedAndroidScreen()
            }
        }

    }
}