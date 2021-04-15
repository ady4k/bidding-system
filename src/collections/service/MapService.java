package collections.service;

import main.Main;
import model.*;
import service.MainService;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class MapService {
    private static final Map<Bid, Product> bids = new HashMap<>();
    private static final Scanner a = new Scanner(System.in);
    private static final MainService srv = new MainService();
    private static final ListService lstSrv = new ListService();

    public void addBid(Bid bid, Product product) {
        bids.put(bid, product);
    }

    public void removeBid(int index) {
        Iterator<Bid> i = index(index);
        i.remove();
    }

    public Iterator<Bid> index(int index) {
        int count = 0;
        Iterator<Bid> i = bids.keySet().iterator();
        while (i.hasNext()) {
            Bid key = i.next();
            count++;
            if (count == index - 1) {
                break;
            }
        }
        return i;
    }

    public void modifyBid(int index, int choice) {
        if (choice == 0) {
            System.out.println("Pretul de inceput nou: ");
            double startingPrice = a.nextDouble();

            Iterator<Bid> i = index(index);
            Bid bid = (Bid) i;
            Product product = bids.get(i);

            bid.setCurrentPrice(startingPrice);
            bids.remove(i);
            bids.put(bid, product);

        } else if (choice == 1) {
            System.out.println("Timpul total ramas nou: ");
            int totalTime = a.nextInt();

            Iterator<Bid> i = index(index);
            Bid bid = (Bid) i;
            Product product = bids.get(i);

            bid.setTotalTime(totalTime);
            bids.remove(i);
            bids.put(bid, product);

        } else if (choice == 2) {
            System.out.println("Alegeti un produs:");
            srv.showProducts();
            int productIndex = a.nextInt();

            Iterator<Bid> i = index(index);
            bids.put((Bid) i, lstSrv.getProduct(productIndex));
        } else {
            System.out.println("Nu ati introdus o valoare corecta!");
        }
    }

    public void getBid(int index) {
        Iterator<Bid> i = index(index);
        bids.get(i);
    }

    public void getBids() {
        bids.forEach((bid, product) -> {
            System.out.println(bid + " " + product);
        });
    }
}