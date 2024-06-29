package mod.azure.tinycoal;

import mod.azure.tinycoal.CommonMod;
import mod.azure.tinycoal.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

@Mod(CommonMod.MOD_ID)
public final class NeoForgeMod {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Registries.ITEM,
            CommonMod.MOD_ID);

    public NeoForgeMod(IEventBus modEventBus) {
        CommonMod.init();
        ITEMS.register(modEventBus);
        modEventBus.addListener(this::addCreativeTabs);
    }

    public void addCreativeTabs(final BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.TINY_COAL.get());
            event.accept(ModItems.TINY_CHARCOAL.get());
        }
    }
}
