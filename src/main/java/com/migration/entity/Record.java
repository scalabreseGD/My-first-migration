package com.migration.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents the data structure for JSON generation, equivalent to the COBOL ws-record.
 */
public class Record {

    @JsonProperty("name")
    private String name;

    @JsonProperty("value")
    private String value;

    @JsonProperty("enabled")
    private boolean enabled;

    // Standard getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public String toString() {
        return "Record{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                ", enabled=" + enabled +
                '}';
    }
}
