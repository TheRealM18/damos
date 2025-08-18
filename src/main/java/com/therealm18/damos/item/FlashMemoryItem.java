package com.therealm18.damos.item;

import li.cil.oc2.api.bus.device.DeviceTypes;
import li.cil.oc2.common.item.AbstractStorageItem;
import net.minecraft.world.item.Item;

public class FlashMemoryItem extends AbstractStorageItem {
    public FlashMemoryItem(Item.Properties properties) {
        super(properties, DeviceTypes.FLASH_MEMORY, 512 * 1024); // 512KB storage
    }
}
