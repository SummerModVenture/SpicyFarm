package com.spicyfarm.farm.init;

import com.spicyfarm.farm.Reference;
import com.spicyfarm.farm.items.ItemBasic;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid= Reference.MODID)
public class ModItems {

    static Item tutorialItem;

    public static void init() {
        tutorialItem = new ItemBasic("tutorialItem");
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(tutorialItem);
    }
}
