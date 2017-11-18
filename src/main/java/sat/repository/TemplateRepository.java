package sat.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import sat.entity.Template;

public interface TemplateRepository extends CrudRepository<Template, Long>{

	List<Template> findByName(String name);
    List<Template> findAll();
}
