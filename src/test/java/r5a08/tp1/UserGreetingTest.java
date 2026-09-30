package r5a08.tp1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UserGreetingTest{

@Test
    public void whenUsernameValidShouldReturnGreeting() {
        //arrange
        String nom = "rayanbelq";

        //act
        String resultat = UserGreeting.formatGreeting(nom);
        
        //assert
        assertEquals("Bonjour, rayanbelq", resultat);
    }

    @Test
    public void whenUsernameIsEmptyShouldThrowException() {
        assertThrows(UserGreetingFailureException.class, () -> {
            UserGreeting.formatGreeting("");
        });
    }

    @Test
    public void whenUsernameIsTooLongShouldThrowException() {
        assertThrows(UserGreetingFailureException.class, () -> { UserGreeting.formatGreeting("rayanbelq123"); });
    }

    @Test
    public void whenUsernameHasSpaceShouldThrowException() {
        assertThrows(UserGreetingFailureException.class, () -> { UserGreeting.formatGreeting("rayan belq"); });
    }

    @Test
    public void whenUsernameHasSpecialCharsShouldThrowException() {
        assertThrows(UserGreetingFailureException.class, () -> { UserGreeting.formatGreeting("rayan@belq"); });
    }

}
