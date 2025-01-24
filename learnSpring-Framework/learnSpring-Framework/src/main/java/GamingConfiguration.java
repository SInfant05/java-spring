import com.lrnSpring.learnSpring_Framework.game.GameConsole;
import com.lrnSpring.learnSpring_Framework.game.GameRunner;
import com.lrnSpring.learnSpring_Framework.game.PacmanGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

    @Bean
    public GameConsole game() {
        return new PacmanGame();
    }

    @Bean
    public GameRunner gameRunner(GameConsole game) {
        return new GameRunner(game);
    }
}
