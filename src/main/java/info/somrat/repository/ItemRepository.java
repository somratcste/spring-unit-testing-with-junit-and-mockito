package info.somrat.repository;

import info.somrat.entity.Item;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer>{

}
