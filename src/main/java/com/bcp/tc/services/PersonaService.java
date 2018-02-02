package com.bcp.tc.services;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bcp.tc.dao.PersonaDAO;
import com.bcp.tc.entity.Agencia;
import com.bcp.tc.entity.Cliente;
import com.bcp.tc.entity.Persona;

//@RestController
public class PersonaService {
	
//	@Autowired
//	private PersonaDAO dao;
	
	@RequestMapping("/")
    public String index() {
        return "Servicios BCP!....version 0.1";
    }
	
	@RequestMapping(value = "/obtenerPersonasTest", method = RequestMethod.POST)
	public Persona obtenerDatosPersonaTest(@RequestParam(value = "dni") String dni, 
										@RequestParam(value = "celular") String celular){
		
		PersonaDAO dao = new PersonaDAO();
		
		Persona persona = dao.obtenerDatosPersonaTest(dni, celular);
		
		return persona;
	}
	
	@RequestMapping(value = "/obtenerDatosCliente", method = RequestMethod.POST)
	public Cliente obtenerDatosCliente(@RequestParam(value = "dni") String dni, 
										@RequestParam(value = "celular") String celular){
		
		PersonaDAO dao = new PersonaDAO();
		
		Cliente cliente = dao.obtenerDatosCliente(dni, celular);
		
		return cliente;
	}
	
	@RequestMapping(value = "/obtenerAgencias", method = RequestMethod.GET)
	public List<Agencia> obtenerAgencias(){
		
		PersonaDAO dao = new PersonaDAO();
		
		List<Agencia> lstAgencias = dao.obtenerAgencias();
		
		return lstAgencias;
	}
	
	@RequestMapping(value = "/guardarConfirmacion", method = RequestMethod.POST)
	public boolean guardarConfirmacion(@RequestParam(value = "idPersona") Integer idPersona, 
										@RequestParam(value = "agencia") Integer idTarjeta,
										@RequestParam(value = "agencia") Integer idAgencia){
		
		PersonaDAO dao = new PersonaDAO();
		
		return dao.guardarConfirmacion(idPersona, idTarjeta, idAgencia);
	}
	
//	public static void main(String[] args) {
//		
//		PersonaDAO dao = new PersonaDAO();
//		
//		Persona persona = dao.obtenerDatosPersonaTest("42341321", "997182912");
//		
//		System.out.println(persona.getNombreCompleto());
//		System.out.println(persona.getCelular());
//		System.out.println(persona.getFecha());
//		
//
//	}

}
