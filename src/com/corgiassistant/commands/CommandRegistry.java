package com.corgiassistant.commands;

import java.util.*;

/**
 * Перечисление, в котором собраны экземпляры всех поддерживаемых команд. Использовется в качестве Singleton'a для экзмепляров команд.
 */
public enum CommandRegistry {
    COMMAND;

    /**
     * Коллекция содержащая экземпляры команд
     */
    static Map<String, Command> commandRegistryMap;

    /**
     * Создание экземпляра коллекции и дабовление экземпляров команд в нее.
     */
    static {
        commandRegistryMap = new LinkedHashMap<>();
        Command commandAuthor = new CommandAuthor();
        Command commandVersion = new CommandVersion();
        Command commandHelp = new CommandHelp();
        Command commandTime = new CommandTime();
        Command commandExit = new CommandExit();
        commandRegistryMap.put(commandAuthor.getCommandName(), commandAuthor);
        commandRegistryMap.put(commandVersion.getCommandName(), commandVersion);
        commandRegistryMap.put(commandHelp.getCommandName(), commandHelp);
        commandRegistryMap.put(commandTime.getCommandName(), commandTime);
        commandRegistryMap.put(commandExit.getCommandName(), commandExit);
    }

    /**
     * Метод возвращающий экземпляр команды из коллекции
     * @param name Имя команды
     * @return Экземпляр команды
     */
    public Command getCommand(String name) {
        return commandRegistryMap.get(name);
    }

    /**
     * Метод выводящий на экран список поддерживаемых команд
     */
    public void getCommandList() {
        Iterator iterator = commandRegistryMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Command> entry = (Map.Entry)iterator.next();
            System.out.printf("%-15s %-15s\n", entry.getValue().getCommandName(), entry.getValue().getCommandDescription());
        }
    }
}
