
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theplanetarymod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.theplanetarymod.ThePlanetaryModMod;

public class ThePlanetaryModModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, ThePlanetaryModMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> OBSIDIAN_PINNACLE = REGISTRY.register("obsidian_pinnacle", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("the_planetary_mod", "obsidian_pinnacle")));
	public static final DeferredHolder<SoundEvent, SoundEvent> SOGGY_SWAMP = REGISTRY.register("soggy_swamp", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("the_planetary_mod", "soggy_swamp")));
	public static final DeferredHolder<SoundEvent, SoundEvent> RANDOM = REGISTRY.register("random", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("the_planetary_mod", "random")));
}
