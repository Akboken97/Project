
package com.epam.learn.main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CsvFile {
    public static void main(String[] args) {
        String [][] personsData = {
                {"Ақбөкен Жанат", "нет задолжнности"},
                {"Зейнольдин Амир", "есть задолженность"}
            /*,
                {"Сақыбек Ерсұлтан", "нет задолженности"},
                {"Мамбетов Дамир", "есть задолженность"},
                {"Бортников Василий", "нет задолженности"},
                {"Ошақбаев Жанболат", "есть задолженность"},
                {"Хайбуллин Наджат", "нет задолженности"}*/
        };
        String csvFileName = "persons.csv";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter (csvFileName))) {
                            writer.write("ФИ, задолженность\n");
                            for (String[] person: personsData) {
                                writer.write(person[0] + "," + person[1]);
                                writer.newLine();
                            }
            System.out.println("Данные успешно записаны CSV файл " + csvFileName);
        }
        catch (IOException e) {
                e.printStackTrace();
        }
    }
}
