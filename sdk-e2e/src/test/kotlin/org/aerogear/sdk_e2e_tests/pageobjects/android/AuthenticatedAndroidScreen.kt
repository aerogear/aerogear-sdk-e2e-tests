package org.aerogear.sdk_e2e_tests.pageobjects.android

import org.aerogear.akow.pageobject.AndroidScreen
import org.aerogear.sdk_e2e_tests.pageobjects.AuthenticatedScreen

/**
 * Created on 3/7/18.
 */
class AuthenticatedAndroidScreen : AuthenticatedScreen,AndroidScreen() {
    override val logoutButton by id ("org.aerogear.mobile.example:id/keycloak_logout")
    override val userNameTextBox by id("org.aerogear.mobile.example:id/user_name")
}