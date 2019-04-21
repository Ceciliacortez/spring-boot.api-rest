package com.apirest.demo.dao.interfaces;


import org.springframework.beans.factory.annotation.Qualifier;

import com.apirest.demo.model.Persona;

@Qualifier (value="persona")
public interface IntPersonaDAO {
	Persona findById(Integer id);
}