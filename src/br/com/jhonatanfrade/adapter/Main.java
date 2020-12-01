package br.com.jhonatanfrade.adapter;

import br.com.jhonatanfrade.adapter.adapters.PayoneerAdapter;
import br.com.jhonatanfrade.adapter.payoneer.Payoneer;
import br.com.jhonatanfrade.adapter.paypal.IPayPalPayments;
import br.com.jhonatanfrade.adapter.paypal.PayPal;

public class Main {
  public static void main(String[] args) {
    // IPayPalPayments payment = new PayPal();
    // payment.paypalPayment();
    // payment.paypalReceive();

    IPayPalPayments payment = new PayoneerAdapter(new Payoneer());
    payment.paypalPayment();
    payment.paypalReceive();
  }
}
