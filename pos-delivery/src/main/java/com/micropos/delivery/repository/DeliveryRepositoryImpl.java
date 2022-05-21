package com.micropos.delivery.repository;

import com.micropos.delivery.model.Entry;

import java.util.ArrayList;
import java.util.List;


public class DeliveryRepositoryImpl implements DeliveryRepository{

    private List<Entry> entries = new ArrayList<>();

    @Override
    public List<Entry> findAll(){
        return entries;
    }

    @Override
    public Entry findEntryById(int id){
        for (Entry entry : entries) {
            if (entry.getOrderId() == id) {
                return entry;
            }
        }
        return null;
    }

    @Override
    public Entry save(Entry entry){
        entry.setOrderId(entries.size());
        if (entries.add(entry)) {
            return entry;
        }
        return null;
    }
}
