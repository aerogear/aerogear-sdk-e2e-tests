package org.aerogear.akow.example.test.pageobjects.android

import org.aerogear.akow.example.test.pageobjects.MainScreen
import org.aerogear.akow.pageobject.AndroidScreen

/**
 * Main screen with navigation drawer.
 */
class MainAndroidScreen : AndroidScreen(), MainScreen {
    override val navDrawer by accessibilityId("Open navigation drawer")
    override val mnuHome by xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[1]")
    override val mnuAuth by xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[3]")

}