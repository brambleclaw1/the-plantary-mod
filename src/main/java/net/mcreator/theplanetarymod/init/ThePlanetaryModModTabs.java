
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theplanetarymod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ThePlanetaryModModTabs {
	@SubscribeEvent
	public static void buildTabContentsModded(CreativeModeTabEvent.Register event) {
		event.registerCreativeModeTab(new ResourceLocation("the_planetary_mod", "planetary_mod"),
				builder -> builder.title(Component.translatable("item_group.the_planetary_mod.planetary_mod")).icon(() -> new ItemStack(Blocks.NETHER_PORTAL)).displayItems((parameters, tabData) -> {
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

		);
	}
}
