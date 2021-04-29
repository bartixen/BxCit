package pl.bartixen.bxcit.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import pl.bartixen.bxcit.Main;

public class Txt implements CommandExecutor {

    Main plugin;

    public Txt(Main m) {
        plugin = m;
        m.getCommand("txt").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        sender.sendMessage("§7Aby mieć włączonego naszego txt należy przed wejściem na serwer ustawić opcje: §9Server Resource Packes §7na §9Enabled");
        return false;
    }
}
