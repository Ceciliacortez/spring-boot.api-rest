package com.apirest.demo.service;


import org.springframework.stereotype.Service;

import com.apirest.demo.model.Persona;


@Service
public  class PersonaService{

	    static private final String Persona = "persona";


public static void Persona() {
	Persona persona = new Persona("23", "Cecilia", 27, "Modesto Arreola 2751", "cecilia@hotmail.com", "8131001090", "34");
//	
	persona.setId("23");
	persona.setNombre("Cecilia");
	persona.setDireccion("direccion");
     persona.setCorreoElectronico("ceci2@horma");
	persona.setEdad(34);
	persona.setNumeroTelefono("333");
	persona.setRegistrationNumber("34");
    persona.put(persona.getId(), persona);
 }

 public void createPersona(Persona persona) {
    persona.put(persona.getId(), persona);
 }
public void updatePersona(String id, Persona persona) {
    persona.remove(id);
    persona.setId(id);
    persona.put(id, persona);
 }
 public void deletePersona(String id, Persona persona) {
	 persona.remove(id);
 }
public String getPersona() {
	return Persona;
}

//public com.apirest.demo.model.Persona findById(Integer id) {
//	// TODO Auto-generated method stub
//	return null;
//}
 }
	

