package com.eric;

import net.fabricmc.api.ModInitializer;

import static com.eric.BECUYeric.LOGGER;

public class Logger implements ModInitializer {
    @Override
    public void onInitialize() {
        LOGGER.info("\n"+
                "============================================\n"+
                "|\n"+
                "|\n"+
                    "|正在启动BECUYeric\n" +
                "v 1.0.0\n"+
                "|\n"+
                "|\n"+
                    "============================================\n");
    }
}
