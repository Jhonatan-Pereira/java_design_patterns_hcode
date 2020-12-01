package br.com.jhonatanfrade.adapter.paypal;

import br.com.jhonatanfrade.adapter.utils.Token;

public class PayPal implements IPayPalPayments {

  @Override
  public Token authToken() {
    return new Token();
  }

  @Override
  public void paypalPayment() {
    System.out.println("Enviando pagamentos via paypal");
  }

  @Override
  public void paypalReceive() {
    System.out.println("Recebendo pagamentos via paypal");
  }
  
}
