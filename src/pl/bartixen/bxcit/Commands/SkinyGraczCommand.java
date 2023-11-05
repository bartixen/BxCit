package pl.bartixen.bxcit.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import pl.bartixen.bxcit.Data.SkinyDataManager;
import pl.bartixen.bxcit.Main;

import java.util.ArrayList;

public class SkinyGraczCommand implements CommandExecutor {

    Main plugin;

    SkinyDataManager data;

    static ArrayList<String> listasprzedarzy = new ArrayList<>();
    static ArrayList<String> listapkt = new ArrayList<>();

    public SkinyGraczCommand(Main m) {
        plugin = m;
        m.getCommand("skinygracz").setExecutor(this);
        m.getCommand("sg").setExecutor(this);
        data = SkinyDataManager.getInstance();
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender.hasPermission("bxcit.commands.gracz") || sender.isOp()) {
            if (args.length == 1) {
                sender.sendMessage("§7Wyszukiwanie gracza: §9" + args[0]);
                sender.sendMessage("§8 • — • — • — • ");
                String uuid = data.getData().getString(args[0] + ".uuid");
                if (uuid != null) {
                    String nick = data.getData().getString(uuid + ".nick");
                    String pkt = data.getData().getString(uuid + ".pkt");
                    listasprzedarzy = (ArrayList<String>) data.getData().getStringList(uuid + ".lista_sprzedaz");
                    listapkt = (ArrayList<String>) data.getData().getStringList(uuid + ".lista_pkt");
                    sender.sendMessage("§7Nick: §9" + nick);
                    sender.sendMessage("§7Punkty: §9" + pkt);
                    sender.sendMessage("§7Wplaty:");
                    if (listapkt.size() > 0) {
                        for (String blacklist : listapkt) {
                            String pkt1 = data.getData().getString(uuid + ".doladowania." + blacklist + ".ilosc");
                            String data1 = data.getData().getString(uuid + ".doladowania." + blacklist + ".data");
                            String diax = data.getData().getString(uuid + ".doladowania." + blacklist + ".diamond");
                            String netherite = data.getData().getString(uuid + ".doladowania." + blacklist + ".netherite");
                            sender.sendMessage("  §9" + blacklist + "§7;");
                            sender.sendMessage("    §7Pkt: §9" + pkt1);
                            sender.sendMessage("    §7Data: §9" + data1);
                            sender.sendMessage("    §7Diamond: §9" + diax);
                            sender.sendMessage("    §7Netherite: §9" + netherite);
                        }
                    } else {
                        sender.sendMessage("  §9Brak");
                    }
                    sender.sendMessage("§7Sprzedaz:");
                    if (listasprzedarzy.size() > 0) {
                        for (String blacklist : listasprzedarzy) {
                            String data1 = data.getData().getString(uuid + ".sprzedaz." + blacklist + ".data");
                            String item = data.getData().getString(uuid + ".sprzedaz." + blacklist + ".item");
                            String koszt = data.getData().getString(uuid + ".sprzedaz." + blacklist + ".koszt");
                            sender.sendMessage("  §9" + blacklist + "§7:");
                            sender.sendMessage("    §7Data: §9" + data1);
                            sender.sendMessage("    §7Item: §9" + item);
                            sender.sendMessage("    §7Koszt: §9" + koszt);
                        }
                    } else {
                        sender.sendMessage("  §9Brak");
                    }
                    sender.sendMessage("§8 • — • — • — • ");
                } else {
                    sender.sendMessage("§7§7Brak danych o graczu §9" + args[0]);
                    sender.sendMessage("§8 • — • — • — • ");
                }
            } else {
                sender.sendMessage("§7Poprawne użycie: §9/sg [gracz]");
            }
        } else {
            sender.sendMessage("§7Brak permisji: §9bxcit.commands.gracz");
        }
        return false;
    }

}