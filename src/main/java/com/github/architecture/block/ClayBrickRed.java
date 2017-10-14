package com.github.architecture.block;

import com.github.architecture.ArchitectureMod;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class ClayBrickRed extends ClayBrick {

    public ClayBrickRed() {
        super();
        setUnlocalizedName(ArchitectureMod.MODID + ".clay_brick_red");
        setRegistryName("clay_brick_red");
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
