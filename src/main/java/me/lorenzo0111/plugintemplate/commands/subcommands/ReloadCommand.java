package me.lorenzo0111.plugintemplate.commands.subcommands;

import me.lorenzo0111.plugintemplate.commands.SubCommand;
import me.lorenzo0111.plugintemplate.commands.TemplateCommand;
import org.bukkit.command.CommandSender;

public class ReloadCommand extends SubCommand {

    public ReloadCommand(TemplateCommand command) {
        super(command);
    }

    @Override
    public void handle(CommandSender sender, String[] args) {
        this.plugin.reload();
        sender.sendMessage(plugin.getPrefixed("reload"));
    }

    @Override
    public String getName() {
        return "reload";
    }

    @Override
    public String getPermission() {
        return "template.reload";
    }

    @Override
    public String getDescription() {
        return "Reload the plugin";
    }
}
