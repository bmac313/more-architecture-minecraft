package com.github.architecture.block;

import com.github.architecture.ArchitectureMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class GrassSlab extends Block {
    public GrassSlab() {
        super(Material.GRASS);
        setUnlocalizedName(ArchitectureMod.MODID + ".grass_slab");
        setRegistryName("grass_slab");
    }
}
