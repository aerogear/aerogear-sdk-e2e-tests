package org.aerogear.sdk_e2e_tests

import java.io.BufferedReader

/**
 * Created on 1/19/18.
 */

/**
 * Kills android process with [packageName] on connected ADB device.
 */
fun killAndroidProcess(packageName: String) {
    execWithoutOutput(BuildConfig.ADB_EXECUTABLE, "shell", "am", "force-stop", packageName)
}

/**
 * Clears android package data of application with [packageName] on connected ADB device.
 */
fun clearPackage(packageName: String) {
    execWithoutOutput(BuildConfig.ADB_EXECUTABLE, "shell", "pm", "clear", packageName)
}

/**
 * Executes shell command and ignores output.
 * @param cmd shell command
 * @param args command arguments
 */
private fun execWithoutOutput(vararg args: String) {
    val p = Runtime.getRuntime().exec(args)
    val out = p.inputStream.bufferedReader().use(BufferedReader::readText) //there is actually no output expected, so read it all and ignore to prevent hanging
    println(out)
}
