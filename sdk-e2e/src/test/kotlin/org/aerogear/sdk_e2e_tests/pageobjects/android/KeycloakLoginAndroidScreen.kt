package org.aerogear.sdk_e2e_tests.pageobjects.android

import org.aerogear.akow.pageobject.AndroidScreen
import org.aerogear.sdk_e2e_tests.pageobjects.KeycloakLoginScreen

/**
 * Created on 3/7/18.
 */
class KeycloakLoginAndroidScreen : KeycloakLoginScreen,AndroidScreen() {
    override val usernameInput by id("username")
    override val passwordInput by id("password")
    override val loginButton by id("kc-login")
}