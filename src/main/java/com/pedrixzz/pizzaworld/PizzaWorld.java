package com.pedrixzz.pizzaworld;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PizzaWorld implements ModInitializer {
    public static final String MOD_ID = "pedrixzz_world";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("PedrixzZ World Inicializado!");
        LOGGER.info("Geração de mundo em formato de pizza (6144x6144) configurada.");
    }
}
