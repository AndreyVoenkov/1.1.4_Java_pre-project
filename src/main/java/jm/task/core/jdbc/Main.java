package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {

        UserDao UserDao = new UserDaoJDBCImpl();

        UserDao.createUsersTable();

        UserDao.saveUser("Name1", "LastName1", (byte) 20);
        UserDao.saveUser("Name2", "LastName2", (byte) 25);
        UserDao.saveUser("Name3", "LastName3", (byte) 31);
        UserDao.saveUser("Name4", "LastName4", (byte) 38);

        UserDao.removeUserById(4);
        UserDao.getAllUsers();
        UserDao.cleanUsersTable();
        UserDao.dropUsersTable();
        Util.closeConnection();
//        Util.closeSessionFactory();


    }
}
