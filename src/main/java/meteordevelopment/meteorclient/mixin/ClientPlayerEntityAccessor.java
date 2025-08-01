/*
 * This file is part of the Meteor Client distribution (https://github.com/MeteorDevelopment/meteor-client).
 * Copyright (c) Meteor Development.
 */

package meteordevelopment.meteorclient.mixin;

import net.minecraft.client.network.ClientPlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(ClientPlayerEntity.class)
public interface ClientPlayerEntityAccessor {
    @Accessor("mountJumpStrength")
    void meteor$setMountJumpStrength(float strength);

    @Accessor("ticksSinceLastPositionPacketSent")
    void meteor$setTicksSinceLastPositionPacketSent(int ticks);

    @Invoker("canSprint")
    boolean meteor$invokeCanSprint();
}
