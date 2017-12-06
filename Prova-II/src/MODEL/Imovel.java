/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 *
 * @author JoaoPedroThedin
 */
@Entity
public class Imovel implements Serializable {

    private static long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String descricao;
    private String areac;
    private String areat;
    @ManyToMany
    private TipoImovel tipoimovel;
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (getId() != null ? getId().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Imovel)) {
            return false;
        }
        Imovel other = (Imovel) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MODEL.Imovel[ id=" + getId() + " ]";
    }

    /**
     * @return the serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    /**
     * @param aSerialVersionUID the serialVersionUID to set
     */
    public static void setSerialVersionUID(long aSerialVersionUID) {
        serialVersionUID = aSerialVersionUID;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }
    
     public Object[] toArray() {
     return null;   
    }
    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the areac
     */
    public String getAreac() {
        return areac;
    }

    /**
     * @param areac the areac to set
     */
    public void setAreac(String areac) {
        this.areac = areac;
    }

    /**
     * @return the areat
     */
    public String getAreat() {
        return areat;
    }

    /**
     * @param areat the areat to set
     */
    public void setAreat(String areat) {
        this.areat = areat;
    }

    /**
     * @return the tipoimovel
     */
    public TipoImovel getTipoimovel() {
        return tipoimovel;
    }

    /**
     * @param tipoimovel the tipoimovel to set
     */
    public void setTipoimovel(TipoImovel tipoimovel) {
        this.tipoimovel = tipoimovel;
    }
    
}
