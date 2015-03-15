package ch.Forticolers.Gerdet;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;

public class Utils 
{
	public static void sendMessageAllPlayers(String message)
	{
		for(Player p : Bukkit.getServer().getOnlinePlayers())
		{
			p.sendMessage(ChatColor.GOLD + "[Gerdet] " + ChatColor.RESET + message);
		}
	}
	
	public static void sendCustomMessage(Player p , String message)
	{
		p.sendMessage(ChatColor.GOLD + "[Gerdet] " + ChatColor.RESET + message);
	}
	
	public static void logInfo(String info)
	{
		Bukkit.getServer().getLogger().info(info);
	}
	
	public static void ClearInventoryAndPotionEffects(Player player)
	{
		player.getInventory().clear();
		
		player.getInventory().setArmorContents(null);
		
		for (PotionEffect e : player.getActivePotionEffects())
		{
			if(player.hasPotionEffect(e.getType()))
			{
				player.removePotionEffect(e.getType());
			}
		}
	}
	
	public static void removeAllPotionEffects(Player player)
	{
		for (PotionEffect e : player.getActivePotionEffects())
		{
			if(player.hasPotionEffect(e.getType()))
			{
				player.removePotionEffect(e.getType());
			}
		}
	}
	
	public static String getArmorFilePath(Player player)
	{
		return Bukkit.getPluginManager().getPlugin("Gerdet").getDataFolder() +"\\" + player.getName() +"\\"+player.getName()+"_Armor.yml";
	}
	
	public static String getStuffFilePath(Player player)
	{
		return Bukkit.getPluginManager().getPlugin("Gerdet").getDataFolder() +"\\" + player.getName() +"\\"+player.getName()+"_Stuff.yml";
	}
}
