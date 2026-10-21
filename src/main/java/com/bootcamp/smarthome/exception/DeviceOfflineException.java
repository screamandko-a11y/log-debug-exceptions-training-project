package com.bootcamp.smarthome.exception;


// bonus task
public class DeviceOfflineException extends HomeAutomationException {
    public DeviceOfflineException(String deviceId) {
        super("Device " + deviceId + " is offline");
    }
}
