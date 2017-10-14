package com.github.architecture.helpers;

import com.github.architecture.block.ClayBrickPink;
import com.github.architecture.block.ClayBrickRed;
import com.github.architecture.block.GrassSlab;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {

    @GameRegistry.ObjectHolder("architecture:grass_slab")
    public static GrassSlab grassSlab;

    @GameRegistry.ObjectHolder("architecture:clay_brick_red")
    public static ClayBrickRed clayBrickRed;

    @GameRegistry.ObjectHolder("architecture:clay_brick_pink")
    public static ClayBrickPink clayBrickPink;

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        grassSlab.initModel();
        clayBrickRed.initModel();
        clayBrickPink.initModel();
    }

}
