package com.micropos.delivery.repository;

import com.micropos.delivery.model.Entry;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DeliveryRepository<Entry, Integer> {
    List<Entry> findAll();
    Entry findEntryById(int id);
    com.micropos.delivery.model.Entry save(com.micropos.delivery.model.Entry entry);
}
