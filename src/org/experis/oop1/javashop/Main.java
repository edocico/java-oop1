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

        double consoleBasePrice = console.getBasePrice(consolePrice, consoleIva);

        System.out.println("prezzo senza iva:" + " " + consoleBasePrice);
        System.out.println("prezzo con iva:" + " " + consolePrice);

    }
}
