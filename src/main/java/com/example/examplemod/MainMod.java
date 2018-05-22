package com.example.examplemod;

        import com.example.examplemod.Init.;
        import net.minecraft.init.Blocks;
        import net.minecraftforge.fml.common.Mod;
        import net.minecraftforge.fml.common.Mod.EventHandler;
        import net.minecraftforge.fml.common.event.FMLInitializationEvent;
        import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
        import org.apache.logging.log4j.Logger;

@Mod(modid = MainMod.MODID, name = MainMod.NAME, version = MainMod.VERSION)
public class MainMod
{
    public static final String MODID = "examplemod";
    public static final String NAME = "Example Mod";
    public static final String VERSION = "1.0";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ModBlocks.init();
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    }
}