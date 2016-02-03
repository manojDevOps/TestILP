
package com.pearson.schema.subpub;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
import com.pearson.daalt.common.MessageTypeCode;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "Message_Type_Code",
    "Originating_System_Code",
    "Message_Version",
    "Transaction_Type_Code",
    "Transaction_Datetime",
    "Course_Section_Source_System_Code",
    "Course_Section_Source_System_Record_Id",
    "Course_Source_System_Code",
    "Course_Source_System_Record_Id",
    "Course_Section_Code",
    "Course_Section_Title",
    "Course_Section_Description",
    "Call_Number",
    "Section_Details",
    "Time_Required_For_Completion",
    "Ref_Time_Units_Code",
    "Ref_Instruction_Language_Code",
    "Virtual_Indicator",
    "Organization_Calendar_Session_Id",
    "Organization_Calendar_Session_Designator",
    "Course_Access_Start_Date",
    "Course_Access_End_Date",
    "Course_Meeting_Days_Of_Week_MTWTFSS",
    "Open_Enrollment_Begin_Datetime",
    "Open_Enrollment_End_Datetime",
    "Course_Section_Meeting_Schedule",
    "Transformation_History"
})
public class CourseSectionSchema  implements SubpubMessage {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Message_Type_Code")
    private MessageTypeCode MessageTypeCode;
    /**
     * 
     */
    @JsonProperty("Originating_System_Code")
    private CourseSectionSchema.OriginatingSystemCode OriginatingSystemCode;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Message_Version")
    private CourseSectionSchema.MessageVersion MessageVersion;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Transaction_Type_Code")
    private CourseSectionSchema.TransactionTypeCode TransactionTypeCode;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Transaction_Datetime")
    private String TransactionDatetime;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Course_Section_Source_System_Code")
    private CourseSectionSchema.CourseSectionSourceSystemCode CourseSectionSourceSystemCode;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Course_Section_Source_System_Record_Id")
    private String CourseSectionSourceSystemRecordId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Course_Source_System_Code")
    private CourseSectionSchema.CourseSourceSystemCode CourseSourceSystemCode;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Course_Source_System_Record_Id")
    private String CourseSourceSystemRecordId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Course_Section_Code")
    private String CourseSectionCode;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Course_Section_Title")
    private String CourseSectionTitle;
    /**
     * 
     */
    @JsonProperty("Course_Section_Description")
    private String CourseSectionDescription;
    /**
     * 
     */
    @JsonProperty("Call_Number")
    private String CallNumber;
    /**
     * 
     */
    @JsonProperty("Section_Details")
    private String SectionDetails;
    /**
     * 
     */
    @JsonProperty("Time_Required_For_Completion")
    private Double TimeRequiredForCompletion;
    /**
     * 
     */
    @JsonProperty("Ref_Time_Units_Code")
    private CourseSectionSchema.RefTimeUnitsCode RefTimeUnitsCode;
    /**
     * 
     */
    @JsonProperty("Ref_Instruction_Language_Code")
    private CourseSectionSchema.RefInstructionLanguageCode RefInstructionLanguageCode;
    /**
     * 
     */
    @JsonProperty("Virtual_Indicator")
    private String VirtualIndicator;
    /**
     * 
     */
    @JsonProperty("Organization_Calendar_Session_Id")
    private String OrganizationCalendarSessionId;
    /**
     * 
     */
    @JsonProperty("Organization_Calendar_Session_Designator")
    private String OrganizationCalendarSessionDesignator;
    /**
     * 
     */
    @JsonProperty("Course_Access_Start_Date")
    private String CourseAccessStartDate;
    /**
     * 
     */
    @JsonProperty("Course_Access_End_Date")
    private String CourseAccessEndDate;
    /**
     * 
     */
    @JsonProperty("Course_Meeting_Days_Of_Week_MTWTFSS")
    private String CourseMeetingDaysOfWeekMTWTFSS;
    /**
     * 
     */
    @JsonProperty("Open_Enrollment_Begin_Datetime")
    private String OpenEnrollmentBeginDatetime;
    /**
     * 
     */
    @JsonProperty("Open_Enrollment_End_Datetime")
    private String OpenEnrollmentEndDatetime;
    /**
     * 
     */
    @JsonProperty("Course_Section_Meeting_Schedule")
    private String CourseSectionMeetingSchedule;
    /**
     * 
     */
    @JsonProperty("Transformation_History")
    private List<com.pearson.schema.subpub.TransformationHistory> TransformationHistory = new ArrayList<com.pearson.schema.subpub.TransformationHistory>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     * @return
     *     The MessageTypeCode
     */
    @JsonProperty("Message_Type_Code")
    public MessageTypeCode getMessageTypeCode() {
        return MessageTypeCode;
    }

