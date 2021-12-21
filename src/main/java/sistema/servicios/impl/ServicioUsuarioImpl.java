package sistema.servicios.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sistema.domain.Usuario;
import sistema.interfaces.ServicioUsuario;
import sistema.repositorios.UsuarioRepositorio;

@Service
public class ServicioUsuarioImpl implements ServicioUsuario{

	@Autowired
	private UsuarioRepositorio usuarioRepositorio;
	
	@Override
	public boolean registro(String nombreUsuario, String correo, String rol, String contrasenha) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Usuario asignarRol(String rol) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean IniciarSesion(String nombreUsuario, String contrasenha) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<String> AgruparRoles(int idUsuario, String rol) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String Financiar(int monto, String formaDePago) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Usuario> ListarUsuarios(int idUsuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean EliminarUsuario(int idUsuario) {
		// TODO Auto-generated method stub
		return false;
	}

	//manual
	
	@Override
	public List<Usuario> findAll() {
		List<Usuario> usuarios = new ArrayList<>();
		Iterator<Usuario> iteratorUsuarios = usuarioRepositorio.findAll().iterator();
		while (iteratorUsuarios.hasNext()) {
			usuarios.add(iteratorUsuarios.next());
		}
		return usuarios;
	}
	
	public void save(Usuario usuarios) {
		usuarioRepositorio.save(usuarios);
		
	}
	
	

	@Override
	public List<Usuario> findByRol(String rol) {
		List<Usuario> usuarios = new ArrayList<>();
		Iterator<Usuario> iteratorUsuarios = usuarioRepositorio.findByRol(rol).iterator();
		while (iteratorUsuarios.hasNext()) {
			usuarios.add(iteratorUsuarios.next());
		}
		return usuarios;
	}

	@Override
	public void notificarExpiracion() {
		//obtener usuarios con credencial vencida
		//List<Usuario> usuarios = usuarioRepositorio.findUsuariosMembresiaExpirada();
		
	}

	/*
	public void saveList(List<Usuario> usuarios) {
		usuarioRepositorio.saveList(usuarios);
		
	}
	*/
	
}
