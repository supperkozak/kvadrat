package kvadrat.dao.implementation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import kvadrat.dao.DataDao;
import kvadrat.model.Data;

@Repository
public class DataDaoImpl implements DataDao {
	@PersistenceContext(unitName = "Primary")
	private EntityManager em;
	
	public EntityManager getEm() {
		return em;
	}
	
	public void setEm(EntityManager em) {
		this.em = em;
	}
	
	@Transactional
	public void insertData(Data data) {
		em.persist(data);
	}

	@Transactional
	public List<Data> getAllData() {
		return em.createQuery("from Data").getResultList();
	}

}
