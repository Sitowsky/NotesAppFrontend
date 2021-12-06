/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import interfaces.INoteBuilder;

/**
 *
 * @author Miguel
 */
public class NoteBuilder implements INoteBuilder{
    private int idnote, iduser;
    private String title, content;
    
    public NoteBuilder(){
        this.idnote = 0;    // Valor por defecto, por el AUTO_INCREMENT
    }
 
    public NoteBuilder withIdnote(int idnote) {
        this.idnote = idnote;
        return this;
    }
    
    public NoteBuilder withIduser(int iduser) {
        this.iduser = iduser;
        return this;
    }

    public NoteBuilder withTitle(String title) {
        this.title = title;
        return this;
    }
    
    public NoteBuilder withContent(String content) {
        this.content = content;
        return this;
    }
    
    @Override
    public Note build() {
        Note note = new Note();
        
        note.setIduser(this.iduser);
        note.setIdnote(this.idnote);
        note.setTitle(this.title);
        note.setContent(this.content);
        
        return note;
    }
}
