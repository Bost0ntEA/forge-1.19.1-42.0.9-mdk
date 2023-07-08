package net.Bostontea.beerealistic_mod.item;

import net.Bostontea.beerealistic_mod.BeeRealistic;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BeeRealistic.MOD_ID);

    // MUSZA BYC TAKIE SAME TE Z ASSETS/MODELS/ITEM (PLIKI JSON)
    public static final RegistryObject<Item> BeeFrame =ITEMS.register("hive_frame",
            ()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> FULL_BeeFrame =ITEMS.register("full_hive_frame",
            ()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static void register(IEventBus iEventBus){
        ITEMS.register(iEventBus);
    }

}
