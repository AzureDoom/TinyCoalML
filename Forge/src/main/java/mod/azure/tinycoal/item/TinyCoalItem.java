package mod.azure.tinycoal.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;

public class TinyCoalItem extends Item {

	public TinyCoalItem() {
		super(new Properties());
	}

	@Override
	public int getBurnTime(ItemStack itemStack, RecipeType<?> recipeType) {
		return 200;
	}
}