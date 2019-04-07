package com.corgiassistant.commands;

/**
 * Класс описывающий команду "exit" (выход из приложения)
 */
public class CommandExit extends Command{
    /**
     * Поле - имя команды
     */
    private static final String COMMAND_NAME = "exit";
    /**
     * Поле - описание команды
     */
    private static final String COMMAND_DESCRIPTION = "-выход из программы.";
    /**
     * Конструктор класса
     * @see Command#Command(String, String)
     */
    public CommandExit() {
        super(COMMAND_NAME, COMMAND_DESCRIPTION);
    }
    /**
     * Переопределенный метод исполнения команды
     */
    @Override
    public void execute() {
        System.exit(0);
    }
}
