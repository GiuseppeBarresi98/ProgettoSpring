package com.epicode.U5D2.Service;

import com.epicode.U5D2.DAO.DrinkDAO;
import com.epicode.U5D2.entities.Drink;
import com.epicode.U5D2.exception.ItemNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Slf4j
@Service
public class DrinkService {
    @Autowired
    private DrinkDAO drinkDAO;

    public void saveDrink(Drink drink){
        drinkDAO.save(drink);
        log.info("Drink salvato con successo");
    }

    public Drink findById(long id) throws ItemNotFoundException {
        return drinkDAO.findById(id).orElseThrow(()-> new ItemNotFoundException(id));
    };

    public List<Drink> findAll(){
        return drinkDAO.findAll();
    }

    public void findByIdAndDelete(long id){
       Drink drink = this.findById(id);
       drinkDAO.delete(drink);
       log.info("Drink eliminato con successo");
    }


}
