package com.migration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

public class JsonGenerateExample {

    public static void main(String[] args) {
        // Create a new Record object
        Record record = new Record();
        record.setName(args[0]);
        record.setValue(args[1]);
        record.setEnabled(true);

        // Use Jackson to generate JSON
        ObjectMapper mapper = new ObjectMapper();
        ObjectWriter writer = mapper.writerWithDefaultPrettyPrinter();

        try {
            String jsonOutput = writer.writeValueAsString(record);
            int jsonCharCount = jsonOutput.length();

            System.out.println("JSON document successfully generated.");
            System.out.println("Generated JSON for record: " + record.toString());
            System.out.println("----------------------------");
            System.out.println(jsonOutput);
            System.out.println("----------------------------");
            System.out.println("JSON output character count: " + jsonCharCount);
            System.out.println("Done.");

        } catch (Exception e) {
            System.err.println("Error generating JSON: " + e.getMessage());
        }
    }
}
