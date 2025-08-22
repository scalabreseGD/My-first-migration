package com.migration;

import com.migration.entity.Record;
import com.migration.service.JsonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class ApplicationRunner {
    private static final Logger logger = LoggerFactory.getLogger(ApplicationRunner.class);

    public void run() {
        logger.info("ApplicationRunner started");

        Scanner scanner = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter record name: ");
        String name = scanner.nextLine();

        System.out.print("Enter record value: ");
        String value = scanner.nextLine();

        System.out.print("Is record enabled? (true/false): ");
        boolean enabled = Boolean.parseBoolean(scanner.nextLine());

        // Create DTO with user input
        Record record = new Record();
        record.setName(name);
        record.setValue(value);
        record.setEnabled(enabled);
        logger.debug("Created Record from user input: {}", record);

        // Call service
        JsonService service = new JsonService();
        try {
            String jsonOutput = service.generateJson(record);
            logger.info("Generated JSON output with {} characters", jsonOutput.length());

            // Print result
            System.out.println("\nGenerated JSON:");
            System.out.println("----------------------------");
            System.out.println(jsonOutput);
            System.out.println("----------------------------");
            System.out.println("Character count: " + jsonOutput.length());

        } catch (Exception e) {
            logger.error("Error while running application", e);
        }

        logger.info("ApplicationRunner finished");
    }
}
