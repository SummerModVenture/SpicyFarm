package com.spicyfarm.farm.items;

import com.spicyfarm.farm.particles.Drip;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.ParticleDrip;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
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
        if(worldIn.isRemote){
            for (int i = 0; i < 15; i++) {
                Minecraft.getMinecraft().effectRenderer.addEffect(new Drip(worldIn, pos.getX() + 0.1 + Math.random(), pos.getY() + 1.5, pos.getZ() + 0.1 + Math.random(), Material.WATER));
            }
        }
        return EnumActionResult.PASS;
    }
}