package factory

import devices.DeviceGoogle
import devices.Smartphone

class SmartphoneFactory: DeviceFactory {
    override fun createDevice(): DeviceGoogle {
        return Smartphone()
    }
}