package com.in28minutes.learn_spring_framework;

import com.in28minutes.learn_spring_framework.game.GameRunner;
import com.in28minutes.learn_spring_framework.game.GamingConsole;
import com.in28minutes.learn_spring_framework.game.PacmanGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {
    @Bean
    public GamingConsole game() {
        var game= new PacmanGame();
        return game;
    }
    @Bean
    public GameRunner gameRunner(GamingConsole game) {
        var gamaRunner = new GameRunner(game);
        return gamaRunner;
    }

////         var game = new MarioGame();
////       var game = new SuperContraGame();
//        var game = new PacmanGame();
//        var gameRunner = new GameRunner(game); //wiring of dependencies
//        // Game is a Dependency of GameRunner.
//        gameRunner.run();
}
