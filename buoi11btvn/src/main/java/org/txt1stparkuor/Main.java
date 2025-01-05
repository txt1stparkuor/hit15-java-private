package org.txt1stparkuor;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.txt1stparkuor.entity.Category;
import org.txt1stparkuor.entity.EntityManagerUtil;
import org.txt1stparkuor.entity.Product;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

public class Main {
    static EntityManager entityManager= EntityManagerUtil.getEntityManager();
    static Scanner scanner=new Scanner(System.in);
    static CriteriaBuilder builder=entityManager.getCriteriaBuilder();
    public static void main(String[] args) {
        while (true) {
            System.out.print("1.Add category\n"
                    + "2.Delete category\n"
                    + "3.Update category\n"
                    + "4.View all categories\n"
                    + "5.Add product\n"
                    + "6.Delete product\n"
                    + "7.Update product\n"
                    + "8.Find product by name\n"
                    + "9.Exit\n");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    addCategory();
                    break;
                case 2:
                    deleteCategory();
                    break;
                case 3:
                    updateCategory();
                    break;
                case 4:
                    viewAllCategories();
                    break;
                case 5:
                    addProduct();
                    break;
                case 6:
                    deleteProduct();
                    break;
                case 7:
                    updateProduct();
                    break;
                case 8:
                    findProductByName();
                    break;
                case 9:
                    System.out.println("Exiting...");
                    entityManager.close();
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }

    private static void addCategory() {
        entityManager.getTransaction().begin();
        System.out.print("Enter name: ");
        String name=scanner.nextLine();
        System.out.print("Enter description: ");
        String description=scanner.nextLine();
        Category category=new Category(name,description);
        entityManager.persist(category);
        entityManager.getTransaction().commit();
    }

    private static void deleteCategory() {
        entityManager.getTransaction().begin();
        System.out.print("Enter the id of the category you want to delete: ");
        String id=scanner.nextLine();
        Category category=entityManager.find(Category.class,id);
        if (category!=null) entityManager.remove(category);
        entityManager.getTransaction().commit();
    }

    private static void updateCategory() {
        entityManager.getTransaction().begin();
        System.out.print("Enter the id of the category you want to update: ");
        String id = scanner.nextLine();
        Category category = entityManager.find(Category.class, id);
        if (category != null) {
            System.out.print("Enter new category name (press Enter to skip): ");
            String newName = scanner.nextLine();
            if (!newName.isBlank()) category.setName(newName);

            System.out.print("Enter new category description (press Enter to skip): ");
            String newDescription = scanner.nextLine();
            if (!newDescription.isBlank()) category.setDescription(newDescription);

            entityManager.merge(category);
        }
        entityManager.getTransaction().commit();
    }
    private static void viewAllCategories() {
        TypedQuery<Category> query=entityManager.createQuery("select c from Category c", Category.class);
        List<Category> categories=query.getResultList();
        System.out.printf("|%-50s|%-30s|%-30s|\n", "Id" , "Name" , "Description");
        for (Category category: categories)
            System.out.printf("|%-50s|%-30s|%-30s|\n", category.getId() , category.getName() , category.getDescription());
    }

    private static void addProduct() {
        entityManager.getTransaction().begin();
        System.out.print("Enter product name: ");
        String name=scanner.nextLine();
        System.out.print("Enter product price: ");
        String priceInput = scanner.nextLine();
        BigDecimal price = new BigDecimal(priceInput);
        System.out.print("Enter product description: ");
        String description=scanner.nextLine();
        System.out.print("Enter product quantity: ");
        int quantity=scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter category id: ");
        String categoryId=scanner.nextLine();
        Category category=entityManager.find(Category.class,categoryId);
        if(category!=null) {
            Product product=new Product(name,price,description,quantity,category);
            entityManager.persist(product);
        }
        entityManager.getTransaction().commit();
    }

    private static void deleteProduct(){
        entityManager.getTransaction().begin();
        System.out.print("Enter the id of the product you want to delete: ");
        String id=scanner.nextLine();
        Product product=entityManager.find(Product.class,id);
        if(product!=null) entityManager.remove(product);
        entityManager.getTransaction().commit();
    }

    private static void updateProduct() {
        entityManager.getTransaction().begin();
        System.out.print("Enter the id of the product you want to update: ");
        String id = scanner.nextLine();
        Product product = entityManager.find(Product.class, id);
        if (product != null) {
            System.out.print("Enter new product name (press Enter to skip): ");
            String name = scanner.nextLine();
            if (!name.isBlank()) product.setName(name);

            System.out.print("Enter new product price (press Enter to skip): ");
            String price = scanner.nextLine();
            if (!price.isBlank()) product.setPrice(new BigDecimal(price));

            System.out.print("Enter new product description (press Enter to skip): ");
            String description = scanner.nextLine();
            if (!description.isBlank()) product.setDescription(description);

            System.out.print("Enter new product quantity (press Enter to skip): ");
            String quantity = scanner.nextLine();
            if (!quantity.isBlank()) product.setQuantity(Integer.parseInt(quantity));

            System.out.print("Enter new category name (press Enter to skip): ");
            String categoryName = scanner.nextLine();
            if (!categoryName.isBlank()) {
                Category category = entityManager.find(Category.class, categoryName);
                if (category != null) {
                    product.setCategory(category);
                }
            }

            entityManager.merge(product);
        }
        entityManager.getTransaction().commit();
    }
    //    Product : id(UUID), name, price, description, quantity
    private static void findProductByName() {
        System.out.print("Enter product name to search for: ");
        String name=scanner.nextLine();
        TypedQuery<Product> query=entityManager.createQuery(
                "select p from Product p where p.name like :name",Product.class
        );
        query.setParameter("name", "%" + name + "%");
//        System.out.printf("|%-50s|%-30s|%-30s|", "Id" , "Name" , "Description");
        System.out.printf("|%-50s|%-30s|%-15s|%-30s|%-10s|%-30s|\n",
                "id","product_name","price","product_description","quantity","category_name");
        List<Product> products=query.getResultList();
        for (Product product: products) {
            System.out.printf("|%-50s|%-30s|%-15f|%-30s|%-10d|%-30s|\n",
                    product.getId(),product.getName(),
                    product.getPrice(),product.getDescription(),
                    product.getQuantity(),product.getCategory().getName());
        }
    }

}