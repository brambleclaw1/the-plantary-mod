
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theplanetarymod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.Item;

import net.mcreator.theplanetarymod.item.WardenPlanetItem;
import net.mcreator.theplanetarymod.item.SnifferDimensionItem;
import net.mcreator.theplanetarymod.item.SlimearmourItem;
import net.mcreator.theplanetarymod.item.SlimeDimensionItem;
import net.mcreator.theplanetarymod.item.SkyWorldItem;
import net.mcreator.theplanetarymod.item.AllayPlanetItem;
import net.mcreator.theplanetarymod.ThePlanetaryModMod;

public class ThePlanetaryModModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(ThePlanetaryModMod.MODID);
	public static final DeferredHolder<Item, Item> ALLAY_PLANET = REGISTRY.register("allay_planet", AllayPlanetItem::new);
	public static final DeferredHolder<Item, Item> WARDEN_PLANET = REGISTRY.register("warden_planet", WardenPlanetItem::new);
	public static final DeferredHolder<Item, Item> SLIME_DIMENSION = REGISTRY.register("slime_dimension", SlimeDimensionItem::new);
	public static final DeferredHolder<Item, Item> SLIMEARMOUR_HELMET = REGISTRY.register("slimearmour_helmet", SlimearmourItem.Helmet::new);
	public static final DeferredHolder<Item, Item> SLIMEARMOUR_CHESTPLATE = REGISTRY.register("slimearmour_chestplate", SlimearmourItem.Chestplate::new);
	public static final DeferredHolder<Item, Item> SLIMEARMOUR_LEGGINGS = REGISTRY.register("slimearmour_leggings", SlimearmourItem.Leggings::new);
	public static final DeferredHolder<Item, Item> SLIMEARMOUR_BOOTS = REGISTRY.register("slimearmour_boots", SlimearmourItem.Boots::new);
	public static final DeferredHolder<Item, Item> SNIFFER_DIMENSION = REGISTRY.register("sniffer_dimension", SnifferDimensionItem::new);
	public static final DeferredHolder<Item, Item> SKY_WORLD = REGISTRY.register("sky_world", SkyWorldItem::new);
	// Start of user code block custom items
	// End of user code block custom items
}
