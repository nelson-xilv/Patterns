package factory

import devices.DeviceGoogle
import devices.Smartwatch

class SmartwatchFactory: DeviceFactory {
    override fun createDevice(): DeviceGoogle {
        return Smartwatch()
    }
}