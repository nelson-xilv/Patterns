package devices

import DeviceType

class Smartwatch: DeviceGoogle {
    override fun typeOs(): String {
        return "OS in Smartwatch: ${DeviceType.SMARTWATCH.nameOs}"
    }
}