package org.femtobit.orbismedeis;

import net.minecraftforge.fml.common.Mod;
import org.femtobit.orbismedeis.gameobjects.registry.Registration;

@Mod(OrbisMedeis.ID)
public class OrbisMedeis {
    public static final String ID = "orbismedeis";

    public OrbisMedeis() {
        Registration.init();
    }
}
