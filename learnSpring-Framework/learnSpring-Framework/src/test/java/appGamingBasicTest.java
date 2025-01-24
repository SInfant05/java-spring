import com.lrnSpring.learnSpring_Framework.game.GameRunner;
import com.lrnSpring.learnSpring_Framework.game.MarioGame;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

class AppGamingBasicTest {

    /**
     * Tests the main behavior of GameRunner with MarioGame.
     */
    @Test
    void testGameRunnerWithMarioGame() {
        // Arrange: Mock the MarioGame instance
        MarioGame mockedMarioGame = Mockito.mock(MarioGame.class);

        // Act: Create a GameRunner and execute its run() method
        GameRunner runner = new GameRunner(mockedMarioGame);
        runner.run();

        // Assert: Verify that all game methods were called exactly once
        verify(mockedMarioGame, times(1)).up();
        verify(mockedMarioGame, times(1)).down();
        verify(mockedMarioGame, times(1)).left();
        verify(mockedMarioGame, times(1)).right();
    }
}