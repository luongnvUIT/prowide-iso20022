
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides the details of the update(s) for the settlement transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesSettlementTransactionDetails47", propOrder = {
    "sttlmTpAndAddtlParams",
    "lnkgs",
    "tradDtls",
    "finInstrmAttrbts",
    "qtyAndAcctDtls",
    "sttlmParams",
    "stgSttlmInstrDtls",
    "dlvrgSttlmPties",
    "rcvgSttlmPties",
    "cshPties",
    "sttlmAmt",
    "othrAmts",
    "othrBizPties",
    "addtlPhysOrRegnDtls",
    "splmtryData"
})
public class SecuritiesSettlementTransactionDetails47 {

    @XmlElement(name = "SttlmTpAndAddtlParams")
    protected SettlementTypeAndAdditionalParameters17 sttlmTpAndAddtlParams;
    @XmlElement(name = "Lnkgs")
    protected List<Linkages48> lnkgs;
    @XmlElement(name = "TradDtls")
    protected SecuritiesTradeDetails132 tradDtls;
    @XmlElement(name = "FinInstrmAttrbts")
    protected FinancialInstrumentAttributes97 finInstrmAttrbts;
    @XmlElement(name = "QtyAndAcctDtls")
    protected QuantityAndAccount93 qtyAndAcctDtls;
    @XmlElement(name = "SttlmParams")
    protected SettlementDetails195 sttlmParams;
    @XmlElement(name = "StgSttlmInstrDtls")
    protected StandingSettlementInstruction17 stgSttlmInstrDtls;
    @XmlElement(name = "DlvrgSttlmPties")
    protected SettlementParties92 dlvrgSttlmPties;
    @XmlElement(name = "RcvgSttlmPties")
    protected SettlementParties92 rcvgSttlmPties;
    @XmlElement(name = "CshPties")
    protected CashParties38 cshPties;
    @XmlElement(name = "SttlmAmt")
    protected AmountAndDirection101 sttlmAmt;
    @XmlElement(name = "OthrAmts")
    protected OtherAmounts43 othrAmts;
    @XmlElement(name = "OthrBizPties")
    protected OtherParties35 othrBizPties;
    @XmlElement(name = "AddtlPhysOrRegnDtls")
    protected RegistrationParameters7 addtlPhysOrRegnDtls;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the sttlmTpAndAddtlParams property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTypeAndAdditionalParameters17 }
     *     
     */
    public SettlementTypeAndAdditionalParameters17 getSttlmTpAndAddtlParams() {
        return sttlmTpAndAddtlParams;
    }

    /**
     * Sets the value of the sttlmTpAndAddtlParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTypeAndAdditionalParameters17 }
     *     
     */
    public SecuritiesSettlementTransactionDetails47 setSttlmTpAndAddtlParams(SettlementTypeAndAdditionalParameters17 value) {
        this.sttlmTpAndAddtlParams = value;
        return this;
    }

    /**
     * Gets the value of the lnkgs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lnkgs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLnkgs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Linkages48 }
     * 
     * 
     */
    public List<Linkages48> getLnkgs() {
        if (lnkgs == null) {
            lnkgs = new ArrayList<Linkages48>();
        }
        return this.lnkgs;
    }

    /**
     * Gets the value of the tradDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTradeDetails132 }
     *     
     */
    public SecuritiesTradeDetails132 getTradDtls() {
        return tradDtls;
    }

    /**
     * Sets the value of the tradDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTradeDetails132 }
     *     
     */
    public SecuritiesSettlementTransactionDetails47 setTradDtls(SecuritiesTradeDetails132 value) {
        this.tradDtls = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmAttrbts property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentAttributes97 }
     *     
     */
    public FinancialInstrumentAttributes97 getFinInstrmAttrbts() {
        return finInstrmAttrbts;
    }

    /**
     * Sets the value of the finInstrmAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentAttributes97 }
     *     
     */
    public SecuritiesSettlementTransactionDetails47 setFinInstrmAttrbts(FinancialInstrumentAttributes97 value) {
        this.finInstrmAttrbts = value;
        return this;
    }

    /**
     * Gets the value of the qtyAndAcctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityAndAccount93 }
     *     
     */
    public QuantityAndAccount93 getQtyAndAcctDtls() {
        return qtyAndAcctDtls;
    }

    /**
     * Sets the value of the qtyAndAcctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityAndAccount93 }
     *     
     */
    public SecuritiesSettlementTransactionDetails47 setQtyAndAcctDtls(QuantityAndAccount93 value) {
        this.qtyAndAcctDtls = value;
        return this;
    }

    /**
     * Gets the value of the sttlmParams property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDetails195 }
     *     
     */
    public SettlementDetails195 getSttlmParams() {
        return sttlmParams;
    }

    /**
     * Sets the value of the sttlmParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDetails195 }
     *     
     */
    public SecuritiesSettlementTransactionDetails47 setSttlmParams(SettlementDetails195 value) {
        this.sttlmParams = value;
        return this;
    }

    /**
     * Gets the value of the stgSttlmInstrDtls property.
     * 
     * @return
     *     possible object is
     *     {@link StandingSettlementInstruction17 }
     *     
     */
    public StandingSettlementInstruction17 getStgSttlmInstrDtls() {
        return stgSttlmInstrDtls;
    }

    /**
     * Sets the value of the stgSttlmInstrDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandingSettlementInstruction17 }
     *     
     */
    public SecuritiesSettlementTransactionDetails47 setStgSttlmInstrDtls(StandingSettlementInstruction17 value) {
        this.stgSttlmInstrDtls = value;
        return this;
    }

    /**
     * Gets the value of the dlvrgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties92 }
     *     
     */
    public SettlementParties92 getDlvrgSttlmPties() {
        return dlvrgSttlmPties;
    }

    /**
     * Sets the value of the dlvrgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties92 }
     *     
     */
    public SecuritiesSettlementTransactionDetails47 setDlvrgSttlmPties(SettlementParties92 value) {
        this.dlvrgSttlmPties = value;
        return this;
    }

    /**
     * Gets the value of the rcvgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties92 }
     *     
     */
    public SettlementParties92 getRcvgSttlmPties() {
        return rcvgSttlmPties;
    }

    /**
     * Sets the value of the rcvgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties92 }
     *     
     */
    public SecuritiesSettlementTransactionDetails47 setRcvgSttlmPties(SettlementParties92 value) {
        this.rcvgSttlmPties = value;
        return this;
    }

    /**
     * Gets the value of the cshPties property.
     * 
     * @return
     *     possible object is
     *     {@link CashParties38 }
     *     
     */
    public CashParties38 getCshPties() {
        return cshPties;
    }

    /**
     * Sets the value of the cshPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashParties38 }
     *     
     */
    public SecuritiesSettlementTransactionDetails47 setCshPties(CashParties38 value) {
        this.cshPties = value;
        return this;
    }

    /**
     * Gets the value of the sttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection101 }
     *     
     */
    public AmountAndDirection101 getSttlmAmt() {
        return sttlmAmt;
    }

    /**
     * Sets the value of the sttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection101 }
     *     
     */
    public SecuritiesSettlementTransactionDetails47 setSttlmAmt(AmountAndDirection101 value) {
        this.sttlmAmt = value;
        return this;
    }

    /**
     * Gets the value of the othrAmts property.
     * 
     * @return
     *     possible object is
     *     {@link OtherAmounts43 }
     *     
     */
    public OtherAmounts43 getOthrAmts() {
        return othrAmts;
    }

    /**
     * Sets the value of the othrAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherAmounts43 }
     *     
     */
    public SecuritiesSettlementTransactionDetails47 setOthrAmts(OtherAmounts43 value) {
        this.othrAmts = value;
        return this;
    }

    /**
     * Gets the value of the othrBizPties property.
     * 
     * @return
     *     possible object is
     *     {@link OtherParties35 }
     *     
     */
    public OtherParties35 getOthrBizPties() {
        return othrBizPties;
    }

    /**
     * Sets the value of the othrBizPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherParties35 }
     *     
     */
    public SecuritiesSettlementTransactionDetails47 setOthrBizPties(OtherParties35 value) {
        this.othrBizPties = value;
        return this;
    }

    /**
     * Gets the value of the addtlPhysOrRegnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationParameters7 }
     *     
     */
    public RegistrationParameters7 getAddtlPhysOrRegnDtls() {
        return addtlPhysOrRegnDtls;
    }

    /**
     * Sets the value of the addtlPhysOrRegnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationParameters7 }
     *     
     */
    public SecuritiesSettlementTransactionDetails47 setAddtlPhysOrRegnDtls(RegistrationParameters7 value) {
        this.addtlPhysOrRegnDtls = value;
        return this;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<SupplementaryData1>();
        }
        return this.splmtryData;
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

    /**
     * Adds a new item to the lnkgs list.
     * @see #getLnkgs()
     * 
     */
    public SecuritiesSettlementTransactionDetails47 addLnkgs(Linkages48 lnkgs) {
        getLnkgs().add(lnkgs);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public SecuritiesSettlementTransactionDetails47 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}