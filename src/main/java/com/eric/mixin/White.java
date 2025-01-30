package com.eric.mixin;

import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(MinecraftServer.class)
public class White {
    @ModifyArg(method = "kickNonWhitelistedPlayers", at = @At(
            value = "INVOKE", target = "Lnet/minecraft/server/network/ServerPlayNetworkHandler;disconnect(Lnet/minecraft/text/Text;)V"), index = 0)
    protected Text modifyDisconnectReason (Text originalReason) {
        return Text.literal("你没有去https://becuy.top/加入职业或者申请内测名额，无法加入服务器");
    }

}