package net.maakuarc.testmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.maakuarc.testmod.TestMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems
{
    public static final Item STRANGE_PICKAXE = registerItem("strange_pickaxe",
            new Item(new FabricItemSettings().group(ModItemGroup.WHY).maxCount(1)));
    public static final Item STRANGE_HOE = registerItem("strange_hoe",
            new Item(new FabricItemSettings().group(ModItemGroup.WHY).maxCount(1)));
    public static final Item STRANGE_AXE = registerItem("strange_axe",
            new Item(new FabricItemSettings().group(ModItemGroup.WHY).maxCount(1)));
    public static final Item STRANGE_SHOVEL = registerItem("strange_shovel",
            new Item(new FabricItemSettings().group(ModItemGroup.WHY).maxCount(1)));

    public static Item registerItem(String name, Item item)
    {
        return Registry.register(Registry.ITEM, new Identifier(TestMod.MOD_ID, name), item);
    }
    public static void registerModItems()
    {
        TestMod.LOGGER.info("Registering Mod Items for " + TestMod.MOD_ID);
    }

}
