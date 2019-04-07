package com.corgiassistant.commands;

/**
 * Абстрактный класс описывающий поведение каждой команды в приложении
 */
public abstract class Command {
    /**
     * Поле - имя команды
     */
    private String commandName;
    /**
     * Поле - описание команды
     */
    private String commandDescription;

    /**
     * Метод заглушка исполения команды
     */
    public abstract void execute();

    /**
     * Конструктор создания команды
     * @param commandName Имя команды
     * @param commandDescription Описание команды
     */
    public Command(String commandName, String commandDescription) {
        this.commandName = commandName;
        this.commandDescription = commandDescription;
    }

    /**
     * Метод возвращающий имя команды
     * @return Имя команды
     */
    public String getCommandName() {
        return commandName;
    }

    /**
     * Метод возращающий описание команды
     * @return Описание команды
     */
    public String getCommandDescription() {
        return commandDescription;
    }

}
