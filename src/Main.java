public class Main {
    public static void main(String[] args) {

    Drink tequila = new Drink();

    tequila.nazwa = "Blue lagoon";
    tequila.cena = 10;
    tequila.alkohol = true;
    tequila.skladniki.skladnik1 = "gin";
    tequila.skladniki.skladnik2 = "Blue curacao";
    tequila.skladniki.skladnik3 = "lemoniada";
    tequila.skladniki.ilosc1 = 30;
    tequila.skladniki.ilosc2 = 10;
    tequila.skladniki.ilosc3 = 50;

        System.out.printf("drink: %s\n cena: %.2f alkohol %b\n skladniki: %s, %s, %s \n w ilosci: %d ml %d ml %d ml \n razem: %d ml", tequila.nazwa, tequila.cena,
                tequila.alkohol, tequila.skladniki.skladnik1, tequila.skladniki.skladnik2, tequila.skladniki.skladnik3,  tequila.skladniki.ilosc1,
                tequila.skladniki.ilosc2,  tequila.skladniki.ilosc3, tequila.skladniki.ilosc1 + tequila.skladniki.ilosc2 + tequila.skladniki.ilosc3);

    }
}

