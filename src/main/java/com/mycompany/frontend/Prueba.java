/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.frontend;

import clientews.servicio.INoteDao;
import clientews.servicio.IUserDao;
import clientews.servicio.Note;
import clientews.servicio.NoteDaoService;
import clientews.servicio.User;
import clientews.servicio.UserDaoService;
import java.util.List;

/**
 *
 * @author fabri
 */
public class Prueba {

    public static void main(String[] args) {
        IUserDao us = new UserDaoService().getUserDaoPort();
        List l = us.getAll();

        INoteDao no = new NoteDaoService().getNoteDaoPort();
        List l2 = no.getAllN();

        User u = (User) l.get(0);
        System.out.println(u.getEmail());

        Note un = (Note) l2.get(0);
        System.out.println(u.getEmail());
        System.out.println(un.getContent());
    }
}
