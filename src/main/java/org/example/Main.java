package org.example;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fileCount = 0; // Счетчик корректных файлов

        for (;;) {
            System.out.print("Введите путь к файлу (или 'exit' для выхода): ");
            String path = scanner.nextLine();

            // Проверка на выход из цикла
            if (path.equalsIgnoreCase("exit")) {
                System.out.println("Программа завершена.");
                break;
            }

            File file = new File(path);
            boolean fileExists = file.exists();
            boolean isFile = file.isFile();

            if (!fileExists) {
                System.out.println("Ошибка: указанный путь не существует. Попробуйте снова.");
                continue;
            }

            if (!isFile) {
                System.out.println("Ошибка: указанный путь ведёт к папке, а не к файлу. Попробуйте снова.");
                continue;
            }

            fileCount++;
            System.out.println("Путь указан верно. Это файл номер " + fileCount);
        }
    }
}
