package com.qx.sync.neoforge;

import com.qx.sync.QxSyncMod;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(QxSyncMod.MOD_ID)
public final class QxSyncNeoForge {

	public QxSyncNeoForge(IEventBus modBus) {
		QxSyncMod.init();
	}
}
