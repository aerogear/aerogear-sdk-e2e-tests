package org.aerogear.sdk_e2e_tests.pageobjects.unimportant

import io.appium.java_client.MobileElement
import io.appium.java_client.android.AndroidDriver
import org.aerogear.akow.pageobject.AndroidScreen
import org.aerogear.akow.pageobject.PageObject
import org.openqa.selenium.WebElement

/**
 * Chrome intro screen that pops up on Android.
 */
interface ChromeIntroScreen : PageObject {
    val title: WebElement
    val acceptButton: WebElement
    val noThanksButton: WebElement

    fun acceptNoThanks() {
        val oldContext=(driver as AndroidDriver<MobileElement>).context
        acceptButton.click()
        (driver as AndroidDriver<MobileElement>).context(oldContext)
        noThanksButton.click()
    }

    override fun checkScreen() = title.text.isNotEmpty()
}

class ChromeIntroAndroidScreen : ChromeIntroScreen, AndroidScreen() {
    override val title by id("com.android.chrome:id/title")
    override val acceptButton by id("com.android.chrome:id/terms_accept")
    override val noThanksButton by id("com.android.chrome:id/negative_button")
}