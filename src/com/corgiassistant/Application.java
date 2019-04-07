package com.corgiassistant;

import com.corgiassistant.commands.Command;
import com.corgiassistant.commands.CommandRegistry;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Основной класс в приложении.
 * @author Fedor Ezhov
 * @version 0.0.1
 */
public class Application {
    /**
     * Выполняемая команда.
     */
    private Command command;
    /**
     * Поток для ввода команд.
     */
    private BufferedReader inputStream;
    /**
     * Хранение преобразования команды из потока в строку.
     */
    private String inputMessage;

    /**
     * Конструктор приложения.
     * Внутри бесконечный цикл, который ожидает ввода команд.
     * После получения команды происходит ее выполнение.
     */
    public Application() {
        System.out.println("Привет! Меня зовут Коржик и я приложение-сервис.\nЧтобы узнать мои возможности введи команду help.");
        inputStream = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            try {
                inputMessage = inputStream.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            command = CommandRegistry.COMMAND.getCommand(inputMessage.toLowerCase());
            command.execute();
        }
    }
}
