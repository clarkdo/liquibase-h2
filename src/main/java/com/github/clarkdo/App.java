package com.github.clarkdo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
@EnableAutoConfiguration
public class App {

    private static final Logger log = LoggerFactory.getLogger(App.class);

    /**
     * Main method, used to run the application.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(App.class);
        Environment env = app.run(args).getEnvironment();
        log.info("\n----------------------------------------------------------\n\t"
                + "Application '{}' is running! H2 Console URL:\n\t" + "Local: \t\t"
                + "http://127.0.0.1:{}{}\n"
                + "----------------------------------------------------------\n",
            env.getProperty("spring.application.name"),
            env.getProperty("server.port"),
            env.getProperty("spring.h2.console.path"));
    }
}
