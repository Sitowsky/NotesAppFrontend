/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.frontend;

import clientews.servicio.IUserDao;
import clientews.servicio.User;
import clientews.servicio.UserDaoService;
import java.util.List;

/**
 *
 * @author fabri
 */
public class Usuarios {
    public static void main(String[] args) {
        IUserDao us = new UserDaoService().getUserDaoPort();
        List l = us.getAll();

        User u = (User) l.get(1);
        System.out.println(u.getEmail());
    }
}
