package com.android.uiautomator.client;

import android.support.test.uiautomator.UiDevice;
import android.support.test.InstrumentationRegistry;

public class Device {

    private static UiDevice uiDevice;

    public static final UiDevice getUiDevice() {
        if (uiDevice == null) {
            uiDevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        }
        return uiDevice;
    }
}
