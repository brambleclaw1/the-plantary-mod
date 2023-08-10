
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theplanetarymod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.theplanetarymod.ThePlanetaryModMod;

public class ThePlanetaryModModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, ThePlanetaryModMod.MODID);
	public static final RegistryObject<SoundEvent> OBSIDIAN_PINNACLE = REGISTRY.register("obsidian_pinnacle", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("the_planetary_mod", "obsidian_pinnacle")));
	public static final RegistryObject<SoundEvent> SOGGY_SWAMP = REGISTRY.register("soggy_swamp", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("the_planetary_mod", "soggy_swamp")));
	public static final RegistryObject<SoundEvent> RANDOM = REGISTRY.register("random", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("the_planetary_mod", "random")));
}
