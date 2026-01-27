package ca.tetervak.flowerdata.repository;

import ca.tetervak.flowerdata.model.Flower;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlowerDataRepository extends JpaRepository<Flower,String> {
}
