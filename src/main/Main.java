// 7) sistem licitatii (licitatii, bids, produse, utilizatori)
package main;

import service.*;

import java.util.Scanner;
//import java.lang.Thread;

public class Main {
    public static void main(String[] args) {
        MainService srv = new MainService();
        int valoare, select;

    Scanner a = new Scanner(System.in);

    do {
        System.out.println("Bine ai venit la sistemul de licitatie adyb0$$");
        System.out.println("""
                        1. Creaza un(o) utilizator / produs / licitatie
                        2. Afiseaza o lista cu toti(toate) utilizatorii / produsele / licitatiile
                        3. Modifica un(o) utilizator / produs / licitatie
                        4. Sterge un(o) utilizator / produs / licitatie
                        5. Liciteaza un produs
                        6. Cumpara un produs
                        7. Iesire din program
                        """);
        valoare = a.nextInt();
        switch (valoare) {
            case 1 -> {
                select = srv.choice();
                srv.addObject(select);
            }
            case 2 -> {
                select = srv.choice();
                //srv.showObject(select);
            }
            case 3 -> {
                select = srv.choice();
                //srv.modifyObject();

            }
            case 4 -> {
                select = srv.choice();
                //srv.deleteObject();

            }
            case 5 -> {

            }
            case 6 -> {

            }
            case 7 -> {

            }
            default -> System.out.println("Command does not exist. Type /help for info. , retard");
        }
    }   while(valoare != 7);


    }
}



/*
exemplu linie de comanda in fisier csv:


adauga,userid,nume,varsta;
afiseaza, useri/produse/licitatii active;
bid, product id/name , userid, oferta monetara,


 */

