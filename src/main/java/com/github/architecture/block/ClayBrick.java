package com.github.architecture.block;


import com.github.architecture.ArchitectureMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ClayBrick extends Block {

    public ClayBrick() {
        super(Material.CLAY);
        setUnlocalizedName(ArchitectureMod.MODID + ".clay_brick");
        setRegistryName("clay_brick");
    }

    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(
                Item.getItemFromBlock(this),
                0,
                new ModelResourceLocation(getRegistryName(), "inventory")
        );
    }

}
