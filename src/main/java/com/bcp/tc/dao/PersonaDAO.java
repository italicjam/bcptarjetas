package com.bcp.tc.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.bcp.tc.entity.Agencia;
import com.bcp.tc.entity.Cliente;
import com.bcp.tc.entity.Persona;

public class PersonaDAO {
	
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenceUnit");
	private EntityManager em = emf.createEntityManager();
	
	public Persona obtenerDatosPersonaTest(String dni, String celular){
		
		Query q;
		Persona persona = new Persona();
		List<Object[]> lstObject;
		
		StringBuilder query = new StringBuilder();
		
		query.append("Select PersonaID, NombreCompleto, Dni, Celular, Correo, Agencia, TipoTarjeta, Fecha");
		query.append(", Conformidad, fecha_creacion, fecha_modificacion");
		query.append(" from dbo.Persona");
		query.append(" where Dni = '" + dni + "' and Celular = '" + celular + "'");
		
		System.out.println(query.toString());
		try{
			q = em.createNativeQuery(query.toString());
	        lstObject = (List<Object[]>) q.getResultList();
	        
	        for(Object[] obj : lstObject){
	        	persona.setPersonaID((Integer) obj[0]);
	        	persona.setNombreCompleto((String) obj[1]);
	        	persona.setDni((String) obj[2]);
	        	persona.setCelular((String) obj[3]);
	        	persona.setCelular((String) obj[4]);
	        	persona.setAgencia((String) obj[5]);
	        	persona.setTipoTarjeta((String) obj[6]);
	        	persona.setFecha((String) obj[7]);
	        }
	        
		}catch(NoResultException nre){
			System.out.println("No hay resultados");
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
        
        return persona;
	}
	
	public Cliente obtenerDatosCliente(String dni, String celular){
		
		Query q;
		Cliente cliente = new Cliente();
		List<Object[]> lstObject;
		
		StringBuilder query = new StringBuilder();
		
		query.append("Select id, idTarjeta, dni, nombres, celular, correo");
		query.append(" from dbo.cliente");
		query.append(" where dni = '" + dni + "' and celular = '" + celular + "'");
		
		System.out.println(query.toString());
		try{
			q = em.createNativeQuery(query.toString());
	        lstObject = (List<Object[]>) q.getResultList();
	        
	        for(Object[] obj : lstObject){
	        	cliente.setId((Integer) obj[0]);
	        	cliente.setIdTarjeta((Integer) obj[1]);
	        	cliente.setNombre((String) obj[2]);
	        	cliente.setDni((String) obj[3]);
	        	cliente.setCelular((String) obj[4]);
	        	cliente.setCorreo((String) obj[5]);
	        }
	        
		}catch(NoResultException nre){
			System.out.println("No hay resultados");
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
        
        return cliente;
	}
	
	public List<Agencia> obtenerAgencias(){
		
		Query q;
		Agencia agencia = new Agencia();
		List<Object[]> lstObject;
		List<Agencia> lstAgencia = new ArrayList<>();
		
		StringBuilder query = new StringBuilder();
		
		query.append("Select id, nombre, direccion");
		query.append(" from dbo.agencia");
		
		System.out.println(query.toString());
		try{
			q = em.createNativeQuery(query.toString());
	        lstObject = (List<Object[]>) q.getResultList();
	        
	        for(Object[] obj : lstObject){
	        	agencia = new Agencia();
	        	agencia.setId((Integer) obj[0]);
	        	agencia.setNombre((String) obj[1]);
	        	agencia.setDireccion((String) obj[2]);
	        	
	        	lstAgencia.add(agencia);
	        }
	        
		}catch(NoResultException nre){
			System.out.println("No hay resultados");
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		
		return lstAgencia;
	}
	
	public boolean guardarConfirmacion(Integer idPersona, Integer idTarjeta, Integer idAgencia){
				
		try{
			
			if(!validarTarjeta(idTarjeta)){
				return false;
			}
			
			if(!validarAgencia(idAgencia)){
				return false;
			}
			
			
			
			return true;
			
		}catch(Exception ex){
			return false;
		}
		
	}
	
	private boolean validarTarjeta(Integer idTarjeta){
		return true;
	}
	
	private boolean validarAgencia(Integer idAgencia){
		return true;
	}

}
