package com.natamus.superflatworldnoslimes.forge.events;

import com.natamus.superflatworldnoslimes.events.SlimeEvent;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ForgeSlimeEvent {
	@SubscribeEvent
	public static void onWorldJoin(EntityJoinLevelEvent e) {
		if (!SlimeEvent.onWorldJoin(e.getLevel(), e.getEntity())) {
			e.setCanceled(true);
		}
	}
}
