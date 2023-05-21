/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.evidencepojisteni;

import java.util.ArrayList;

/**
 *
 * @author Uživatel
 */
public class Databaze {

    ArrayList<Pojistenec> pojistenci = new ArrayList<>();

    // založení nového pojištěnce 
    public void vytvorPojisteneho(String jmeno, String prijmeni, int vek, String telefonniCislo) {

        pojistenci.add(new Pojistenec(jmeno, prijmeni, vek, telefonniCislo));

    }

    // zobrazí se seznam pojištěných
    public void zobrazSeznam() {
        if (pojistenci.isEmpty()) {
            System.out.println("Nejsou žádní pojištěnci. ");
        } else {
            System.out.println("Seznam všech pojištěných: ");
            for (Pojistenec pojistenec : pojistenci) {
                System.out.println(pojistenec);
            }
        }
    }

    // najde pojištěného podle jména a příjmení
    public void najdiPojisteneho(String jmeno, String prijmeni) {
        boolean nalezeno = false;

        for (Pojistenec pojistenec : pojistenci) {
            if (pojistenec.getJmeno().equals(jmeno) && pojistenec.getPrijmeni().equals(prijmeni)) {
                System.out.println("Nalezeno: " + pojistenec);
                nalezeno = true;
                break;
            }
        }

        if (!nalezeno) {
            System.out.println("Pojištěný s tímto jménem a příjmením nebyl nalezen.");
        }

    }
}
