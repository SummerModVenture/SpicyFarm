package com.example.examplemod.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class memeblock extends Block {
    public memeblock(String name, Material material) {
        super(material);
        setUnlocalizedName("memeblock");
        setRegistryName("memeblock");
        this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

    }
}