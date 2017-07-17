package hibernateFactory;

import implementations.CommentDAOImpl;
import implementations.ImageDAOImpl;
import implementations.UserDAOImpl;
import interfaces.CommentDAO;
import interfaces.ImageDAO;
import interfaces.UserDAO;

public class Factory {

    private static UserDAO userDAO = null;
    private static ImageDAO imageDAO = null;
    private static CommentDAO commentDAO = null;

    private static Factory instance = null;

    public static synchronized Factory getInstance() {
        if (instance == null) {
            instance = new Factory();
        }
        return instance;
    }

    public UserDAO getUserDAO() {
        if (userDAO == null) {
            userDAO = new UserDAOImpl();
        }
        return userDAO;
    }
    public ImageDAO getImageDAO() {
        if (imageDAO == null) {
            imageDAO = new ImageDAOImpl();
        }
        return imageDAO;
    }

    public CommentDAO getCommentDAO() {
        if (commentDAO == null) {
            commentDAO = new CommentDAOImpl();
        }
        return commentDAO;
    }


}