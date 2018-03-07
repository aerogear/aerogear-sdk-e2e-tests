package org.aerogear.sdk_e2e_tests.tests

import org.aerogear.akow.example.test.pageobjects.MainScreen
import org.aerogear.sdk_e2e_tests.base.BaseTest
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

/**
 * Created on 3/7/18.
 */
@RunWith(Parameterized::class)
class InitialTest : BaseTest() {

    @Test
    fun testOpenNavDrawer() {
        akow {
            on<MainScreen> {
                navDrawer.click()
            }
        }
    }
}