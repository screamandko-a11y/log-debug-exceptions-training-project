package com.bootcamp.smarthome.exception;


// bonus task
public class DeviceNotFoundException extends  RuntimeException {
    public DeviceNotFoundException(String deviceId) {
        super ("Device " + deviceId + " not found");
    }
}

