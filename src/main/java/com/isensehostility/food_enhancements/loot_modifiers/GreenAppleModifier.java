package com.isensehostility.food_enhancements.loot_modifiers;

import com.google.gson.JsonObject;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.common.loot.LootModifier;
import net.minecraftforge.common.util.JsonUtils;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GreenAppleModifier extends LootModifier {
    private final Item appleItem;
    private final Random random = new Random();

    public GreenAppleModifier(LootItemCondition[] conditionsIn, Item apple) {
        super(conditionsIn);
        this.appleItem = apple;
    }

    @Nonnull
    @Override
    public List<ItemStack> doApply(List<ItemStack> generatedLoot, LootContext context) {
        if (random.nextInt(200) < 1) {
            List<ItemStack> stack = new ArrayList<>();
            stack.add(new ItemStack(appleItem));
            return stack;
        } else return generatedLoot;
    }

    public static class Serializer extends GlobalLootModifierSerializer<GreenAppleModifier> {

        @Override
        public GreenAppleModifier read(ResourceLocation location, JsonObject object, LootItemCondition[] conditionsIn) {
            Item green_apple = (Item) ForgeRegistries.ITEMS.getValue(new ResourceLocation(JsonUtils.readNBT(object, "appleItem").toString()));
            return new GreenAppleModifier(conditionsIn, green_apple);
        }

        @Override
        public JsonObject write(GreenAppleModifier instance) {
            return null;
        }
    }

}

