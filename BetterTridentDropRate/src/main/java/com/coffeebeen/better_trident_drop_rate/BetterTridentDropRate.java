package com.coffeebeen.better_trident_drop_rate;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod("better_trident_drop_rate")
public class BetterTridentDropRate {

	public BetterTridentDropRate() {
		MinecraftForge.EVENT_BUS.register(this);
	}
	
}
