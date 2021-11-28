package codegym.service;

import codegym.model.Product;

import java.util.List;

public interface ProductService {
    public List<Product> findAll();
    public void save(Product product);
    Object findById(int id);
    void update(int id,Product product);
}
