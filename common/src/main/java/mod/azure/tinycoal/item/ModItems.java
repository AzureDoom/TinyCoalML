package mod.azure.tinycoal.item;

import mod.azure.tinycoal.CommonMod;
import net.minecraft.world.item.Item;

import java.util.function.Supplier;

public record ModItems() implements CommonItemRegistryInterface{

    public static final Supplier<Item> TINY_COAL = CommonItemRegistryInterface.registerItem(CommonMod.MOD_ID, "tinycoal", TinyCoalItem::new);
    public static final Supplier<Item> TINY_CHARCOAL = CommonItemRegistryInterface.registerItem(CommonMod.MOD_ID, "tinycharcoal", TinyCoalItem::new);

    public static void init() {
    }
}