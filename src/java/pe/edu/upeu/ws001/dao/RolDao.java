/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.ws001.dao;

/**
 *
 * @author Yeikov
 */
import java.util.List;
import pe.edu.upeu.ws001.model.Rol;

/**
 *
 * @author admin
 */
public interface RolDao {

    int create(Rol rol);

    int update(Rol rol);

    int delete(int rol);

    Rol read(int id);

    List<Rol> readAll();
}
