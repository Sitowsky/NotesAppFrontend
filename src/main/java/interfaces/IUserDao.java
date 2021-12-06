/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;
import model.User;

/**
 *
 * @author joang
 */
@WebService
public interface IUserDao {
    @WebMethod
    public List<User> getAll();
    
    @WebMethod
    public boolean verifyCredentials(String email, String pass);
    
    @WebMethod
    public boolean add(User object);
    
    @WebMethod
    public boolean delete(int id);
    
    @WebMethod
    public boolean update(User object);
}
