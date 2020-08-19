package net.mcreator.rpgcraft.procedures;

import net.minecraft.world.IWorld;

import net.mcreator.rpgcraft.RpgCraftModVariables;
import net.mcreator.rpgcraft.RpgCraftModElements;

import java.util.Map;

@RpgCraftModElements.ModElement.Tag
public class ManatestDisplayOverlayIngameProcedure extends RpgCraftModElements.ModElement {
	public ManatestDisplayOverlayIngameProcedure(RpgCraftModElements instance) {
		super(instance, 3);
	}

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure ManatestDisplayOverlayIngame!");
			return false;
		}
		IWorld world = (IWorld) dependencies.get("world");
		return ((RpgCraftModVariables.WorldVariables.get(world).mana) == 3);
	}
}
