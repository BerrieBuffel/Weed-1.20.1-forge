package net.berriebuffel.weedmod.item;

import net.berriebuffel.weedmod.WeedMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, WeedMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> WEED_TAB = CREATIVE_MODE_TABS.register("weed_tab",
            () -> CreativeModeTab.builder()
                    .icon(()-> new ItemStack(ModItems.WEED.get()))
                    .title(Component.translatable("creativetab.weed_tab"))
                    .displayItems((parameters, output) ->
                    {
                        output.accept(ModItems.WEED.get());
                        output.accept(ModItems.WEED_SEEDS.get());

                    })
                    .build());

    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
