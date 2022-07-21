package com.isensehostility.food_enhancements.init;

import com.isensehostility.food_enhancements.FoodEnhancements;
import com.isensehostility.food_enhancements.items.*;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemRegistry {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FoodEnhancements.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Items
    public static final RegistryObject<BoiledEgg> BOILED_EGG = ITEMS.register("boiled_egg", BoiledEgg::new);
    public static final RegistryObject<RoastedPumpkinSeeds> ROASTED_PUMPKIN_SEEDS = ITEMS.register("roasted_pumpkin_seeds", RoastedPumpkinSeeds::new);
    public static final RegistryObject<PumpkinSlice> PUMPKIN_SLICE = ITEMS.register("pumpkin_slice", PumpkinSlice::new);
    public static final RegistryObject<SweetBerryPie> SWEET_BERRY_PIE = ITEMS.register("sweet_berry_pie", SweetBerryPie::new);
    public static final RegistryObject<GreenApple> GREEN_APPLE = ITEMS.register("green_apple", GreenApple::new);
    public static final RegistryObject<FruitBowl> FRUIT_BOWL = ITEMS.register("fruit_bowl", FruitBowl::new);
    public static final RegistryObject<GlisteringFruitBowl> GLISTERING_FRUIT_BOWL = ITEMS.register("glistering_fruit_bowl", GlisteringFruitBowl::new);
    public static final RegistryObject<PumpkinSoup> PUMPKIN_SOUP = ITEMS.register("pumpkin_soup", PumpkinSoup::new);
    public static final RegistryObject<SweetBerryWine> SWEET_BERRY_WINE = ITEMS.register("sweet_berry_wine", SweetBerryWine::new);
    public static final RegistryObject<CarrotSalad> CARROT_SALAD = ITEMS.register("carrot_salad", CarrotSalad::new);
    public static final RegistryObject<GratedCarrot> GRATED_CARROT = ITEMS.register("grated_carrot", GratedCarrot::new);
    public static final RegistryObject<HoneyRoastedChicken> HONEY_ROASTED_CHICKEN = ITEMS.register("honey_roasted_chicken", HoneyRoastedChicken::new);
    public static final RegistryObject<HoneyToast> HONEY_TOAST = ITEMS.register("honey_toast", HoneyToast::new);
    public static final RegistryObject<SeasonedPork> SEASONED_PORK = ITEMS.register("seasoned_pork", SeasonedPork::new);
    public static final RegistryObject<Toast> TOAST = ITEMS.register("toast", Toast::new);
    public static final RegistryObject<MilkAndHoneyBread> MILK_AND_HONEY_BREAD = ITEMS.register("milk_and_honey_bread", MilkAndHoneyBread::new);
    public static final RegistryObject<HoneyedWheat> HONEYED_WHEAT = ITEMS.register("honeyed_wheat", HoneyedWheat::new);
    public static final RegistryObject<SpiderLeg> SPIDER_LEG = ITEMS.register("spider_leg", SpiderLeg::new);
    public static final RegistryObject<CookedSpiderLeg> COOKED_SPIDER_LEG = ITEMS.register("cooked_spider_leg", CookedSpiderLeg::new);
    public static final RegistryObject<CaveSpiderLeg> CAVE_SPIDER_LEG = ITEMS.register("cave_spider_leg", CaveSpiderLeg::new);
    public static final RegistryObject<CookedCaveSpiderLeg> COOKED_CAVE_SPIDER_LEG = ITEMS.register("cooked_cave_spider_leg", CookedCaveSpiderLeg::new);
    public static final RegistryObject<CactusSap> CACTUS_SAP = ITEMS.register("cactus_sap", CactusSap::new);
    public static final RegistryObject<ChorusJuice> CHORUS_JUICE = ITEMS.register("chorus_juice", ChorusJuice::new);
    public static final RegistryObject<GoldenBerries> GOLDEN_BERRIES = ITEMS.register("golden_berries", GoldenBerries::new);
    public static final RegistryObject<AppleCider> APPLE_CIDER = ITEMS.register("apple_cider", AppleCider::new);
    public static final RegistryObject<GoldenAppleCider> GOLDEN_APPLE_CIDER = ITEMS.register("golden_apple_cider", GoldenAppleCider::new);
    public static final RegistryObject<CakeSlice> CAKE_SLICE = ITEMS.register("cake_slice", CakeSlice::new);
    public static final RegistryObject<CookieCrumbs> COOKIE_CRUMBS = ITEMS.register("cookie_crumbs", CookieCrumbs::new);
    public static final RegistryObject<CookedMushroom> COOKED_MUSHROOM = ITEMS.register("cooked_mushroom", CookedMushroom::new);
    public static final RegistryObject<SquidTentacle> SQUID_TENTACLE = ITEMS.register("squid_tentacle", SquidTentacle::new);
    public static final RegistryObject<CookedSquidTentacle> COOKED_SQUID_TENTACLE = ITEMS.register("cooked_squid_tentacle", CookedSquidTentacle::new);
    public static final RegistryObject<MashedPotatoes> MASHED_POTATOES = ITEMS.register("mashed_potatoes", MashedPotatoes::new);
    public static final RegistryObject<SuspiciousSubstance> SUSPICIOUS_SUBSTANCE = ITEMS.register("suspicious_substance", SuspiciousSubstance::new);
    public static final RegistryObject<Gelatin> GELATIN = ITEMS.register("gelatin", Gelatin::new);
    public static final RegistryObject<IllagerFlesh> ILLAGER_FLESH = ITEMS.register("illager_flesh", IllagerFlesh::new);
    public static final RegistryObject<SpiderSoup> SPIDER_SOUP = ITEMS.register("spider_soup", SpiderSoup::new);
    public static final RegistryObject<MelonJuice> MELON_JUICE = ITEMS.register("melon_juice", MelonJuice::new);
    public static final RegistryObject<GlisteringMelonJuice> GLISTERING_MELON_JUICE = ITEMS.register("glistering_melon_juice", GlisteringMelonJuice::new);
    public static final RegistryObject<FishFillet> FISH_FILLET = ITEMS.register("fish_fillet", FishFillet::new);
    public static final RegistryObject<FriedEgg> FRIED_EGG = ITEMS.register("fried_egg", FriedEgg::new);
    public static final RegistryObject<BowlOfWater> BOWL_OF_WATER = ITEMS.register("bowl_of_water", BowlOfWater::new);
    public static final RegistryObject<CookedFishFillet> COOKED_FISH_FILLET = ITEMS.register("cooked_fish_fillet", CookedFishFillet::new);
    public static final RegistryObject<FishSoup> FISH_SOUP = ITEMS.register("fish_soup", FishSoup::new);
    public static final RegistryObject<FishStock> FISH_STOCK = ITEMS.register("fish_stock", FishStock::new);
    public static final RegistryObject<FishBones> FISH_BONES = ITEMS.register("fish_bones", FishBones::new);
    public static final RegistryObject<BowlOfFishBones> BOWL_OF_FISH_BONES = ITEMS.register("bowl_of_fish_bones", BowlOfFishBones::new);
    public static final RegistryObject<MilkBottle> MILK_BOTTLE = ITEMS.register("milk_bottle", MilkBottle::new);
    public static final RegistryObject<ChocolateMilkBottle> CHOCOLATE_MILK_BOTTLE = ITEMS.register("chocolate_milk_bottle", ChocolateMilkBottle::new);
    public static final RegistryObject<PumpkinJuice> PUMPKIN_JUICE = ITEMS.register("pumpkin_juice", PumpkinJuice::new);
    public static final RegistryObject<BatWing> BAT_WING = ITEMS.register("bat_wing", BatWing::new);
    public static final RegistryObject<BatSoup> BAT_SOUP = ITEMS.register("bat_soup", BatSoup::new);
    public static final RegistryObject<FieryStew> FIERY_STEW = ITEMS.register("fiery_stew", FieryStew::new);
    public static final RegistryObject<CookedBatWing> COOKED_BAT_WING = ITEMS.register("cooked_bat_wing", CookedBatWing::new);
    public static final RegistryObject<GoldenCarrotSalad> GOLDEN_CARROT_SALAD = ITEMS.register("golden_carrot_salad", GoldenCarrotSalad::new);
    public static final RegistryObject<GratedGoldenCarrot> GRATED_GOLDEN_CARROT = ITEMS.register("grated_golden_carrot", GratedGoldenCarrot::new);
    public static final RegistryObject<GoldenBerryPie> GOLDEN_BERRY_PIE = ITEMS.register("golden_berry_pie", GoldenBerryPie::new);
    public static final RegistryObject<GoldenBerryWine> GOLDEN_BERRY_WINE = ITEMS.register("golden_berry_wine", GoldenBerryWine::new);
    public static final RegistryObject<CreamyHoneyToast> CREAMY_HONEY_TOAST = ITEMS.register("creamy_honey_toast", CreamyHoneyToast::new);
    public static final RegistryObject<GlowBerryPie> GLOW_BERRY_PIE = ITEMS.register("glow_berry_pie", GlowBerryPie::new);
    public static final RegistryObject<GlowBerryWine> GLOW_BERRY_WINE = ITEMS.register("glow_berry_wine", GlowBerryWine::new);
}
