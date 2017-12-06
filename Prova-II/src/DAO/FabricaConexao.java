/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author JoaoPedroThedin
 */
public class FabricaConexao {
     private static EntityManagerFactory emf;
    public static EntityManagerFactory getConexao(){
        if(emf==null){
            emf=Persistence.createEntityManagerFactory("Prova-IIPU");
        }
        return emf;
    }
}
