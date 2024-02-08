package com.epicode.U5D2.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Topping extends Item {
	@Column
	private String name;

	@ManyToMany
	@JoinTable(name = "pizza_topping",joinColumns = @JoinColumn(name="topping_id"),inverseJoinColumns = @JoinColumn(name = "pizza_id"))
	private List<Pizza> lista_pizze;

	public Topping(String name, int calories, double price) {
		super(calories, price);
		this.name = name;
	}

	@Override
	public String toString() {
		return "Topping{" +
				"name='" + name + '\'' +
				", calories=" + calories +
				", price=" + price +
				'}';
	}
}
