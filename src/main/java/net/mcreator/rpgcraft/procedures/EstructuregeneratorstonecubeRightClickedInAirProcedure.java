package net.mcreator.rpgcraft.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.rpgcraft.item.EstructuregeneratorstonecubeItem;
import net.mcreator.rpgcraft.item.AszcItem;
import net.mcreator.rpgcraft.RpgCraftModElements;

import java.util.Random;
import java.util.Map;

@RpgCraftModElements.ModElement.Tag
public class EstructuregeneratorstonecubeRightClickedInAirProcedure extends RpgCraftModElements.ModElement {
	public EstructuregeneratorstonecubeRightClickedInAirProcedure(RpgCraftModElements instance) {
		super(instance, 18);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure EstructuregeneratorstonecubeRightClickedInAir!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure EstructuregeneratorstonecubeRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		IWorld world = (IWorld) dependencies.get("world");
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).inventory
					.clearMatchingItems(p -> new ItemStack(EstructuregeneratorstonecubeItem.block, (int) (1)).getItem() == p.getItem(), (int) 1);
		if (world instanceof World && !world.getWorld().isRemote && entity instanceof LivingEntity) {
			AszcItem.shoot(world.getWorld(), (LivingEntity) entity, new Random(), (float) 0, (float) 0, (int) 0);
		}
	}
}
