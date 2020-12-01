package br.com.jhonatanfrade.adapter.payoneer;

import br.com.jhonatanfrade.adapter.utils.Token;

public interface IPayoneerPayments {
  
  Token authToken();
  void sendPayment();
  void receivePayment();
}
