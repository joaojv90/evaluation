package ec.edu.itsqmet.evaluation.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "birdCategory")
public class BirdDTO {
	
	@Id
	private Integer id;
	private String name;

}
