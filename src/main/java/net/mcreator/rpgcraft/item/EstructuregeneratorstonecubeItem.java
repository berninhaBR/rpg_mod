
package net.mcreator.rpgcraft.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.rpgcraft.itemgroup.RpgItemGroup;
import net.mcreator.rpgcraft.RpgCraftModElements;

@RpgCraftModElements.ModElement.Tag
public class EstructuregeneratorstonecubeItem extends RpgCraftModElements.ModElement {
	@ObjectHolder("rpg_craft:estructuregeneratorstonecube")
	public static final Item block = null;
	public EstructuregeneratorstonecubeItem(RpgCraftModElements instance) {
		super(instance, 16);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(RpgItemGroup.tab).maxStackSize(1));
			setRegistryName("estructuregeneratorstonecube");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
