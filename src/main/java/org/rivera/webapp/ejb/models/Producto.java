package org.rivera.webapp.ejb.models;

public class Producto {
  private String name;

  public Producto() {
  }

  public Producto(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Producto{" +
            "name=" + name +
            '}';
  }
}
