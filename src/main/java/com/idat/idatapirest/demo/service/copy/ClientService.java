package com.idat.idatapirest.demo.service.copy;
import java.util.List;

import com.idat.idatapirest.demo.dto.ClienteRequestDTO;
import com.idat.idatapirest.demo.dto.ClienteResponseDTO;


public interface ClientService {
	public void guardarCliente(ClienteRequestDTO p);
	public void eliminarCliente(Integer id);
	public void editarCliente(ClienteRequestDTO p);
	public List<ClienteResponseDTO> listarCliente();
	public ClienteResponseDTO clienteById(Integer id);
}
