package org.rivera.webapp.ejb.controllers;

import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.rivera.webapp.ejb.service.ServiceEjb;

import java.io.IOException;

@WebServlet("/index")
public class ServletEjemplo extends HttpServlet {

  @EJB
  private ServiceEjb service;

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    req.setAttribute("saludo", service.greet("Irving"));
    getServletContext().getRequestDispatcher("/index.jsp").forward(req,resp);
  }
}
