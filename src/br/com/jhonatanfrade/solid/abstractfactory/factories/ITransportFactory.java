package br.com.jhonatanfrade.solid.abstractfactory.factories;

import br.com.jhonatanfrade.solid.abstractfactory.aircrafts.IAircraft;
import br.com.jhonatanfrade.solid.abstractfactory.landvehicles.ILandVehicle;
import br.com.jhonatanfrade.solid.abstractfactory.waterVehicles.IWaterVehicle;

public interface ITransportFactory {
  ILandVehicle createTransportLandVehicle();
  IAircraft createTransportAircarft();
  IWaterVehicle createTransportWaterVehicle();
}
