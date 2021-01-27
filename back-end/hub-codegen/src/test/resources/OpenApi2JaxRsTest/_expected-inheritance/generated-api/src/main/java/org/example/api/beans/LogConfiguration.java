
package org.example.api.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "level"
})
public class LogConfiguration {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("level")
    private String level;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("level")
    public String getLevel() {
        return level;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("level")
    public void setLevel(String level) {
        this.level = level;
    }

}
