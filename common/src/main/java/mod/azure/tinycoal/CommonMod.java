package mod.azure.tinycoal;

import mod.azure.tinycoal.item.ModItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public record CommonMod() {
    public static final String MOD_ID = "tinycoal";

    public static void init() {
        ModItems.init();
    }

    public static ResourceLocation modResource(String name) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, name);
    }
}
