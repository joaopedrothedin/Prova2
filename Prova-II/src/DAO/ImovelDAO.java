/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import MODEL.Imovel;
import MODEL.TipoImovel;
import java.sql.SQLException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author JoaoPedroThedin
 */
public class ImovelDAO {
       
    
    public void cadastrar(Object o) throws SQLException {
        Imovel imovel = (Imovel) o;  
        EntityManager em = FabricaConexao.getConexao().createEntityManager();
        em.getTransaction().begin();
        em.persist(imovel);
        em.getTransaction().commit();
        em.close();
        
    }

    public void alterar(Object o) throws SQLException {
        Imovel imovel = (Imovel) o;        
        EntityManager em = FabricaConexao.getConexao().createEntityManager();
        em.getTransaction().begin();
        em.merge(imovel);
        em.getTransaction().commit();
        em.close();
    }
    
        public List listarTodos() throws SQLException {
        
        EntityManager em = FabricaConexao.getConexao().createEntityManager();
        TypedQuery<Imovel> consulta = em.createQuery("SELECT i FROM Imovel i",Imovel.class);
        List<Imovel> categoria = consulta.getResultList();
        em.close();
        return categoria;
    }

} 
