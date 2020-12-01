package br.com.jhonatanfrade.bridge.platforms;

public class YouTube implements IPlatform {

  public YouTube() {
    configureRMTP();
    System.out.println("Youtube: Trasmissão iniciada");
  }

  @Override
  public void configureRMTP() {
    authToken();
    System.out.println("Youtube: Configurando Broadcasting");
  }

  @Override
  public void authToken() {
    System.out.println("Youtube: autorizando aplicação");
  }
  
}
