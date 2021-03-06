package es.salesianos.service;

import java.util.List;

import es.salesianos.model.Owner;
import es.salesianos.repository.Repository;
import es.salesianos.utils.DateConverter;

public class ListService {
	private Repository repository = new Repository();
	private DateConverter converter = new DateConverter();
	
	public List<Owner> listAllOwners() {
		return repository.searchAll();
	}
}
