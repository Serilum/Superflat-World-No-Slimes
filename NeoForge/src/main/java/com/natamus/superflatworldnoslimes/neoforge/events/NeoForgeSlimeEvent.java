package com.natamus.superflatworldnoslimes.neoforge.events;

import com.natamus.superflatworldnoslimes.events.SlimeEvent;
import net.neoforged.neoforge.event.entity.EntityJoinLevelEvent;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class NeoForgeSlimeEvent {
	@SubscribeEvent
	public static void onWorldJoin(EntityJoinLevelEvent e) {
		if (!SlimeEvent.onWorldJoin(e.getLevel(), e.getEntity())) {
			e.setCanceled(true);
		}
	}
}
