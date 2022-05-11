/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.ws001.ws;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import pe.edu.upeu.ws001.dao.RolDao;
import pe.edu.upeu.ws001.daoimpl.RolDaoImpl;
import pe.edu.upeu.ws001.model.Rol;
/**
 *
 * @author Yeikov
 */
@WebService(serviceName = "RolWebService")
public class RolWebService {

    RolDao rolDao = new RolDaoImpl();

    @WebMethod(operationName = "insertar")
    public int insertar(@WebParam(name = "nombre") String nombre) {
        //TODO write your implementation code here:
        return rolDao.create(new Rol(0, nombre));
    }

    @WebMethod(operationName = "editar")
    public int editar(@WebParam(name = "idrol") int idrol, @WebParam(name = "nombre") String nombre) {
        //TODO write your implementation code here:
        return rolDao.update(new Rol(idrol, nombre));
    }

    @WebMethod(operationName = "eliminar")
    public int eliminar(@WebParam(name = "id") int id) {
        //TODO write your implementation code here:
        return rolDao.delete(id);
    }

    @WebMethod(operationName = "read")
    public Rol read(@WebParam(name = "id") int id) {
        //TODO write your implementation code here:
        return rolDao.read(id);
    }

    @WebMethod(operationName = "readAll")
    public List<Rol> readAll() {
        //TODO write your implementation code here:
        return rolDao.readAll();
    }
} 
