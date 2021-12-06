/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.frontend;

import clientews.servicio.*;
import java.util.List;

/**
 *
 * @author fabri
 */
public class Pruebas1 {

    public static void main(String[] args) {
        IUserDao no = new UserDaoService().getUserDaoPort();
        List l = no.getAll();
        //Pendiente no se puede convertir el objeto
        //User u = (User) l.get(0);

        System.out.println(no.getAll());

    }
}
