
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
 * Class for semt.016.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "intraPosMvmntPstngRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:semt.016.001.04")
public class MxSemt01600104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "IntraPosMvmntPstngRpt", required = true)
    protected IntraPositionMovementPostingReportV04 intraPosMvmntPstngRpt;
    public final static transient String BUSINESS_PROCESS = "semt";
    public final static transient int FUNCTIONALITY = 16;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AmountAndDirection9 .class, ClassificationType2Choice.class, CorporateActionEventType14Code.class, CorporateActionEventType16Choice.class, CreditDebitCode.class, DateAndDateTimeChoice.class, DateTimePeriodDetails.class, EventFrequency3Code.class, EventFrequency4Code.class, FinancialInstrumentAttributes36 .class, FinancialInstrumentDetails14 .class, FinancialInstrumentQuantity1Choice.class, ForeignExchangeTerms11 .class, FormOfSecurity1Code.class, FormOfSecurity2Choice.class, Frequency3Choice.class, Frequency4Choice.class, GenericIdentification1 .class, GenericIdentification19 .class, GenericIdentification20 .class, GenericIdentification21 .class, GenericIdentification37 .class, IdentificationSource3Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat1Choice.class, IntraPositionDetails28 .class, IntraPositionMovementDetails9 .class, IntraPositionMovementPostingReportV04 .class, MarketIdentification3Choice.class, MxSemt01600104 .class, Number2Choice.class, Number3Choice.class, OptionStyle2Code.class, OptionStyle4Choice.class, OptionType1Code.class, OptionType2Choice.class, OtherIdentification1 .class, Pagination.class, PartyIdentification36Choice.class, Period2 .class, Period2Choice.class, Price2 .class, PriceRateOrAmountChoice.class, PriceType1Choice.class, PriceValueType1Code.class, QuantityBreakdown15 .class, References27Choice.class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat3Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText3 .class, SecuritiesAccount13 .class, SecuritiesBalanceType11Code.class, SecuritiesBalanceType3Choice.class, SecuritiesPaymentStatus1Code.class, SecuritiesPaymentStatus2Choice.class, SecurityIdentification14 .class, Statement15 .class, StatementUpdateType1Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, UpdateType2Choice.class, YieldedOrValueType1Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:semt.016.001.04";

    public MxSemt01600104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt01600104(final String xml) {
        this();
        MxSemt01600104 tmp = parse(xml);
        intraPosMvmntPstngRpt = tmp.getIntraPosMvmntPstngRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt01600104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the intraPosMvmntPstngRpt property.
     * 
     * @return
     *     possible object is
     *     {@link IntraPositionMovementPostingReportV04 }
     *     
     */
    public IntraPositionMovementPostingReportV04 getIntraPosMvmntPstngRpt() {
        return intraPosMvmntPstngRpt;
    }

    /**
     * Sets the value of the intraPosMvmntPstngRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntraPositionMovementPostingReportV04 }
     *     
     */
    public MxSemt01600104 setIntraPosMvmntPstngRpt(IntraPositionMovementPostingReportV04 value) {
        this.intraPosMvmntPstngRpt = value;
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
    public static MxSemt01600104 parse(String xml) {
        return ((MxSemt01600104) MxReadImpl.parse(MxSemt01600104 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt01600104 parse(String xml, MxRead parserImpl) {
        return ((MxSemt01600104) parserImpl.read(MxSemt01600104 .class, xml, _classes));
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
     * Creates an MxSemt01600104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt01600104 message
     * @return
     *     a new instance of MxSemt01600104
     */
    public final static MxSemt01600104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSemt01600104 .class);
    }

}
