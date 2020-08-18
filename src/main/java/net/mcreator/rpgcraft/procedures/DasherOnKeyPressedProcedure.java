package net.mcreator.rpgcraft.procedures;

import net.minecraft.util.Direction;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.rpgcraft.item.DashItem;
import net.mcreator.rpgcraft.RpgCraftModElements;

import java.util.Map;
import java.util.Collections;

@RpgCraftModElements.ModElement.Tag
public class DasherOnKeyPressedProcedure extends RpgCraftModElements.ModElement {
	public DasherOnKeyPressedProcedure(RpgCraftModElements instance) {
		super(instance, 2);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure DasherOnKeyPressed!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure DasherOnKeyPressed!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure DasherOnKeyPressed!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure DasherOnKeyPressed!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if (((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(DashItem.block, (int) (1))) : false)) {
			if (((entity.getHorizontalFacing()) == Direction.NORTH)) {
				{
					Entity _ent = entity;
					_ent.setPositionAndUpdate(x, y, (z - 5));
					if (_ent instanceof ServerPlayerEntity) {
						((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, y, (z - 5), _ent.rotationYaw, _ent.rotationPitch,
								Collections.emptySet());
					}
				}
			} else if (((entity.getHorizontalFacing()) == Direction.SOUTH)) {
				{
					Entity _ent = entity;
					_ent.setPositionAndUpdate(x, y, (z + 5));
					if (_ent instanceof ServerPlayerEntity) {
						((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, y, (z + 5), _ent.rotationYaw, _ent.rotationPitch,
								Collections.emptySet());
					}
				}
			} else if (((entity.getHorizontalFacing()) == Direction.WEST)) {
				{
					Entity _ent = entity;
					_ent.setPositionAndUpdate((x - 5), y, z);
					if (_ent instanceof ServerPlayerEntity) {
						((ServerPlayerEntity) _ent).connection.setPlayerLocation((x - 5), y, z, _ent.rotationYaw, _ent.rotationPitch,
								Collections.emptySet());
					}
				}
			} else if (((entity.getHorizontalFacing()) == Direction.EAST)) {
				{
					Entity _ent = entity;
					_ent.setPositionAndUpdate((x + 5), y, z);
					if (_ent instanceof ServerPlayerEntity) {
						((ServerPlayerEntity) _ent).connection.setPlayerLocation((x + 5), y, z, _ent.rotationYaw, _ent.rotationPitch,
								Collections.emptySet());
					}
				}
			}
		}
	}
}
