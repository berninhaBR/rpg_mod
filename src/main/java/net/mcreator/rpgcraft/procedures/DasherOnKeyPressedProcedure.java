package net.mcreator.rpgcraft.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.Direction;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.rpgcraft.item.DashItem;
import net.mcreator.rpgcraft.item.Armadura_barbaraArmorItem;
import net.mcreator.rpgcraft.RpgCraftModVariables;
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
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure DasherOnKeyPressed!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((RpgCraftModVariables.WorldVariables.get(world).mana) == 0)) {
		}
		if ((((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).inventory.armorInventory.get(0) : ItemStack.EMPTY)
				.getItem() == new ItemStack(Armadura_barbaraArmorItem.boots, (int) (1)).getItem())) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SPEED, (int) 2, (int) 3));
			if (((RpgCraftModVariables.WorldVariables.get(world).mana) == 3)) {
				RpgCraftModVariables.WorldVariables.get(world).mana = (double) 2;
				RpgCraftModVariables.WorldVariables.get(world).syncData(world);
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
			} else {
				if (((RpgCraftModVariables.WorldVariables.get(world).mana) == 2)) {
					RpgCraftModVariables.WorldVariables.get(world).mana = (double) 1;
					RpgCraftModVariables.WorldVariables.get(world).syncData(world);
				} else {
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
					if (((RpgCraftModVariables.WorldVariables.get(world).mana) == 2)) {
						RpgCraftModVariables.WorldVariables.get(world).mana = (double) 1;
						RpgCraftModVariables.WorldVariables.get(world).syncData(world);
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
					} else {
						if (((RpgCraftModVariables.WorldVariables.get(world).mana) == 1)) {
							RpgCraftModVariables.WorldVariables.get(world).mana = (double) 0;
							RpgCraftModVariables.WorldVariables.get(world).syncData(world);
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
			}
		} else {
			if (((entity instanceof PlayerEntity)
					? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(DashItem.block, (int) (1)))
					: false)) {
				if (((RpgCraftModVariables.WorldVariables.get(world).mana) == 3)) {
					RpgCraftModVariables.WorldVariables.get(world).mana = (double) 2;
					RpgCraftModVariables.WorldVariables.get(world).syncData(world);
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
				} else {
					if (((RpgCraftModVariables.WorldVariables.get(world).mana) == 2)) {
						RpgCraftModVariables.WorldVariables.get(world).mana = (double) 1;
						RpgCraftModVariables.WorldVariables.get(world).syncData(world);
					} else {
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
						if (((RpgCraftModVariables.WorldVariables.get(world).mana) == 2)) {
							RpgCraftModVariables.WorldVariables.get(world).mana = (double) 1;
							RpgCraftModVariables.WorldVariables.get(world).syncData(world);
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
						} else {
							if (((RpgCraftModVariables.WorldVariables.get(world).mana) == 1)) {
								RpgCraftModVariables.WorldVariables.get(world).mana = (double) 0;
								RpgCraftModVariables.WorldVariables.get(world).syncData(world);
								if (((entity.getHorizontalFacing()) == Direction.NORTH)) {
									{
										Entity _ent = entity;
										_ent.setPositionAndUpdate(x, y, (z - 5));
										if (_ent instanceof ServerPlayerEntity) {
											((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, y, (z - 5), _ent.rotationYaw,
													_ent.rotationPitch, Collections.emptySet());
										}
									}
								} else if (((entity.getHorizontalFacing()) == Direction.SOUTH)) {
									{
										Entity _ent = entity;
										_ent.setPositionAndUpdate(x, y, (z + 5));
										if (_ent instanceof ServerPlayerEntity) {
											((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, y, (z + 5), _ent.rotationYaw,
													_ent.rotationPitch, Collections.emptySet());
										}
									}
								} else if (((entity.getHorizontalFacing()) == Direction.WEST)) {
									{
										Entity _ent = entity;
										_ent.setPositionAndUpdate((x - 5), y, z);
										if (_ent instanceof ServerPlayerEntity) {
											((ServerPlayerEntity) _ent).connection.setPlayerLocation((x - 5), y, z, _ent.rotationYaw,
													_ent.rotationPitch, Collections.emptySet());
										}
									}
								} else if (((entity.getHorizontalFacing()) == Direction.EAST)) {
									{
										Entity _ent = entity;
										_ent.setPositionAndUpdate((x + 5), y, z);
										if (_ent instanceof ServerPlayerEntity) {
											((ServerPlayerEntity) _ent).connection.setPlayerLocation((x + 5), y, z, _ent.rotationYaw,
													_ent.rotationPitch, Collections.emptySet());
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
