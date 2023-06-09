package com.github.sib_energy_craft.recipes.load;

import com.github.sib_energy_craft.energy_api.utils.Identifiers;
import com.github.sib_energy_craft.recipes.recipe.CompressingRecipe;
import com.github.sib_energy_craft.recipes.recipe.ExtractingRecipe;
import com.github.sib_energy_craft.recipes.recipe.MaceratingRecipe;
import com.github.sib_energy_craft.sec_utils.load.DefaultModInitializer;
import net.minecraft.recipe.RecipeType;

/**
 * @since 0.0.1
 * @author sibmaks
 */
public final class RecipeTypes implements DefaultModInitializer {
    public static final RecipeType<ExtractingRecipe> EXTRACTING;
    public static final RecipeType<MaceratingRecipe> MACERATING;
    public static final RecipeType<CompressingRecipe> COMPRESSING;

    static {
        EXTRACTING = RecipeType.register(Identifiers.asString("extracting"));
        MACERATING = RecipeType.register(Identifiers.asString("macerating"));
        COMPRESSING = RecipeType.register(Identifiers.asString("compressing"));
    }
}
