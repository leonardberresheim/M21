package com.company;

public class Main {

    public static void main(String[] args) {
        // ---------- Uebung 1a ---------- //
        // folgendes Program soll die Zahlen 0 bis 10 ausgeben
        for(int i = 0; i <= 10; i++){
            System.out.println(i);
        }

        // Wie würde das ganze als while schleife aussehen?

        // ---------- Uebung 1b ---------- //
        // folgendes Program soll die Zahlen 5 bis 12 ausgeben
        for(int i = 5; i <= 12; i++){
            System.out.println(i);
        }

        // ---------- Uebung 1c ---------- //
        // folgendes Program soll die Zahlen -12 bis 0 ausgeben
        for(int i = 5; i <= 12; i++){
            System.out.println(i);
        }

        // Wie würde das ganze als while schleife aussehen?

        // ---------- Uebung 2 ---------- //
        // folgendes Program soll alle geraden Zahlen zwichen 0 und 10 ausgeben
        for(int i = 0; i <= 10; i+=2){
            System.out.println(i);
        }




        // Wie würde eine zweite Lösung aussehen mit forgegebener Schleifen?
        for(int i = 0; i <= 10; i++){
            if(i%2 == 0) {
                System.out.println(i);
            }
        }

        // ---------- Uebung 3 ---------- //
        // Der Nutzer soll solange abgefragt werden bis er 'x' eingibt
        char input = 0;
        while(input != 'x'){
            System.out.println("Press x to cancel");
        }

        // andere Möglichkeit mit dieser Schleifen?
        while(true){
            System.out.println("Press c to cancel");
        }


        // ---------- Uebung 4 ---------- //
        // folgendes Program soll von 100 runterzählen bis -100
        for(int i = 100; i > -100; i++){
            System.out.println(i);
        }

        // Zahlen die durch 5 restlos teilbar sind sollen nun übersprungen werden



        // ---------- Uebung 5 ---------- //
        // Der Nutzer soll eingeben bis wohin gezählt werden soll und mit welchem interval

        int interval = 5;
        int dest = 100;
        for(int i = 0; i < dest; i += 5){
            System.out.println(i);
        }


        // ---------- Uebung 6 ---------- //
        // Der Nutzer gibt wiederhohlt Zahlen ein die mit einander verrechnet werden. Solange bis die Grenze 100 erreicht wird.
        int summe = 0;
        while(summe < 100){
            System.out.print("Enter a number: ");
            summe += input;
        }

        // ---------- Uebung 7 ---------- //



        // ---------- Uebung 8 ---------- //
    }
}
