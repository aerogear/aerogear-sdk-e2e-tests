package org.aerogear.sdkE2ETests.pageobjects.android

import org.aerogear.akow.pageobject.AndroidScreen
import org.aerogear.sdkE2ETests.pageobjects.KeycloakLoginScreen

/**
 * Created on 3/7/18.
 */
class KeycloakLoginAndroidScreen : KeycloakLoginScreen,AndroidScreen() {
    override val usernameInput by id("username")
    override val passwordInput by id("password")
    override val loginButton by id("kc-login")
}