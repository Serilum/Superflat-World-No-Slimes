package com.serilum.superflatworldnoslimes;

import com.natamus.collective.check.RegisterMod;
import com.natamus.collective.check.ShouldLoadCheck;
import com.natamus.collective.fabric.callbacks.CollectiveEntityEvents;
import com.serilum.superflatworldnoslimes.events.SlimeEvent;
import com.serilum.superflatworldnoslimes.util.Reference;
import net.fabricmc.api.ModInitializer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;

public class ModFabric implements ModInitializer {
	
	@Override
	public void onInitialize() {
		if (!ShouldLoadCheck.shouldLoad(Reference.MOD_ID)) {
			return;
		}

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
