package com.github.architecture;

import com.github.architecture.proxy.CommonProxy;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import org.apache.logging.log4j.Logger;

@Mod(
        modid = ArchitectureMod.MODID,
        name = ArchitectureMod.MODNAME,
        version = ArchitectureMod.VERSION,
        useMetadata = true
)
public class ArchitectureMod
{
    public static final String MODID = "architecture";
    public static final String MODNAME = "More Architecture";
    public static final String VERSION = "0.0.1";

    @SidedProxy(
            clientSide = "com.github.architecture.proxy.ClientProxy",
            serverSide = "com.github.architecture.proxy.ServerProxy"
    )
    public static CommonProxy proxy;

    @Mod.Instance
    public static ArchitectureMod instance;

    public static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}
