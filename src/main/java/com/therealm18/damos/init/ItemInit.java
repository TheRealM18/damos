package com.therealm18.damos.init;

import com.therealm18.damos.DamOS;
import com.therealm18.damos.item.FlashMemoryItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = 
        DeferredRegister.create(ForgeRegistries.ITEMS, DamOS.MOD_ID);
    
    public static final RegistryObject<Item> FLASH_MEMORY = ITEMS.register("flash_memory",
        () -> new FlashMemoryItem(new Item.Properties().stacksTo(1).tab(CreativeModeTab.TAB_MISC)));
}
