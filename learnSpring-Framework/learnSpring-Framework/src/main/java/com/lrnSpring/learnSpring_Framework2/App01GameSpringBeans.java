package com.lrnSpring.learnSpring_Framework2;

import com.lrnSpring.learnSpring_Framework.game.GameRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.lrnSpring.learnSpring_Framework.game")
public class App01GameSpringBeans {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			var context = new AnnotationConfigApplicationContext(App01GameSpringBeans.class);
			 context.getBean(GameRunner.class).run();
	}

}
