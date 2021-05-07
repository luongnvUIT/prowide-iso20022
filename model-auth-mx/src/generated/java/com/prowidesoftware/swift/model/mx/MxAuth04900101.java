
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
 * Class for auth.049.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "finInstrmRptgMktIdCdRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.049.001.01")
public class MxAuth04900101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "FinInstrmRptgMktIdCdRpt", required = true)
    protected FinancialInstrumentReportingMarketIdentificationCodeReportV01 finInstrmRptgMktIdCdRpt;
    public final static transient String BUSINESS_PROCESS = "auth";
    public final static transient int FUNCTIONALITY = 49;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {CountryCodeAndName3 .class, FinancialInstrumentReportingMarketIdentificationCodeReportV01 .class, MarketIdentification1Code.class, MarketIdentification92 .class, Modification1Code.class, MxAuth04900101 .class, Period2 .class, Period4Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradingVenue1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.049.001.01";

    public MxAuth04900101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth04900101(final String xml) {
        this();
        MxAuth04900101 tmp = parse(xml);
        finInstrmRptgMktIdCdRpt = tmp.getFinInstrmRptgMktIdCdRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth04900101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the finInstrmRptgMktIdCdRpt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentReportingMarketIdentificationCodeReportV01 }
     *     
     */
    public FinancialInstrumentReportingMarketIdentificationCodeReportV01 getFinInstrmRptgMktIdCdRpt() {
        return finInstrmRptgMktIdCdRpt;
    }

    /**
     * Sets the value of the finInstrmRptgMktIdCdRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentReportingMarketIdentificationCodeReportV01 }
     *     
     */
    public MxAuth04900101 setFinInstrmRptgMktIdCdRpt(FinancialInstrumentReportingMarketIdentificationCodeReportV01 value) {
        this.finInstrmRptgMktIdCdRpt = value;
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
    public static MxAuth04900101 parse(String xml) {
        return ((MxAuth04900101) MxReadImpl.parse(MxAuth04900101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth04900101 parse(String xml, MxRead parserImpl) {
        return ((MxAuth04900101) parserImpl.read(MxAuth04900101 .class, xml, _classes));
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
     * Creates an MxAuth04900101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth04900101 message
     * @return
     *     a new instance of MxAuth04900101
     */
    public final static MxAuth04900101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAuth04900101 .class);
    }

}
