package br.com.jhonatanfrade.solid.abstractfactory.waterVehicles;

public class Boat implements IWaterVehicle {

  @Override
  public void startRoute() {
    getCargo();
    System.out.println("Iniciando o trajeto fluvial");

  }

  @Override
  public void getCargo() {
    System.out.println("Passageiros embarcaram");

  }
  
}
