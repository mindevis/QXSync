package com.qx.sync;

import dev.architectury.event.events.common.LifecycleEvent;
import dev.architectury.event.events.common.PlayerEvent;
import dev.architectury.event.events.common.TickEvent;

/**
 * Server-side inventory sync to QMServer; entrypoints call {@link #init()}.
 */
public final class QxSyncMod {

	public static final String MOD_ID = "qxsync";

	private QxSyncMod() {}

	public static void init() {
		QxSyncConfig.bootstrap();

		LifecycleEvent.SERVER_STOPPED.register(server -> InventorySyncManager.shutdown());
		TickEvent.SERVER_POST.register(InventorySyncManager::onServerTick);
		PlayerEvent.PLAYER_QUIT.register(player -> InventorySyncManager.syncPlayerInventory(player));
	}
}
