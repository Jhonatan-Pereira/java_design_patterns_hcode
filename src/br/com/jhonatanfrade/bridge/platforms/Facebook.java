package br.com.jhonatanfrade.bridge.platforms;

public class Facebook implements IPlatform {

  public Facebook() {
    configureRMTP();
    System.out.println("Facebook: Trasmissão Iniciada");
  }

  @Override
  public void configureRMTP() {
    authToken();
    System.out.println("Facebook: Conta autorizada");
  }

  @Override
  public void authToken() {
    System.out.println("Facebook: autorizando aplicação");
  }
  
}
