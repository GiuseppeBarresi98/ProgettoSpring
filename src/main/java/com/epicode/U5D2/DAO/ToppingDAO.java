package com.epicode.U5D2.DAO;

import com.epicode.U5D2.entities.Topping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ToppingDAO extends JpaRepository<Topping,Long> {

    @Query("SELECT t FROM Topping t WHERE t.id <=100")
    List<Topping> filtraPerIdMinoreDiCento();
}
