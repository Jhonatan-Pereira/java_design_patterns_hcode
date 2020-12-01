package br.com.jhonatanfrade.builder;

import br.com.jhonatanfrade.builder.builders.CarBuilder;
import br.com.jhonatanfrade.builder.builders.TruckBuilder;
import br.com.jhonatanfrade.builder.cars.Car;
import br.com.jhonatanfrade.builder.cars.Truck;
import br.com.jhonatanfrade.builder.director.Director;

public class Main {
  public static void main(String[] args) {
    
    Director director = new Director();

    //criando o carro sedan
    CarBuilder builder = new CarBuilder();
    director.constructSedanCar(builder);

    Car car = builder.getresult();
    System.out.println(car.getCarType() + " produzido com sucesso!");

    //criando o caminhão
    TruckBuilder truckBuilder = new TruckBuilder();
    director.constructTruck(truckBuilder);

    Truck truck = truckBuilder.getresult();
    System.out.println("Caminhão: " + truck.result());
  }
}
