package mod.azure.tinycoal;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public class CommonMod {
    public static final String MOD_ID = "tinycoal";
    public static final Item TINY_COAL = new Item(new Item.Properties());
    public static final Item TINY_CHARCOAL = new Item(new Item.Properties());

    public static ResourceLocation modResource(String name) {
        return new ResourceLocation(MOD_ID, name);
    }
}
