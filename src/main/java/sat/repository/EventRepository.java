package sat.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import sat.entity.Event;

public interface EventRepository extends CrudRepository <Event, Long>{

	 List<Event> findByTitle(String title);
	 List<Event> findAll();

}
