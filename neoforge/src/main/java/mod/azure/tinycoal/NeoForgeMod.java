package mod.azure.tinycoal;

import mod.azure.tinycoal.CommonMod;
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


    public static final DeferredRegister<Item> ITEM_DEFERRED_REGISTER = DeferredRegister.create(Registries.ITEM,
            CommonMod.MOD_ID);
    public static final Supplier<Item> TINY_COAL = ITEM_DEFERRED_REGISTER.register("tinycoal", TinyCoalItem::new);
    public static final Supplier<Item> TINY_CHARCOAL = ITEM_DEFERRED_REGISTER.register("tinycharcoal",
            TinyCoalItem::new);

    public NeoForgeMod(IEventBus modEventBus) {
        ITEM_DEFERRED_REGISTER.register(modEventBus);
        modEventBus.addListener(this::addCreativeTabs);
    }

    public void addCreativeTabs(final BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(TINY_COAL.get());
            event.accept(TINY_CHARCOAL.get());
        }
    }
}
