package net.maakuarc.testmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.maakuarc.testmod.TestMod;
import net.maakuarc.testmod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup
{
    public static final ItemGroup WHY = FabricItemGroupBuilder.build(new Identifier(TestMod.MOD_ID, "why"),
            () -> new ItemStack(ModBlocks.INVERTED_END_STONE));
}
