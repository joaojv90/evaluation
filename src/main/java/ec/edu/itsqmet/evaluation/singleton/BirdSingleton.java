package ec.edu.itsqmet.evaluation.singleton;

import ec.edu.itsqmet.evaluation.repository.IBirdRepository;

public class BirdSingleton {
	
	private static BirdSingleton instance;
	public static long totalBird;
	
	private BirdSingleton() {
		
	}
	
	public static BirdSingleton getInstance() {
		if(instance == null) {
			instance = new BirdSingleton();
		}
		return instance;
	}
	
	public static long getTotalBird(IBirdRepository birdRepository) {
		if (totalBird == 0) {
			totalBird = birdRepository.count();
		}
		return totalBird;
	}

}
