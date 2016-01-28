package com.sdp.adapter;

/**
 * Created by Basil on 23/01/2016.
 */

// implement current class Xpay
public class XpayToPayDAdapter implements Xpay {

    // reference to new class
    private PayD payD;

    // create adapter with new class
    public XpayToPayDAdapter(PayD payD) {
        this.payD = payD;
    }

    // adapt methods to new class PayD

    @Override
    public String getCreditCardNo() {
        return payD.getCustCardNo();
    }

    @Override
    public void setCreditCardNo(String creditCardNo) {
        payD.setCustCardNo(creditCardNo);
    }

    @Override
    public String getCustomerName() {
        return payD.getCardOwnerName();
    }

    @Override
    public void setCustomerName(String customerName) {
        payD.setCardOwnerName(customerName);
    }

    @Override
    public String getCardExpMonth() {
        return payD.getCardExpMonthDate();
    }

    @Override
    public void setCardExpMonth(String cardExpMonth) {
        payD.setCardExpMonthDate(cardExpMonth);
    }

    // not in new class

    @Override
    public String getCardExpYear() {
        return null;
    }

    @Override
    public void setCardExpYear(String cardExpYear) {
        // pass
    }

    @Override
    public Short getCardCVVNo() {
        return payD.getCVVNo().shortValue();
    }

    @Override
    public void setCardCVVNo(Short cardCVVNo) {
        payD.setCVVNo(new Integer(cardCVVNo.intValue()));
    }

    @Override
    public Double getAmount() {
        return payD.getTotalAmount();
    }

    @Override
    public void setAmount(Double amount) {
        payD.setTotalAmount(amount);
    }
}
