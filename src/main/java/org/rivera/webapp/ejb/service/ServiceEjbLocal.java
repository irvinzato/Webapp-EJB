package org.rivera.webapp.ejb.service;

import jakarta.ejb.Local;

@Local
public interface ServiceEjbLocal {
  String greet(String name);
}
