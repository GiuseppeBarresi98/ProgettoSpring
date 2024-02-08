package com.epicode.U5D2.DAO;

import com.epicode.U5D2.entities.Topping;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToppingDAO extends JpaRepository<Topping,Long> {
}
