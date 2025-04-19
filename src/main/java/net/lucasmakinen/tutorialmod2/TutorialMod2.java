package net.lucasmakinen.tutorialmod2;

import net.fabricmc.api.ModInitializer;

import net.lucasmakinen.tutorialmod2.block.ModBlocks;
import net.lucasmakinen.tutorialmod2.item.ModItemGroups;
import net.lucasmakinen.tutorialmod2.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//:3
public class TutorialMod2 implements ModInitializer {
	public static final String MOD_ID = "tutorialmod2";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}