import java.util.Scanner;

public class Main {


    /**
     * http://www.ogr.com
     * @since 1999
     * @param args age name firstname
     */
    public static void main(String[] args){
        String imie;
        String nazwisko;
        String inicjal;
        char znak;
        Scanner wejscie = new Scanner(System.in); //tworzymy instancję klasy Scanner pod nazwą wejscie
        System.out.println("Podaj imię: ");
        imie = wejscie.nextLine(); //odczytujemy całą linię wprowadzonych danych - czyli wszystko do momentu naciśnięcia klawisza Enter - i zapisujemy w zmiennej imie
        znak = imie.charAt(0);
        inicjal=""+znak;
        System.out.println("Podaj nazwisko: ");
        nazwisko = wejscie.next(); //ponownie odczytujemy dane wprowadzone przez użytkonika przy użyciu metody next()
        znak=nazwisko.charAt(0);
        inicjal+=String.valueOf(znak);
        System.out.print("Twoje inicjały: "+inicjal);
    }

}
