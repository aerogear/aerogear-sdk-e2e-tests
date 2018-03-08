package org.aerogear.sdk_e2e_tests.tests

import org.aerogear.akow.example.test.pageobjects.MainScreen
import org.aerogear.sdk_e2e_tests.BuildConfig
import org.aerogear.sdk_e2e_tests.base.BaseTest
import org.aerogear.sdk_e2e_tests.clearPackage
import org.aerogear.sdk_e2e_tests.pageobjects.AuthStartScreen
import org.aerogear.sdk_e2e_tests.pageobjects.AuthenticatedScreen
import org.aerogear.sdk_e2e_tests.pageobjects.KeycloakLoginScreen
import org.aerogear.sdk_e2e_tests.pageobjects.unimportant.ChromeIntroScreen
import org.aerogear.sdk_e2e_tests.pageobjects.unimportant.SetPINDialogScreen
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import java.lang.Thread.sleep
import kotlin.test.assertEquals

/**
 * Test functionality of Auth module through Example app.
 */
@RunWith(Parameterized::class)
class AuthTest : BaseTest() {

    private val USERNAME = "user1"
    private val PASSWORD = "123"

    /**
     * Required to prevent reauthentication with remembered session.
     */
    @Before
    fun killBrowserBeforehand() {
        clearPackage(BuildConfig.BROWSER_PACKAGE)
    }

    @Test
    fun testLoginAndLogout() {
        akow {
            on<MainScreen> {
                selectNavigationItem(mnuAuth)

                on<AuthStartScreen> {
                    startLogin()
                }

                androidOnly {
                    maybeOn<ChromeIntroScreen> { acceptNoThanks() }
                    sleep(5000)
                    maybeOn<SetPINDialogScreen> { cancel() }
                }

                sleep(5000)
                on<KeycloakLoginScreen> {
                    login(USERNAME, PASSWORD)
                }
                sleep(5000)
                on<AuthenticatedScreen> {
                    assertEquals("User 1", userNameTextBox.text)
                }

                selectNavigationItem(mnuHome)

                selectNavigationItem(mnuAuth)

                on<AuthenticatedScreen> {
                    assertEquals("User 1", userNameTextBox.text)
                    logoutButton.click()
                }
            }
        }
    }
}