package org.aerogear.sdk_e2e_tests.pageobjects

import org.aerogear.akow.pageobject.PageObject
import org.openqa.selenium.WebElement

/**
 * Keycloak login screen.
 */
interface KeycloakLoginScreen : PageObject {
    val usernameInput: WebElement
    val passwordInput: WebElement
    val loginButton: WebElement

    /**
     * Logs in with [username] and [password].
     */
    fun login(username: String, password: String) {
        usernameInput.apply {
            click()
            sendKeys(username)
        }
        passwordInput.apply {
            click()
            sendKeys(password)
        }
        loginButton.click()

    }
}