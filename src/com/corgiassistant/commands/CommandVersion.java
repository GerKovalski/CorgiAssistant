package com.corgiassistant.commands;
import static com.corgiassistant.AppConst.*;
/**
 * Класс описывающий команду "version" (вывод текущего версии приложения)
 */
public class CommandVersion extends Command{
    /**
     * Поле - имя команды
     */
    private static final String COMMAND_NAME = "version";
    /**
     * Поле - описание команды
     */
    private static final String COMMAND_DESCRIPTION = "-выводит на экран автора приложения";
    /**
     * Конструктор класса
     * @see Command#Command(String, String)
     */
    public CommandVersion() {
        super(COMMAND_NAME, COMMAND_DESCRIPTION);
    }
    /**
     * Переопределенный метод исполнения команды
     */
    @Override
    public void execute() {
        System.out.println("Текущая версия приложения: " + APP_VERSION);
    }
}
