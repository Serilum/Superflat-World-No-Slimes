package com.natamus.superflatworldnoslimes.forge.events;

import com.natamus.superflatworldnoslimes.events.SlimeEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class ForgeSlimeEvent {
	@SubscribeEvent
	public void onWorldJoin(EntityJoinWorldEvent e) {
		if (!SlimeEvent.onWorldJoin(e.getWorld(), e.getEntity())) {
			e.setCanceled(true);
		}
	}
}
