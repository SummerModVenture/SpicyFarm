package com.spicyfarm.farm.coremod;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFarmland;
import net.minecraft.block.BlockGlowstone;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

/**
 * Created by Spencer on 5/22/18.
 */
public class WorldPatches{

    static {
        System.out.println("LOADED");
    }

    public static boolean isOpaqueCube(Block gs, IBlockState bs, int x, Random pos){
        System.out.println("SPICY MEMES");
        return true;
    }

    public static int quantityDropped(Block gs, IBlockState bs, int x, Random random)
    {
        System.out.println("ALSO SPICY MEMES");
        return 32;
    }

    public static boolean hasWater(BlockFarmland f, World worldIn, BlockPos pos)
    {
        for (BlockPos.MutableBlockPos blockpos$mutableblockpos : BlockPos.getAllInBoxMutable(pos.add(-1, 0, -1), pos.add(1, 1, 1)))
        {
            if (worldIn.getBlockState(blockpos$mutableblockpos).getMaterial() == Material.WATER)
            {
                return true;
            }
        }

        return false;
    }

    public static boolean hasWaterCondition(BlockFarmland f, World worldIn, BlockPos pos){
        return true;
    }
}
