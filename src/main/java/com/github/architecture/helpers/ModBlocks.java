package com.github.architecture.helpers;

import com.github.architecture.block.GrassSlab;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {

    @GameRegistry.ObjectHolder("architecture:grass_slab")
    public static GrassSlab grassSlab;

    public static void initModels() {
        grassSlab.initModel();
    }

}
