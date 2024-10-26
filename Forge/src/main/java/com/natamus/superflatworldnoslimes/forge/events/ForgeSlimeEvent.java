package com.natamus.superflatworldnoslimes.forge.events;

import com.natamus.superflatworldnoslimes.events.SlimeEvent;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class ForgeSlimeEvent {
	@SubscribeEvent
	public void onWorldJoin(EntityJoinLevelEvent e) {
		if (!SlimeEvent.onWorldJoin(e.getLevel(), e.getEntity())) {
			e.setCanceled(true);
		}
	}
}
