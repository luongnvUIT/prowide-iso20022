
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
 * Class for sese.034.002.07 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesFincgStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.034.002.07")
public class MxSese03400207
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesFincgStsAdvc", required = true)
    protected SecuritiesFinancingStatusAdvice002V07 sctiesFincgStsAdvc;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 34;
    public final static transient int VARIANT = 2;
    public final static transient int VERSION = 7;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcknowledgedAcceptedStatus25Choice.class, AcknowledgedAcceptedStatus27Choice.class, AcknowledgementReason13 .class, AcknowledgementReason15 .class, AcknowledgementReason16Choice.class, AcknowledgementReason18Choice.class, AcknowledgementReason5Code.class, AlternatePartyIdentification9 .class, AmountAndDirection59 .class, AmountAndDirection67 .class, BeneficialOwnership5Choice.class, BlockTrade1Code.class, BlockTrade5Choice.class, CancellationReason15 .class, CancellationReason25Choice.class, CancellationStatus18Choice.class, CancelledStatusReason9Code.class, CashSettlementSystem2Code.class, CashSettlementSystem5Choice.class, CentralCounterPartyEligibility5Choice.class, CreditDebitCode.class, DateAndDateTimeChoice.class, DateCode32Choice.class, DateType3Code.class, DateType4Code.class, DateType5Code.class, DeliveryReceiptType2Code.class, DeniedReason13 .class, DeniedReason18Choice.class, DeniedReason3Code.class, DeniedStatus18Choice.class, FailingReason10 .class, FailingReason11Choice.class, FailingReason2Code.class, FailingStatus12Choice.class, FinancialInstrumentQuantity15Choice.class, GenericIdentification47 .class, GenericIdentification84 .class, GenericIdentification85 .class, IdentificationSource4Choice.class, IdentificationType44Choice.class, MarketClientSide5Choice.class, MarketClientSideCode.class, MarketIdentification2Choice.class, MarketIdentification90 .class, MarketType16Choice.class, MarketType2Code.class, MatchingStatus29Choice.class, MxSese03400207 .class, NameAndAddress12 .class, NettingEligibility5Choice.class, NoReasonCode.class, OriginalAndCurrentQuantities4 .class, OtherIdentification2 .class, OwnershipLegalRestrictions1Code.class, PartyIdentification103 .class, PartyIdentification103Choice.class, PartyIdentification104Choice.class, PartyIdentification110 .class, PartyIdentification115Choice.class, PartyIdentification119 .class, PartyIdentification58Choice.class, PartyIdentificationAndAccount131 .class, PartyTextInformation3 .class, PendingProcessingReason11 .class, PendingProcessingReason13Choice.class, PendingProcessingReason1Code.class, PendingProcessingStatus14Choice.class, PendingReason1Code.class, PendingReason20 .class, PendingReason21 .class, PendingReason37Choice.class, PendingReason38Choice.class, PendingReason6Code.class, PendingStatus46Choice.class, PendingStatus47Choice.class, PlaceOfTradeIdentification2 .class, ProcessingStatus57Choice.class, ProprietaryReason5 .class, ProprietaryStatusAndReason7 .class, Quantity10Choice.class, Rate2 .class, RateName2 .class, RateOrName2Choice.class, RateType1Code.class, RateType67Choice.class, ReceiveDelivery1Code.class, RejectionReason28Choice.class, RejectionReason34 .class, RejectionReason38Code.class, RejectionStatus22Choice.class, RepairReason11 .class, RepairReason13Choice.class, RepairReason5Code.class, RepairStatus15Choice.class, RepoCallAcknowledgementReason2Code.class, RepoCallRequestStatus9Choice.class, RestrictedFINActiveCurrencyAndAmount.class, RestrictedFINActiveOrHistoricCurrencyAndAmount.class, Restriction6Choice.class, SafeKeepingPlace2 .class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat17Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText15 .class, SecuritiesAccount27 .class, SecuritiesAccount30 .class, SecuritiesFinancingStatusAdvice002V07 .class, SecuritiesFinancingTransactionDetails36 .class, SecuritiesFinancingTransactionType2Code.class, SecuritiesRTGS5Choice.class, SecurityIdentification20 .class, SettlementDate15Choice.class, SettlementDateCode11Choice.class, SettlementDetails107 .class, SettlementParties44 .class, SettlementStatus21Choice.class, SettlementSystemMethod1Code.class, SettlementSystemMethod5Choice.class, SettlementTransactionCondition22Choice.class, SettlementTransactionCondition5Code.class, SettlementTransactionCondition6Code.class, SettlingCapacity2Code.class, SettlingCapacity8Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxCapacityParty5Choice.class, TaxLiability1Code.class, TerminationDate5Choice.class, TradeDate6Choice.class, TradeDateCode4Choice.class, TransactionIdentifications35 .class, TypeOfIdentification1Code.class, UnmatchedReason13Code.class, UnmatchedReason18 .class, UnmatchedReason25Choice.class, UnmatchedStatus19Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.034.002.07";

    public MxSese03400207() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese03400207(final String xml) {
        this();
        MxSese03400207 tmp = parse(xml);
        sctiesFincgStsAdvc = tmp.getSctiesFincgStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese03400207(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesFincgStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesFinancingStatusAdvice002V07 }
     *     
     */
    public SecuritiesFinancingStatusAdvice002V07 getSctiesFincgStsAdvc() {
        return sctiesFincgStsAdvc;
    }

    /**
     * Sets the value of the sctiesFincgStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesFinancingStatusAdvice002V07 }
     *     
     */
    public MxSese03400207 setSctiesFincgStsAdvc(SecuritiesFinancingStatusAdvice002V07 value) {
        this.sctiesFincgStsAdvc = value;
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
    public static MxSese03400207 parse(String xml) {
        return ((MxSese03400207) MxReadImpl.parse(MxSese03400207 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese03400207 parse(String xml, MxRead parserImpl) {
        return ((MxSese03400207) parserImpl.read(MxSese03400207 .class, xml, _classes));
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
     * Creates an MxSese03400207 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese03400207 message
     * @return
     *     a new instance of MxSese03400207
     */
    public final static MxSese03400207 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese03400207 .class);
    }

}
