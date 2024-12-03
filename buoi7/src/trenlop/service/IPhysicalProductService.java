package trenlop.service;

import trenlop.model.Product;

import java.util.Scanner;

public interface IProductService {
    boolean addProduct(Scanner scanner);
    void displayProduct();
    void findByProDuctName(Scanner scanner);
    void updateProductById(Scanner scanner);
}
