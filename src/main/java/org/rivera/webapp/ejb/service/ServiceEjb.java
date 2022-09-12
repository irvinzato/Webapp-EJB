package org.rivera.webapp.ejb.service;

import jakarta.ejb.Stateful;
import jakarta.ejb.Stateless;
import jakarta.enterprise.context.RequestScoped;

//@Stateless  //Es compartida por ser Stateless(Sin estado), la misma instancia para todos los usuarios
@RequestScoped  //Tiene sentido ocuparlo junto con Stateful
@Stateful   //Es propia(Con estado), diferentes instancias
public class ServiceEjb {

  private int count;

  public String greet(String name) {
    count++;
    System.out.println("Dentro del ejb con instancia: " + this + " Contado " + count);
    return "Hola amigo " + name;
  }

}
