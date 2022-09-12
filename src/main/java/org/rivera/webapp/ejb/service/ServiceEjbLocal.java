package org.rivera.webapp.ejb.service;

import jakarta.ejb.Local;
import org.rivera.webapp.ejb.models.Producto;

import java.util.List;

@Local  //Indica que este ejb se usa dentro del servidor de aplicaciones(Dentro del mismo proyecto)
public interface ServiceEjbLocal {
  String greet(String name);
  List<Producto> toList();
  Producto create(Producto p);
}
