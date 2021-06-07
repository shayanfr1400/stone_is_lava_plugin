package com.shayan.main;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import org.bukkit.ChatColor;

public class Main extends JavaPlugin {
	 @Override
    public void onEnable() {
    }
    @Override
    public void onDisable() {
    	
    	
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
    	
    	if(label.equalsIgnoreCase("huh")) {
    		if(!(sender instanceof Player)) {
    			sender.sendMessage("Command out of autherization");
    			return true;
    		}
    		if(!sender.hasPermission("TestPlugin.use")) {
    			sender.sendMessage("Permition denide");
    			return true;
    		}
    		Player player = (Player) sender;
    		player.sendMessage(ChatColor.YELLOW + "Hello");
    	}
    	
    	return false;
    }

}
