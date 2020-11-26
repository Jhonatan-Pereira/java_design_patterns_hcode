package br.com.jhonatanfrade.solid.abstractfactory.factories;

import br.com.jhonatanfrade.solid.abstractfactory.aircrafts.Airplane;
import br.com.jhonatanfrade.solid.abstractfactory.aircrafts.IAircraft;
import br.com.jhonatanfrade.solid.abstractfactory.landvehicles.Car;
import br.com.jhonatanfrade.solid.abstractfactory.landvehicles.ILandVehicle;

public class UberTransport implements ITransportFactory {

  @Override
  public ILandVehicle createTransportLandVehicle() {
    return new Car();
  }

  @Override
  public IAircraft createTransportAircarft() {
    return new Airplane();
  }
  
}
