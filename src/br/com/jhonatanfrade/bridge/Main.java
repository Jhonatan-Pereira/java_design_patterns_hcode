package br.com.jhonatanfrade.bridge;

import br.com.jhonatanfrade.bridge.platforms.Facebook;
import br.com.jhonatanfrade.bridge.platforms.IPlatform;
import br.com.jhonatanfrade.bridge.platforms.TwitchTV;
import br.com.jhonatanfrade.bridge.platforms.YouTube;
// import br.com.jhonatanfrade.bridge.transmissions.Live;
import br.com.jhonatanfrade.bridge.transmissions.AdvancedLive;

public class Main {
  public static void main(String[] args) {
    startLive(new YouTube());
    startLive(new TwitchTV());
    startLive(new Facebook());
  }

  public static void startLive(IPlatform platform) {
    // System.out.println("...aguarde!");
    // Live live = new Live(platform);
    // live.broadcasting();
    // live.result();

    System.out.println("Transmissão avançada... aguarde!");
    AdvancedLive advancedLive = new AdvancedLive(platform);
    advancedLive.broadcasting();
    advancedLive.subtitles();
    advancedLive.comments();
    advancedLive.result();
  }
}
