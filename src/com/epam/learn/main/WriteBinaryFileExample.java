package com.epam.learn.main;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteBinaryFileExample {
    public static void main(String[] args) {
        String[] personsWithDebt = {
                "Зейнольдин Амир",
                "Мамбетов Дамир",
                "Ошақбаев Жанболат"
        };
        String binaryFileName = "persons_with_debt.bin";
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(binaryFileName))) {

            for (String client : personsWithDebt) {
                dos.writeUTF(client);
            }
            System.out.println("Данные о клиентах с задолженностями успешно записаны в бинарный файл " + binaryFileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
