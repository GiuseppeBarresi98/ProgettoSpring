package com.epicode.U5D2.DAO;

import com.epicode.U5D2.entities.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaDAO extends JpaRepository<Pizza,Long> {
}
