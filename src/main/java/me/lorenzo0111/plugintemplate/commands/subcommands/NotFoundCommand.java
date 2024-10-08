package me.lorenzo0111.plugintemplate.commands.subcommands;

import me.lorenzo0111.plugintemplate.commands.SubCommand;
import me.lorenzo0111.plugintemplate.commands.TemplateCommand;
import org.bukkit.command.CommandSender;

public class NotFoundCommand extends SubCommand {

    public NotFoundCommand(TemplateCommand command) {
        super(command);
    }

    @Override
    public void handle(CommandSender sender, String[] args) {
        sender.sendMessage(plugin.getPrefixed("not-found"));
    }

    @Override
    public String getName() {
        return "!notfound";
    }

    @Override
    public String getDescription() {
        return null;
    }

}
