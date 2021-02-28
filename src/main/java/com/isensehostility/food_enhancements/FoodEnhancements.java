package com.isensehostility.food_enhancements;

import com.isensehostility.food_enhancements.init.ItemRegistry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod("food_enhancements")
public class FoodEnhancements
{
    public static final String MOD_ID = "food_enhancements";
    private static final Logger LOGGER = LogManager.getLogger();

    public FoodEnhancements() {

        ItemRegistry.init();

        MinecraftForge.EVENT_BUS.register(this);
    }

    public static ResourceLocation locate (String name){
        return new ResourceLocation(MOD_ID, name);
    }

    public static final ItemGroup TAB = new ItemGroup("foodEnhancementsTab")
    {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ItemRegistry.BOILED_EGG.get());
        }
    };

}
