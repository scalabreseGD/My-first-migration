package com.migration.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.migration.entity.Record;
import com.migration.exception.JsonGenerationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JsonService {
    private static final Logger logger = LoggerFactory.getLogger(JsonService.class);
    private final ObjectWriter writer;

    public JsonService() {
        ObjectMapper mapper = new ObjectMapper();
        this.writer = mapper.writerWithDefaultPrettyPrinter();
    }

    public JsonService(ObjectWriter writer) {
        this.writer = writer;
    }

    public String generateJson(Record record) {
        try {
            logger.debug("Generating JSON for record: {}", record);
            String json = writer.writeValueAsString(record);
            logger.info("JSON successfully generated for record: {}", record.getName());
            return json;
        } catch (Exception e) {
            logger.error("Failed to generate JSON for record: {}", record, e);
            throw new JsonGenerationException("Error generating JSON", e);
        }
    }
}
