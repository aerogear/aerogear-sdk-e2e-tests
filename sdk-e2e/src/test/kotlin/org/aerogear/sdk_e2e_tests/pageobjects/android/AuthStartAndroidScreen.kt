package org.aerogear.sdk_e2e_tests.pageobjects.android

import org.aerogear.akow.pageobject.AndroidScreen
import org.aerogear.sdk_e2e_tests.pageobjects.AuthStartScreen

/**
 * Authentication start screen for Android
 */
class AuthStartAndroidScreen : AuthStartScreen, AndroidScreen() {
    override val loginButton by id("org.aerogear.mobile.example:id/keycloak_login")
}