package com.example.examplemod;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MODID);
    public static final RegistryObject<SwordItem> NAME_SPEAR = ITEMS.register("awesomespear", () -> new SwordItem(ModItemTier.CUSTOMNAMEHERE, 5, -2.8f, (new Item.Properties()).tab(ModMainItemGroup.ITEM_GROUP)));
}
