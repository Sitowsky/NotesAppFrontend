/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;
import model.Note;

/**
 *
 * @author joang
 */
@WebService
public interface INoteDao {
    
    // Gets all existing notes on DB
    @WebMethod
    public List<Note> getAll();
    
    // Gets all notes from a specific user
    @WebMethod
    public List<Note> getAllByUser(int userid);
    
    @WebMethod
    public boolean add(Note object);
    
    @WebMethod
    public boolean delete(int idnote);
    
    @WebMethod
    public boolean update(Note object);
}