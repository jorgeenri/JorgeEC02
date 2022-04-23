package com.idat.idatapirest.demo.service.copy;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.idatapirest.demo.dto.ClienteRequestDTO;
import com.idat.idatapirest.demo.dto.ClienteResponseDTO;

import com.idat.idatapirest.demo.model.Clients;
import com.idat.idatapirest.demo.repository.ClienteRepository;

@Service
public class ClientServiceImpl implements ClientService{
	@Autowired
	private ClienteRepository repository;
	
	@Override
	public void guardarCliente(ClienteRequestDTO p) {
		// TODO Auto-generated method stub
		Clients cliente = new Clients();
		cliente.setDireccionCliente(p.getDireccionCliente());
		cliente.setDniCliente(p.getDniCliente());
		cliente.setNombreCliente(p.getNombreCliente());
		cliente.setIdCliente(p.getIdCliente());
		repository.save(cliente);
	}

	@Override
	public void eliminarCliente(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public void editarCliente(ClienteRequestDTO p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ClienteResponseDTO> listarCliente() {
		List<Clients> cliente = repository.findAll();
		List<ClienteResponseDTO> dto = new ArrayList<ClienteResponseDTO>();
		ClienteResponseDTO clienteDTO = null;
		
		for (Clients c : cliente) {
			clienteDTO = new ClienteResponseDTO();
			clienteDTO.setIdCliente(c.getIdCliente());
			clienteDTO.setDireccionCliente(c.getDireccionCliente());
			clienteDTO.setDniCliente(c.getDniCliente());
			clienteDTO.setNombreCliente(c.getNombreCliente());
			dto.add(clienteDTO);
		}
		
		return dto;
	}

	@Override
	public ClienteResponseDTO clienteById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
