package learning.bootcamp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import learning.bootcamp.model.Unit;
import learning.bootcamp.repository.UnitRepository;

@Service("unitService")
public class UnitServiceImpl implements UnitService{

    @Autowired
    private UnitRepository unitRepository;
    
    @Override
    public void save(Unit unit){
        unitRepository.save(unit);
    }
	//Read
    @Override
	public Unit getById(int unitId){
        return unitRepository.findbyUnitId(unitId);
    }
	//Update
    @Override
	public void update(Unit unit){
        unitRepository.save(unit);
    }
	//Delete
    @Override
	public void delete(Unit unit){
        unitRepository.delete(unit);
    }
    //Get All
    @Override
	public List<Unit> getAll(){
        return unitRepository.findAll();
    }
}