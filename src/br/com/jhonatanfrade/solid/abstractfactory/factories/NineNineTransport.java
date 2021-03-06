package br.com.jhonatanfrade.solid.abstractfactory.factories;

import br.com.jhonatanfrade.solid.abstractfactory.aircrafts.Helicopter;
import br.com.jhonatanfrade.solid.abstractfactory.aircrafts.IAircraft;
import br.com.jhonatanfrade.solid.abstractfactory.landvehicles.ILandVehicle;
import br.com.jhonatanfrade.solid.abstractfactory.landvehicles.Motocycle;
import br.com.jhonatanfrade.solid.abstractfactory.waterVehicles.Boat;
import br.com.jhonatanfrade.solid.abstractfactory.waterVehicles.IWaterVehicle;

public class NineNineTransport implements ITransportFactory {

  @Override
  public ILandVehicle createTransportLandVehicle() {
    return new Motocycle();
  }

  @Override
  public IAircraft createTransportAircarft() {
    return new Helicopter();
  }

  @Override
  public IWaterVehicle createTransportWaterVehicle() {
    return new Boat();
  }
  
}
