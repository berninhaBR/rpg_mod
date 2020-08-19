package net.mcreator.rpgcraft.procedures;

import net.minecraft.world.IWorld;

import net.mcreator.rpgcraft.RpgCraftModVariables;
import net.mcreator.rpgcraft.RpgCraftModElements;

import java.util.Map;

@RpgCraftModElements.ModElement.Tag
public class SemmaninhaProcedure extends RpgCraftModElements.ModElement {
	public SemmaninhaProcedure(RpgCraftModElements instance) {
		super(instance, 8);
	}

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure Semmaninha!");
			return false;
		}
		IWorld world = (IWorld) dependencies.get("world");
		return ((RpgCraftModVariables.WorldVariables.get(world).mana) == 0);
	}
}
