package hu.szamalk;

import hu.szamalk.modell.Konyv;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.UUID;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        egyKonyv();
        tobbKonyv();
        listazas();
    }

    private static void listazas() {
        ArrayList<Konyv> konyvek = new ArrayList<>();
        ArrayList<String> szerzok = new ArrayList<>();
        szerzok.add("Első sz.");
        szerzok.add("Szerző 2");
        szerzok.add("Harmadik szerző");

        konyvek.add(new Konyv("Asdasd", szerzok, 2012));
        konyvek.add(new Konyv("Java", szerzok, 2023));
        konyvek.add(new Konyv("JavaScript", szerzok, 2022));
        konyvek.add(new Konyv("PHP", szerzok, 2016));
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("listazas.txt"))){
            oos.writeObject(konyvek);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void tobbKonyv() {
        ArrayList<String> szerzok = new ArrayList<>();
        szerzok.add("Szerző 1");
        szerzok.add("Második sz.");
        szerzok.add("Harmadik szerző");

        Konyv konyv1=new Konyv("Könyv1", szerzok, 2024);
        Konyv konyv2 = new Konyv("Könyv2", szerzok, 2012);
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("tobbKonyv.txt"))){
            oos.writeObject(konyv1);
            oos.writeObject(konyv2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void egyKonyv() {
        ArrayList<String> szerzok = new ArrayList<>();
        szerzok.add("JK Rowling");

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("konyv.txt"))){
            oos.writeObject(new Konyv("Harry Potter", szerzok, 2020));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}