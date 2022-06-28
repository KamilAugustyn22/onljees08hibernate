package pl.coderslab;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class PersonDetailsDao {
    @PersistenceContext
    private EntityManager entityManager;

    public void save(PersonDetails details){
        entityManager.persist(details);
    }
    public PersonDetails findById(PersonDetails details){
        return entityManager.find(PersonDetails.class, details.getId());
    }
    public void edit(PersonDetails details){
        entityManager.merge(details);
    }
    public void delete(PersonDetails details){
        entityManager.remove(entityManager.contains(details) ?
                details : entityManager.merge(details));
    }
}
