
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theplanetarymod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;

import net.mcreator.theplanetarymod.block.WardenPlanetPortalBlock;
import net.mcreator.theplanetarymod.block.SnifferDimensionPortalBlock;
import net.mcreator.theplanetarymod.block.SlimeDimensionPortalBlock;
import net.mcreator.theplanetarymod.block.SkyWorldPortalBlock;
import net.mcreator.theplanetarymod.block.AllayPlanetPortalBlock;
import net.mcreator.theplanetarymod.ThePlanetaryModMod;

public class ThePlanetaryModModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(ThePlanetaryModMod.MODID);
	public static final DeferredHolder<Block, Block> ALLAY_PLANET_PORTAL = REGISTRY.register("allay_planet_portal", AllayPlanetPortalBlock::new);
	public static final DeferredHolder<Block, Block> WARDEN_PLANET_PORTAL = REGISTRY.register("warden_planet_portal", WardenPlanetPortalBlock::new);
	public static final DeferredHolder<Block, Block> SLIME_DIMENSION_PORTAL = REGISTRY.register("slime_dimension_portal", SlimeDimensionPortalBlock::new);
	public static final DeferredHolder<Block, Block> SNIFFER_DIMENSION_PORTAL = REGISTRY.register("sniffer_dimension_portal", SnifferDimensionPortalBlock::new);
	public static final DeferredHolder<Block, Block> SKY_WORLD_PORTAL = REGISTRY.register("sky_world_portal", SkyWorldPortalBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
