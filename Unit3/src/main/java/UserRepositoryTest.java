// Задание 3
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRepositoryTest {

    @Test
    public void testLogoutUsersExceptAdmins() {

        List<User> users = new ArrayList<>();
        users.add(new User("user1", false));
        users.add(new User("user2", true));
        users.add(new User("user3", false));
        users.add(new User("user4", true));

        UserRepository userRepository = new UserRepository();
        userRepository.setUsers(users);

        userRepository.logoutUsersExceptAdmins();

        // Проверяем, что только пользователи без админских прав были разлогинены
        Assertions.assertFalse(users.get(0).isLoggedIn()); 
        Assertions.assertTrue(users.get(1).isLoggedIn());
        Assertions.assertFalse(users.get(2).isLoggedIn());
        Assertions.assertTrue(users.get(3).isLoggedIn());
    }
}
