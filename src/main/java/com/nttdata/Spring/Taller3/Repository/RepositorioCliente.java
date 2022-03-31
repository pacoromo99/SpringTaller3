package com.nttdata.Spring.Taller3.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nttdata.Spring.Taller3.Entidades.Cliente;

public interface RepositorioCliente extends JpaRepository<Cliente, Long> 
{
	 List<Cliente> findByLastname(String apellidosCliente);
}
