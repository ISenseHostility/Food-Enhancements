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
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.ShapedRecipe;
import net.minecraft.world.item.crafting.ShapelessRecipe;
import org.jetbrains.annotations.Nullable;

public class CaramelAppleTypeRecipe extends ShapelessRecipe {

    private final NonNullList<Ingredient> ingredients;
    private final ItemStack result;
    private final String group;

    public CaramelAppleTypeRecipe(ResourceLocation id, String group, ItemStack result, NonNullList<Ingredient> ingredients) {
        super(id, group, result, ingredients);
        this.ingredients = ingredients;
        this.result = result;
        this.group = group;
    }

    @Override
    public ItemStack assemble(CraftingContainer container) {
        ItemStack stack = new ItemStack(ItemRegistry.CARAMEL_APPLE.get());
        int apple_type = 0;

        for (int i = 0; i < container.getContainerSize(); i++) {
            if (container.getItem(i).getItem() == Items.APPLE) {
                apple_type = 1;
            } else if (container.getItem(i).getItem() == ItemRegistry.GREEN_APPLE.get()) {
                apple_type = 2;
            }
        }

        stack.getOrCreateTag().putInt("apple_type", apple_type);

        return stack;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return RecipeRegistry.CARAMEL_APPLE.get();
    }

    public static class Serializer extends net.minecraftforge.registries.ForgeRegistryEntry<RecipeSerializer<?>> implements RecipeSerializer<CaramelAppleTypeRecipe> {
        private static final ResourceLocation name = new ResourceLocation("food_enhancements", "caramel_apple");

        public CaramelAppleTypeRecipe fromJson(ResourceLocation p_44290_, JsonObject p_44291_) {
            String s = GsonHelper.getAsString(p_44291_, "group", "");
            NonNullList<Ingredient> nonnulllist = itemsFromJson(GsonHelper.getAsJsonArray(p_44291_, "ingredients"));
            if (nonnulllist.isEmpty()) {
                throw new JsonParseException("No ingredients for caramel apple recipe");
            } else if (nonnulllist.size() > 9) {
                throw new JsonParseException("Too many ingredients for caramel apple recipe. The maximum is " + 9);
            } else {
                ItemStack itemstack = ShapedRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(p_44291_, "result"));
                return new CaramelAppleTypeRecipe(p_44290_, s, itemstack, nonnulllist);
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

        public CaramelAppleTypeRecipe fromNetwork(ResourceLocation p_44293_, FriendlyByteBuf p_44294_) {
            String s = p_44294_.readUtf();
            int i = p_44294_.readVarInt();
            NonNullList<Ingredient> nonnulllist = NonNullList.withSize(i, Ingredient.EMPTY);

            for(int j = 0; j < nonnulllist.size(); ++j) {
                nonnulllist.set(j, Ingredient.fromNetwork(p_44294_));
            }

            ItemStack itemstack = p_44294_.readItem();
            return new CaramelAppleTypeRecipe(p_44293_, s, itemstack, nonnulllist);
        }

        public void toNetwork(FriendlyByteBuf p_44281_, CaramelAppleTypeRecipe p_44282_) {
            p_44281_.writeUtf(p_44282_.group);
            p_44281_.writeVarInt(p_44282_.ingredients.size());

            for(Ingredient ingredient : p_44282_.ingredients) {
                ingredient.toNetwork(p_44281_);
            }

            p_44281_.writeItem(p_44282_.result);
        }
    }
}
