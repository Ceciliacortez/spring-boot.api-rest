package com.apirest.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.apirest.demo.dao.interfaces.IntPersonaDAO;
import com.apirest.demo.model.Persona;

public class RegistroPersonaController {
	
	@RestController
//	@RequestMapping("/persona")
	 @RequestMapping(value = "/persona")
	public class PersonaController {
	
	   @Autowired
	   private  IntPersonaDAO personaDAO;
	   
	   @RequestMapping(value ="/{id}", method = RequestMethod.GET)
	   public Persona getPersona(@PathVariable Integer id) {
		   return personaDAO.findById(id);
	   }
//	   @RequestParam(value="name", defaultValue="World") String name
	   @RequestMapping(value ="/{id}", method = RequestMethod.PUT)
	   public Persona updatePersona(@PathVariable Integer id) {
		   return personaDAO.findById(id);
	   }
	   @RequestMapping(value ="/{id}", method = RequestMethod.DELETE)
	   public Persona deletePersona(@PathVariable Integer id) {
		   return personaDAO.findById(id);
	   }
	   @RequestMapping(value = "/persona", method = RequestMethod.POST)
	   public Persona createPersona(@RequestBody Persona persona) {
		   return new Persona("23", "Cecilia", 27, "cecilia2@hotmail.com","Modesto Arreola #2751","8131001090",  "34");
	   }

	}
}
	

