package org.femtobit.orbismedeis.gameobjects.item;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import org.femtobit.orbismedeis.gameobjects.item.core.JournalItem;
import org.femtobit.orbismedeis.gameobjects.registry.Registration;

import java.util.function.Supplier;

public class ItemRegistry {

    private static final Supplier<Item> JOURNAL_SUP = () -> new JournalItem();

    public static final RegistryObject<Item> JOURNAL = Registration.ITEMS.register("journal", JOURNAL_SUP);

    // Trigger classloading and initialise the static constants
    public static void poke() {}
}
