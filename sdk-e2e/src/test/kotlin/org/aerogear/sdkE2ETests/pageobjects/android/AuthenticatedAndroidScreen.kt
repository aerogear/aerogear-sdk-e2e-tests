package org.aerogear.sdkE2ETests.pageobjects.android

import org.aerogear.akow.pageobject.AndroidScreen
import org.aerogear.sdkE2ETests.pageobjects.AuthenticatedScreen

/**
 * Created on 3/7/18.
 */
class AuthenticatedAndroidScreen : AuthenticatedScreen,AndroidScreen() {
    override val logoutButton by id ("org.aerogear.mobile.example:id/keycloak_logout")
    override val userNameTextBox by id("org.aerogear.mobile.example:id/user_name")
}