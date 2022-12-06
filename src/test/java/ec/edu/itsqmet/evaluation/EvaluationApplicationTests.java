package ec.edu.itsqmet.evaluation;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import ec.edu.itsqmet.evaluation.repository.IBirdRepository;
import ec.edu.itsqmet.evaluation.singleton.BirdSingleton;

@SpringBootTest
class EvaluationApplicationTests {
	
	@Autowired
	private IBirdRepository birdRepository;

	@Test
	void contextLoads() {
		
		for(int i=0; i <= 5; i++) {
			System.out.println(BirdSingleton.getTotalBird(birdRepository));
		}
		
	}

}
