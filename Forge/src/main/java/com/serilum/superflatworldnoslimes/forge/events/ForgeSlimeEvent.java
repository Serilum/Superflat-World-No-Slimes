package com.serilum.superflatworldnoslimes.forge.events;

import com.serilum.superflatworldnoslimes.events.SlimeEvent;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.eventbus.api.listener.SubscribeEvent;

import java.lang.invoke.MethodHandles;

public class ForgeSlimeEvent {
	public static void registerEventsInBus() {
		// BusGroup.DEFAULT.register(MethodHandles.lookup(), ForgeSlimeEvent.class);

		EntityJoinLevelEvent.BUS.addListener(ForgeSlimeEvent::onWorldJoin);
	}

	@SubscribeEvent
	public static boolean onWorldJoin(EntityJoinLevelEvent e) {
		if (!SlimeEvent.onWorldJoin(e.getLevel(), e.getEntity())) {
			return true;
		}
		return false;
	}
}
