package com.lazyvic.tacos.data;

import org.springframework.data.repository.CrudRepository;

import com.lazyvic.tacos.TacoOrder;

public interface OrderRepository 
         extends CrudRepository<TacoOrder, Long> {

}
