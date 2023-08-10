
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theplanetarymod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.theplanetarymod.block.WardenPlanetPortalBlock;
import net.mcreator.theplanetarymod.block.SnifferDimensionPortalBlock;
import net.mcreator.theplanetarymod.block.SlimeDimensionPortalBlock;
import net.mcreator.theplanetarymod.block.SkyWorldPortalBlock;
import net.mcreator.theplanetarymod.block.AllayPlanetPortalBlock;
import net.mcreator.theplanetarymod.ThePlanetaryModMod;

public class ThePlanetaryModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ThePlanetaryModMod.MODID);
	public static final RegistryObject<Block> ALLAY_PLANET_PORTAL = REGISTRY.register("allay_planet_portal", () -> new AllayPlanetPortalBlock());
	public static final RegistryObject<Block> WARDEN_PLANET_PORTAL = REGISTRY.register("warden_planet_portal", () -> new WardenPlanetPortalBlock());
	public static final RegistryObject<Block> SLIME_DIMENSION_PORTAL = REGISTRY.register("slime_dimension_portal", () -> new SlimeDimensionPortalBlock());
	public static final RegistryObject<Block> SNIFFER_DIMENSION_PORTAL = REGISTRY.register("sniffer_dimension_portal", () -> new SnifferDimensionPortalBlock());
	public static final RegistryObject<Block> SKY_WORLD_PORTAL = REGISTRY.register("sky_world_portal", () -> new SkyWorldPortalBlock());
}
