package org.rivera.webapp.ejb.service;

import jakarta.ejb.Stateless;

@Stateless  //Es compartida por ser Stateless, la misma instancia para todos los usuarios
public class ServiceEjb {

  public String greet(String name) {
    System.out.println("Dentro del ejb con instancia: " + this);
    return "Hola amigo " + name;
  }

}
