package opekope2.optigui.internal

/**
 * Gets or sets the current wrapper interface
 */
lateinit var minecraftWrapper: MinecraftWrapper

/**
 * A wrapper interface to communicate with Minecraft through the wrapper library.
 * Contains methods used by OptiGUI
 */
abstract class MinecraftWrapper {
    /**
     * Wrapper library name
     */
    abstract val name: String

    /**
     * Wrapper library version
     */
    abstract val version: String

    /**
     * Running Minecraft version
     */
    abstract val minecraftVersion: String
}
