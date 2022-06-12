package top.shenjack.carpet_translate.mixin;

import net.minecraft.client.gui.screen.TitleScreen;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class CarpetTranslateMixin {

    private static final String MOD_NAME = "CarpetTranslate";
    private static final Logger LOGGER = LogManager.getLogger(MOD_NAME);

    @Inject(at = @At("HEAD"), method = "init()V")
    private void init(CallbackInfo info) {
        LOGGER.info("hello log4j in mod mixin");
    }

}
