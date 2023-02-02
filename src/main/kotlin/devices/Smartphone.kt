package devices

import DeviceType

class Smartphone() : DeviceGoogle {
    override fun typeOs(): String {
        return "OS in Smartphone: ${DeviceType.SMARTPHONE.nameOs}"
    }
}