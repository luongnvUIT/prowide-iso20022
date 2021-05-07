
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for semt.021.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesStmtQry"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:semt.021.001.04")
public class MxSemt02100104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesStmtQry", required = true)
    protected SecuritiesStatementQueryV04 sctiesStmtQry;
    public final static transient String BUSINESS_PROCESS = "semt";
    public final static transient int FUNCTIONALITY = 21;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcknowledgementReason2Choice.class, AcknowledgementReason3Choice.class, AcknowledgementReason5Code.class, AdditionalQueryParameters7 .class, AffirmationStatus1Choice.class, AffirmationStatus1Code.class, AllocationSatus1Choice.class, AllocationStatus1Code.class, CancellationProcessingStatus1Choice.class, CancellationProcessingStatus1Code.class, CancellationReason9Choice.class, CancelledStatusReason12Code.class, CorporateActionEventProcessingStatus1Choice.class, CorporateActionEventProcessingStatus1Code.class, CorporateActionEventStage1Choice.class, CorporateActionEventStage2Code.class, DateAndDateTimeChoice.class, DateAndPeriod1Choice.class, DateTimePeriodDetails.class, DeniedReason1Choice.class, DeniedReason5Code.class, DocumentNumber1 .class, DocumentNumber1Choice.class, EventFrequency4Code.class, FailingReason1Choice.class, FailingReason1Code.class, Frequency4Choice.class, GeneratedReason3Code.class, GeneratedReasons3Choice.class, GenericIdentification19 .class, GenericIdentification20 .class, IdentificationSource3Choice.class, InstructionProcessingStatus1Code.class, InstructionProcessingStatus2Choice.class, MatchingStatus1Choice.class, MatchingStatus1Code.class, MxSemt02100104 .class, OtherIdentification1 .class, PartyIdentification36Choice.class, PendingCancellationReasons2Choice.class, PendingProcessingReason1Choice.class, PendingProcessingReason1Code.class, PendingReason11Choice.class, PendingReason2Choice.class, PendingReason6Code.class, PendingReason7Code.class, PendingReason8Code.class, Period2 .class, Period2Choice.class, Reason12Choice.class, RegistrationProcessingStatus1Choice.class, RegistrationProcessingStatus1Code.class, RejectionReason16Choice.class, RejectionReason39Code.class, RepairReason6Code.class, RepairReason7Choice.class, ReplacementProcessingStatus1Choice.class, ReplacementProcessingStatus1Code.class, RepoCallAcknowledgementReason2Code.class, RepoCallRequestStatus1Choice.class, RepoCallRequestStatus1Code.class, ResponseStatus1Choice.class, ResponseStatus1Code.class, SecuritiesAccount13 .class, SecuritiesSettlementStatus2Code.class, SecuritiesStatementQueryV04 .class, SecuritiesStatementType1Code.class, SecurityIdentification14 .class, SettlementConditionModificationStatus1Choice.class, SettlementConditionModificationStatus1Code.class, SettlementStatus5Choice.class, Statement16 .class, StatementBasis1Code.class, StatementBasis3Choice.class, StatementType2Choice.class, StatementUpdateType1Code.class, Status8Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, UnmatchedReason16Choice.class, UnmatchedReason9Code.class, UpdateType2Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:semt.021.001.04";

    public MxSemt02100104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt02100104(final String xml) {
        this();
        MxSemt02100104 tmp = parse(xml);
        sctiesStmtQry = tmp.getSctiesStmtQry();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt02100104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesStmtQry property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesStatementQueryV04 }
     *     
     */
    public SecuritiesStatementQueryV04 getSctiesStmtQry() {
        return sctiesStmtQry;
    }

    /**
     * Sets the value of the sctiesStmtQry property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesStatementQueryV04 }
     *     
     */
    public MxSemt02100104 setSctiesStmtQry(SecuritiesStatementQueryV04 value) {
        this.sctiesStmtQry = value;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public String getBusinessProcess() {
        return BUSINESS_PROCESS;
    }

    @Override
    public int getFunctionality() {
        return FUNCTIONALITY;
    }

    @Override
    public int getVariant() {
        return VARIANT;
    }

    @Override
    public int getVersion() {
        return VERSION;
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML
     * 
     */
    public static MxSemt02100104 parse(String xml) {
        return ((MxSemt02100104) MxReadImpl.parse(MxSemt02100104 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt02100104 parse(String xml, MxRead parserImpl) {
        return ((MxSemt02100104) parserImpl.read(MxSemt02100104 .class, xml, _classes));
    }

    @Override
    public String getNamespace() {
        return NAMESPACE;
    }

    @Override
    @SuppressWarnings("rawtypes")
    public Class[] getClasses() {
        return _classes;
    }

    /**
     * Creates an MxSemt02100104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt02100104 message
     * @return
     *     a new instance of MxSemt02100104
     */
    public final static MxSemt02100104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSemt02100104 .class);
    }

}
