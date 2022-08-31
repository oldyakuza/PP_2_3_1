package web.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;
import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<User> listAll() {
        TypedQuery<User> tQuery = entityManager.createQuery("from User", User.class);
        return tQuery.getResultList();
    }
    @Transactional
    @Override
    public void add(User user) {
        entityManager.persist(user);
    }
    @Transactional
    @Override
    public void remove(long id) {
        User user = entityManager.find(User.class, id);
        entityManager.remove(user);
    }
    @Transactional
    @Override
    public void update(long id, User user) {
        User updatedUser = entityManager.find(User.class, id);
        updatedUser.setName(user.getName());
    }
    @Override
    public User getUserById(long id) {
        return entityManager.find(User.class, id);
    }
}
