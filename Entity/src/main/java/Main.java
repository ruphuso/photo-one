import hibernateFactory.Factory;
import entity.User;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        User defaultUser = new User();
        System.out.println("Имя пользователя");
        defaultUser.setName(scanner.nextLine());
        System.out.println("Логин");
        defaultUser.setLogin(scanner.nextLine());
        System.out.println("Пароль");
        defaultUser.setPassword(scanner.next());

            try {
                Factory.getInstance().getUserDAO().addUser(defaultUser);
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
}
