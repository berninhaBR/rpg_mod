
package net.mcreator.rpgcraft.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.UseAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.entity.LivingEntity;

import net.mcreator.rpgcraft.procedures.ManafruitRightClickedInAirProcedure;
import net.mcreator.rpgcraft.itemgroup.RpgItemGroup;
import net.mcreator.rpgcraft.RpgCraftModElements;

import java.util.Map;
import java.util.HashMap;

@RpgCraftModElements.ModElement.Tag
public class ManafrutaItem extends RpgCraftModElements.ModElement {
	@ObjectHolder("rpg_craft:manafruta")
	public static final Item block = null;
	public ManafrutaItem(RpgCraftModElements instance) {
		super(instance, 10);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(RpgItemGroup.tab).maxStackSize(64).food((new Food.Builder()).hunger(6).saturation(2f).build()));
			setRegistryName("manafruta");
		}

		@Override
		public UseAction getUseAction(ItemStack par1ItemStack) {
			return UseAction.EAT;
		}

		@Override
		public ItemStack onItemUseFinish(ItemStack itemStack, World world, LivingEntity entity) {
			ItemStack retval = super.onItemUseFinish(itemStack, world, entity);
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("world", world);
				ManafruitRightClickedInAirProcedure.executeProcedure($_dependencies);
			}
			return retval;
		}
	}
}
