/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bantulfutsal;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author samsi
 */
@Entity
public class pelanggan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String Nama_Pelanggan;
    private String Alamat_Pelanggan;
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof pelanggan)) {
            return false;
        }
        pelanggan other = (pelanggan) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bantulfutsal.langganan[ id=" + id + " ]";
    }
     public String getNama_pelanggan() {
        return Nama_Pelanggan;
    }

    /**
     * @param Nama_pelanggan the NTpelanggan to set
     */
    public void setNama_pelanggan(String Nama_pelanggan) {
        this.Nama_Pelanggan = Nama_pelanggan;
    }

    /**
     * @return the Alamat_pelanggan
     */
    public String getAlamat_pelanggan() {
        return Alamat_Pelanggan;
    }

    /**
     * @param Alamat_pelanggan the Alamat_pelanggan to set
     */
    public void setAlamat_pelanggan(String Alamat_pelanggan) {
        this.Alamat_Pelanggan = Alamat_Pelanggan;

}

}
