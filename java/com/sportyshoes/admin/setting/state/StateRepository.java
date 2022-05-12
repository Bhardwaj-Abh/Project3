package com.sportyshoes.admin.setting.state;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sportyshoes.common.entity.Country;
import com.sportyshoes.common.entity.State;

public interface StateRepository extends CrudRepository<State, Integer> {
	
	public List<State> findByCountryOrderByNameAsc(Country country);
}