    /**
     * 
     * (Required)
     * 
     * @param MessageTypeCode
     *     The Message_Type_Code
     */
    @JsonProperty("Message_Type_Code")
    public void setMessageTypeCode(MessageTypeCode MessageTypeCode) {
        this.MessageTypeCode = MessageTypeCode;
    }

    /**
     * 
     * @return
     *     The OriginatingSystemCode
     */
    @JsonProperty("Originating_System_Code")
    public CourseSectionSchema.OriginatingSystemCode getOriginatingSystemCode() {
        return OriginatingSystemCode;
    }

    /**
     * 
     * @param OriginatingSystemCode
     *     The Originating_System_Code
     */
    @JsonProperty("Originating_System_Code")
    public void setOriginatingSystemCode(CourseSectionSchema.OriginatingSystemCode OriginatingSystemCode) {
        this.OriginatingSystemCode = OriginatingSystemCode;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The MessageVersion
     */
    @JsonProperty("Message_Version")
    public CourseSectionSchema.MessageVersion getMessageVersion() {
        return MessageVersion;
    }

    /**
     * 
     * (Required)
     * 
     * @param MessageVersion
     *     The Message_Version
     */
    @JsonProperty("Message_Version")
    public void setMessageVersion(CourseSectionSchema.MessageVersion MessageVersion) {
        this.MessageVersion = MessageVersion;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The TransactionTypeCode
     */
    @JsonProperty("Transaction_Type_Code")
    public CourseSectionSchema.TransactionTypeCode getTransactionTypeCode() {
        return TransactionTypeCode;
    }

    /**
     * 
     * (Required)
     * 
     * @param TransactionTypeCode
     *     The Transaction_Type_Code
     */
    @JsonProperty("Transaction_Type_Code")
    public void setTransactionTypeCode(CourseSectionSchema.TransactionTypeCode TransactionTypeCode) {
        this.TransactionTypeCode = TransactionTypeCode;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The TransactionDatetime
     */
    @JsonProperty("Transaction_Datetime")
    public String getTransactionDatetime() {
        return TransactionDatetime;
    }

    /**
     * 
     * (Required)
     * 
     * @param TransactionDatetime
     *     The Transaction_Datetime
     */
    @JsonProperty("Transaction_Datetime")
    public void setTransactionDatetime(String TransactionDatetime) {
        this.TransactionDatetime = TransactionDatetime;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The CourseSectionSourceSystemCode
     */
    @JsonProperty("Course_Section_Source_System_Code")
    public CourseSectionSchema.CourseSectionSourceSystemCode getCourseSectionSourceSystemCode() {
        return CourseSectionSourceSystemCode;
    }

    /**
     * 
     * (Required)
     * 
     * @param CourseSectionSourceSystemCode
     *     The Course_Section_Source_System_Code
     */
    @JsonProperty("Course_Section_Source_System_Code")
    public void setCourseSectionSourceSystemCode(CourseSectionSchema.CourseSectionSourceSystemCode CourseSectionSourceSystemCode) {
        this.CourseSectionSourceSystemCode = CourseSectionSourceSystemCode;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The CourseSectionSourceSystemRecordId
     */
    @JsonProperty("Course_Section_Source_System_Record_Id")
    public String getCourseSectionSourceSystemRecordId() {
        return CourseSectionSourceSystemRecordId;
    }

    /**
     * 
     * (Required)
     * 
     * @param CourseSectionSourceSystemRecordId
     *     The Course_Section_Source_System_Record_Id
     */
    @JsonProperty("Course_Section_Source_System_Record_Id")
    public void setCourseSectionSourceSystemRecordId(String CourseSectionSourceSystemRecordId) {
        this.CourseSectionSourceSystemRecordId = CourseSectionSourceSystemRecordId;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The CourseSourceSystemCode
     */
    @JsonProperty("Course_Source_System_Code")
    public CourseSectionSchema.CourseSourceSystemCode getCourseSourceSystemCode() {
        return CourseSourceSystemCode;
    }

    /**
     * 
     * (Required)
     * 
     * @param CourseSourceSystemCode
     *     The Course_Source_System_Code
     */
    @JsonProperty("Course_Source_System_Code")
    public void setCourseSourceSystemCode(CourseSectionSchema.CourseSourceSystemCode CourseSourceSystemCode) {
        this.CourseSourceSystemCode = CourseSourceSystemCode;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The CourseSourceSystemRecordId
     */
    @JsonProperty("Course_Source_System_Record_Id")
    public String getCourseSourceSystemRecordId() {
        return CourseSourceSystemRecordId;
    }

    /**
     * 
     * (Required)
     * 
     * @param CourseSourceSystemRecordId
     *     The Course_Source_System_Record_Id
     */
    @JsonProperty("Course_Source_System_Record_Id")
    public void setCourseSourceSystemRecordId(String CourseSourceSystemRecordId) {
        this.CourseSourceSystemRecordId = CourseSourceSystemRecordId;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The CourseSectionCode
     */
    @JsonProperty("Course_Section_Code")
    public String getCourseSectionCode() {
        return CourseSectionCode;
    }

    /**
     * 
     * (Required)
     * 
     * @param CourseSectionCode
     *     The Course_Section_Code
     */
    @JsonProperty("Course_Section_Code")
    public void setCourseSectionCode(String CourseSectionCode) {
        this.CourseSectionCode = CourseSectionCode;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The CourseSectionTitle
     */
    @JsonProperty("Course_Section_Title")
    public String getCourseSectionTitle() {
        return CourseSectionTitle;
    }

    /**
     * 
     * (Required)
     * 
     * @param CourseSectionTitle
     *     The Course_Section_Title
     */
    @JsonProperty("Course_Section_Title")
    public void setCourseSectionTitle(String CourseSectionTitle) {
        this.CourseSectionTitle = CourseSectionTitle;
    }

    /**
     * 
     * @return
     *     The CourseSectionDescription
     */
    @JsonProperty("Course_Section_Description")
    public String getCourseSectionDescription() {
        return CourseSectionDescription;
    }

    /**
     * 
     * @param CourseSectionDescription
     *     The Course_Section_Description
     */
    @JsonProperty("Course_Section_Description")
    public void setCourseSectionDescription(String CourseSectionDescription) {
        this.CourseSectionDescription = CourseSectionDescription;
    }

    /**
     * 
     * @return
     *     The CallNumber
     */
    @JsonProperty("Call_Number")
    public String getCallNumber() {
        return CallNumber;
    }

    /**
     * 
     * @param CallNumber
     *     The Call_Number
     */
    @JsonProperty("Call_Number")
    public void setCallNumber(String CallNumber) {
        this.CallNumber = CallNumber;
    }

    /**
     * 
     * @return
     *     The SectionDetails
     */
    @JsonProperty("Section_Details")
    public String getSectionDetails() {
        return SectionDetails;
    }

    /**
     * 
     * @param SectionDetails
     *     The Section_Details
     */
    @JsonProperty("Section_Details")
    public void setSectionDetails(String SectionDetails) {
        this.SectionDetails = SectionDetails;
    }

    /**
     * 
     * @return
     *     The TimeRequiredForCompletion
     */
    @JsonProperty("Time_Required_For_Completion")
    public Double getTimeRequiredForCompletion() {
        return TimeRequiredForCompletion;
    }

    /**
     * 
     * @param TimeRequiredForCompletion
     *     The Time_Required_For_Completion
     */
    @JsonProperty("Time_Required_For_Completion")
    public void setTimeRequiredForCompletion(Double TimeRequiredForCompletion) {
        this.TimeRequiredForCompletion = TimeRequiredForCompletion;
    }

    /**
     * 
     * @return
     *     The RefTimeUnitsCode
     */
    @JsonProperty("Ref_Time_Units_Code")
    public CourseSectionSchema.RefTimeUnitsCode getRefTimeUnitsCode() {
        return RefTimeUnitsCode;
    }

    /**
     * 
     * @param RefTimeUnitsCode
     *     The Ref_Time_Units_Code
     */
    @JsonProperty("Ref_Time_Units_Code")
    public void setRefTimeUnitsCode(CourseSectionSchema.RefTimeUnitsCode RefTimeUnitsCode) {
        this.RefTimeUnitsCode = RefTimeUnitsCode;
    }

    /**
     * 
     * @return
     *     The RefInstructionLanguageCode
     */
    @JsonProperty("Ref_Instruction_Language_Code")
    public CourseSectionSchema.RefInstructionLanguageCode getRefInstructionLanguageCode() {
        return RefInstructionLanguageCode;
    }

    /**
     * 
     * @param RefInstructionLanguageCode
     *     The Ref_Instruction_Language_Code
     */
    @JsonProperty("Ref_Instruction_Language_Code")
    public void setRefInstructionLanguageCode(CourseSectionSchema.RefInstructionLanguageCode RefInstructionLanguageCode) {
        this.RefInstructionLanguageCode = RefInstructionLanguageCode;
    }

    /**
     * 
     * @return
     *     The VirtualIndicator
     */
    @JsonProperty("Virtual_Indicator")
    public String getVirtualIndicator() {
        return VirtualIndicator;
    }

    /**
     * 
     * @param VirtualIndicator
     *     The Virtual_Indicator
     */
    @JsonProperty("Virtual_Indicator")
    public void setVirtualIndicator(String VirtualIndicator) {
        this.VirtualIndicator = VirtualIndicator;
    }

    /**
     * 
     * @return
     *     The OrganizationCalendarSessionId
     */
    @JsonProperty("Organization_Calendar_Session_Id")
    public String getOrganizationCalendarSessionId() {
        return OrganizationCalendarSessionId;
    }

    /**
     * 
     * @param OrganizationCalendarSessionId
     *     The Organization_Calendar_Session_Id
     */
    @JsonProperty("Organization_Calendar_Session_Id")
    public void setOrganizationCalendarSessionId(String OrganizationCalendarSessionId) {
        this.OrganizationCalendarSessionId = OrganizationCalendarSessionId;
    }

    /**
     * 
     * @return
     *     The OrganizationCalendarSessionDesignator
     */
    @JsonProperty("Organization_Calendar_Session_Designator")
    public String getOrganizationCalendarSessionDesignator() {
        return OrganizationCalendarSessionDesignator;
    }

    /**
     * 
     * @param OrganizationCalendarSessionDesignator
     *     The Organization_Calendar_Session_Designator
     */
    @JsonProperty("Organization_Calendar_Session_Designator")
    public void setOrganizationCalendarSessionDesignator(String OrganizationCalendarSessionDesignator) {
        this.OrganizationCalendarSessionDesignator = OrganizationCalendarSessionDesignator;
    }

    /**
     * 
     * @return
     *     The CourseAccessStartDate
     */
    @JsonProperty("Course_Access_Start_Date")
    public String getCourseAccessStartDate() {
        return CourseAccessStartDate;
    }

    /**
     * 
     * @param CourseAccessStartDate
     *     The Course_Access_Start_Date
     */
    @JsonProperty("Course_Access_Start_Date")
    public void setCourseAccessStartDate(String CourseAccessStartDate) {
        this.CourseAccessStartDate = CourseAccessStartDate;
    }

    /**
     * 
     * @return
     *     The CourseAccessEndDate
     */
    @JsonProperty("Course_Access_End_Date")
    public String getCourseAccessEndDate() {
        return CourseAccessEndDate;
    }

    /**
     * 
     * @param CourseAccessEndDate
     *     The Course_Access_End_Date
     */
    @JsonProperty("Course_Access_End_Date")
    public void setCourseAccessEndDate(String CourseAccessEndDate) {
        this.CourseAccessEndDate = CourseAccessEndDate;
    }

    /**
     * 
     * @return
     *     The CourseMeetingDaysOfWeekMTWTFSS
     */
    @JsonProperty("Course_Meeting_Days_Of_Week_MTWTFSS")
    public String getCourseMeetingDaysOfWeekMTWTFSS() {
        return CourseMeetingDaysOfWeekMTWTFSS;
    }

    /**
     * 
     * @param CourseMeetingDaysOfWeekMTWTFSS
     *     The Course_Meeting_Days_Of_Week_MTWTFSS
     */
    @JsonProperty("Course_Meeting_Days_Of_Week_MTWTFSS")
    public void setCourseMeetingDaysOfWeekMTWTFSS(String CourseMeetingDaysOfWeekMTWTFSS) {
        this.CourseMeetingDaysOfWeekMTWTFSS = CourseMeetingDaysOfWeekMTWTFSS;
    }

    /**
     * 
     * @return
     *     The OpenEnrollmentBeginDatetime
     */
    @JsonProperty("Open_Enrollment_Begin_Datetime")
    public String getOpenEnrollmentBeginDatetime() {
        return OpenEnrollmentBeginDatetime;
    }

    /**
     * 
     * @param OpenEnrollmentBeginDatetime
     *     The Open_Enrollment_Begin_Datetime
     */
    @JsonProperty("Open_Enrollment_Begin_Datetime")
    public void setOpenEnrollmentBeginDatetime(String OpenEnrollmentBeginDatetime) {
        this.OpenEnrollmentBeginDatetime = OpenEnrollmentBeginDatetime;
    }

    /**
     * 
     * @return
     *     The OpenEnrollmentEndDatetime
     */
    @JsonProperty("Open_Enrollment_End_Datetime")
    public String getOpenEnrollmentEndDatetime() {
        return OpenEnrollmentEndDatetime;
    }

    /**
     * 
     * @param OpenEnrollmentEndDatetime
     *     The Open_Enrollment_End_Datetime
     */
    @JsonProperty("Open_Enrollment_End_Datetime")
    public void setOpenEnrollmentEndDatetime(String OpenEnrollmentEndDatetime) {
        this.OpenEnrollmentEndDatetime = OpenEnrollmentEndDatetime;
    }

    /**
     * 
     * @return
     *     The CourseSectionMeetingSchedule
     */
    @JsonProperty("Course_Section_Meeting_Schedule")
    public String getCourseSectionMeetingSchedule() {
        return CourseSectionMeetingSchedule;
    }

    /**
     * 
     * @param CourseSectionMeetingSchedule
     *     The Course_Section_Meeting_Schedule
     */
    @JsonProperty("Course_Section_Meeting_Schedule")
    public void setCourseSectionMeetingSchedule(String CourseSectionMeetingSchedule) {
        this.CourseSectionMeetingSchedule = CourseSectionMeetingSchedule;
    }

    /**
     * 
     * @return
     *     The TransformationHistory
     */
    @JsonProperty("Transformation_History")
    public List<com.pearson.schema.subpub.TransformationHistory> getTransformationHistory() {
        return TransformationHistory;
    }

    /**
     * 
     * @param TransformationHistory
     *     The Transformation_History
     */
    @JsonProperty("Transformation_History")
    public void setTransformationHistory(List<com.pearson.schema.subpub.TransformationHistory> TransformationHistory) {
        this.TransformationHistory = TransformationHistory;
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
        return new HashCodeBuilder().append(MessageTypeCode).append(OriginatingSystemCode).append(MessageVersion).append(TransactionTypeCode).append(TransactionDatetime).append(CourseSectionSourceSystemCode).append(CourseSectionSourceSystemRecordId).append(CourseSourceSystemCode).append(CourseSourceSystemRecordId).append(CourseSectionCode).append(CourseSectionTitle).append(CourseSectionDescription).append(CallNumber).append(SectionDetails).append(TimeRequiredForCompletion).append(RefTimeUnitsCode).append(RefInstructionLanguageCode).append(VirtualIndicator).append(OrganizationCalendarSessionId).append(OrganizationCalendarSessionDesignator).append(CourseAccessStartDate).append(CourseAccessEndDate).append(CourseMeetingDaysOfWeekMTWTFSS).append(OpenEnrollmentBeginDatetime).append(OpenEnrollmentEndDatetime).append(CourseSectionMeetingSchedule).append(TransformationHistory).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CourseSectionSchema) == false) {
            return false;
        }
        CourseSectionSchema rhs = ((CourseSectionSchema) other);
        return new EqualsBuilder().append(MessageTypeCode, rhs.MessageTypeCode).append(OriginatingSystemCode, rhs.OriginatingSystemCode).append(MessageVersion, rhs.MessageVersion).append(TransactionTypeCode, rhs.TransactionTypeCode).append(TransactionDatetime, rhs.TransactionDatetime).append(CourseSectionSourceSystemCode, rhs.CourseSectionSourceSystemCode).append(CourseSectionSourceSystemRecordId, rhs.CourseSectionSourceSystemRecordId).append(CourseSourceSystemCode, rhs.CourseSourceSystemCode).append(CourseSourceSystemRecordId, rhs.CourseSourceSystemRecordId).append(CourseSectionCode, rhs.CourseSectionCode).append(CourseSectionTitle, rhs.CourseSectionTitle).append(CourseSectionDescription, rhs.CourseSectionDescription).append(CallNumber, rhs.CallNumber).append(SectionDetails, rhs.SectionDetails).append(TimeRequiredForCompletion, rhs.TimeRequiredForCompletion).append(RefTimeUnitsCode, rhs.RefTimeUnitsCode).append(RefInstructionLanguageCode, rhs.RefInstructionLanguageCode).append(VirtualIndicator, rhs.VirtualIndicator).append(OrganizationCalendarSessionId, rhs.OrganizationCalendarSessionId).append(OrganizationCalendarSessionDesignator, rhs.OrganizationCalendarSessionDesignator).append(CourseAccessStartDate, rhs.CourseAccessStartDate).append(CourseAccessEndDate, rhs.CourseAccessEndDate).append(CourseMeetingDaysOfWeekMTWTFSS, rhs.CourseMeetingDaysOfWeekMTWTFSS).append(OpenEnrollmentBeginDatetime, rhs.OpenEnrollmentBeginDatetime).append(OpenEnrollmentEndDatetime, rhs.OpenEnrollmentEndDatetime).append(CourseSectionMeetingSchedule, rhs.CourseSectionMeetingSchedule).append(TransformationHistory, rhs.TransformationHistory).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

    @Generated("org.jsonschema2pojo")
    public static enum CourseSectionSourceSystemCode {

        REGISTRAR("Registrar");
        private final String value;
        private static Map<String, CourseSectionSchema.CourseSectionSourceSystemCode> constants = new HashMap<String, CourseSectionSchema.CourseSectionSourceSystemCode>();

        static {
            for (CourseSectionSchema.CourseSectionSourceSystemCode c: values()) {
                constants.put(c.value, c);
            }
        }

        private CourseSectionSourceSystemCode(String value) {
            this.value = value;
        }

        @JsonValue
        @Override
        public String toString() {
            return this.value;
        }

        @JsonCreator
        public static CourseSectionSchema.CourseSectionSourceSystemCode fromValue(String value) {
            CourseSectionSchema.CourseSectionSourceSystemCode constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    @Generated("org.jsonschema2pojo")
    public static enum CourseSourceSystemCode {

        REGISTRAR("Registrar");
        private final String value;
        private static Map<String, CourseSectionSchema.CourseSourceSystemCode> constants = new HashMap<String, CourseSectionSchema.CourseSourceSystemCode>();

        static {
            for (CourseSectionSchema.CourseSourceSystemCode c: values()) {
                constants.put(c.value, c);
            }
        }

        private CourseSourceSystemCode(String value) {
            this.value = value;
        }

        @JsonValue
        @Override
        public String toString() {
            return this.value;
        }

        @JsonCreator
        public static CourseSectionSchema.CourseSourceSystemCode fromValue(String value) {
            CourseSectionSchema.CourseSourceSystemCode constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    @Generated("org.jsonschema2pojo")
    public static enum MessageVersion {

        _1_0("1.0"),
        _2_0("2.0");
        private final String value;
        private static Map<String, CourseSectionSchema.MessageVersion> constants = new HashMap<String, CourseSectionSchema.MessageVersion>();

        static {
            for (CourseSectionSchema.MessageVersion c: values()) {
                constants.put(c.value, c);
            }
        }

        private MessageVersion(String value) {
            this.value = value;
        }

        @JsonValue
        @Override
        public String toString() {
            return this.value;
        }

        @JsonCreator
        public static CourseSectionSchema.MessageVersion fromValue(String value) {
            CourseSectionSchema.MessageVersion constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    @Generated("org.jsonschema2pojo")
    public static enum OriginatingSystemCode {

        REGISTRAR("Registrar"),
        COLLECTIONS("Collections"),
        DAALT_DEMO("DAALTDemo"),
        DAALT_TEST("DAALTTest");
        private final String value;
        private static Map<String, CourseSectionSchema.OriginatingSystemCode> constants = new HashMap<String, CourseSectionSchema.OriginatingSystemCode>();

        static {
            for (CourseSectionSchema.OriginatingSystemCode c: values()) {
                constants.put(c.value, c);
            }
        }

        private OriginatingSystemCode(String value) {
            this.value = value;
        }

        @JsonValue
        @Override
        public String toString() {
            return this.value;
        }

        @JsonCreator
        public static CourseSectionSchema.OriginatingSystemCode fromValue(String value) {
            CourseSectionSchema.OriginatingSystemCode constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    @Generated("org.jsonschema2pojo")
    public static enum RefInstructionLanguageCode {

        EN_US("en-US"),
        EN_GB("en-GB");
        private final String value;
        private static Map<String, CourseSectionSchema.RefInstructionLanguageCode> constants = new HashMap<String, CourseSectionSchema.RefInstructionLanguageCode>();

        static {
            for (CourseSectionSchema.RefInstructionLanguageCode c: values()) {
                constants.put(c.value, c);
            }
        }

        private RefInstructionLanguageCode(String value) {
            this.value = value;
        }

        @JsonValue
        @Override
        public String toString() {
            return this.value;
        }

        @JsonCreator
        public static CourseSectionSchema.RefInstructionLanguageCode fromValue(String value) {
            CourseSectionSchema.RefInstructionLanguageCode constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    @Generated("org.jsonschema2pojo")
    public static enum RefTimeUnitsCode {

        WEEK("Week"),
        DAY("Day"),
        HOUR("Hour"),
        MINUTE("Minute"),
        SECOND("Second");
        private final String value;
        private static Map<String, CourseSectionSchema.RefTimeUnitsCode> constants = new HashMap<String, CourseSectionSchema.RefTimeUnitsCode>();

        static {
            for (CourseSectionSchema.RefTimeUnitsCode c: values()) {
                constants.put(c.value, c);
            }
        }

        private RefTimeUnitsCode(String value) {
            this.value = value;
        }

        @JsonValue
        @Override
        public String toString() {
            return this.value;
        }

        @JsonCreator
        public static CourseSectionSchema.RefTimeUnitsCode fromValue(String value) {
            CourseSectionSchema.RefTimeUnitsCode constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    @Generated("org.jsonschema2pojo")
    public static enum TransactionTypeCode {

        CREATE("Create"),
        UPDATE("Update"),
        DELETE("Delete");
        private final String value;
        private static Map<String, CourseSectionSchema.TransactionTypeCode> constants = new HashMap<String, CourseSectionSchema.TransactionTypeCode>();

        static {
            for (CourseSectionSchema.TransactionTypeCode c: values()) {
                constants.put(c.value, c);
            }
        }

        private TransactionTypeCode(String value) {
            this.value = value;
        }

        @JsonValue
        @Override
        public String toString() {
            return this.value;
        }

        @JsonCreator
        public static CourseSectionSchema.TransactionTypeCode fromValue(String value) {
            CourseSectionSchema.TransactionTypeCode constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
