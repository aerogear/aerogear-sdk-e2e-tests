package org.aerogear.akow.example.test.pageobjects

import org.aerogear.akow.pageobject.PageObject
import org.openqa.selenium.WebElement

/**
 * Main screen.
 */
interface MainScreen : PageObject {

    val navDrawer: WebElement
    val mnuHome: WebElement
    val mnuAuth: WebElement

    fun selectNavigationItem(item: WebElement) {
        navDrawer.click()
        item.click()
    }

}