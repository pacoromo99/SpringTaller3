package com.nttdata.Spring.Taller3.Services;
import java.util.List;
import org.springframework.stereotype.Service;
import com.nttdata.Spring.Taller3.Entidades.Cliente;
import com.nttdata.Spring.Taller3.Repository.RepositorioCliente;

@Service
public class ServiciosCliente {
	
	RepositorioCliente repositorio;

	public ServiciosCliente(RepositorioCliente repositorio) {
		this.repositorio = repositorio;
	}
	public List<Cliente> findByLastname(String apellidos) {
	        return  repositorio.findByLastname(apellidos);
	    }
	public void insert(Cliente cliente) 
	{
		repositorio.save(cliente);
	}
	public void delete(Cliente cliente) 
	{
		repositorio.delete(cliente);
	}
}
