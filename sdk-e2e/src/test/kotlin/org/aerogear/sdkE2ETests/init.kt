package org.aerogear.sdkE2ETests

import org.aerogear.akow.dsl.base.appium
import org.aerogear.akow.example.test.pageobjects.android.MainAndroidScreen
import org.aerogear.sdkE2ETests.pageobjects.android.AuthStartAndroidScreen
import org.aerogear.sdkE2ETests.pageobjects.android.AuthenticatedAndroidScreen
import org.aerogear.sdkE2ETests.pageobjects.android.KeycloakLoginAndroidScreen
import org.aerogear.sdkE2ETests.pageobjects.unimportant.SetPINDialogAndroidScreen

val appium = appium(BuildConfig.APPIUM_SERVER_URL) {
    applications {
        androidAPKApplication(BuildConfig.TEST_APK, "org.aerogear.mobile.example",".ui.MainActivity") {
            capabilities {
                chromeOptions.addArguments("--no-first-run")
            }
            screens {
                +MainAndroidScreen()
                +AuthStartAndroidScreen()
                +SetPINDialogAndroidScreen()
                +KeycloakLoginAndroidScreen()
                +AuthenticatedAndroidScreen()
            }
        }

    }
}