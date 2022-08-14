package com.isensehostility.food_enhancements.init;

import com.isensehostility.food_enhancements.FoodEnhancements;
import com.isensehostility.food_enhancements.recipe.CaramelAppleTypeRecipe;
import com.isensehostility.food_enhancements.recipe.JellyTypeRecipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class RecipeRegistry {
    public static final DeferredRegister<RecipeSerializer<?>> RECIPES = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, FoodEnhancements.MODID);

    public static void initialize() {
        RECIPES.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static final RegistryObject<RecipeSerializer<CaramelAppleTypeRecipe>> CARAMEL_APPLE = RECIPES.register("caramel_apple", CaramelAppleTypeRecipe.Serializer::new);
    public static final RegistryObject<RecipeSerializer<JellyTypeRecipe>> JELLY = RECIPES.register("jelly", JellyTypeRecipe.Serializer::new);
}
