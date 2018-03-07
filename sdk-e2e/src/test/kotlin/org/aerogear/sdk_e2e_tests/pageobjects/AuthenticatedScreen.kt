package org.aerogear.sdk_e2e_tests.pageobjects

import org.aerogear.akow.pageobject.PageObject
import org.openqa.selenium.WebElement

/**
 * Screen representing authenticated user.
 */
interface AuthenticatedScreen : PageObject {
    val logoutButton: WebElement
    val userNameTextBox:WebElement
}