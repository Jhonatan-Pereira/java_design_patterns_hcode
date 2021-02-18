package br.com.jhonatanfrade.ChainOfResponsability.server;

import java.util.HashMap;
import java.util.Map;

import br.com.jhonatanfrade.ChainOfResponsability.middlewares.Middleware;

public class Server {
  
  private Map<String, String> users = new HashMap();
  private Middleware middleware;

  public void setMiddleware(Middleware middleware) {
    this.middleware = middleware;
  }

  public boolean logIn(String email, String password) {
    if(middleware.check(email, password)) {
      System.out.println("Usuário autenticado com sucesso!");

      return true;
    }

    return false;
  }

  public void registerUser(String email, String password) {
    users.put(email, password);
  }

  public boolean hasEmail(String email) {
    return users.containsKey(email);
  }

  public boolean isValidPassword(String email, String password) {
    return users.get(email).equals(password);
  }
}
