package store

import devices.DeviceType
import factory.ChromebookFactory
import factory.DeviceFactory
import factory.SmartphoneFactory
import factory.SmartwatchFactory

class GoogleStore() {
    companion object {
        fun createDevice(deviceOs: String): DeviceFactory {
            return when(deviceOs) {
                DeviceType.SMARTPHONE.nameOs -> SmartphoneFactory()
                DeviceType.SMARTWATCH.nameOs -> SmartwatchFactory()
                DeviceType.CHROMEBOOK.nameOs -> ChromebookFactory()
                else -> throw IllegalArgumentException("incorrect OS name: $deviceOs")
            }
        }
    }

    fun createFactory(deviceOS: String) {
        val factory = createDevice(deviceOS)
        val device = factory.createDevice()

        println(device.typeOs())
    }
}