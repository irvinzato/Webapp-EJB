package org.rivera.webapp.ejb.controllers;

import jakarta.ejb.EJB;
import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.rivera.webapp.ejb.service.ServiceEjb;

import java.io.IOException;

@WebServlet("/index")
public class ServletEjemplo extends HttpServlet {

  @Inject  //Cuando se usa CDI es mejor Inject a "EJB"(Lo uso en RequestScoped)
  private ServiceEjb service;

  @Inject
  private ServiceEjb service2;

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    System.out.println("¿Son iguales los servicios? " + service.equals(service2));
    req.setAttribute("saludo", service.greet("Irving"));
    req.setAttribute("saludo2", service2.greet("Mauricio"));
    getServletContext().getRequestDispatcher("/index.jsp").forward(req,resp);
  }
}
