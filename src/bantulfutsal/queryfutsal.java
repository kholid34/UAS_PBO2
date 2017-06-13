/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bantulfutsal;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

/**
 *
 * @author samsi
 */
public class QueryFutsal {

    public void Add (Object object){
        
        EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("perhotelanPU");
        EntityManager em = emf.createEntityManager();  
        em.getTransaction().begin();
        try {
                em.persist(object);
                em.getTransaction().commit();
        } catch (Exception e) {
                e.printStackTrace();
                em.getTransaction().rollback();
        } finally {
                em.close();
        }
    }
    
    public void update(long id,String nama_tamu,String alamat_tamu){
        EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("perhotelanPU");
        EntityManager em = emf.createEntityManager();  
        em.getTransaction().begin();
        em.createQuery("UPDATE pelanggan e SET e.Nama_pelanggan=?1,e.Alamat_pelanggan=?2 WHERE e.id=?3",pelanggan.class)
                .setParameter(1, nama_pelanggan)
                .setParameter(2, alamat_pelanggan)
                .setParameter(3,id)
                .executeUpdate();       
        em.getTransaction().commit();
  }
    
    
public void hapus(long id){
        EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("bantulfutsalPU");
        EntityManager em = emf.createEntityManager();  
        em.getTransaction().begin();
        int hapusyu=em.createQuery("DELETE FROM Tamu e WHERE e.id=:par").setParameter("par", id).executeUpdate();
        em.getTransaction().commit();
}
  public void Show() {
        EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("bantulfutsalPU");
        EntityManager em = emf.createEntityManager();
        Query query = em.createQuery("SELECT e FROM pelanggan e");
        List<pelanggan> result = query.getResultList();
        for (pelanggan e : result) {
                 System.out.println("ID pelanggan :"+ e.getId() + "\n NAMA :" + e.getNama_Tamu()+"\n Alamat :"+ e.getAlamat_pelanggan());   
        }
  }
}
