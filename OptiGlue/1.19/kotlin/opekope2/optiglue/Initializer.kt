package opekope2.optiglue

import opekope2.optigui.internal.minecraftWrapper
import org.slf4j.Logger
import org.slf4j.LoggerFactory

val logger: Logger = LoggerFactory.getLogger(Minecraft_1_19_Wrapper.NAME)

@Suppress("unused") // Used by Fabric Loader
fun initialize() {
    minecraftWrapper = Minecraft_1_19_Wrapper()
    Minecraft_1_19_Wrapper.apply { logger.info("$NAME $VERSION initialized in Minecraft ${minecraftWrapper.minecraftVersion}.") }
}
