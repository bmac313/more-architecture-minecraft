package com.github.architecture.block;

import com.github.architecture.ArchitectureMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class GrassSlab extends Block {
    public GrassSlab() {
        super(Material.GRASS);
        setUnlocalizedName(ArchitectureMod.MODID + ".grass_slab");
        setRegistryName("grass_slab");
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(
            Item.getItemFromBlock(this),
            0,
            new ModelResourceLocation(getRegistryName(), "inventory")
        );
    }

}
