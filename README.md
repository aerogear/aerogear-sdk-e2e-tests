# Aerogear Services SDK End-to-end test suite 

Set of UI tests to check SDKs functionality and possible regressions.

# Current state

Currently works only with [aerogear-android-sdk](https://github.com/aerogear/aerogear-android-sdk).

# Requirements

For local runs:
* properly installed Android SDK with an Android Emulator
* [Appium](http://appium.io/) server

# How to run locally

Start your local Appium server and launch the Android emulator.
Then execute:
```text
$ ./gradlew test
```

