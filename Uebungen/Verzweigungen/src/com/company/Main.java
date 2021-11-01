package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 5;
        int b = 6;

        // --------- Uebung 1 ---------- //
        // Im folgenden Code soll ausgegeben werden ob zahl a kleiner, größer oder gleich b ist

        if(a < b){
            System.out.println("a ist kleiner als b");
        }else if(a > b){
            System.out.println("a ist groesser als b");
        }else if(a == b){
            System.out.println("a is gleich b");
        }
        // Kann man die letzte Zeile auch anders schreiben (kürzer)?

        // --------- Uebung 2 ---------- //
        // Im folgenden Code soll die vom Nutzer eingegeben Stadt als Fahrtziel ausgegeben werden.
        String ziel = "New Dehli";
        if(ziel == "Paris"){
            System.out.println("Wir fahren nach Paris");
        }else if(ziel == "Berlin"){
            System.out.println("Wir fahren nach Berlin");
        }else if(ziel == "New Dehli"){
            System.out.println("Wir fahren nach New Dehli");
        }

        // Was passiert wenn der Nutzer keine "valide" Stadt eingibt?

        // --------- Uebung 3 ---------- //
        // Hier sollen vom Nutzer 2 Zahlen abgefragt werden sowie eine Operation
        // und diese Zahlen dann entsprechen miteinander berechnet und ausgegeben werden
        char op = '*';
        if(op == '+'){
            System.out.println(a + b);
        }else if(op == '-'){
            System.out.println(a - b);
        }else if(op == '/'){
            System.out.println(a / b);
        }else if(op == '*'){
            System.out.println(a * b);
        }

        // Was passiert wenn der Nutzer eine falsche Operation eingibt ?

        // --------- Uebung 4 ---------- //
        // Aufgabe 3 soll nun als switch case umgesetzt werden
        switch(op){
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
        }
        // Wie könnte man hier mit einer falschen Eingabe für op umgehen?

        // --------- Uebung 5 ---------- //
        // Dieses Program soll ausgeben ob die eingegeben Zahl gerade oder ungerade ist.

        if(a % 2 == 0){
            System.out.println("Zahl ist gerade");
        }else if(a % 2 != 0){
            System.out.println("Zahl ist ungerade");
        }
        // Kann man das auch kürzer schreiben?

        // --------- Uebung 6 ---------- //
        // Der Nutzer hat die Wahl zwichen "speicher", "nicht speichern", oder "cancel" -
        // Die Eingabe des Nutzers soll ausgegeben werden.
        System.out.println("save, discard or cancel?");
        String input = "cancel";
        switch(input){
            case "save":
                System.out.println("The document has been saved");
                break;
            case "discard":
                System.out.println("The changes have been discarded");
                break;
            case "cancel":
                System.out.println("Process has been canceled");
                break;
        }

        // Das Programm soll jetzt so abgeändert werden, dass bei einer falschen Eingabe der Prozess abgebrochen wird


        // --------- Uebung 7 ---------- //
        // Uebung 6 soll so abgeändert werden, das bei der Eingabe "discard" nochmal nachgefragt wird ob der Nutzer
        // auch wirklich sicher ist.
        System.out.println("save, discard or cancel?");
        switch(input){
            case "save":
                System.out.println("The document has been saved");
                break;
            case "discard":
                System.out.println("The changes have been discarded");
                break;
            case "cancel":
                System.out.println("Process has been canceled");
                break;
        }

        // --------- Uebung 8 ---------- //
        // Nutzer kann 2 farben auswählen. Die auswahl des nutzers wird ausgegeben
        String colorA = "black", colorB = "Blue";
        System.out.println("Please choose 2 colors. Available colors are: black, blue, white");
        if((colorA == "blue" && colorA == "black") || (colorA == "black" && colorB == "blue")){
            System.out.println("You chose color blue and black");
        }else if((colorA == "blue" && colorA == "white") || (colorA == "white" && colorB == "blue")){
            System.out.println("You chose color blue and white");
        }else if((colorA == "black" && colorA == "white") || (colorA == "white" && colorB == "black")){
            System.out.println("You chose color black and white");
        }
    }
}
