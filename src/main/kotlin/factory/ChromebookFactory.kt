package factory

import devices.Chromebook
import devices.DeviceGoogle

class ChromebookFactory: DeviceFactory {
    override fun createDevice(): DeviceGoogle {
        return Chromebook()
    }
}