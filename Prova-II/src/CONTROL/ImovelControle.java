/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROL;

import DAO.ImovelDAO;
import DAO.TipoDAO;
import MODEL.Imovel;
import MODEL.TipoImovel;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JList;

/**
 *
 * @author JoaoPedroThedin
 */
public class ImovelControle {
         
    public void gravar(Imovel i, JList listaImovel) throws SQLException{
        
        if(i.getId()==null){
        
            cadastrar(i, listaImovel);
            
        }else{
            alterar(i, listaImovel);
        
        }
    }
    public void cadastrar(Imovel i, JList listaImovel) throws SQLException{
        ImovelDAO dao = new ImovelDAO();
        dao.cadastrar(i);
        List imovel = dao.listarTodos();
        listaImovel.setListData(imovel.toArray());
       
        
    }
    
    public static void alterar(Imovel i, JList listaImovel) throws SQLException{
        ImovelDAO dao = new ImovelDAO();
        Imovel imovel = new Imovel();
        dao.cadastrar(i);
        List categoria = dao.listarTodos();
        listaImovel.setListData(imovel.toArray());
    }
        
}


