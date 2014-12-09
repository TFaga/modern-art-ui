# Modern Art UI
[![Build Status](http://img.shields.io/travis/TFaga/modern-art-ui/master.svg?style=flat)](https://travis-ci.org/TFaga/modern-art-ui)

> An android application displaying a UI with modern art as part of a course for developing android applications on Coursera.

## Usage

Packages for the latest stable build can be downloaded on the [releases page](https://github.com/TFaga/modern-art-ui/releases).

You can also download the latest master nightly [debug](https://portalvhdssm6mkh1w1w6cn.blob.core.windows.net/binaries/TFaga/modern-art-ui/modern-art-ui-debug.apk)
or [release](https://portalvhdssm6mkh1w1w6cn.blob.core.windows.net/binaries/TFaga/modern-art-ui/modern-art-ui-release-unsigned.apk) build, also you can view the latest [lint](https://portalvhdssm6mkh1w1w6cn.blob.core.windows.net/binaries/TFaga/modern-art-ui/lint-results.xml) results.

## Building

This is an Android Studio project:
http://developer.android.com/sdk/installing/studio.html

Then import the project into Android Studio:
File -> Import Project -> Choose Directory -> Import from external model ->
    Gradle -> Use default gradle wrapper -> Finish

Alternatively you can use the gradle wrapper to build the application. First make the graddle wrapper executable:
```
chmod +x gradlew
```

To build a debug version:
```
./gradlew assembleDebug
```

To build a release version:
```
./gradlew assembleRelease
```

The apks will be located in `app/build/outputs/apk`.

## Changelog

Recent changes can be viewed on Github on the [Releases Page](https://github.com/TFaga/modern-art-ui/releases)

## Contribute

See the [contributing docs](https://github.com/TFaga/modern-art-ui/blob/master/CONTRIBUTING.md)

When submitting an issue, please follow the [guidelines](https://github.com/TFaga/modern-art-ui/blob/master/CONTRIBUTING.md#bugs).

When submitting a bugfix, write a test that exposes the bug and fails before applying your fix. Submit the test alongside the fix.

When submitting a new feature, add tests that cover the feature.

## License

MIT
