package com.example.examplemod;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class ModMainItemGroup {
    public static final CreativeModeTab ITEM_GROUP = new CreativeModeTab(ExampleMod.MODID) {
        @Override
        public ItemStack makeIcon() {
            return RegistryHandler.NAME_SPEAR.get().getDefaultInstance();
        }
       /* @Override
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
            LaserBladeItemStack icon = LaserBladeItemStack.ICON;
            return icon.getCopy();
        }*/
    };
}
