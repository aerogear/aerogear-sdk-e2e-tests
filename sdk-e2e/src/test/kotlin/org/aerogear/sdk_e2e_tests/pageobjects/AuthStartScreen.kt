package org.aerogear.sdk_e2e_tests.pageobjects

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