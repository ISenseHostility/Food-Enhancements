package com.isensehostility.food_enhancements.init;

import com.isensehostility.food_enhancements.FoodEnhancements;
import com.isensehostility.food_enhancements.items.*;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemRegistry {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FoodEnhancements.MODID);

    public static void initialize() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Regular Food
    public static final RegistryObject<Item> BOILED_EGG = ITEMS.register("boiled_egg", () -> new Item(new Item.Properties().tab(FoodEnhancements.TAB).stacksTo(16).food(new FoodProperties.Builder().nutrition(3).saturationMod(1.33F).build())));
    public static final RegistryObject<Item> ROASTED_PUMPKIN_SEEDS = ITEMS.register("roasted_pumpkin_seeds", () -> new Item(new Item.Properties().tab(FoodEnhancements.TAB).food(new FoodProperties.Builder().nutrition(2).saturationMod(0.5F).build())));
    public static final RegistryObject<Item> PUMPKIN_SLICE = ITEMS.register("pumpkin_slice", () -> new Item(new Item.Properties().tab(FoodEnhancements.TAB).food(new FoodProperties.Builder().nutrition(2).saturationMod(0.5F).build())));
    public static final RegistryObject<Item> SWEET_BERRY_PIE = ITEMS.register("sweet_berry_pie", () -> new Item(new Item.Properties().tab(FoodEnhancements.TAB).food(new FoodProperties.Builder().nutrition(7).saturationMod(1.06F).build())));
    public static final RegistryObject<Item> GREEN_APPLE = ITEMS.register("green_apple", () -> new Item(new Item.Properties().tab(FoodEnhancements.TAB).food(new FoodProperties.Builder().nutrition(4).saturationMod(1.0F).build())));
    public static final RegistryObject<Item> GRATED_CARROT = ITEMS.register("grated_carrot", () -> new Item(new Item.Properties().tab(FoodEnhancements.TAB).food(new FoodProperties.Builder().nutrition(2).saturationMod(0.5F).build())));
    public static final RegistryObject<Item> HONEY_ROASTED_CHICKEN = ITEMS.register("honey_roasted_chicken", () -> new Item(new Item.Properties().tab(FoodEnhancements.TAB).food(new FoodProperties.Builder().nutrition(10).saturationMod(1.3F).meat().build())));
    public static final RegistryObject<Item> HONEY_TOAST = ITEMS.register("honey_toast", () -> new Item(new Item.Properties().tab(FoodEnhancements.TAB).food(new FoodProperties.Builder().nutrition(8).saturationMod(1.0F).build())));
    public static final RegistryObject<Item> SEASONED_PORK = ITEMS.register("seasoned_pork", () -> new Item(new Item.Properties().tab(FoodEnhancements.TAB).food(new FoodProperties.Builder().nutrition(9).saturationMod(1.2F).meat().build())));
    public static final RegistryObject<Item> TOAST = ITEMS.register("toast", () -> new Item(new Item.Properties().tab(FoodEnhancements.TAB).food(new FoodProperties.Builder().nutrition(6).saturationMod(0.83F).build())));
    public static final RegistryObject<Item> MILK_AND_HONEY_BREAD = ITEMS.register("milk_and_honey_bread", () -> new Item(new Item.Properties().tab(FoodEnhancements.TAB).food(new FoodProperties.Builder().nutrition(7).saturationMod(1.21F).build())));
    public static final RegistryObject<Item> SPIDER_LEG = ITEMS.register("spider_leg", () -> new Item(new Item.Properties().tab(FoodEnhancements.TAB).food(new FoodProperties.Builder().nutrition(2).saturationMod(0.25F).meat()
            .effect(()->new MobEffectInstance(MobEffects.POISON,200,0),1).build())));
    public static final RegistryObject<Item> COOKED_SPIDER_LEG = ITEMS.register("cooked_spider_leg", () -> new Item(new Item.Properties().tab(FoodEnhancements.TAB).food(new FoodProperties.Builder().nutrition(5).saturationMod(0.6F).meat().build())));
    public static final RegistryObject<Item> CAVE_SPIDER_LEG = ITEMS.register("cave_spider_leg", () -> new Item(new Item.Properties().tab(FoodEnhancements.TAB).food(new FoodProperties.Builder().nutrition(2).saturationMod(0.25F).meat()
            .effect(()->new MobEffectInstance(MobEffects.POISON, 200,1),1)
            .effect(()->new MobEffectInstance(MobEffects.CONFUSION, 400,0),1).build())));
    public static final RegistryObject<Item> COOKED_CAVE_SPIDER_LEG = ITEMS.register("cooked_cave_spider_leg", () -> new Item(new Item.Properties().tab(FoodEnhancements.TAB).food(new FoodProperties.Builder().nutrition(5).saturationMod(0.6F).meat().build())));
    public static final RegistryObject<Item> GOLDEN_BERRIES = ITEMS.register("golden_berries", () -> new Item(new Item.Properties().tab(FoodEnhancements.TAB).food(new FoodProperties.Builder().nutrition(2).saturationMod(1.0F)
            .effect(()->new MobEffectInstance(MobEffects.DIG_SPEED,200,0),1).build())));
    public static final RegistryObject<Item> CAKE_SLICE = ITEMS.register("cake_slice", () -> new Item(new Item.Properties().tab(FoodEnhancements.TAB).stacksTo(16).food(new FoodProperties.Builder().nutrition(2).saturationMod(1.5F).build())));
    public static final RegistryObject<Item> COOKIE_CRUMBS = ITEMS.register("cookie_crumbs", () -> new Item(new Item.Properties().tab(FoodEnhancements.TAB).food(new FoodProperties.Builder().nutrition(1).saturationMod(1.0F).build())));
    public static final RegistryObject<Item> COOKED_MUSHROOM = ITEMS.register("cooked_mushroom", () -> new Item(new Item.Properties().tab(FoodEnhancements.TAB).food(new FoodProperties.Builder().nutrition(2).saturationMod(0.5F).build())));
    public static final RegistryObject<Item> SQUID_TENTACLE = ITEMS.register("squid_tentacle", () -> new Item(new Item.Properties().tab(FoodEnhancements.TAB).food(new FoodProperties.Builder().nutrition(3).saturationMod(0.83F).meat()
            .effect(()-> new MobEffectInstance(MobEffects.BLINDNESS,100,1),1).build())));
    public static final RegistryObject<Item> COOKED_SQUID_TENTACLE = ITEMS.register("cooked_squid_tentacle", () -> new Item(new Item.Properties().tab(FoodEnhancements.TAB).food(new FoodProperties.Builder().nutrition(6).saturationMod(0.66F).meat().build())));
    public static final RegistryObject<Item> GELATIN = ITEMS.register("gelatin", () -> new Item(new Item.Properties().tab(FoodEnhancements.TAB).food(new FoodProperties.Builder().nutrition(2).saturationMod(0.5F).build())));
    public static final RegistryObject<Item> ILLAGER_FLESH = ITEMS.register("illager_flesh", () -> new Item(new Item.Properties().tab(FoodEnhancements.TAB).food(new FoodProperties.Builder().nutrition(4).saturationMod(0.37F).meat()
            .effect(()-> new MobEffectInstance(MobEffects.HUNGER,300,0),0.7F).build())));
    public static final RegistryObject<Item> FISH_FILLET = ITEMS.register("fish_fillet", () -> new Item(new Item.Properties().tab(FoodEnhancements.TAB).food(new FoodProperties.Builder().nutrition(2).saturationMod(0.5F).build())));
    public static final RegistryObject<Item> FRIED_EGG = ITEMS.register("fried_egg", () -> new Item(new Item.Properties().tab(FoodEnhancements.TAB).food(new FoodProperties.Builder().nutrition(4).saturationMod(1.25F).build())));
    public static final RegistryObject<Item> COOKED_FISH_FILLET = ITEMS.register("cooked_fish_fillet", () -> new Item(new Item.Properties().tab(FoodEnhancements.TAB).food(new FoodProperties.Builder().nutrition(6).saturationMod(0.66F).build())));
    public static final RegistryObject<Item> BAT_WING = ITEMS.register("bat_wing", () -> new Item(new Item.Properties().tab(FoodEnhancements.TAB).food(new FoodProperties.Builder().nutrition(2).saturationMod(0.25F).meat()
            .effect(()->new MobEffectInstance(MobEffects.CONFUSION,200,0),0.7F)
            .effect(()->new MobEffectInstance(MobEffects.POISON,200,0),0.4F).build())));
    public static final RegistryObject<Item> COOKED_BAT_WING = ITEMS.register("cooked_bat_wing", () -> new Item(new Item.Properties().tab(FoodEnhancements.TAB).food(new FoodProperties.Builder().nutrition(5).saturationMod(0.6F).meat()
            .effect(()->new MobEffectInstance(MobEffects.CONFUSION,200,0),0.3F).build())));
    public static final RegistryObject<Item> GRATED_GOLDEN_CARROT = ITEMS.register("grated_golden_carrot", () -> new Item(new Item.Properties().tab(FoodEnhancements.TAB).food(new FoodProperties.Builder().nutrition(3).saturationMod(0.5F)
            .effect(()-> new MobEffectInstance(MobEffects.NIGHT_VISION,400,0),1).build())));
    public static final RegistryObject<Item> GOLDEN_BERRY_PIE = ITEMS.register("golden_berry_pie", () -> new Item(new Item.Properties().tab(FoodEnhancements.TAB).food(new FoodProperties.Builder().nutrition(7).saturationMod(1.06F)
            .effect(()-> new MobEffectInstance(MobEffects.ABSORPTION,600,1),1).build())));
    public static final RegistryObject<Item> CREAMY_HONEY_TOAST = ITEMS.register("creamy_honey_toast", () -> new Item(new Item.Properties().tab(FoodEnhancements.TAB).food(new FoodProperties.Builder().nutrition(9).saturationMod(1.0F).build())));
    public static final RegistryObject<Item> GLOW_BERRY_PIE = ITEMS.register("glow_berry_pie", () -> new Item(new Item.Properties().tab(FoodEnhancements.TAB).food(new FoodProperties.Builder().nutrition(7).saturationMod(1.06F)
            .effect(() -> new MobEffectInstance(MobEffects.GLOWING, 600, 0), 1).build())));
    public static final RegistryObject<Item> MARSHMALLOW = ITEMS.register("marshmallow", () -> new Item(new Item.Properties().tab(FoodEnhancements.TAB).food(new FoodProperties.Builder().nutrition(3).saturationMod(1.33F).build())));
    public static final RegistryObject<Item> BURNT_MARSHMALLOW = ITEMS.register("burnt_marshmallow", () -> new Item(new Item.Properties().tab(FoodEnhancements.TAB).food(new FoodProperties.Builder().nutrition(1).saturationMod(0.33F)
            .effect(()->new MobEffectInstance(MobEffects.BLINDNESS, 100,0),1).build())));
    public static final RegistryObject<Item> CARAMEL = ITEMS.register("caramel", () -> new Item(new Item.Properties().tab(FoodEnhancements.TAB).food(new FoodProperties.Builder().nutrition(2).saturationMod(0.66F).build())));
    public static final RegistryObject<Item> CARAMEL_APPLE = ITEMS.register("caramel_apple", () -> new Item(new Item.Properties().tab(FoodEnhancements.TAB).food(new FoodProperties.Builder().nutrition(6).saturationMod(0.66F).build())));
    public static final RegistryObject<Item> JELLY = ITEMS.register("jelly", () -> new Item(new Item.Properties().tab(FoodEnhancements.TAB).food(new FoodProperties.Builder().nutrition(7).saturationMod(0.66F).build())));
    public static final RegistryObject<Item> CARAMEL_MELON = ITEMS.register("caramel_melon", () -> new Item(new Item.Properties().tab(FoodEnhancements.TAB).food(new FoodProperties.Builder().nutrition(4).saturationMod(0.66F).build())));
    public static final RegistryObject<Item> CARAMEL_CHORUS = ITEMS.register("caramel_chorus", CaramelChorus::new);
    public static final RegistryObject<Item> CARAMEL_PUMPKIN = ITEMS.register("caramel_pumpkin", () -> new Item(new Item.Properties().tab(FoodEnhancements.TAB).food(new FoodProperties.Builder().nutrition(4).saturationMod(0.66F).build())));
    public static final RegistryObject<Item> CARAMEL_CHOCOLATE = ITEMS.register("caramel_chocolate", () -> new Item(new Item.Properties().tab(FoodEnhancements.TAB).food(new FoodProperties.Builder().nutrition(4).saturationMod(0.66F).build())));
    public static final RegistryObject<Item> CARAMEL_GLOW_BERRIES = ITEMS.register("caramel_glow_berries", () -> new Item(new Item.Properties().tab(FoodEnhancements.TAB).food(new FoodProperties.Builder().nutrition(4).saturationMod(0.66F).build())));
    public static final RegistryObject<Item> CARAMEL_SWEET_BERRIES = ITEMS.register("caramel_sweet_berries", () -> new Item(new Item.Properties().tab(FoodEnhancements.TAB).food(new FoodProperties.Builder().nutrition(4).saturationMod(0.66F).build())));

    // Bowl Food
    public static final RegistryObject<Item> FRUIT_BOWL = ITEMS.register("fruit_bowl", () -> new BowlFood(new Item.Properties().food(new FoodProperties.Builder().nutrition(7).saturationMod(1.0F).build())));
    public static final RegistryObject<Item> GLISTERING_FRUIT_BOWL = ITEMS.register("glistering_fruit_bowl", () -> new BowlFood(new Item.Properties().food(new FoodProperties.Builder().nutrition(7).saturationMod(1.0F)
            .effect(()->new MobEffectInstance(MobEffects.ABSORPTION, 2400, 0),1)
            .effect(()->new MobEffectInstance(MobEffects.REGENERATION, 400, 1), 1)
            .effect(()->new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 400, 1), 1).build())));
    public static final RegistryObject<Item> PUMPKIN_SOUP = ITEMS.register("pumpkin_soup", () -> new BowlFood(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(1.2F).build())));
    public static final RegistryObject<Item> CARROT_SALAD = ITEMS.register("carrot_salad", () -> new BowlFood(new Item.Properties().food(new FoodProperties.Builder().nutrition(9).saturationMod(0.66F).build())));
    public static final RegistryObject<Item> MASHED_POTATOES = ITEMS.register("mashed_potatoes", () -> new BowlFood(new Item.Properties().food(new FoodProperties.Builder().nutrition(9).saturationMod(1.22F).build())));
    public static final RegistryObject<Item> SPIDER_SOUP = ITEMS.register("spider_soup", () -> new BowlFood(new Item.Properties().food(new FoodProperties.Builder().nutrition(11).saturationMod(1.0F)
            .effect(()-> new MobEffectInstance(MobEffects.HUNGER,300,0),1)
            .effect(()-> new MobEffectInstance(MobEffects.WEAKNESS,200,0),0.2F).build())));
    public static final RegistryObject<Item> BOWL_OF_WATER = ITEMS.register("bowl_of_water", () -> new BowlFood(new Item.Properties().food(new FoodProperties.Builder().build())));
    public static final RegistryObject<Item> FISH_SOUP = ITEMS.register("fish_soup", () -> new BowlFood(new Item.Properties().food(new FoodProperties.Builder().nutrition(9).saturationMod(0.8F).build())));
    public static final RegistryObject<Item> FISH_STOCK = ITEMS.register("fish_stock", () -> new BowlFood(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(1.0F).build())));
    public static final RegistryObject<Item> BAT_SOUP = ITEMS.register("bat_soup", () -> new BowlFood(new Item.Properties().food(new FoodProperties.Builder().nutrition(8).saturationMod(1.9F)
            .effect(()->new MobEffectInstance(MobEffects.CONFUSION,200,0),0.3F)
            .effect(()->new MobEffectInstance(MobEffects.POISON,200,0),0.1F).build())));
    public static final RegistryObject<Item> FIERY_STEW = ITEMS.register("fiery_stew", () -> new BowlFood(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(1.2F)
            .effect(()->new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 1200,0),0.7F).build())));
    public static final RegistryObject<Item> GOLDEN_CARROT_SALAD = ITEMS.register("golden_carrot_salad", () -> new BowlFood(new Item.Properties().food(new FoodProperties.Builder().nutrition(9).saturationMod(0.66F)
            .effect(()-> new MobEffectInstance(MobEffects.NIGHT_VISION,2400,0),1).build())));

    // Bottle Food
    public static final RegistryObject<Item> SWEET_BERRY_WINE = ITEMS.register("sweet_berry_wine", () -> new BottleFood(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(0.33F).alwaysEat()
            .effect(()->new MobEffectInstance(MobEffects.CONFUSION, 200, 1), 1).build())));
    public static final RegistryObject<Item> CACTUS_SAP = ITEMS.register("cactus_sap", () -> new BottleFood(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(0.33F).alwaysEat().build())));
    public static final RegistryObject<Item> CHORUS_JUICE = ITEMS.register("chorus_juice", ChorusJuice::new);
    public static final RegistryObject<Item> APPLE_CIDER = ITEMS.register("apple_cider", () -> new BottleFood(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(0.33F).alwaysEat().build())));
    public static final RegistryObject<Item> GOLDEN_APPLE_CIDER = ITEMS.register("golden_apple_cider", () -> new BottleFood(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(0.33F).alwaysEat()
            .effect(()->new MobEffectInstance(MobEffects.ABSORPTION, 1200, 0), 1)
            .effect(()->new MobEffectInstance(MobEffects.REGENERATION, 200, 0), 1).build())));
    public static final RegistryObject<Item> SUSPICIOUS_SUBSTANCE = ITEMS.register("suspicious_substance", () -> new BottleFood(new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(0.5F).alwaysEat()
            .effect(()->new MobEffectInstance(MobEffects.ABSORPTION, 600, 0), 0.4F)
            .effect(()->new MobEffectInstance(MobEffects.WEAKNESS, 400, 0), 0.3F).build())));
    public static final RegistryObject<Item> MELON_JUICE = ITEMS.register("melon_juice", () -> new BottleFood(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(0.33F).alwaysEat().build())));
    public static final RegistryObject<Item> GLISTERING_MELON_JUICE = ITEMS.register("glistering_melon_juice", () -> new BottleFood(new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(0.25F).alwaysEat()
            .effect(()-> new MobEffectInstance(MobEffects.ABSORPTION,400,0),0.7F).build())));
    public static final RegistryObject<Item> MILK_BOTTLE = ITEMS.register("milk_bottle", () -> new BottleFood(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.5F).alwaysEat().build())));
    public static final RegistryObject<Item> CHOCOLATE_MILK_BOTTLE = ITEMS.register("chocolate_milk_bottle", () -> new BottleFood(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(0.5F).alwaysEat()
            .effect(()-> new MobEffectInstance(MobEffects.HEAL,1,0),1)
            .effect(()-> new MobEffectInstance(MobEffects.HEALTH_BOOST,400,0),1).build())));
    public static final RegistryObject<Item> PUMPKIN_JUICE = ITEMS.register("pumpkin_juice", () -> new BottleFood(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(0.33F).alwaysEat().build())));
    public static final RegistryObject<Item> GOLDEN_BERRY_WINE = ITEMS.register("golden_berry_wine", () -> new BottleFood(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(0.33F).alwaysEat()
            .effect(()->new MobEffectInstance(MobEffects.CONFUSION, 200, 1), 1)
            .effect(()-> new MobEffectInstance(MobEffects.ABSORPTION,400,1),1).build())));
    public static final RegistryObject<Item> GLOW_BERRY_WINE = ITEMS.register("glow_berry_wine", () -> new BottleFood(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(0.33F).alwaysEat()
            .effect(()->new MobEffectInstance(MobEffects.CONFUSION, 200, 1), 1)
            .effect(()-> new MobEffectInstance(MobEffects.GLOWING,800,0),1).build())));

    // Stick Food
    public static final RegistryObject<Item> MARSHMALLOW_ON_A_STICK = ITEMS.register("marshmallow_on_a_stick", () -> new StickFood(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(1.33F).build())));
    public static final RegistryObject<Item> BURNT_MARSHMALLOW_ON_A_STICK = ITEMS.register("burnt_marshmallow_on_a_stick", () -> new StickFood(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.33F)
            .effect(()->new MobEffectInstance(MobEffects.BLINDNESS, 100,0),1).build())));
    public static final RegistryObject<Item> SMOLDERING_MARSHMALLOW = ITEMS.register("smoldering_marshmallow", () -> new StickFood(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(0.8F).build())));
    public static final RegistryObject<Item> COOKED_CHICKEN_SKEWER = ITEMS.register("cooked_chicken_skewer", () -> new StickFood(new Item.Properties().food(new FoodProperties.Builder().nutrition(7).saturationMod(0.9F).build())));
    public static final RegistryObject<Item> COOKED_PORKCHOP_SKEWER = ITEMS.register("cooked_porkchop_skewer", () -> new StickFood(new Item.Properties().food(new FoodProperties.Builder().nutrition(9).saturationMod(0.9F).build())));
    public static final RegistryObject<Item> COOKED_MUTTON_SKEWER = ITEMS.register("cooked_mutton_skewer", () -> new StickFood(new Item.Properties().food(new FoodProperties.Builder().nutrition(7).saturationMod(0.9F).build())));
    public static final RegistryObject<Item> STEAK_SKEWER = ITEMS.register("steak_skewer", () -> new StickFood(new Item.Properties().food(new FoodProperties.Builder().nutrition(9).saturationMod(0.9F).build())));
    public static final RegistryObject<Item> COOKED_RABBIT_SKEWER = ITEMS.register("cooked_rabbit_skewer", () -> new StickFood(new Item.Properties().food(new FoodProperties.Builder().nutrition(7).saturationMod(0.9F).build())));
    public static final RegistryObject<Item> HONEY_ROASTED_CHICKEN_SKEWER = ITEMS.register("honey_roasted_chicken_skewer", () -> new StickFood(new Item.Properties().food(new FoodProperties.Builder().nutrition(15).saturationMod(0.9F)
            .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 600, 0), 1.0F).build())));
    public static final RegistryObject<Item> MIXED_GRILL_SKEWER = ITEMS.register("mixed_grill_skewer", () -> new StickFood(new Item.Properties().food(new FoodProperties.Builder().nutrition(13).saturationMod(0.9F).build())));
    public static final RegistryObject<Item> SEASONED_PORK_SKEWER = ITEMS.register("seasoned_pork_skewer", () -> new StickFood(new Item.Properties().food(new FoodProperties.Builder().nutrition(11).saturationMod(0.9F).build())));
    public static final RegistryObject<Item> SQUID_TENTACLE_SKEWER = ITEMS.register("squid_tentacle_skewer", () -> new StickFood(new Item.Properties().food(new FoodProperties.Builder().nutrition(9).saturationMod(0.83F).build())));
    public static final RegistryObject<Item> SPIDER_LEG_SKEWER = ITEMS.register("spider_leg_skewer", () -> new StickFood(new Item.Properties().food(new FoodProperties.Builder().nutrition(8).saturationMod(0.6F).build())));
    public static final RegistryObject<Item> CAVE_SPIDER_LEG_SKEWER = ITEMS.register("cave_spider_leg_skewer", () -> new StickFood(new Item.Properties().food(new FoodProperties.Builder().nutrition(8).saturationMod(0.6F).build())));

    // Standard Items
    public static final RegistryObject<Item> HONEYED_WHEAT = ITEMS.register("honeyed_wheat", () -> new Item(new Item.Properties().tab(FoodEnhancements.TAB)));
    public static final RegistryObject<Item> FISH_BONES = ITEMS.register("fish_bones", () -> new Item(new Item.Properties().tab(FoodEnhancements.TAB)));
    public static final RegistryObject<Item> BOWL_OF_FISH_BONES = ITEMS.register("bowl_of_fish_bones", () -> new Item(new Item.Properties().tab(FoodEnhancements.TAB).stacksTo(16)));

}
