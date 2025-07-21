package net.berriebuffel.weedmod.item;

import net.berriebuffel.weedmod.WeedMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, WeedMod.MOD_ID);

    public static final RegistryObject<Item> WEED = ITEMS.register("weed", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WEED_SEEDS = ITEMS.register("weed_seeds", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
