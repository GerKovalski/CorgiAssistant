package com.corgiassistant.commands;
/**
 * Класс описывающий команду "help" (вывод списка поддерживаемых команд)
 */
public class CommandHelp extends Command {
    /**
     * Поле - имя команды
     */
    private static final String COMMAND_NAME = "help";
    /**
     * Поле - описание команды
     */
    private static final String COMMAND_DESCRIPTION = "-выводит на экран список всех доступных команд и вохможных ключей к ним.";
    /**
     * Конструктор класса
     * @see Command#Command(String, String)
     */
    public CommandHelp() {
        super(COMMAND_NAME, COMMAND_DESCRIPTION);
    }
    /**
     * Переопределенный метод исполнения команды
     */
    @Override
    public void execute() {
        CommandRegistry.COMMAND.getCommandList();
    }

}
