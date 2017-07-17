package interfaces;

import entity.Comments;

import java.sql.SQLException;

public interface CommentDAO {
    public void addComment(Comments comments) throws SQLException;
    public void updateComment(Comments comments) throws SQLException;
    public void deleteComment(Comments comments) throws SQLException;
}