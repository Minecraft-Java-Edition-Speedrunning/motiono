package link.infra.motiono.mixin;

import net.minecraft.entity.player.ClientPlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ClientPlayerEntity.class)
public abstract class ClientPlayerEntityMixin {
    @Inject(method = "method_1305", at = @At(value = "HEAD"), cancellable = true)
    public void onGetSpeed(CallbackInfoReturnable<Float> cir) {
        cir.setReturnValue(1.0f);
    }
}
