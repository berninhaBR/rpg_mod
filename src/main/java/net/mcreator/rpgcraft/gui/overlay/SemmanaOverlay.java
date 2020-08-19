
package net.mcreator.rpgcraft.gui.overlay;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.Minecraft;

import net.mcreator.rpgcraft.procedures.SemmaninhaProcedure;
import net.mcreator.rpgcraft.RpgCraftModElements;

import com.google.common.collect.ImmutableMap;

@RpgCraftModElements.ModElement.Tag
public class SemmanaOverlay extends RpgCraftModElements.ModElement {
	public SemmanaOverlay(RpgCraftModElements instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		MinecraftForge.EVENT_BUS.register(this);
	}

	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent(priority = EventPriority.HIGH)
	public void eventHandler(RenderGameOverlayEvent event) {
		if (!event.isCancelable() && event.getType() == RenderGameOverlayEvent.ElementType.HELMET) {
			int posX = (event.getWindow().getScaledWidth()) / 2;
			int posY = (event.getWindow().getScaledHeight()) / 2;
			PlayerEntity entity = Minecraft.getInstance().player;
			World world = entity.world;
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			if (SemmaninhaProcedure.executeProcedure(ImmutableMap.of("world", world))) {
				Minecraft.getInstance().fontRenderer.drawString("no mana", posX + -212, posY + -118, -6750208);
			}
		}
	}
}
