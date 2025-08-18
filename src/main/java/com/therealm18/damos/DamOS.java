package com.therealm18.damos;

import com.therealm18.damos.init.ItemInit;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(DamOS.MOD_ID)
public class DamOS {
    public static final String MOD_ID = "damos";
    public static final CreativeModeTab DAMOS_TAB = new CreativeModeTab(MOD_ID) {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemInit.FLASH_MEMORY.get());
        }
    };
    
    public DamOS() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        
        // Register items
        ItemInit.ITEMS.register(bus);
        
        // Register event listeners
        MinecraftForge.EVENT_BUS.register(this);
    }
}
