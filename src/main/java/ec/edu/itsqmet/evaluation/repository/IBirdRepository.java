package ec.edu.itsqmet.evaluation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.itsqmet.evaluation.dto.BirdDTO;

public interface IBirdRepository extends JpaRepository<BirdDTO, Integer>{

}
