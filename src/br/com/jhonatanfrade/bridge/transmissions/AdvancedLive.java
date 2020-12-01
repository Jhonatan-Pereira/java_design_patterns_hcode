package br.com.jhonatanfrade.bridge.transmissions;

import br.com.jhonatanfrade.bridge.platforms.IPlatform;

public class AdvancedLive extends Live {
  
  public AdvancedLive(IPlatform platform) {
    super.platform = platform;
  }

  public void subtitles() {
    System.out.println("Legendas ativas na transmissão");
  }

  public void comments() {
    System.out.println("Comentários liberados na live");
  }
}
