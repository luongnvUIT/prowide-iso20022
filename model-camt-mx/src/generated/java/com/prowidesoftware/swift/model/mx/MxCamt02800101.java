
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
 * Class for camt.028.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "camt02800101"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.028.001.01")
public class MxCamt02800101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "camt.028.001.01", required = true)
    protected Camt02800101 camt02800101;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 28;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Account1 .class, AccountIdentification1 .class, AccountIdentification1Choice.class, AddressType2Code.class, AmountType1Choice.class, BranchAndFinancialInstitutionIdentification.class, BranchData.class, Camt02800101 .class, Case.class, CaseAssignment.class, CashAccount3 .class, CashAccountType3Code.class, ClearingSystemMemberIdentificationChoice.class, CurrencyAndAmount.class, DocumentType1Code.class, EquivalentAmount.class, FinancialInstitutionIdentification1 .class, GenericIdentification1 .class, GenericIdentification3 .class, GenericIdentification4 .class, Intermediary1 .class, LongPostalAddress1Choice.class, MxCamt02800101 .class, NameAndAddress2 .class, NonFinancialInstitutionIdentification1 .class, Party1Choice.class, PartyIdentification1 .class, PartyIdentification1Choice.class, PaymentComplementaryInformation.class, PaymentInstructionExtract.class, PersonIdentification2 .class, PostalAddress1 .class, ReferredDocumentAmount1Choice.class, RemittanceInformation3Choice.class, SimpleIdentificationInformation.class, StructuredLongPostalAddress1 .class, StructuredRemittanceInformation2 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:camt.028.001.01";

    public MxCamt02800101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt02800101(final String xml) {
        this();
        MxCamt02800101 tmp = parse(xml);
        camt02800101 = tmp.getCamt02800101();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt02800101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the camt02800101 property.
     * 
     * @return
     *     possible object is
     *     {@link Camt02800101 }
     *     
     */
    public Camt02800101 getCamt02800101() {
        return camt02800101;
    }

    /**
     * Sets the value of the camt02800101 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Camt02800101 }
     *     
     */
    public MxCamt02800101 setCamt02800101(Camt02800101 value) {
        this.camt02800101 = value;
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
    public static MxCamt02800101 parse(String xml) {
        return ((MxCamt02800101) MxReadImpl.parse(MxCamt02800101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt02800101 parse(String xml, MxRead parserImpl) {
        return ((MxCamt02800101) parserImpl.read(MxCamt02800101 .class, xml, _classes));
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
     * Creates an MxCamt02800101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt02800101 message
     * @return
     *     a new instance of MxCamt02800101
     */
    public final static MxCamt02800101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt02800101 .class);
    }

}
