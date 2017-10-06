package com.github.architecture;

import com.github.architecture.proxy.CommonProxy;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(
        modid = ArchitectureMod.MODID,
        name = ArchitectureMod.MODNAME,
        version = ArchitectureMod.VERSION,
        dependencies = "required-after:Forge@[11.16.0.1965,)",
        useMetadata = true
)
public class ArchitectureMod
{
    public static final String MODID = "architecture";
    public static final String MODNAME = "More Architecture";
    public static final String VERSION = "0.0.1";

    @SidedProxy(
            clientSide = "mcjty.architecture.proxy.ClientProxy",
            serverSide = "mcjty.architecture.proxy.ServerProxy"
    )
    public static CommonProxy proxy;

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        System.out.println("DIRT BLOCK >> "+Blocks.DIRT.getUnlocalizedName());
    }
}
