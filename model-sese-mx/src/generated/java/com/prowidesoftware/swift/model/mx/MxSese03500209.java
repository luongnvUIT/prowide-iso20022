
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
 * Class for sese.035.002.09 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesFincgConf"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.035.002.09")
public class MxSese03500209
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesFincgConf", required = true)
    protected SecuritiesFinancingConfirmation002V09 sctiesFincgConf;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 35;
    public final static transient int VARIANT = 2;
    public final static transient int VERSION = 9;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AdditionalParameters26 .class, AlternatePartyIdentification9 .class, AmountAndDirection19 .class, AmountAndDirection44 .class, AmountAndDirection58 .class, AmountAndDirection59 .class, AmountAndDirection96 .class, AutoBorrowing1Code.class, AutomaticBorrowing8Choice.class, BeneficialOwnership5Choice.class, BlockTrade1Code.class, BlockTrade5Choice.class, CashAccountIdentification6Choice.class, CashParties38 .class, CashSettlementSystem2Code.class, CashSettlementSystem5Choice.class, CentralCounterPartyEligibility5Choice.class, ClassificationType33Choice.class, Counterparty14Choice.class, CreditDebitCode.class, DateAndDateTime2Choice.class, DateCode32Choice.class, DateType3Code.class, DateType5Code.class, DeliveryReceiptType2Code.class, Eligibility1Code.class, EventFrequency3Code.class, FinancialInstrumentAttributes97 .class, FinancialInstrumentQuantity15Choice.class, ForeignExchangeTerms23 .class, ForeignExchangeTerms27 .class, FormOfSecurity1Code.class, FormOfSecurity7Choice.class, Frequency27Choice.class, GenericIdentification18 .class, GenericIdentification39 .class, GenericIdentification47 .class, GenericIdentification84 .class, GenericIdentification85 .class, GenericIdentification86 .class, IdentificationSource4Choice.class, IdentificationType44Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat5Choice.class, InvestorCapacity5Choice.class, LegalFramework1Code.class, LegalFramework4Choice.class, MarketClientSide1Code.class, MarketClientSide7Choice.class, MarketIdentification2Choice.class, MarketIdentification4Choice.class, MarketIdentification90 .class, MarketType16Choice.class, MarketType2Code.class, MxSese03500209 .class, NameAndAddress12 .class, NettingEligibility5Choice.class, Number23Choice.class, OptionStyle2Code.class, OptionStyle9Choice.class, OptionType1Code.class, OptionType7Choice.class, OriginalAndCurrentQuantities4 .class, OriginatorRole2Code.class, OtherAmounts42 .class, OtherIdentification2 .class, OtherParties35 .class, OwnershipLegalRestrictions1Code.class, PartialSettlement2Code.class, PartyIdentification136Choice.class, PartyIdentification137Choice.class, PartyIdentification145Choice.class, PartyIdentification147Choice.class, PartyIdentification156 .class, PartyIdentification157 .class, PartyIdentification162 .class, PartyIdentificationAndAccount176 .class, PartyIdentificationAndAccount177 .class, PartyIdentificationAndAccount178 .class, PartyIdentificationAndAccount179 .class, PartyIdentificationAndAccount180 .class, PartyIdentificationAndAccount181 .class, PartyTextInformation3 .class, PartyTextInformation4 .class, PlaceOfClearingIdentification2 .class, PlaceOfTradeIdentification2 .class, PreConfirmation1Code.class, Price3 .class, PriceRateOrAmount1Choice.class, PriceType5Choice.class, PriceValueType1Code.class, PriorityNumeric5Choice.class, Quantity10Choice.class, QuantityAndAccount85 .class, Rate2 .class, RateName2 .class, RateOrName2Choice.class, RateType1Code.class, RateType67Choice.class, ReceiveDelivery1Code.class, Reporting11Choice.class, Reporting3Code.class, RestrictedFINActiveCurrencyAndAmount.class, RestrictedFINActiveOrHistoricCurrencyAnd13DecimalAmount.class, RestrictedFINActiveOrHistoricCurrencyAndAmount.class, Restriction6Choice.class, RevaluationIndicator4Choice.class, SafeKeepingPlace4 .class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat39Choice.class, SafekeepingPlaceTypeAndIdentification1 .class, SafekeepingPlaceTypeAndText15 .class, SecuritiesAccount30 .class, SecuritiesFinancingConfirmation002V09 .class, SecuritiesFinancingTransactionDetails46 .class, SecuritiesFinancingTransactionType2Code.class, SecuritiesPaymentStatus1Code.class, SecuritiesPaymentStatus6Choice.class, SecuritiesRTGS5Choice.class, SecuritiesTradeDetails101 .class, SecurityIdentification20 .class, SettlementDate20Choice.class, SettlementDate22Choice.class, SettlementDate4Code.class, SettlementDateCode9Choice.class, SettlementDetails151 .class, SettlementParties81 .class, SettlementStandingInstructionDatabase1Code.class, SettlementStandingInstructionDatabase5Choice.class, SettlementSystemMethod1Code.class, SettlementSystemMethod5Choice.class, SettlementTransactionCondition22Choice.class, SettlementTransactionCondition5Code.class, SettlementTransactionCondition6Code.class, SettlingCapacity2Code.class, SettlingCapacity8Choice.class, StandingSettlementInstruction17 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxCapacityParty5Choice.class, TaxLiability1Code.class, TerminationDate7Choice.class, TradeDate9Choice.class, TradeDateCode4Choice.class, TradeOriginator4Choice.class, TradeTransactionCondition4Code.class, TradeTransactionCondition6Choice.class, TransactionTypeAndAdditionalParameters19 .class, TypeOfIdentification1Code.class, YieldedOrValueType1Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.035.002.09";

    public MxSese03500209() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese03500209(final String xml) {
        this();
        MxSese03500209 tmp = parse(xml);
        sctiesFincgConf = tmp.getSctiesFincgConf();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese03500209(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesFincgConf property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesFinancingConfirmation002V09 }
     *     
     */
    public SecuritiesFinancingConfirmation002V09 getSctiesFincgConf() {
        return sctiesFincgConf;
    }

    /**
     * Sets the value of the sctiesFincgConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesFinancingConfirmation002V09 }
     *     
     */
    public MxSese03500209 setSctiesFincgConf(SecuritiesFinancingConfirmation002V09 value) {
        this.sctiesFincgConf = value;
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
    public static MxSese03500209 parse(String xml) {
        return ((MxSese03500209) MxReadImpl.parse(MxSese03500209 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese03500209 parse(String xml, MxRead parserImpl) {
        return ((MxSese03500209) parserImpl.read(MxSese03500209 .class, xml, _classes));
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
     * Creates an MxSese03500209 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese03500209 message
     * @return
     *     a new instance of MxSese03500209
     */
    public final static MxSese03500209 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese03500209 .class);
    }

}
