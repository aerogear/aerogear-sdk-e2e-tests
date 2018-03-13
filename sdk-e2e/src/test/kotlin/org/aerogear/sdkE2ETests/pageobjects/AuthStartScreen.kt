package org.aerogear.sdkE2ETests.pageobjects

import org.aerogear.akow.pageobject.PageObject
import org.openqa.selenium.WebElement

/**
 * Authentication functionality screen
 */
interface AuthStartScreen : PageObject {
    val loginButton: WebElement


    /**
     * Starts login flow.
     */
    fun startLogin() {
        loginButton.click()
    }
}