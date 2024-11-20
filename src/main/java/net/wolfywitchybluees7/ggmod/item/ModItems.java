package net.wolfywitchybluees7.ggmod.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.wolfywitchybluees7.ggmod.GenerallyGeneral;

public class ModItems {


    private static final Item COOL_ITEM = registerItem("cool_item", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(GenerallyGeneral.MOD_ID, name), item);
    }

    public static void registerModItems() {
    }
}
