package choicehotels.wk2sbrestapitutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// meta-annotation that pulls in component scanning, autoconfiguration, and property support
@SpringBootApplication
public class Wk2SbRestApiTutorialApplication {

	public static void main(String[] args) {
		// This is the class that contains the run method
		SpringApplication.run(Wk2SbRestApiTutorialApplication.class, args);
	}

}
