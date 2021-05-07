
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
 * Class for auth.077.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "finBchmkRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.077.001.01")
public class MxAuth07700101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "FinBchmkRpt", required = true)
    protected FinancialBenchmarkReportV01 finBchmkRpt;
    public final static transient String BUSINESS_PROCESS = "auth";
    public final static transient int FUNCTIONALITY = 77;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AddressType2Code.class, BenchmarkCancellation1 .class, BenchmarkCreate1 .class, BenchmarkCurveName2Code.class, BenchmarkDetail1 .class, BenchmarkReport1Choice.class, BenchmarkUpdate1 .class, FinancialBenchmarkReportV01 .class, GenericIdentification36 .class, IdentificationSource3Choice.class, MxAuth07700101 .class, NameAndAddress5 .class, OtherIdentification1 .class, PartyIdentification120Choice.class, PartyIdentification136 .class, Period2 .class, Period4Choice.class, PostalAddress1 .class, SecurityIdentification19 .class, StatusDetail1 .class, SupervisingAuthorityIdentification1 .class, SupervisingAuthorityIdentification1Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.077.001.01";

    public MxAuth07700101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth07700101(final String xml) {
        this();
        MxAuth07700101 tmp = parse(xml);
        finBchmkRpt = tmp.getFinBchmkRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth07700101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the finBchmkRpt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialBenchmarkReportV01 }
     *     
     */
    public FinancialBenchmarkReportV01 getFinBchmkRpt() {
        return finBchmkRpt;
    }

    /**
     * Sets the value of the finBchmkRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialBenchmarkReportV01 }
     *     
     */
    public MxAuth07700101 setFinBchmkRpt(FinancialBenchmarkReportV01 value) {
        this.finBchmkRpt = value;
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
    public static MxAuth07700101 parse(String xml) {
        return ((MxAuth07700101) MxReadImpl.parse(MxAuth07700101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth07700101 parse(String xml, MxRead parserImpl) {
        return ((MxAuth07700101) parserImpl.read(MxAuth07700101 .class, xml, _classes));
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
     * Creates an MxAuth07700101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth07700101 message
     * @return
     *     a new instance of MxAuth07700101
     */
    public final static MxAuth07700101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAuth07700101 .class);
    }

}
