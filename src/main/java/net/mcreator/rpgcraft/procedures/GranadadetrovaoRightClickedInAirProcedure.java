package net.mcreator.rpgcraft.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.rpgcraft.item.InvisevelItem;
import net.mcreator.rpgcraft.item.GranadadetrovaoItem;
import net.mcreator.rpgcraft.RpgCraftModElements;

import java.util.Random;
import java.util.Map;

@RpgCraftModElements.ModElement.Tag
public class GranadadetrovaoRightClickedInAirProcedure extends RpgCraftModElements.ModElement {
	public GranadadetrovaoRightClickedInAirProcedure(RpgCraftModElements instance) {
		super(instance, 15);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure GranadadetrovaoRightClickedInAir!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure GranadadetrovaoRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		IWorld world = (IWorld) dependencies.get("world");
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).inventory.clearMatchingItems(p -> new ItemStack(GranadadetrovaoItem.block, (int) (1)).getItem() == p.getItem(),
					(int) 1);
		if (world instanceof World && !world.getWorld().isRemote && entity instanceof LivingEntity) {
			InvisevelItem.shoot(world.getWorld(), (LivingEntity) entity, new Random(), (float) 2, (float) 10, (int) 0);
		}
	}
}
