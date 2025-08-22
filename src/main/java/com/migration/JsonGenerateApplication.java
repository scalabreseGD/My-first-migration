package com.migration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.migration.entity.Record;

public class JsonGenerateApplication {
    private static final Logger logger = LoggerFactory.getLogger(JsonGenerateApplication.class);

    public static void main(String[] args) {
        logger.info("Starting Json Generator Application...");

        // Delegate to Application Runner
        new ApplicationRunner().run();

        logger.info("Application finished.");
    }
}
