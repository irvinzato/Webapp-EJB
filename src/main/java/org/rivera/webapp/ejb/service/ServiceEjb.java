package org.rivera.webapp.ejb.service;

import jakarta.ejb.Stateful;
import jakarta.ejb.Stateless;
import jakarta.enterprise.context.RequestScoped;
import org.rivera.webapp.ejb.models.Producto;

import java.util.ArrayList;
import java.util.List;

@Stateless  //Es compartida por ser Stateless(Sin estado), la misma instancia para todos los usuarios
//@RequestScoped  //Tiene sentido ocuparlo junto con Stateful
//@Stateful   //Es propia(Con estado), diferentes instancias
public class ServiceEjb implements ServiceEjbLocal {

  private int count;

  public String greet(String name) {
    count++;
    System.out.println("Dentro del ejb con instancia: " + this + " Contado " + count);
    return "Hola amigo " + name;
  }

  @Override
  public List<Producto> toList() {
    List<Producto> products = new ArrayList<>();
    products.add(new Producto("Durazno"));
    products.add(new Producto("Sandia"));
    products.add(new Producto("Mango"));
    return products;
  }

  @Override
  public Producto create(Producto p) {
    System.out.println("Creando producto " + p);
    Producto product = new Producto();
    product.setName(p.getName());
    return product;
  }

}
