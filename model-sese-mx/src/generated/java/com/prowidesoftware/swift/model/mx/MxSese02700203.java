
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
 * Class for sese.027.002.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesTxCxlReqStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:sese.027.002.03")
public class MxSese02700203
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesTxCxlReqStsAdvc", required = true)
    protected SecuritiesTransactionCancellationRequestStatusAdvice002V03 sctiesTxCxlReqStsAdvc;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 27;
    public final static transient int VARIANT = 2;
    public final static transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcknowledgedAcceptedStatus18Choice.class, AcknowledgementReason3Code.class, AcknowledgementReason4 .class, AcknowledgementReason6Choice.class, AmountAndDirection12 .class, CancellationReason3 .class, CancellationReason7Choice.class, CancellationStatus13Choice.class, CancelledStatusReason5Code.class, CreditDebitCode.class, DateAndDateTimeChoice.class, DateType3Code.class, DateType4Code.class, DeliveryReceiptType2Code.class, DeniedReason4 .class, DeniedReason4Code.class, DeniedReason6Choice.class, DeniedStatus9Choice.class, DocumentNumber2Choice.class, FinancialInstrumentQuantity15Choice.class, GenericDocumentIdentification2 .class, GenericIdentification23 .class, GenericIdentification24 .class, GenericIdentification25 .class, Identification4 .class, IdentificationSource4Choice.class, MxSese02700203 .class, NameAndAddress12 .class, NoReasonCode.class, OriginalAndCurrentQuantities4 .class, OtherIdentification2 .class, PartyIdentification51Choice.class, PartyIdentification53 .class, PartyIdentification58Choice.class, PartyIdentification60Choice.class, PartyIdentification65Choice.class, PartyIdentificationAndAccount75 .class, PendingReason12 .class, PendingReason20Choice.class, PendingReason9Code.class, PendingStatus22Choice.class, ProcessingStatus26Choice.class, ProprietaryReason2 .class, ProprietaryStatusAndReason2 .class, Quantity10Choice.class, ReceiveDelivery1Code.class, References30Choice.class, RejectionAndRepairReason16Choice.class, RejectionAndRepairReason19Choice.class, RejectionOrRepairReason16 .class, RejectionOrRepairReason19 .class, RejectionOrRepairStatus20Choice.class, RejectionOrRepairStatus24Choice.class, RejectionReason27Code.class, RejectionReason32Code.class, RestrictedFINActiveCurrencyAndAmount.class, RestrictedFINActiveOrHistoricCurrencyAndAmount.class, SecuritiesAccount17 .class, SecuritiesTransactionCancellationRequestStatusAdvice002V03 .class, SecurityIdentification15 .class, SettlementDate6Choice.class, SettlementDateCode4Choice.class, SettlementParties21 .class, SettlementTypeAndIdentification7 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradeDate2Choice.class, TradeDateCode2Choice.class, TransactionDetails35 .class, TransactionIdentifications23 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:sese.027.002.03";

    public MxSese02700203() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese02700203(final String xml) {
        this();
        MxSese02700203 tmp = parse(xml);
        sctiesTxCxlReqStsAdvc = tmp.getSctiesTxCxlReqStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese02700203(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesTxCxlReqStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionCancellationRequestStatusAdvice002V03 }
     *     
     */
    public SecuritiesTransactionCancellationRequestStatusAdvice002V03 getSctiesTxCxlReqStsAdvc() {
        return sctiesTxCxlReqStsAdvc;
    }

    /**
     * Sets the value of the sctiesTxCxlReqStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionCancellationRequestStatusAdvice002V03 }
     *     
     */
    public MxSese02700203 setSctiesTxCxlReqStsAdvc(SecuritiesTransactionCancellationRequestStatusAdvice002V03 value) {
        this.sctiesTxCxlReqStsAdvc = value;
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
    public static MxSese02700203 parse(String xml) {
        return ((MxSese02700203) MxReadImpl.parse(MxSese02700203 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese02700203 parse(String xml, MxRead parserImpl) {
        return ((MxSese02700203) parserImpl.read(MxSese02700203 .class, xml, _classes));
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
     * Creates an MxSese02700203 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese02700203 message
     * @return
     *     a new instance of MxSese02700203
     */
    public final static MxSese02700203 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese02700203 .class);
    }

}
