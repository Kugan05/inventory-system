package com.example.inventory.service;

import com.example.inventory.model.Item;
import com.example.inventory.repository.ItemRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ItemService {
    private final ItemRepository repo;

    public ItemService(ItemRepository repo) {
        this.repo = repo;
    }

    public List<Item> getAll() {
        return repo.findAll();
    }

    public Item add(Item item) {
        return repo.save(item);
    }

    public Item update(Long id, Item item) {
        return repo.findById(id)
                .map(existing -> {
                    existing.setName(item.getName());
                    existing.setPrice(item.getPrice());
                    existing.setQuantity(item.getQuantity());
                    return repo.save(existing);
                })
                .orElse(null);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
