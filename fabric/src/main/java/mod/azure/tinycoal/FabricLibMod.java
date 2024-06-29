package mod.azure.tinycoal;

import mod.azure.tinycoal.item.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.CreativeModeTabs;

public final class FabricLibMod implements ModInitializer {

    @Override
    public void onInitialize() {
        CommonMod.init();
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.INGREDIENTS).register(entries -> {
            entries.accept(ModItems.TINY_COAL.get());
            entries.accept(ModItems.TINY_CHARCOAL.get());
        });
        FuelRegistry.INSTANCE.add(ModItems.TINY_COAL.get(), 200);
        FuelRegistry.INSTANCE.add(ModItems.TINY_CHARCOAL.get(), 200);
    }
}
