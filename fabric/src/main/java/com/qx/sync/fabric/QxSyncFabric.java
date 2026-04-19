package com.qx.sync.fabric;

import com.qx.sync.QxSyncMod;
import net.fabricmc.api.ModInitializer;

public final class QxSyncFabric implements ModInitializer {

	@Override
	public void onInitialize() {
		QxSyncMod.init();
	}
}
