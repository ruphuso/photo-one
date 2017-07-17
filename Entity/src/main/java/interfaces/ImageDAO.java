package interfaces;


import entity.Image;

import java.sql.SQLException;

public interface ImageDAO <T extends Image> {
    public void addImage(T image) throws SQLException;
    public void deleteImage(T image) throws SQLException;
    public void updateImage(T image) throws SQLException;

}
