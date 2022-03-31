package com.nttdata.Spring.Taller3.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nttdata.Spring.Taller3.Entidades.Cliente;

@Repository
public interface RepositorioCliente extends JpaRepository<Cliente, Long> 
{

	List<Cliente> findByNombreAndApellidos(String nombre, String apellidos);
	List<Cliente> findFirstByDni(String dni);
	
}
