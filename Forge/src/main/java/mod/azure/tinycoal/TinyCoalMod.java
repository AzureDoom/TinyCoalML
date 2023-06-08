package mod.azure.tinycoal;

import mod.azure.tinycoal.item.TinyCoalItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod(Constants.MODID)
public class TinyCoalMod {

    public static final DeferredRegister<Item> ITEMS_DEFERRED_REGISTER = DeferredRegister.create(ForgeRegistries.ITEMS, Constants.MODID);
    public static final RegistryObject<Item> TINY_COAL = ITEMS_DEFERRED_REGISTER.register("tinycoal", TinyCoalItem::new);
    public static final RegistryObject<Item> TINY_CHARCOAL = ITEMS_DEFERRED_REGISTER.register("tinycharcoal", TinyCoalItem::new);

    public TinyCoalMod() {
        CommonClass.init();
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ITEMS_DEFERRED_REGISTER.register(bus);
        bus.addListener(this::addCreativeTabs);
    }

    public void addCreativeTabs(final BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(TINY_COAL.get());
            event.accept(TINY_CHARCOAL.get());
        }
    }
}