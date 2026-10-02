package com.serilum.superflatworldnoslimes.forge.events;

import com.serilum.superflatworldnoslimes.events.SlimeEvent;
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
