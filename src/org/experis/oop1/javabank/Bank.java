package org.experis.oop1.javabank;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisca il suo nome per generare un nuovo conto");
         String userName = scan.nextLine();

         // istanzio un nuovo conto e ne settto il nome del proprietario

        BankAccount account = new BankAccount();
        account.setAccountOwner(userName);
        String owner = account.getAccountOwner();
        System.out.println("il conto è di:" + " " + owner);
        account.setBalance(0);

        // comandi

        String deposit = "deposita";
        String withdrow = "preleva";
        String exit = "esci";
        double balance = account.getBalance();

        // variabile di controllo ciclo

        boolean isDone = false;

        // ciclo do while

        do {
            System.out.println("Quale operazione vuoi fare ? hai tre comandi: deposita , preleva , esci");
            String command = scan.nextLine();

            if(command.equalsIgnoreCase(deposit)) {
                System.out.println("quanto vuoi depositare? scrivi la cifra");
                int answer = scan.nextInt();

                double newBalance = account.depositMoney(answer);
                account.setBalance(newBalance);
                System.out.println("il tuo nuovo saldo è:" + " " + newBalance);
            } else if (command.equalsIgnoreCase(withdrow)) {
                System.out.println("quanto vuoi ritirare? scrivi la cifra");
                int answer = scan.nextInt();
                double balance2 = account.getBalance();
                if (balance2 < answer || balance2 == 0) {
                    System.out.println("operazione impossibile saldo non sufficiente");
                    System.out.println("il tuo conto ha:" + " " + balance2);
                } else if (balance2 >= answer) {
                    double newBalance = account.withdrawMoney(answer);
                    account.setBalance(newBalance);
                    System.out.println("operazione completata");
                    System.out.println("il tuo nuovo saldo è:" + " " + newBalance);
                }


            } else if (command.equalsIgnoreCase(exit)) {
                isDone = true;
            }


        }while (!isDone);

        System.out.println("Grazie e arrivederci!");



        scan.close();
    }
}
