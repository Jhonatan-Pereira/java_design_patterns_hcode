package br.com.jhonatanfrade.ChainOfResponsability;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import br.com.jhonatanfrade.ChainOfResponsability.middlewares.CheckPermissionMiddleware;
import br.com.jhonatanfrade.ChainOfResponsability.middlewares.CheckUserMiddleware;
import br.com.jhonatanfrade.ChainOfResponsability.middlewares.Middleware;
import br.com.jhonatanfrade.ChainOfResponsability.server.Server;

public class Main {

  private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  private static Server server;

  public static void init() {
    server = new Server();
    server.registerUser("master@hcode.com.br", "123456789");
    server.registerUser("user@hcode.com.br", "12345");

    Middleware middleware = new CheckUserMiddleware(server);
    middleware.linkWith(new CheckPermissionMiddleware());

    server.setMiddleware(middleware);
  }

  public static void main(String[] args) throws IOException {
    init();

    boolean done;

    do {
      System.out.println("Digite o e-mail: ");
      String email = reader.readLine();
      System.out.println("Digite sua senha: ");
      String password = reader.readLine();
      done = server.logIn(email, password);
    } while(!done);
  }
}
