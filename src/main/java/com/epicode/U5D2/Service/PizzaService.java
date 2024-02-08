package com.epicode.U5D2.Service;


import com.epicode.U5D2.DAO.PizzaDAO;
import com.epicode.U5D2.entities.Pizza;
import com.epicode.U5D2.exception.ItemNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Slf4j
@Service
public class PizzaService {

    @Autowired
    private PizzaDAO pizzaDAO;

    public void savePizza(Pizza pizza){
        pizzaDAO.save(pizza);
        log.info("Pizza salvata con successo");
    }

    public Pizza findPizzaById(long id) throws ItemNotFoundException {
       return pizzaDAO.findById(id).orElseThrow(()-> new ItemNotFoundException(id));
    }

    public List<Pizza> findAll(){
        return pizzaDAO.findAll();
    }

    public void findAndDelete(long id){
        Pizza pizza = findPizzaById(id);
        pizzaDAO.delete(pizza);

    }
}
