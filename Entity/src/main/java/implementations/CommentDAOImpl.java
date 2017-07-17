package implementations;


import entity.Comments;
import hibernateFactory.HibernateSessionFactory;
import interfaces.CommentDAO;
import org.hibernate.Session;

import java.sql.SQLException;

public class CommentDAOImpl implements CommentDAO {


    @Override
    public void addComment(Comments comments) throws SQLException {
        try (Session session = HibernateSessionFactory.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.save((comments));
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void updateComment(Comments comments) throws SQLException {
        try (Session session = HibernateSessionFactory.getSessionFactory().openSession();) {
            session.beginTransaction();
            session.update(comments);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteComment(Comments comments) throws SQLException {

        try (Session session = HibernateSessionFactory.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.delete((comments));
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}