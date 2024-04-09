package mod.azure.tinycoal;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.CreativeModeTabs;

public final class FabricLibMod implements ModInitializer {

    @Override
    public void onInitialize() {
        Registry.register(BuiltInRegistries.ITEM, CommonMod.modResource("tinycoal"), CommonMod.TINY_COAL);
        Registry.register(BuiltInRegistries.ITEM, CommonMod.modResource("tinycharcoal"), CommonMod.TINY_CHARCOAL);
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.INGREDIENTS).register(entries -> {
            entries.accept(CommonMod.TINY_COAL);
            entries.accept(CommonMod.TINY_CHARCOAL);
        });
        FuelRegistry.INSTANCE.add(CommonMod.TINY_COAL, 200);
        FuelRegistry.INSTANCE.add(CommonMod.TINY_CHARCOAL, 200);
    }
}
