package com.example.examplemod.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.server.MinecraftServer;

@Mixin(MinecraftServer.class)
public class MinecraftServerExampleMixin {
    @Inject(method = "loadLevel", at = @At("HEAD"))
    private void examplemod$beforeLevelLoad(CallbackInfo callbackInfo) {
        // Example injection point for common/server setup logic.
    }
}
