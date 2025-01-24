import com.lrnSpring.learnSpring_Framework.game.GameRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App01GameSpringBeans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			var context = new AnnotationConfigApplicationContext(GamingConfiguration.class);
			 context.getBean(GameRunner.class).run();
	}

}
