package bd2.repositories.spring;

import org.springframework.data.repository.CrudRepository;

import bd2.model.Provider;

public interface ProviderRepository extends CrudRepository<Provider, Long> {
	
	public Provider findByCuit(long cuit);

}
