
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
 * Class for semt.005.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "acctgStmtOfHldgsCxlV02"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:semt.005.001.02")
public class MxSemt00500102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AcctgStmtOfHldgsCxlV02", required = true)
    protected AccountingStatementOfHoldingsCancellationV02 acctgStmtOfHldgsCxlV02;
    public final static transient String BUSINESS_PROCESS = "semt";
    public final static transient int FUNCTIONALITY = 5;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Account7 .class, AccountIdentification1 .class, AccountIdentification3 .class, AccountIdentificationAndPurpose.class, AccountIdentificationFormatChoice.class, AccountingStatementOfHoldings2 .class, AccountingStatementOfHoldingsCancellationV02 .class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AdditionalBalanceInformation2 .class, AdditionalReference2 .class, AddressType2Code.class, AggregateBalanceInformation3 .class, AggregateBalancePerSafekeepingPlace4 .class, AlternateSecurityIdentification1 .class, BalanceQuantity1Choice.class, DateAndDateTimeChoice.class, DistributionPolicy1Code.class, EventFrequency1Code.class, Extension1 .class, FinancialInstrument13 .class, FinancialInstrumentQuantityChoice.class, ForeignExchangeTerms6 .class, FormOfSecurity1Code.class, FrequencyCodeAndDSSCode1Choice.class, GenericIdentification1 .class, GenericIdentification5 .class, GenericIdentification6 .class, GenericIdentification7 .class, Intermediary11 .class, InvestmentFundRole2Code.class, LongPostalAddress1Choice.class, MessageIdentification1 .class, MxSemt00500102 .class, NameAndAddress2 .class, NameAndAddress5 .class, Pagination.class, PartyIdentification1Choice.class, PartyIdentification2Choice.class, PartyIdentification3 .class, PostalAddress1 .class, PriceInformation2 .class, PriceRateOrAmountOrUnknownChoice.class, PriceSource.class, PriceSource1Code.class, PriceSourceFormatChoice.class, PriceValueType2Code.class, QuantityAndAvailability.class, SafekeepingAccount2 .class, SafekeepingPlace1Code.class, SafekeepingPlaceAsCodeAndPartyIdentification.class, SafekeepingPlaceFormatChoice.class, SecuritiesAccountPurposeType1Code.class, SecuritiesBalanceType1Code.class, SecuritiesBalanceType2Code.class, SecurityIdentification3Choice.class, SimpleIdentificationInformation.class, Statement6 .class, StatementBasis1Code.class, StatementBasisCodeAndDSSCodeChoice.class, StatementUpdateTypeCode.class, StatementUpdateTypeCodeAndDSSCodeChoice.class, StructuredLongPostalAddress1 .class, SubAccountIdentification3 .class, SubBalanceInformation2 .class, SubBalanceQuantity1Choice.class, TotalValueInPageAndStatement.class, TypeOfPrice11Code.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:semt.005.001.02";

    public MxSemt00500102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt00500102(final String xml) {
        this();
        MxSemt00500102 tmp = parse(xml);
        acctgStmtOfHldgsCxlV02 = tmp.getAcctgStmtOfHldgsCxlV02();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt00500102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the acctgStmtOfHldgsCxlV02 property.
     * 
     * @return
     *     possible object is
     *     {@link AccountingStatementOfHoldingsCancellationV02 }
     *     
     */
    public AccountingStatementOfHoldingsCancellationV02 getAcctgStmtOfHldgsCxlV02() {
        return acctgStmtOfHldgsCxlV02;
    }

    /**
     * Sets the value of the acctgStmtOfHldgsCxlV02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingStatementOfHoldingsCancellationV02 }
     *     
     */
    public MxSemt00500102 setAcctgStmtOfHldgsCxlV02(AccountingStatementOfHoldingsCancellationV02 value) {
        this.acctgStmtOfHldgsCxlV02 = value;
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
    public static MxSemt00500102 parse(String xml) {
        return ((MxSemt00500102) MxReadImpl.parse(MxSemt00500102 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt00500102 parse(String xml, MxRead parserImpl) {
        return ((MxSemt00500102) parserImpl.read(MxSemt00500102 .class, xml, _classes));
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
     * Creates an MxSemt00500102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt00500102 message
     * @return
     *     a new instance of MxSemt00500102
     */
    public final static MxSemt00500102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSemt00500102 .class);
    }

}
