/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROL;

import DAO.TipoDAO;
import MODEL.TipoImovel;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JList;

/**
 *
 * @author JoaoPedroThedin
 */
public class TipoControle {

     public void gravar(TipoImovel t, JList listaTipoImovel) throws SQLException{
        
        if(t.getId()==null){
        
            cadastrar(t, listaTipoImovel);
            
        }else{
            alterar(t, listaTipoImovel);
        
        }
    }
    public void cadastrar(TipoImovel t, JList listaTipoImovel) throws SQLException{
        TipoDAO dao = new TipoDAO();
        TipoImovel tipoimovel = new TipoImovel();
        dao.cadastrar(t);
        List categoria = dao.listarTodos();
        listaTipoImovel.setListData(tipoimovel.toArray());
       
        
    }
    
    public static void alterar(TipoImovel t, JList listaTipoImovel) throws SQLException{
        TipoDAO dao = new TipoDAO();
        TipoImovel tipoimovel = new TipoImovel();
        dao.cadastrar(t);
        List categoria = dao.listarTodos();
          listaTipoImovel.setListData(tipoimovel.toArray());
    }
        

}
