
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theplanetarymod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.theplanetarymod.ThePlanetaryModMod;

public class ThePlanetaryModModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ThePlanetaryModMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> PLANETARY_MOD = REGISTRY.register("planetary_mod",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.the_planetary_mod.planetary_mod")).icon(() -> new ItemStack(Blocks.NETHER_PORTAL)).displayItems((parameters, tabData) -> {
				tabData.accept(ThePlanetaryModModItems.ALLAY_PLANET.get());
				tabData.accept(ThePlanetaryModModItems.WARDEN_PLANET.get());
				tabData.accept(ThePlanetaryModModItems.SLIME_DIMENSION.get());
				tabData.accept(ThePlanetaryModModItems.SLIMEARMOUR_HELMET.get());
				tabData.accept(ThePlanetaryModModItems.SLIMEARMOUR_CHESTPLATE.get());
				tabData.accept(ThePlanetaryModModItems.SLIMEARMOUR_LEGGINGS.get());
				tabData.accept(ThePlanetaryModModItems.SLIMEARMOUR_BOOTS.get());
				tabData.accept(ThePlanetaryModModItems.SNIFFER_DIMENSION.get());
				tabData.accept(ThePlanetaryModModItems.SKY_WORLD.get());
			})

					.build());
}
