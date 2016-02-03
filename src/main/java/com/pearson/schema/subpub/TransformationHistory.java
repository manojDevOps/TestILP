
package com.pearson.schema.subpub;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "Transform_Datetime",
    "From_Version",
    "To_Version"
})
public class TransformationHistory {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Transform_Datetime")
    private String TransformDatetime;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("From_Version")
    private TransformationHistory.FromVersion FromVersion;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("To_Version")
    private TransformationHistory.ToVersion ToVersion;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     * @return
     *     The TransformDatetime
     */
    @JsonProperty("Transform_Datetime")
    public String getTransformDatetime() {
        return TransformDatetime;
    }

    /**
     * 
     * (Required)
     * 
     * @param TransformDatetime
     *     The Transform_Datetime
     */
    @JsonProperty("Transform_Datetime")
    public void setTransformDatetime(String TransformDatetime) {
        this.TransformDatetime = TransformDatetime;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The FromVersion
     */
    @JsonProperty("From_Version")
    public TransformationHistory.FromVersion getFromVersion() {
        return FromVersion;
    }

    /**
     * 
     * (Required)
     * 
     * @param FromVersion
     *     The From_Version
     */
    @JsonProperty("From_Version")
    public void setFromVersion(TransformationHistory.FromVersion FromVersion) {
        this.FromVersion = FromVersion;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The ToVersion
     */
    @JsonProperty("To_Version")
    public TransformationHistory.ToVersion getToVersion() {
        return ToVersion;
    }

    /**
     * 
     * (Required)
     * 
     * @param ToVersion
     *     The To_Version
     */
    @JsonProperty("To_Version")
    public void setToVersion(TransformationHistory.ToVersion ToVersion) {
        this.ToVersion = ToVersion;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(TransformDatetime).append(FromVersion).append(ToVersion).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TransformationHistory) == false) {
            return false;
        }
        TransformationHistory rhs = ((TransformationHistory) other);
        return new EqualsBuilder().append(TransformDatetime, rhs.TransformDatetime).append(FromVersion, rhs.FromVersion).append(ToVersion, rhs.ToVersion).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

    @Generated("org.jsonschema2pojo")
    public static enum FromVersion {

        _1_0("1.0"),
        _2_0("2.0");
        private final String value;
        private static Map<String, TransformationHistory.FromVersion> constants = new HashMap<String, TransformationHistory.FromVersion>();

        static {
            for (TransformationHistory.FromVersion c: values()) {
                constants.put(c.value, c);
            }
        }

        private FromVersion(String value) {
            this.value = value;
        }

        @JsonValue
        @Override
        public String toString() {
            return this.value;
        }

        @JsonCreator
        public static TransformationHistory.FromVersion fromValue(String value) {
            TransformationHistory.FromVersion constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    @Generated("org.jsonschema2pojo")
    public static enum ToVersion {

        _1_0("1.0"),
        _2_0("2.0");
        private final String value;
        private static Map<String, TransformationHistory.ToVersion> constants = new HashMap<String, TransformationHistory.ToVersion>();

        static {
            for (TransformationHistory.ToVersion c: values()) {
                constants.put(c.value, c);
            }
        }

        private ToVersion(String value) {
            this.value = value;
        }

        @JsonValue
        @Override
        public String toString() {
            return this.value;
        }

        @JsonCreator
        public static TransformationHistory.ToVersion fromValue(String value) {
            TransformationHistory.ToVersion constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
