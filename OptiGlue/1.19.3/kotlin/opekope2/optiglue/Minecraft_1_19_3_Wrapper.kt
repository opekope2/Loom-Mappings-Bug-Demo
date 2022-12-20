package opekope2.optiglue

import net.minecraft.MinecraftVersion
import opekope2.optigui.internal.MinecraftWrapper

@Suppress("ClassName") // Because no dots are allowed
class Minecraft_1_19_3_Wrapper : MinecraftWrapper() {
    override val name: String get() = NAME
    override val version: String get() = VERSION
    override val minecraftVersion: String get() = MinecraftVersion.CURRENT.name

    companion object {
        const val NAME = "OptiGlue"
        const val VERSION = "@mod_version@+1.19.3"
    }
}
