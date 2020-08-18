
package net.mcreator.rpgcraft.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.block.BlockState;

import net.mcreator.rpgcraft.itemgroup.RpgItemGroup;
import net.mcreator.rpgcraft.RpgCraftModElements;

import java.util.List;

@RpgCraftModElements.ModElement.Tag
public class DashItem extends RpgCraftModElements.ModElement {
	@ObjectHolder("rpg_craft:dash")
	public static final Item block = null;
	public DashItem(RpgCraftModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(RpgItemGroup.tab).maxDamage(1000));
			setRegistryName("dash");
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

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("press END to dash"));
		}
	}
}
