package br.com.jhonatanfrade.builder.builders;

import br.com.jhonatanfrade.builder.components.CarType;
import br.com.jhonatanfrade.builder.components.Engine;
import br.com.jhonatanfrade.builder.components.Transmission;

public interface IBuilder {
  
  void setCarType(CarType type);
  void setSeats(int seats);
  void setTransmission(Transmission transmission);
  void setEngine(Engine engine);
}
