package com.nttdata.Spring.Taller3;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.Spring.Taller3.Entidades.Cliente;
import com.nttdata.Spring.Taller3.Repository.RepositorioCliente;
import com.nttdata.Spring.Taller3.Services.ServiciosCliente;

@SpringBootApplication
public class SpringTaller3Application implements CommandLineRunner {

	@Autowired
	ServiciosCliente cliente;

	public static void main(String[] args) {
		SpringApplication.run(SpringTaller3Application.class, args);
		
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Cliente uno = new Cliente("Pepe","Rodriguez" , new Date(),"47589873H" );
		Cliente dos = new Cliente("Pepe","Morillo" , new Date(),"47589873J" );
		Cliente tres = new Cliente("Antonio","Rodriguez" , new Date(),"47589873L" );
		cliente.insert(uno);
		cliente.insert(dos);
		cliente.insert(tres);
		cliente.delete(dos);
		cliente.findByLastname("Rodriguez");
		
	}

}
