package br.com.jhonatanfrade.solid.abstractfactory.factories;

import br.com.jhonatanfrade.solid.abstractfactory.aircrafts.Airplane;
import br.com.jhonatanfrade.solid.abstractfactory.aircrafts.IAircraft;
import br.com.jhonatanfrade.solid.abstractfactory.landvehicles.Car;
import br.com.jhonatanfrade.solid.abstractfactory.landvehicles.ILandVehicle;
import br.com.jhonatanfrade.solid.abstractfactory.waterVehicles.Boat;
import br.com.jhonatanfrade.solid.abstractfactory.waterVehicles.IWaterVehicle;

public class UberTransport implements ITransportFactory {

  @Override
  public ILandVehicle createTransportLandVehicle() {
    return new Car();
  }

  @Override
  public IAircraft createTransportAircarft() {
    return new Airplane();
  }

  @Override
  public IWaterVehicle createTransportWaterVehicle() {
    return new Boat();
  }
  
}
