package mod.azure.tinycoal.mixins;

import mod.azure.tinycoal.item.TinyCoalItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(TinyCoalItem.class)
public abstract class TinyCoalItemMixin extends Item {
    public TinyCoalItemMixin(Properties properties) {
        super(properties);
    }

    @Override
    public int getBurnTime(@NotNull ItemStack itemStack, RecipeType<?> recipeType) {
        return 200;
    }
}
