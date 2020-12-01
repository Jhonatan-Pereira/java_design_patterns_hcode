package br.com.jhonatanfrade.bridge.platforms;

public class TwitchTV implements IPlatform {

  public TwitchTV() {
    configureRMTP();
    System.out.println("Twitch: Trasmissão iniciada.");
  }

  @Override
  public void configureRMTP() {
    authToken();
    System.out.println("Twitch: configurando RMTP");
  }

  @Override
  public void authToken() {
    System.out.println("Twitch: validando canal");
  }
  
}
