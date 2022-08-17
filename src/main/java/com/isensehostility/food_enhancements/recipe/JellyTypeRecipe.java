package com.isensehostility.food_enhancements.recipe;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.isensehostility.food_enhancements.init.ItemRegistry;
import com.isensehostility.food_enhancements.init.RecipeRegistry;
import net.minecraft.core.NonNullList;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.inventory.CraftingContainer;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.ShapedRecipe;
import net.minecraft.world.item.crafting.ShapelessRecipe;

public class JellyTypeRecipe extends ShapelessRecipe {

    private final NonNullList<Ingredient> ingredients;
    private final ItemStack result;
    private final String group;

    public JellyTypeRecipe(ResourceLocation id, String group, ItemStack result, NonNullList<Ingredient> ingredients) {
        super(id, group, result, ingredients);
        this.ingredients = ingredients;
        this.result = result;
        this.group = group;
    }

    @Override
    public ItemStack assemble(CraftingContainer container) {
        ItemStack stack = new ItemStack(ItemRegistry.JELLY.get());
        int jelly_type = 0;

        for (int i = 0; i < container.getContainerSize(); i++) {
            Item flavorIngredient = container.getItem(i).getItem();

            if (flavorIngredient == Items.APPLE || flavorIngredient == Items.SWEET_BERRIES || flavorIngredient == Items.MELON_SLICE || flavorIngredient == Items.GLISTERING_MELON_SLICE) {
                jelly_type = 1;
            } else if (flavorIngredient == ItemRegistry.GREEN_APPLE.get()) {
                jelly_type = 2;
            } else if (flavorIngredient == Items.CHORUS_FRUIT) {
                jelly_type = 5;
            } else if (flavorIngredient == Items.COCOA_BEANS) {
                jelly_type = 7;
            } else if (flavorIngredient == Items.BLAZE_POWDER || flavorIngredient == Items.MAGMA_CREAM) {
                jelly_type = 8;
            } else if (flavorIngredient == ItemRegistry.MILK_BOTTLE.get() || flavorIngredient == ItemRegistry.MARSHMALLOW.get()) {
                jelly_type = 6;
            } else if (flavorIngredient == ItemRegistry.COOKIE_CRUMBS.get() || flavorIngredient == ItemRegistry.CARAMEL.get() || flavorIngredient == ItemRegistry.PUMPKIN_SLICE.get()) {
                jelly_type = 4;
            } else if (flavorIngredient == Items.GOLDEN_APPLE || flavorIngredient == Items.ENCHANTED_GOLDEN_APPLE || flavorIngredient == Items.GLOW_BERRIES || flavorIngredient == Items.HONEY_BOTTLE || flavorIngredient == ItemRegistry.GOLDEN_BERRIES.get()) {
                jelly_type = 3;
            }
        }

        stack.getOrCreateTag().putInt("jelly_type", jelly_type);

        return stack;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return RecipeRegistry.JELLY.get();
    }

    public static class Serializer extends net.minecraftforge.registries.ForgeRegistryEntry<RecipeSerializer<?>> implements RecipeSerializer<JellyTypeRecipe> {
        private static final ResourceLocation NAME = new ResourceLocation("food_enhancements", "jelly");

        public JellyTypeRecipe fromJson(ResourceLocation p_44290_, JsonObject p_44291_) {
            String s = GsonHelper.getAsString(p_44291_, "group", "");
            NonNullList<Ingredient> nonnulllist = itemsFromJson(GsonHelper.getAsJsonArray(p_44291_, "ingredients"));
            if (nonnulllist.isEmpty()) {
                throw new JsonParseException("No ingredients for jelly recipe");
            } else if (nonnulllist.size() > 9) {
                throw new JsonParseException("Too many ingredients for jelly recipe. The maximum is " + 9);
            } else {
                ItemStack itemstack = ShapedRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(p_44291_, "result"));
                return new JellyTypeRecipe(p_44290_, s, itemstack, nonnulllist);
            }
        }

        private static NonNullList<Ingredient> itemsFromJson(JsonArray p_44276_) {
            NonNullList<Ingredient> nonnulllist = NonNullList.create();

            for(int i = 0; i < p_44276_.size(); ++i) {
                Ingredient ingredient = Ingredient.fromJson(p_44276_.get(i));
                if (true || !ingredient.isEmpty()) { // FORGE: Skip checking if an ingredient is empty during shapeless recipe deserialization to prevent complex ingredients from caching tags too early. Can not be done using a config value due to sync issues.
                    nonnulllist.add(ingredient);
                }
            }

            return nonnulllist;
        }

        public JellyTypeRecipe fromNetwork(ResourceLocation p_44293_, FriendlyByteBuf p_44294_) {
            String s = p_44294_.readUtf();
            int i = p_44294_.readVarInt();
            NonNullList<Ingredient> nonnulllist = NonNullList.withSize(i, Ingredient.EMPTY);

            for(int j = 0; j < nonnulllist.size(); ++j) {
                nonnulllist.set(j, Ingredient.fromNetwork(p_44294_));
            }

            ItemStack itemstack = p_44294_.readItem();
            return new JellyTypeRecipe(p_44293_, s, itemstack, nonnulllist);
        }

        public void toNetwork(FriendlyByteBuf p_44281_, JellyTypeRecipe p_44282_) {
            p_44281_.writeUtf(p_44282_.group);
            p_44281_.writeVarInt(p_44282_.ingredients.size());

            for(Ingredient ingredient : p_44282_.ingredients) {
                ingredient.toNetwork(p_44281_);
            }

            p_44281_.writeItem(p_44282_.result);
        }
    }
}
