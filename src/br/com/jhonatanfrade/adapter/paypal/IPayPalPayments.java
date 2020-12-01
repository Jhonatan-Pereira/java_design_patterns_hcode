package br.com.jhonatanfrade.adapter.paypal;

import br.com.jhonatanfrade.adapter.utils.Token;

public interface IPayPalPayments {
  
  Token authToken();
  void paypalPayment();
  void paypalReceive();
}
