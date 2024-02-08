package com.epicode.U5D2.Service;


import com.epicode.U5D2.DAO.ToppingDAO;
import com.epicode.U5D2.entities.Topping;
import com.epicode.U5D2.exception.ItemNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ToppingService {
    @Autowired
    private ToppingDAO toppingDAO;

    public void saveTopping(Topping top){
        toppingDAO.save(top);
    }

    public Topping findToppingById(long id) throws ItemNotFoundException {
        return toppingDAO.findById(id).orElseThrow(()-> new ItemNotFoundException(id));
    }

    public void findAndDelete(long id){
        Topping topping = this.findToppingById(id);
        toppingDAO.delete(topping);
    }


}
