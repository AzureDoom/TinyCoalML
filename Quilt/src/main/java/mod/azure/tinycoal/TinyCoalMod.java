package mod.azure.tinycoal;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

public class TinyCoalMod implements ModInitializer {

    public static final Item TINY_COAL = new Item(new Item.Properties());
    public static final Item TINY_CHARCOAL = new Item(new Item.Properties());

    @Override
    public void onInitialize(ModContainer container) {
        CommonClass.init();
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Constants.MODID, "tinycoal"), TINY_COAL);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Constants.MODID, "tinycharcoal"), TINY_CHARCOAL);
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.INGREDIENTS).register(entries -> entries.accept(TINY_COAL));
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.INGREDIENTS).register(entries -> entries.accept(TINY_CHARCOAL));
        FuelRegistry.INSTANCE.add(TINY_COAL, 200);
        FuelRegistry.INSTANCE.add(TINY_CHARCOAL, 200);
    }
}
