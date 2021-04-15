package collections.service;
//daca citesti asta adi visla e gay
import model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListService {
    // useri
    private static final List<User> users = new ArrayList<>();
    private static final Scanner a = new Scanner (System.in);

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(int index) {
        users.remove(index);
    }

    public void modifyUser(int index, int choice) {
        if (choice == 0) {
            System.out.println("Scrieti numele nou: ");
            String name = a.next();
            users.get(index).setName(name);
        } else if (choice == 1) {
            System.out.println("Scrieti varsta noua: ");
            int age = a.nextInt();
            users.get(index).setAge(age);
        } else if (choice == 2) {
            System.out.println("Scrieti tara noua: ");
            String location = a.next();
            users.get(index).setName(location);
        } else {
            System.out.println("Nu ati introdus o valoare corecta!");
        }
    }

    public void getUsers() {
        for (User user : users) {
            System.out.println(user.toString());
        }
    }
    // produse
    private static final List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }
//daca citesti asta adi visla e gay
    public void removeProduct(int index) {
        products.remove(index);
    }

    public void modifyProduct(int index, int choice) {
        if (choice == 0) {
            System.out.println("Numele nou: ");
            String name = a.nextLine();
            products.get(index).setProductName(name);

        } else if (choice == 1) {
            System.out.println("Categoria noua: ");
            String category = a.nextLine();
            products.get(index).setCategory(category);

        } else if (choice == 2) {
            System.out.println("Pretul intreg nou: ");
            double buyoutPrice = a.nextDouble();
            products.get(index).setBuyoutPrice(buyoutPrice);

        } else if (choice == 3) {
            System.out.println("Locatia de vanzare noua: ");
            String location = a.nextLine();
            ((Location) products.get(index)).setLocation(location);

        } else if (choice == 4) {
            System.out.println("Locatiile pt. destinatie noi: ");
            boolean exit = false;
            List<String> deliveryLocations = new ArrayList<>();
            do {
                String country = a.nextLine();
                if (country.equals("exit")) {
                    exit = true;
                } else {
                    deliveryLocations.add(country);
                }
            } while (!exit);
            ((Location) products.get(index)).setDeliveryLocations(deliveryLocations);
        }

        if (products.get(index) instanceof  Vehicle) {
            if (choice == 5) {
                System.out.println("Puterea motorului noua: ");
                int kW = a.nextInt();
                ((Vehicle) products.get(index)).setkW(kW);

            } else if (choice == 6) {
                System.out.println("Viteza maxima noua: ");
                int maxSpeed = a.nextInt();
                ((Vehicle) products.get(index)).setMaxSpeed(maxSpeed);

            } else if (choice == 7) {
                System.out.println("Capacitatea motorului noua: ");
                double engineCapacity = a.nextDouble();
                ((Vehicle) products.get(index)).setEngineCapacity(engineCapacity);

            } else if (choice == 8) {
                System.out.println("Daca are inductie fortata: ");
                boolean hasForcedInduction = a.nextBoolean();
                ((Vehicle) products.get(index)).setForceInducted(hasForcedInduction);
            }
        } else if (products.get(index) instanceof Other) {
            if (choice == 5) {
                System.out.println("Cantitatea noua: ");
                int quantity = a.nextInt();
                ((Other) products.get(index)).setQuantity(quantity);

            } else if (choice == 6) {
                System.out.println("Greutatea noua: ");
                double weight = a.nextDouble();
                ((Other) products.get(index)).setWeight(weight);

            } else if (choice == 7) {
                System.out.println("Modul de impachetare nou: ");
                String packagingType = a.nextLine();
                ((Other) products.get(index)).setPackagingType(packagingType);
            }
        }
        if (choice < 0 || choice > 8) {
            System.out.println("Nu ati introdus o valoare corecta!");
        }

    }

    public Product getProduct(int index) {
        return products.get(index);
    }

    public void getProducts() {
        for (Product product : products) {
            System.out.println(product.toString());
        }
    }
}