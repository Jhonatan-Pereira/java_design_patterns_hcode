package br.com.jhonatanfrade.ChainOfResponsability.middlewares;

public class CheckPermissionMiddleware extends Middleware {

  @Override
  public boolean check(String email, String password) {
    if(email.equals("master@hcode.com.br")) {
      System.out.println("Bem vindo administrador");
      return true;
    }
    System.out.println("Bem vindo");
    return checkNext(email, password);
  }
  

}