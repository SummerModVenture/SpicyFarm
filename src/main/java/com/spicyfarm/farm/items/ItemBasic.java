package com.spicyfarm.farm.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import static net.minecraft.block.BlockFarmland.MOISTURE;

public class ItemBasic extends Item {

    public ItemBasic(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);
    }

    @Override
    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        if(worldIn.getBlockState(pos).getBlock() == Blocks.FARMLAND){
            worldIn.setBlockState(pos, Blocks.FARMLAND.getDefaultState().withProperty(MOISTURE, 7));
        } else {
            System.out.println("DID NOT CLICK ON FARMLAND");
        }
        return EnumActionResult.PASS;
    }
}