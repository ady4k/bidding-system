package service;

import collections.service.ListService;
import model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainService  {
    private final Scanner a = new Scanner (System.in);

    private static final ListService lstSrv = new ListService();

    public int choice() {
        System.out.println("""
                            Selecteaza una dintre:
                            1) Utilizator
                            2) Produs
                            3) Licitatie
                            """);
        return a.nextInt();
    }

    public void addObject(int val) {
        if (val == 1) {
            addUser();
        } else if (val == 2) {
            addProduct();
        } else if (val == 3) {
            addBid();
        } else {
            System.out.println("Valoare invalida!");
        }
    }

    public void addUser(){
        System.out.print("Numele: ");
        String nume = a.nextLine();

        System.out.print("Varsta: ");
        int age = a.nextInt();

        System.out.print("Tara: ");
        String location = a.nextLine();

        System.out.print("Alege nivelul de admin:\n1 - utilizator normal\n2 - permisiuni licitatii\n3 - permisiuni licitatii / produse\n4 - permisiuni totale");
        int adminLevel = a.nextInt();

        if (adminLevel == 1) {
            User us = new User(nume, age, location);
            System.out.println("Utilizatorul a fost adaugat in baza de date!");
        } else if (adminLevel > 1 && adminLevel < 5) {
            Admin adm = new Admin(nume, age, location, adminLevel);
            System.out.println("Administratorul a fost adaugat in baza de date!");
        }
    }

    public void addProduct() {
        System.out.print("Numele: ");
        String productName = a.nextLine();

        System.out.print("Categoria: ");
        String category = a.nextLine();

        System.out.print("Pret de inceput: ");
        double buyoutPrice = a.nextDouble();

        System.out.print("Locatia: ");
        String location = a.nextLine();

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

        System.out.print("Produsul este un vehicul?");
        boolean isVehicle = a.nextBoolean();

        if (isVehicle) {
            System.out.print("Puterea in kW: ");
            int kW = a.nextInt();

            System.out.print("Viteza maxima (km/h): ");
            int maxSpeed = a.nextInt();

            System.out.print("Capacitatea motorului (cc): ");
            double engineCapacity = a.nextDouble();

            System.out.print("Are inductie fortata? (1 = da/ 0 = nu)");
            boolean hasForcedInduction = a.nextBoolean();

            Vehicle veh = new Vehicle(productName, category, buyoutPrice, location, deliveryLocations, kW, maxSpeed, engineCapacity, hasForcedInduction);
        } else {
            System.out.print("Cantitate: ");
            int quantity = a.nextInt();

            System.out.print("Greutate: ");
            double weight = a.nextDouble();

            System.out.print("Tipul de impachetare: ");
            String packagingType = a.nextLine();

            Other oth = new Other(productName, category, buyoutPrice, location, deliveryLocations, quantity, weight, packagingType);
        }
        System.out.println("Produsul a fost adaugat in baza de date!");
    }

    public void addBid() {
        System.out.println("Pretul de inceput: ");
        double startingPrice = a.nextDouble();

        System.out.println("Timpul total: ");
        int totalTime = a.nextInt();

        Bid bid = new Bid(startingPrice, totalTime);
    }

    public void showUsers() {
        lstSrv.getUsers();
    }

    public void showProducts() {

    }

    public void showBids() {

    }
}


