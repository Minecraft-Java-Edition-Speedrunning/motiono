package link.infra.motiono.mixin;

import net.minecraft.client.network.AbstractClientPlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(AbstractClientPlayerEntity.class)
public abstract class AbstractClientPlayerEntityMixin {
    @Inject(method = "getSpeed", at = @At(value = "HEAD"), cancellable = true)
    public void onGetSpeed(CallbackInfoReturnable<Float> cir) {
        cir.setReturnValue(1.0f);
    }
}
