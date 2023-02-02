package devices

import DeviceType

class Chromebook: DeviceGoogle {
    override fun typeOs(): String {
        return "OS in Chromebook: ${DeviceType.CHROMEBOOK.nameOs}"
    }
}