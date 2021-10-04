
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
 * Class for camt.080.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "intraBalMvmntModQry"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.080.001.01")
public class MxCamt08000101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "IntraBalMvmntModQry", required = true)
    protected IntraBalanceMovementModificationQueryV01 intraBalMvmntModQry;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 80;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountIdentificationSearchCriteria2Choice.class, AccountSchemeName1Choice.class, AddressType2Code.class, AddressType3Choice.class, BranchAndFinancialInstitutionIdentification6 .class, BranchData3 .class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, CopyDuplicate1Code.class, DateAndDateTime2Choice.class, DateAndDateTimeSearch5Choice.class, DatePeriod2 .class, DatePeriodSearch1Choice.class, DateTimePeriod1 .class, DateTimeSearch2Choice.class, DocumentIdentification51 .class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification18 .class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification30 .class, GenericIdentification36 .class, IntraBalanceMovementModificationQueryV01 .class, IntraBalanceQueryCriteria8 .class, IntraBalanceQueryDefinition8 .class, ModificationProcessingStatus1Code.class, ModificationProcessingStatus9Choice.class, MovementResponseType1Code.class, MxCamt08000101 .class, NameAndAddress5 .class, PartyIdentification120Choice.class, PartyIdentification136 .class, PostalAddress1 .class, PostalAddress24 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SystemPartyIdentification8 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:camt.080.001.01";

    public MxCamt08000101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt08000101(final String xml) {
        this();
        MxCamt08000101 tmp = parse(xml);
        intraBalMvmntModQry = tmp.getIntraBalMvmntModQry();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt08000101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the intraBalMvmntModQry property.
     * 
     * @return
     *     possible object is
     *     {@link IntraBalanceMovementModificationQueryV01 }
     *     
     */
    public IntraBalanceMovementModificationQueryV01 getIntraBalMvmntModQry() {
        return intraBalMvmntModQry;
    }

    /**
     * Sets the value of the intraBalMvmntModQry property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntraBalanceMovementModificationQueryV01 }
     *     
     */
    public MxCamt08000101 setIntraBalMvmntModQry(IntraBalanceMovementModificationQueryV01 value) {
        this.intraBalMvmntModQry = value;
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
    public static MxCamt08000101 parse(String xml) {
        return ((MxCamt08000101) MxReadImpl.parse(MxCamt08000101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt08000101 parse(String xml, MxRead parserImpl) {
        return ((MxCamt08000101) parserImpl.read(MxCamt08000101 .class, xml, _classes));
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
     * Creates an MxCamt08000101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt08000101 message
     * @return
     *     a new instance of MxCamt08000101
     */
    public final static MxCamt08000101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt08000101 .class);
    }

}