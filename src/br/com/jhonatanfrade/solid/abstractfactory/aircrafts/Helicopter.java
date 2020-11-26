package br.com.jhonatanfrade.solid.abstractfactory.aircrafts;

public class Helicopter implements IAircraft {

  @Override
  public void startRoute() {
    wind();
    getCargo();
    System.out.println("Iniciando a decolagem");
  }

  @Override
  public void getCargo() {
    System.out.println("Passageiros a bordo, ligando helices");
  }

  @Override
  public void wind() {
    System.out.println("Ventos 25km, Suldeste, Ventos ok!");
  }
  
}
