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

# How to run against different Appium server

```text
$ APPIUM_SERVER='yourserverhostname:4723' ./gradlew test
```

# How to write a new test using page objects?

1. Create new test class in the `org.aerogear.sdkE2ETests.tests` extending [`BaseTest`](sdk-e2e/src/test/kotlin/org/aerogear/sdkE2ETests/base/BaseTest.kt).
2. Create page objects for the flow of the test case
    * write level 1 page object (like one in [`AuthenticatedScreen`](sdk-e2e/src/test/kotlin/org/aerogear/sdkE2ETests/pageobjects/AuthenticatedScreen.kt) - interface that contains all UI elements that are needed for the test as properties of the interface 
    * create level 2 page object for Android (like one in [`AutenticatedAndroidScreen`](sdk-e2e/src/test/kotlin/org/aerogear/sdkE2ETests/pageobjects/android/AuthenticatedAndroidScreen.kt))) implementing page 1 interface and `AndroidScreen` class
    * use Appium Desktop to scan for elements used on the each "screen" in the flow and override UI element properties in the level 2 pageobject, fill in how they will be obtained on the screen using delegations like `by id()`, `by accessibilityId()`, etc.
    * implement test logic as methods in the page object (platform indepenent in the interface)
    * add level 2 page object into the `screens` section in [`init.kt`](sdk-e2e/src/test/kotlin/org/aerogear/sdkE2ETests/init.kt)
    
3. Write your test using [akow DSL](https://github.com/aerogear/akow). 

More detailed approach for writing tests using the Akow library is in [its documentation](https://github.com/aerogear/akow). 
