package me.mooy1.infinityexpansion.gear;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import me.mooy1.infinityexpansion.Categories;
import me.mooy1.infinityexpansion.Items;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

public class InfinityGear extends SlimefunItem {

    private static final ItemStack ingot = Items.INFINITE_INGOT;

    public InfinityGear(Type type) {
        super(Categories.INFINITY_GEAR, type.getItem(), RecipeType.ENHANCED_CRAFTING_TABLE,
            type.getRecipe());
    }

    @Getter
    @AllArgsConstructor(access = AccessLevel.PRIVATE)
    public enum Type {

        PICKAXE(Items.INFINITY_PICKAXE, new ItemStack[] {
                ingot, ingot, ingot,
                null, ingot, null,
                null, ingot, null
        }),
        BLADE(Items.INFINITY_BLADE, new ItemStack[] {
                null, ingot, null,
                null, ingot, null,
                null, ingot, null
        }),
        CROWN(Items.INFINITY_CROWN, new ItemStack[] {
            ingot, ingot, ingot,
            ingot, null, ingot,
            null, null, null
        }),
        CHESTPLATE(Items.INFINITY_CHESTPLATE, new ItemStack[] {
            ingot, null, ingot,
            ingot, ingot, ingot,
            ingot, ingot, ingot
        }),
        LEGGINGS(Items.INFINITY_LEGGINGS, new ItemStack[] {
            ingot, ingot, ingot,
            ingot, null, ingot,
            ingot, null, ingot
        }),
        BOOTS(Items.INFINITY_BOOTS, new ItemStack[] {
            null, null, null,
            ingot, null, ingot,
            ingot, null, ingot
        });

        @Nonnull
        private final SlimefunItemStack item;
        private final ItemStack[] recipe;
    }
}