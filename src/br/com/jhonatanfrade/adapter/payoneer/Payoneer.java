package br.com.jhonatanfrade.adapter.payoneer;

import br.com.jhonatanfrade.adapter.utils.Token;

public class Payoneer implements IPayoneerPayments {

  @Override
  public Token authToken() {
    return new Token();
  }

  @Override
  public void sendPayment() {
    System.out.println("Enviado pagamentos via payoneer");
  }

  @Override
  public void receivePayment() {
    System.out.println("Recebendo pagamentos via payoneer");
  }
  
}
