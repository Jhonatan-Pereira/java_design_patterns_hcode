package br.com.jhonatanfrade.solid.abstractfactory;

import br.com.jhonatanfrade.solid.abstractfactory.app.Application;
import br.com.jhonatanfrade.solid.abstractfactory.factories.ITransportFactory;
import br.com.jhonatanfrade.solid.abstractfactory.factories.NineNineTransport;
import br.com.jhonatanfrade.solid.abstractfactory.factories.UberTransport;

public class Main {

  public static Application configureApplication() {
    Application app;
    ITransportFactory factory;

    String company = "99";

    if(company == "uber") {
      factory = new UberTransport();
    } else {
      factory = new NineNineTransport();
    }

    app = new Application(factory);

    return app;
  }

  public static void main(String[] args) {
    Application app = configureApplication();
    app.startRoute();
  }
}
