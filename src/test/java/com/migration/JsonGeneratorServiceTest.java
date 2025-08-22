package com.migration;

import com.migration.entity.Record;
import com.migration.exception.JsonGenerationException;
import com.migration.service.JsonService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JsonGeneratorServiceTest {

    private JsonService service;

    @BeforeEach
    void setUp() {
        service = new JsonService();
    }

    @Test
    void shouldGenerateValidJsonForRecord() {
        // given
        Record record = new Record();
        record.setName("Test User");
        record.setValue("Developer");
        record.setEnabled(true);

        // when
        String json = service.generateJson(record);

        // then
        assertTrue(json.contains("\"name\" : \"Test User\""));
        assertTrue(json.contains("\"value\" : \"Developer\""));
        assertTrue(json.contains("\"enabled\" : true"));
    }

    @Test
    void shouldThrowExceptionForNullRecord() {
        // when + then
        Exception exception = assertThrows(JsonGenerationException.class,
                () -> service.generateJson(null));

        assertTrue(exception.getMessage().contains("Error generating JSON"));
    }
}
