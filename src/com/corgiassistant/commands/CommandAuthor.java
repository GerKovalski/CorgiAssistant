package com.corgiassistant.commands;
import static com.corgiassistant.AppConst.*;

/**
 * Класс описывающий команду "author" (вывод автора приложения)
 */
public class CommandAuthor extends Command {

    /**
     * Поле - имя команды
     */
    private static final String COMMAND_NAME = "author";

    /**
     * Поле - описание команды
     */
    private static final String COMMAND_DESCRIPTION = "-выводит на экран текущую версию программы.";

    /**
     * Конструктор класса
     * @see Command#Command(String, String)
     */
    public CommandAuthor() {
        super(COMMAND_NAME, COMMAND_DESCRIPTION);
    }

    /**
     * Переопределенный метод исполнения команды
     */
    @Override
    public void execute() {
        System.out.println("Автор приложения: " + APP_AUTHOR);
    }
}
