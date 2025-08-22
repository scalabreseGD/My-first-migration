package com.migration;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RecordTest {

    @Test
    void testRecordGettersAndSetters() {
        Record record = new Record();
        record.setName("Test Name");
        record.setValue("Test Value");
        record.setEnabled(true);

        assertEquals("Test Name", record.getName());
        assertEquals("Test Value", record.getValue());
        assertTrue(record.isEnabled());
    }
}
