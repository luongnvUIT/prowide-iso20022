
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
 * Class for sese.038.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesSttlmTxModReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.038.001.03")
public class MxSese03800103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesSttlmTxModReq", required = true)
    protected SecuritiesSettlementTransactionModificationRequestV03 sctiesSttlmTxModReq;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 38;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AffirmationStatus1Choice.class, AffirmationStatus1Code.class, AlternatePartyIdentification2 .class, AmountAndDirection37 .class, AmountAndDirection8 .class, AmountAndDirection9 .class, BeneficialOwnership1Choice.class, CashAccountIdentification5Choice.class, CashParties17 .class, CashSettlementSystem1Choice.class, CashSettlementSystem2Code.class, CentralCounterPartyEligibility1Choice.class, ClassificationType2Choice.class, Counterparty4Choice.class, CreditDebitCode.class, CurrencyToBuyOrSell1Choice.class, DateAndDateTimeChoice.class, DateType3Code.class, DeliveryReceiptType2Code.class, DeliveryReturn1Choice.class, DeliveryReturn1Code.class, DocumentNumber1Choice.class, Eligibility1Code.class, EventFrequency3Code.class, ExposureType10Choice.class, ExposureType4Code.class, FXStandingInstruction1Choice.class, FinancialInstrumentAttributes35 .class, FinancialInstrumentQuantity1Choice.class, ForeignExchangeTerms11 .class, FormOfSecurity1Code.class, FormOfSecurity2Choice.class, Frequency3Choice.class, GenericIdentification1 .class, GenericIdentification19 .class, GenericIdentification20 .class, GenericIdentification21 .class, GenericIdentification37 .class, IdentificationSource3Choice.class, IdentificationType4Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat1Choice.class, InvestorCapacity1Choice.class, LetterOfGuarantee1Choice.class, Linkages1 .class, Linkages21 .class, MarketClientSide1Choice.class, MarketClientSideCode.class, MarketIdentification1Choice.class, MarketIdentification3Choice.class, MarketIdentification78 .class, MarketType2Code.class, MarketType3Choice.class, MatchingStatus1Choice.class, MatchingStatus1Code.class, ModificationCancellationAllowed1Choice.class, MxSese03800103 .class, NameAndAddress5 .class, NettingEligibility1Choice.class, Number2Choice.class, OpeningClosing1Choice.class, OpeningClosing1Code.class, OptionStyle2Code.class, OptionStyle4Choice.class, OptionType1Code.class, OptionType2Choice.class, OriginalAndCurrentQuantities1 .class, OriginatorRole2Code.class, OtherAmounts14 .class, OtherIdentification1 .class, OtherParties19 .class, OwnershipLegalRestrictions1Code.class, PairedOrTurnedQuantity1Choice.class, PartyIdentification36Choice.class, PartyIdentification37Choice.class, PartyIdentification38Choice.class, PartyIdentification43Choice.class, PartyIdentification44Choice.class, PartyIdentification46 .class, PartyIdentification48 .class, PartyIdentificationAndAccount39 .class, PartyIdentificationAndAccount41 .class, PartyIdentificationAndAccount42 .class, PartyIdentificationAndAccount43 .class, PartyIdentificationAndAccount50 .class, PartyIdentificationAndAccount81 .class, PartyIdentificationAndAccount86 .class, PartyTextInformation1 .class, PartyTextInformation2 .class, PostalAddress1 .class, Price2 .class, PriceRateOrAmountChoice.class, PriceType1Choice.class, PriceValueType1Code.class, ProcessingPosition1Choice.class, ProcessingPosition3Code.class, Quantity6Choice.class, QuantityAndAccount29 .class, QuantityAndAccount30 .class, QuantityBreakdown13 .class, ReceiveDelivery1Code.class, References1Choice.class, Registration1Choice.class, Registration1Code.class, RegistrationParameters1 .class, Reporting2Choice.class, Reporting2Code.class, Restriction1Choice.class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat3Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText3 .class, SecuritiesAccount13 .class, SecuritiesCertificate1 .class, SecuritiesPaymentStatus1Code.class, SecuritiesPaymentStatus2Choice.class, SecuritiesSettlementTransactionDetails14 .class, SecuritiesSettlementTransactionDetails15 .class, SecuritiesSettlementTransactionDetails16 .class, SecuritiesSettlementTransactionModificationRequestV03 .class, SecuritiesTradeDetails32 .class, SecuritiesTradeDetails34 .class, SecuritiesTransactionType7Code.class, SecuritiesTransactionType9Choice.class, SecurityIdentification14 .class, SettlementDate1Choice.class, SettlementDate4Code.class, SettlementDateCode1Choice.class, SettlementDetails68 .class, SettlementParties11 .class, SettlementParties12 .class, SettlementParties26 .class, SettlementStandingInstructionDatabase1Choice.class, SettlementStandingInstructionDatabase1Code.class, SettlementTransactionCondition12Choice.class, SettlementTransactionCondition8Code.class, SettlementTypeAndAdditionalParameters5 .class, SettlementTypeAndAdditionalParameters6 .class, SettlementTypeAndIdentification3 .class, SettlingCapacity2Code.class, SettlingCapacity4Choice.class, StandingSettlementInstruction4 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxCapacityParty1Choice.class, TaxLiability1Code.class, Tracking1Choice.class, TradeDate1Choice.class, TradeDateCode1Choice.class, TradeOriginator1Choice.class, TradeTransactionCondition1Choice.class, TradeTransactionCondition4Code.class, TransactionDetails28 .class, TransactionDetails64 .class, TypeOfIdentification1Code.class, TypeOfPrice14Code.class, TypeOfPrice3Choice.class, UpdateType11Choice.class, YieldedOrValueType1Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.038.001.03";

    public MxSese03800103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese03800103(final String xml) {
        this();
        MxSese03800103 tmp = parse(xml);
        sctiesSttlmTxModReq = tmp.getSctiesSttlmTxModReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese03800103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesSttlmTxModReq property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlementTransactionModificationRequestV03 }
     *     
     */
    public SecuritiesSettlementTransactionModificationRequestV03 getSctiesSttlmTxModReq() {
        return sctiesSttlmTxModReq;
    }

    /**
     * Sets the value of the sctiesSttlmTxModReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlementTransactionModificationRequestV03 }
     *     
     */
    public MxSese03800103 setSctiesSttlmTxModReq(SecuritiesSettlementTransactionModificationRequestV03 value) {
        this.sctiesSttlmTxModReq = value;
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
    public static MxSese03800103 parse(String xml) {
        return ((MxSese03800103) MxReadImpl.parse(MxSese03800103 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese03800103 parse(String xml, MxRead parserImpl) {
        return ((MxSese03800103) parserImpl.read(MxSese03800103 .class, xml, _classes));
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
     * Creates an MxSese03800103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese03800103 message
     * @return
     *     a new instance of MxSese03800103
     */
    public final static MxSese03800103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese03800103 .class);
    }

}
