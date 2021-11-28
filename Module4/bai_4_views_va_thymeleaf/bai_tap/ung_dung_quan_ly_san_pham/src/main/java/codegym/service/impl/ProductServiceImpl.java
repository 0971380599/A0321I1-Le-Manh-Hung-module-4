package codegym.service.impl;

import codegym.model.Product;
import codegym.service.ProductService;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService {
    public static List<Product> products = new ArrayList<>();
    static {
        products.add(new Product(1, "iphone 11","14000000", 7, "full box"));
        products.add(new Product(2, "iphone 11 pro","17000000", 5, "full box"));
        products.add(new Product(3, "iphone 11 pro max","20000000", 9, "full box"));
        products.add(new Product(4, "iphone 12","18000000", 10, "full box"));
        products.add(new Product(5, "iphone 12 pro","21000000", 5, "full box"));
        products.add(new Product(6, "iphone 12 pro max","24000000", 11, "full box"));
    }
    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public void save(Product product) {
        products.add(product);
    }

    @Override
    public Object findById(int id) {
        Product product = null;
        for (Product product1: products) {
            if (product1.getProductID() == id) {
                product = product1;
            }
        }
        return product;
    }

    @Override
    public void update(int id,Product product) {
        for (int i = 0; i<products.size(); i++) {
            if(products.get(i).getProductID() ==id){
                products.get(i).setProductName(product.getProductName());
                products.get(i).setProductPrice(product.getProductPrice());
                products.get(i).setProductQuantity(product.getProductQuantity());
                products.get(i).setProductStatus(product.getProductStatus());
            }
        }
    }
}
