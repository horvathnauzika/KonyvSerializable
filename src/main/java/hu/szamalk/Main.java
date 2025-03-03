package hu.szamalk;

import hu.szamalk.modell.Konyv;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;

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
        konyvek.add(new Konyv("Asdasd", "Valaki", 2012));
        konyvek.add(new Konyv("Java", "Valaki", 2023));
        konyvek.add(new Konyv("JavaScript", "Valaki", 2022));
        konyvek.add(new Konyv("PHP", "Valaki", 2016));
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("listazas.txt"))){
            oos.writeObject(konyvek);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void tobbKonyv() {
        Konyv konyv1=new Konyv("Könyv1", "Én", 2024);
        Konyv konyv2 = new Konyv("Könyv2", "te", 2012);
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("tobbKonyv.txt"))){
            oos.writeObject(konyv1);
            oos.writeObject(konyv2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    private static void egyKonyv() {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("konyv.txt"))){
            oos.writeObject(new Konyv("Harry Potter", "JK Rowling", 2020 ));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }




}