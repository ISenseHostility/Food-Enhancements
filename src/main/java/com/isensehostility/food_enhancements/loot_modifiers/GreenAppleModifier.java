package com.isensehostility.food_enhancements.loot_modifiers;

import com.google.gson.JsonObject;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.LootContext;
import net.minecraft.loot.conditions.ILootCondition;
import net.minecraft.util.JSONUtils;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.common.loot.LootModifier;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GreenAppleModifier extends LootModifier {
    private final Item appleItem;

    public GreenAppleModifier(ILootCondition[] conditionsIn, Item apple) {
        super(conditionsIn);
        this.appleItem = apple;
    }

    @Nonnull
    @Override
    public List<ItemStack> doApply(List<ItemStack> generatedLoot, LootContext context) {
        Random chance = new Random();
        if (chance.nextInt(200) < 1){
            List<ItemStack> stack = new ArrayList<ItemStack>();
            stack.add(new ItemStack(appleItem));
            return stack;
        }
        else return generatedLoot;
    }

    public static class Serializer extends GlobalLootModifierSerializer<GreenAppleModifier> {
        @Override
        public GreenAppleModifier read(ResourceLocation name, JsonObject object, ILootCondition[] conditionsIn) {
            Item green_apple = ForgeRegistries.ITEMS.getValue(new ResourceLocation(JSONUtils.getString(object, "appleItem")));
            return new GreenAppleModifier(conditionsIn, green_apple);
        }

        @Override
        public JsonObject write(GreenAppleModifier instance) {
            return null;
        }
    }
}

