package com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.FiltroModalidad;
import com.empresa.entity.Modalidad;
import com.empresa.repository.ModalidadRepository;

@Service
public class ModalidadServiceImpl implements ModalidadService {

	@Autowired
	private ModalidadRepository repositorio;

	@Override
	public Modalidad insertaActualizaModalidad(Modalidad obj) {
		return repositorio.save(obj);
	}

	@Override
	public List<Modalidad> listaModalidad() {
		return repositorio.findAll();
	}

	@Override
	public List<Modalidad> listaModalidadPorNombre(String nombre) {
		
		return repositorio.findByNombre(nombre);
	}

	@Override
	public List<Modalidad> listaModalidadPorSede(String sede) {
		
		return repositorio.findBySede(sede);
	}

	@Override
	public List<Modalidad> listaModalidadNombreSede(String nombre, String sede) {
		return repositorio.listaModalidadNombreSede(nombre, sede);
	}

	@Override
	public List<Modalidad> listaModalidadNombreSedeDeporte(String nombre, String sede, int idDeporte) {
	
		return repositorio.listaModalidadNombreSedeDeporte(nombre, sede, idDeporte);
	}

	@Override
	public List<Modalidad> listaModalidadFiltro(FiltroModalidad filtro) {
		
		return repositorio.listaModalidadFiltro(filtro);
	}

}
