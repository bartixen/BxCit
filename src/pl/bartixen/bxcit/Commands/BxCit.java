package pl.bartixen.bxcit.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import pl.bartixen.bxcit.Data.SkinsDataManager;
import pl.bartixen.bxcit.Main;

public class BxCit implements CommandExecutor {

    Main plugin;

    SkinsDataManager data;

    public BxCit(Main m) {
        plugin = m;
        m.getCommand("bxcit").setExecutor(this);
        m.getCommand("cit").setExecutor(this);
        data = SkinsDataManager.getInstance();
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        String version = plugin.version;
        if (args.length == 1) {
            if (sender.hasPermission("bxauth.commands.reload") || sender.isOp()) {
                if (args[0].equalsIgnoreCase("reload")) {
                    sender.sendMessage("§8 • — • — • — • ");
                    plugin.reloadConfig();
                    sender.sendMessage("§7Successfully persecuted §9CONFIG");
                    data.reloadData();
                    sender.sendMessage("§7Successfully persecuted §9DATAMENAGER");
                    sender.sendMessage("§8 • — • — • — • ");
                } else {
                    sender.sendMessage("§7");
                    sender.sendMessage("§7Plugin §eBxCit");
                    sender.sendMessage("§7Version: §e" + version);
                    sender.sendMessage("§7Author: §eBartixen");
                    sender.sendMessage("§7Website: §ehttps://bartixen.pl");
                    sender.sendMessage("§7");
                }
            } else {
                sender.sendMessage("§7");
                sender.sendMessage("§7Plugin §eBxCit");
                sender.sendMessage("§7Version: §e" + version);
                sender.sendMessage("§7Author: §eBartixen");
                sender.sendMessage("§7Website: §ehttps://bartixen.pl");
                sender.sendMessage("§7");
            }
        } else {
            sender.sendMessage("§7");
            sender.sendMessage("§7Plugin §eBxCit");
            sender.sendMessage("§7Version: §e" + version);
            sender.sendMessage("§7Author: §eBartixen");
            sender.sendMessage("§7Website: §ehttps://bartixen.pl");
            sender.sendMessage("§7");
        }
        return false;
    }

}