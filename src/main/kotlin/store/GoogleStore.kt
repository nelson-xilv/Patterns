package store

import DeviceType
import factory.ChromebookFactory
import factory.DeviceFactory
import factory.SmartphoneFactory
import factory.SmartwatchFactory

class GoogleStore() {
    companion object {
        fun createDevice(deviceType: String): DeviceFactory {
            return when(deviceType) {
                DeviceType.SMARTPHONE.nameOs -> SmartphoneFactory()
                DeviceType.SMARTWATCH.nameOs -> SmartwatchFactory()
                DeviceType.CHROMEBOOK.nameOs -> ChromebookFactory()
                else -> throw IllegalArgumentException("incorrect OS name: $deviceType")
            }
        }
    }

    fun createFactory(deviceOS: String) {
        val factory = createDevice(deviceOS)
        val device = factory.createDevice()

        println(device.typeOs())
    }
}