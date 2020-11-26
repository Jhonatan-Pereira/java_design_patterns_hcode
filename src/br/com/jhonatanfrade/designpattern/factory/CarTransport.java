package br.com.jhonatanfrade.designpattern.factory;

import br.com.jhonatanfrade.designpattern.factory.vehicles.Car;
import br.com.jhonatanfrade.designpattern.factory.vehicles.IVehicle;

public class CarTransport extends Transport {

  @Override
  protected IVehicle createTransport() {
    return new Car();
  }
  
}
