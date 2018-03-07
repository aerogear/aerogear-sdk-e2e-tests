package org.aerogear.sdk_e2e_tests.pageobjects.unimportant

import org.aerogear.akow.pageobject.AndroidScreen
import org.aerogear.akow.pageobject.PageObject
import org.openqa.selenium.WebElement

/**
 * Fingerprint dialog shown in Chrome on Android.
 */
interface SetPINDialogScreen : PageObject {
    val alertTitle: WebElement
    val cancelButton: WebElement

    override fun checkScreen() = alertTitle.text.isNotEmpty()

    fun cancel() = cancelButton.click()
}

class SetPINDialogAndroidScreen : SetPINDialogScreen, AndroidScreen() {
    override val alertTitle by id("android:id/alertTitle")
    override val cancelButton by id("android:id/button2")

}