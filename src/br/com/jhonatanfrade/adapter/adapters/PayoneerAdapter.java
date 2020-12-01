package br.com.jhonatanfrade.adapter.adapters;

import br.com.jhonatanfrade.adapter.payoneer.Payoneer;
import br.com.jhonatanfrade.adapter.paypal.IPayPalPayments;
import br.com.jhonatanfrade.adapter.utils.Token;

public class PayoneerAdapter implements IPayPalPayments {

  private Payoneer payoneer;

  public PayoneerAdapter(Payoneer payoneer) {
    this.payoneer = payoneer;
    System.out.println("Adaptando o Payoneer utilizando os métodos padrões do PayPal");
  }

  @Override
  public Token authToken() {
    return new Token();
  }

  @Override
  public void paypalPayment() {
    this.payoneer.sendPayment();
  }

  @Override
  public void paypalReceive() {
    this.payoneer.receivePayment();
  }
  
}
