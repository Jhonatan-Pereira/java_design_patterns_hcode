package br.com.jhonatanfrade.designpattern.factory;

import br.com.jhonatanfrade.designpattern.factory.vehicles.Bike;
import br.com.jhonatanfrade.designpattern.factory.vehicles.IVehicle;

public class BikeTransport extends Transport {

  @Override
  protected IVehicle createTransport() {
    return new Bike();
  }
  
}
