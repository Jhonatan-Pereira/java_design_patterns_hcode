package br.com.jhonatanfrade.solid.abstractfactory.app;

import br.com.jhonatanfrade.solid.abstractfactory.aircrafts.IAircraft;
import br.com.jhonatanfrade.solid.abstractfactory.factories.ITransportFactory;
import br.com.jhonatanfrade.solid.abstractfactory.landvehicles.ILandVehicle;

public class Application {
  private ILandVehicle vehicle;
  private IAircraft aircraft;

  public Application(ITransportFactory factory) {
    vehicle = factory.createTransportLandVehicle();
    aircraft = factory.createTransportAircarft();
  }

  public void startRoute() {
    vehicle.startRoute();
    aircraft.startRoute();
  }
}
