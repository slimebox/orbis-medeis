package org.femtobit.orbismedeis.gameobjects.registry;

import net.minecraft.item.Item;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.femtobit.orbismedeis.OrbisMedeis;
import org.femtobit.orbismedeis.gameobjects.item.ItemRegistry;

public class Registration {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, OrbisMedeis.ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());

        ItemRegistry.poke();
    }
}
