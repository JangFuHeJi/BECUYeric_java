package com.eric.registry;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class Identification implements ModInitializer{
    public static final Item CusTOM_Item = new Item(new FabricItemSettings());


    @Override
    public void onInitialize() {
        Registry.register(Registries.ITEM, Identifier.of("eric", "Identification"), CusTOM_Item);
    }
}
