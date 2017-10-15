package com.github.architecture.helpers;

import com.github.architecture.block.*;
import com.github.architecture.block.brick.ClayBrickHardened;
import com.github.architecture.block.brick.ClayBrickPink;
import com.github.architecture.block.brick.ClayBrickRed;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks {

    @GameRegistry.ObjectHolder("architecture:grass_slab")
    public static GrassSlab grassSlab;

    @GameRegistry.ObjectHolder("architecture:clay_brick_red")
    public static ClayBrickRed clayBrickRed;

    @GameRegistry.ObjectHolder("architecture:clay_brick_pink")
    public static ClayBrickPink clayBrickPink;

    @GameRegistry.ObjectHolder("architecture:clay_brick_hardened")
    public static ClayBrickHardened clayBrickHardened;

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        grassSlab.initModel();
        clayBrickRed.initModel();
        clayBrickPink.initModel();
        clayBrickHardened.initModel();
    }

}
