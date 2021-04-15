package service;

import collections.service.ListService;
import collections.service.MapService;
import model.*;

import java.util.Iterator;
import java.util.Scanner;

public class BidService {
    private final Scanner a = new Scanner (System.in);
    private static final MainService srv = new MainService();
    private static final MapService mapSrv = new MapService();
    private static final ListService lstSrv = new ListService();

    public void addBid(Bid bid) {
        System.out.println("Alegeti un produs:");
        srv.showProducts();
        int index = a.nextInt();
        mapSrv.addBid(bid, lstSrv.getProduct(index));
    }

    public void removeBid(int index) {
        mapSrv.removeBid(index);
        System.out.println("Licitatia a fost stearsa cu succes!");
    }

    public void modifyBid(int index, int choice) {
        mapSrv.modifyBid(index, choice);
        System.out.println("Licitatia a fost modificata cu succes!");
    }

    public void showBids() {

    }

    public void bid(int index) {

    }
}