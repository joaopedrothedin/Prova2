/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import MODEL.TipoImovel;
import java.sql.SQLException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author JoaoPedroThedin
 */
public class TipoDAO {
    
    public void cadastrar(Object o) throws SQLException {
        TipoImovel tipoimovel = (TipoImovel) o;  
        EntityManager em = FabricaConexao.getConexao().createEntityManager();
        em.getTransaction().begin();
        em.persist(tipoimovel);
        em.getTransaction().commit();
        em.close();
        
    }

    public void alterar(Object o) throws SQLException {
        TipoImovel tipoimovel = (TipoImovel) o;        
        EntityManager em = FabricaConexao.getConexao().createEntityManager();
        em.getTransaction().begin();
        em.merge(tipoimovel);
        em.getTransaction().commit();
        em.close();
    }
    
        public List listarTodos() throws SQLException {
        
        EntityManager em = FabricaConexao.getConexao().createEntityManager();
        TypedQuery<TipoImovel> consulta = em.createQuery("SELECT t FROM TipoImovel T",TipoImovel.class);
        List<TipoImovel> categoria = consulta.getResultList();
        em.close();
        return categoria;
    }

}
