package com.github.architecture.helpers;

import com.github.architecture.block.GrassSlab;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {

    @GameRegistry.ObjectHolder("architecture:grass_slab")
    public static GrassSlab grassSlab;

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        grassSlab.initModel();
    }

}
