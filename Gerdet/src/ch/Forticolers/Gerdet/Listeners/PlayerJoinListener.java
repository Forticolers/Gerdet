package ch.Forticolers.Gerdet.Listeners;

import java.io.File;
import java.io.IOException;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.Plugin;

public class PlayerJoinListener implements Listener 
{
	//UTILISER CETTE VARIABLE POUR AVOIR ACCES A METHODES DE LA CLASSE QUI EXTENDS JAVAPLUGIN (MAIN)
	Plugin pl;	
	
	public PlayerJoinListener(Plugin p) 
	{
		Bukkit.getPluginManager().registerEvents(this, p);
		pl = p;
	}
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event)
	{
		//Variables ici
		final Player player = event.getPlayer();		
		//Codes ici
		//Message bienvenue
		Bukkit.getScheduler().scheduleSyncDelayedTask(pl, new Runnable(){			
			@Override
			public void run()
			{
				player.sendMessage(ChatColor.AQUA+"Bienvenue, "+ player.getName() + "\nFaite /help pour voir \nles commandes qui vont ont été attribuées");
			}
		}, 10);
		
		//Création du dossier inventaire
		File dossier;		
		dossier = new File (Bukkit.getPluginManager().getPlugin("Gerdet").getDataFolder()+"\\"+player.getName());
		if(dossier.exists())
		{
			pl.getLogger().info("Directory already existed !");
		}
		else
		{
			dossier.mkdirs();
			pl.getLogger().info("Directory succesfully created !");
		}
		
		//Création des fichier stuff et armure
		File fileArmor, fileStuff;	
		fileArmor = new File(Bukkit.getPluginManager().getPlugin("Gerdet").getDataFolder() +"\\" + player.getName() +"\\"+player.getName()+"_Armor.yml");
		fileStuff = new File(Bukkit.getPluginManager().getPlugin("Gerdet").getDataFolder() +"\\" + player.getName() +"\\"+player.getName()+"_Stuff.yml");
		
		FileConfiguration armorYaml = YamlConfiguration.loadConfiguration(fileArmor);
		FileConfiguration stuffYaml = YamlConfiguration.loadConfiguration(fileStuff);
					
		try 
		{
			armorYaml.save(fileArmor);
			stuffYaml.save(fileStuff);
		} 
		catch (IOException e1) 
		{
			e1.printStackTrace();
		}
	}
}
