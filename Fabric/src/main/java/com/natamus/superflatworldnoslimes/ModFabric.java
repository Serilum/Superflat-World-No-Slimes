package com.natamus.superflatworldnoslimes;

import com.natamus.collective.check.RegisterMod;
import com.natamus.collective.fabric.callbacks.CollectiveEntityEvents;
import com.natamus.superflatworldnoslimes.events.SlimeEvent;
import com.natamus.superflatworldnoslimes.util.Reference;
import net.fabricmc.api.ModInitializer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;

public class ModFabric implements ModInitializer {
	
	@Override
	public void onInitialize() {
		setGlobalConstants();
		ModCommon.init();

		loadEvents();

		RegisterMod.register(Reference.NAME, Reference.MOD_ID, Reference.VERSION, Reference.ACCEPTED_VERSIONS);
	}

	private void loadEvents() {
		CollectiveEntityEvents.PRE_ENTITY_JOIN_WORLD.register((Level world, Entity entity) -> {
			return SlimeEvent.onWorldJoin(world, entity);
		});
	}

	private static void setGlobalConstants() {

	}
}
