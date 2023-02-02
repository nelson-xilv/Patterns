package factory

import devices.DeviceGoogle

interface DeviceFactory {
    fun createDevice(): DeviceGoogle
}