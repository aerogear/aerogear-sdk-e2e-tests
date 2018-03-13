package org.aerogear.sdkE2ETests.pageobjects

import org.aerogear.akow.pageobject.PageObject
import org.openqa.selenium.WebElement

/**
 * Screen representing authenticated user.
 */
interface AuthenticatedScreen : PageObject {
    val logoutButton: WebElement
    val userNameTextBox:WebElement
}