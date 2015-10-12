package com.halmerson;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Core extends JavaPlugin {
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("fakejoin")) {
			if (args.length < 1) {
				Bukkit.broadcastMessage(ChatColor.YELLOW + sender.getName() + " joined the game");
			}
			
			if (args.length > 1) {
				sender.sendMessage(ChatColor.RED + "Too many arguments!");
			}
			if (args.length == 1) {
				Bukkit.broadcastMessage(ChatColor.YELLOW + args[0] + " joined the game");
			}	
		}
		if (cmd.getName().equalsIgnoreCase("fakeleave")) {
			if (args.length < 1) {
				Bukkit.broadcastMessage(ChatColor.YELLOW + sender.getName() + " left the game");
			}
			
			if (args.length > 1) {
				sender.sendMessage(ChatColor.RED + "Too many arguments!");
			}
			
			if (args.length == 1) {
				Bukkit.broadcastMessage(ChatColor.YELLOW + args[0] + " left the game");
			}
			
		}
			
			if(cmd.getName().equalsIgnoreCase("fakeop")) {
				if (args.length < 1) {
						sender.sendMessage(ChatColor.RED + "Please specify a player!");
						
					}
				
				if (args.length > 1) {
					sender.sendMessage(ChatColor.RED + "Too many arguments!");
				
				}
				
				if (args.length == 1) {
					@SuppressWarnings("deprecation")
					Player target = Bukkit.getPlayerExact(args[0]);
						if (target != null) {
							target.sendMessage(ChatColor.YELLOW + "You are now op!");
						}else 
							sender.sendMessage(ChatColor.RED + "Player " + args[0] + " is not online!");
					}
			}
				return true;
	
	}

}
