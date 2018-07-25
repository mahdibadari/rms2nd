package learning.bootcamp.service;

import java.util.List;

import learning.bootcamp.model.Unit;

public interface UnitService{
    public void save(Unit unit);
	//Read
	public Unit getById(int unitId);
	//Update
	public void update(Unit unit);
	//Delete
	public void delete(Unit unit);
	//Get All
	public List<Unit> getAll();
}