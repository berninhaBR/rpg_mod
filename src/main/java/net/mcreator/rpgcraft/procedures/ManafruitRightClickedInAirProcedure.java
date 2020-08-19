package net.mcreator.rpgcraft.procedures;

import net.minecraft.world.IWorld;

import net.mcreator.rpgcraft.RpgCraftModVariables;
import net.mcreator.rpgcraft.RpgCraftModElements;

import java.util.Map;

@RpgCraftModElements.ModElement.Tag
public class ManafruitRightClickedInAirProcedure extends RpgCraftModElements.ModElement {
	public ManafruitRightClickedInAirProcedure(RpgCraftModElements instance) {
		super(instance, 9);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure ManafruitRightClickedInAir!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		if (((RpgCraftModVariables.WorldVariables.get(world).mana) == 2)) {
			RpgCraftModVariables.WorldVariables.get(world).mana = (double) 3;
			RpgCraftModVariables.WorldVariables.get(world).syncData(world);
		} else {
			if (((RpgCraftModVariables.WorldVariables.get(world).mana) == 1)) {
				RpgCraftModVariables.WorldVariables.get(world).mana = (double) 2;
				RpgCraftModVariables.WorldVariables.get(world).syncData(world);
			} else {
				if (((RpgCraftModVariables.WorldVariables.get(world).mana) == 0)) {
					RpgCraftModVariables.WorldVariables.get(world).mana = (double) 1;
					RpgCraftModVariables.WorldVariables.get(world).syncData(world);
				}
			}
		}
	}
}
