package com.github.architecture.proxy;

import com.github.architecture.block.*;
import com.github.architecture.block.brick.ClayBrickHardened;
import com.github.architecture.block.brick.ClayBrickPink;
import com.github.architecture.block.brick.ClayBrickRed;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import static com.github.architecture.helpers.ModBlocks.*;

@Mod.EventBusSubscriber
public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) {

    }

    public void init(FMLInitializationEvent e) {

    }

    public void postInit(FMLPostInitializationEvent e) {

    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> e) {
        e.getRegistry().register(new GrassSlab());
        e.getRegistry().register(new ClayBrickRed());
        e.getRegistry().register(new ClayBrickPink());
        e.getRegistry().register(new ClayBrickHardened());
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> e) {
        e.getRegistry().register(new ItemBlock(grassSlab).setRegistryName(grassSlab.getRegistryName()));
        e.getRegistry().register(new ItemBlock(clayBrickRed).setRegistryName(clayBrickRed.getRegistryName()));
        e.getRegistry().register(new ItemBlock(clayBrickPink).setRegistryName(clayBrickPink.getRegistryName()));
        e.getRegistry().register(new ItemBlock(clayBrickHardened).setRegistryName(clayBrickHardened.getRegistryName()));
    }

}
