package br.com.jhonatanfrade.designpattern.factory;

import br.com.jhonatanfrade.designpattern.factory.vehicles.IVehicle;
import br.com.jhonatanfrade.designpattern.factory.vehicles.Motorcycle;

public class MotocycleTransport extends Transport {

  @Override
  protected IVehicle createTransport() {
    return new Motorcycle();
  }
  
}
