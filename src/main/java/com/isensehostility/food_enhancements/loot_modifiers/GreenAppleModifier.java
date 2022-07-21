package com.isensehostility.food_enhancements.loot_modifiers;

import com.google.common.base.Suppliers;
import com.google.gson.JsonObject;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.common.loot.LootModifier;
import net.minecraftforge.common.util.JsonUtils;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.Nonnull;
import java.util.Random;
import java.util.function.Supplier;

public class GreenAppleModifier extends LootModifier {
    private final Item appleItem;
    private final Random random = new Random();
    public static final Supplier<Codec<GreenAppleModifier>> CODEC = Suppliers.memoize(() -> RecordCodecBuilder.create(inst -> codecStart(inst)
            .and(ForgeRegistries.ITEMS.getCodec().fieldOf("appleItem").forGetter(m -> m.appleItem))
            .apply(inst, GreenAppleModifier::new)
    ));

    public GreenAppleModifier(LootItemCondition[] conditionsIn, Item apple) {
        super(conditionsIn);
        this.appleItem = apple;
    }

    @Nonnull
    @Override
    public ObjectArrayList<ItemStack> doApply(ObjectArrayList<ItemStack> generatedLoot, LootContext context) {
        if (random.nextInt(200) < 1) {
            ObjectArrayList<ItemStack> stack = new ObjectArrayList<>();
            stack.add(new ItemStack(appleItem));
            return stack;
        } else return generatedLoot;
    }

    @Override
    public Codec<? extends IGlobalLootModifier> codec() {
        return CODEC.get();
    }
}

