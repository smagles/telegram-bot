package org.example.bot.commands;

import org.telegram.telegrambots.extensions.bots.commandbot.commands.IBotCommand;

public abstract class BaseTextCommand implements IBotCommand {
    private final String textCommandIdentifier;
    private final String description;

    public BaseTextCommand(String textCommandIdentifier, String description) {
        this.textCommandIdentifier = textCommandIdentifier;
        this.description = description;
    }

    @Override
    public String getCommandIdentifier() {
        return textCommandIdentifier;
    }

    @Override
    public String getDescription() {
        return description;
    }


}
