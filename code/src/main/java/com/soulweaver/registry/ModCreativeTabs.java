package com.soulweaver.registry;

import com.soulweaver.Soulweaver;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModCreativeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Soulweaver.MOD_ID);

    // public static final DeferredHolder<CreativeModeTab, CreativeModeTab> SOULWEAVER_TAB =
    //         CREATIVE_MODE_TABS.register("soulweaver_tab", () -> CreativeModeTab.builder()
    //                 .title(Component.translatable("itemGroup.soulweaver"))
    //                 .withTabsBefore(CreativeModeTabs.COMBAT)
    //                 .icon(() -> ModItems.EXAMPLE_ITEM.get().getDefaultInstance())
    //                 .displayItems((parameters, output) -> {
    //                     output.accept(ModItems.EXAMPLE_ITEM.get());
    //                 }).build());
}
