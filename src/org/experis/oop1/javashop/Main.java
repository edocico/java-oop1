package org.experis.oop1.javashop;

public class Main {
    public static void main(String[] args) {

        // istanzio nuovo prodotto

        Product console = new Product();

        // chiamo i setter

        console.setName("Playstation");

        console.setDescription("una macchina per giocare ai videogiochi");

        console.setPrice(399.99);

        console.setIva(22);

        // chiamo i getter

        double consolePrice = console.getPrice();
        int consoleIva = console.getIva();
        String consoleName = console.getName();
        int consoleCode = console.getCode();

        // evoco il metodo per avere il baseprice

        double consoleBasePrice = console.getBasePrice(consolePrice, consoleIva);

        System.out.println("prezzo senza iva:" + " " + consoleBasePrice);
        System.out.println("prezzo con iva:" + " " + consolePrice);

        // evoco il metodo per avere il fullname

        String consoleFullName = console.getFullName(consoleCode, consoleName);

        System.out.println(consoleFullName);



    }
}
