package com.mx.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.mx.entidad.VideoJuego;
import com.mx.dao.*;
import java.util.*;

public class Principal {
	public static void main(String [] args) {
		VideoJuegoDao dao = new VideoJuegoDao();
		System.out.println(dao.mostrar());
		
		VideoJuego vg = new VideoJuego(2);
		System.out.println(dao.buscar(vg));
		
		VideoJuego vg2 = new VideoJuego(2,null,null,400);
		dao.editar(vg2);
		System.out.println(dao.mostrar());
		
		
		
	}
	
	
}
