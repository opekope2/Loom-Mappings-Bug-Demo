package opekope2.optiglue.mixin;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.util.Identifier;
import opekope2.optigui.internal.TextureReplacer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

import static opekope2.optiglue.UtilKt.unwrap;
import static opekope2.optiglue.UtilKt.wrap;

// Inject before Animatica for full compatibility
@Mixin(value = RenderSystem.class, priority = 900)
public final class RenderSystemMixin {
    @ModifyVariable(method = "_setShaderTexture(ILnet/minecraft/util/Identifier;)V", at = @At("HEAD"), index = 1, argsOnly = true)
    private static Identifier setShaderTextureMixin(Identifier id) {
        return unwrap(TextureReplacer.INSTANCE.getReplacement(wrap(id)));
    }
}
