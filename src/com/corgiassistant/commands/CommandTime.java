package com.corgiassistant.commands;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * Класс описывающий команду "time" (вывод текущего времени и даты)
 */
public class CommandTime extends Command {
    /**
     * Поле - имя команды
     */
    private static final String COMMAND_NAME = "time";
    /**
     * Поле - описание команды
     */
    private static final String COMMAND_DESCRIPTION = "-выводит на экран текущee время.";
    /**
     * Конструктор класса
     * @see Command#Command(String, String)
     */
    public CommandTime() {
        super(COMMAND_NAME, COMMAND_DESCRIPTION);
    }
    /**
     * Переопределенный метод исполнения команды
     */
    @Override
    public void execute() {
        System.out.printf("%-16s %-20s\n", "Текущее дата - ", new SimpleDateFormat("E yyyy.MM.dd").format(new Date()));
        System.out.printf("%-16s %-20s\n", "Текущее время - ", new SimpleDateFormat("hh:mm:ss a zzz").format(new Date()));
    }
}
