package br.com.jhonatanfrade.solid.abstractfactory.app;

import br.com.jhonatanfrade.solid.abstractfactory.aircrafts.IAircraft;
import br.com.jhonatanfrade.solid.abstractfactory.factories.ITransportFactory;
import br.com.jhonatanfrade.solid.abstractfactory.landvehicles.ILandVehicle;
import br.com.jhonatanfrade.solid.abstractfactory.waterVehicles.IWaterVehicle;

public class Application {
  private ILandVehicle vehicle;
  private IAircraft aircraft;
  private IWaterVehicle waterVehicle;

  public Application(ITransportFactory factory) {
    vehicle = factory.createTransportLandVehicle();
    aircraft = factory.createTransportAircarft();
    waterVehicle = factory.createTransportWaterVehicle();
  }

  public void startRoute() {
    vehicle.startRoute();
    aircraft.startRoute();
    waterVehicle.startRoute();
  }
}
