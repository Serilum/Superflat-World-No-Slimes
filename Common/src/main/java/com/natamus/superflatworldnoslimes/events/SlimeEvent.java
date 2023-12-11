package com.natamus.superflatworldnoslimes.events;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.monster.Slime;
import net.minecraft.world.level.Level;

public class SlimeEvent {
	public static boolean onWorldJoin(Level world, Entity entity) {
		if (world.isClientSide) {
			return true;
		}
		
		ServerLevel serverworld = (ServerLevel)world;
		
		if (entity instanceof Slime) {
			return !serverworld.getServer().getWorldData().worldGenSettings().isFlatWorld();
		}
		
		return true;
	}
}
