package br.com.jhonatanfrade.designpattern.factory;

import br.com.jhonatanfrade.designpattern.factory.vehicles.IVehicle;

public abstract class Transport {
  
  void startTransport() {
    IVehicle vehicle = createTransport();
    vehicle.startRoute();
  }

  protected abstract IVehicle createTransport();
}
