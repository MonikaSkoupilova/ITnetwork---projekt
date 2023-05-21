/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package cz.itnetwork.evidencepojisteni;

import java.util.Scanner;

/**
 *
 * @author Uživatel
 */
public class EvidencePojisteni {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Databaze databaze = new Databaze();

        String volba = "";

        while (!volba.equals("4")) {
            System.out.println("Vyberte z následujících možností: \n");
            System.out.println("1 - Přidat nového pojištěnce");
            System.out.println("2 - Seznam všech pojištěných");
            System.out.println("3 - Vyhledání pojištěnce");
            System.out.println("4 - Konec");

            volba = scanner.nextLine();
            System.out.println();

            switch (volba) {
                case "1":
                    String jmeno = zjistiUdaje(scanner, "jméno");
                    String prijmeni = zjistiUdaje(scanner, "příjmení");
                    int vek = zjistiVek(scanner);
                    String telefonniCislo = zjistiUdaje(scanner, "telefonní číslo");
                    databaze.vytvorPojisteneho(jmeno, prijmeni, vek, telefonniCislo);
                    System.out.println("Pojištěnec byl přidán do systému \n");
                    break;
                case "2":
                    databaze.zobrazSeznam();
                    System.out.println();
                    break;
                case "3":
                    jmeno = zjistiUdaje(scanner, "jméno");
                    prijmeni = zjistiUdaje(scanner, "příjmení");
                    databaze.najdiPojisteneho(jmeno, prijmeni);
                    System.out.println();
                    break;
                case "4":
                    System.out.println("Konec. Děkujeme za použítí programu.\n");
                    break;
                default:
                    System.out.println("Neplatná volba.");
                    break;
            }
        }
    }

    private static String zjistiUdaje(Scanner scanner, String udaje) {
        System.out.println("Zadejte " + udaje + ":");
        return scanner.nextLine().trim().toLowerCase();

    }

    private static int zjistiVek(Scanner scanner) {
        System.out.println("Zadejte věk: ");
        int vek = Integer.parseInt(scanner.nextLine());
        return vek;

    }

}
