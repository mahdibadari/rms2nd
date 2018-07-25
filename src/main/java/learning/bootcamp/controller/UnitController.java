package learning.bootcamp.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

import learning.bootcamp.model.Unit;
import learning.bootcamp.service.UnitService;

@RestController
@RequestMapping("/api")
public class UnitController{
    UnitService unitService;

    @GetMapping("/units")
    public List<Unit> getAllUnits() {
        return unitService.getAll();
    }

    @PostMapping("/units")
    public void createUnit (@Valid @RequestBody Unit unit)
    {
        unitService.save(unit);
    }

    @GetMapping("/units/{id}")
    public Unit getUnitbyId (@PathVariable(value = "unitId") int unitId){
        return unitService.getById(unitId);
    }

    @PostMapping("/units/{id}")
    public void updateUnit (@PathVariable(value = "unitId") int unitId, @Valid @RequestBody Unit unitNewDetails){
        Unit unit = unitService.getById(unitId);
        unit.setBblvl(unitNewDetails.getBblvl());
        unit.setExp(unitNewDetails.getExp());
        unitService.save(unit);
    }

    @DeleteMapping("/units/{id}")
    public void deleteUnit(@PathVariable(value = "unitId") int unitId){
       Unit unit = unitService.getById(unitId);
       unitService.delete(unit);
    }



}