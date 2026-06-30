package com.soulweaver;

import com.mojang.logging.LogUtils;
import com.soulweaver.registry.ModBlocks;
import com.soulweaver.registry.ModCreativeTabs;
import com.soulweaver.registry.ModItems;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import org.slf4j.Logger;

@Mod(Soulweaver.MOD_ID)
public class Soulweaver {

    public static final String MOD_ID = "soulweaver";
    private static final Logger LOGGER = LogUtils.getLogger();

    public Soulweaver(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::commonSetup);

        ModItems.ITEMS.register(modEventBus);
        ModBlocks.BLOCKS.register(modEventBus);
        ModCreativeTabs.CREATIVE_MODE_TABS.register(modEventBus);

        NeoForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("Soulweaver mod initialized!");
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        LOGGER.info("Soulweaver loaded on server!");
    }
}
