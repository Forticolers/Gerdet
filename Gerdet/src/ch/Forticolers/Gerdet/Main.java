package ch.Forticolers.Gerdet;

import java.io.File;
import java.io.IOException;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener
{
	@Override
	public void onLoad() 
	{
		//Variables ici
		
		//Codes ici
	
	}
	
	@Override
	public void onEnable() 
	{
		//Variables ici
		
		//Codes ici
		init();
	}
	
	@Override
	public void onDisable() 
	{
		//Variables ici
		
		//Codes ici
		saveConfig();
		System.out.println("Sauvegarde de la configuration");
	}
	
	private void init()
	{
		//ici il y auras les listener pour les VirtualInventoy et le methodes qui on besoin d'etre executées a l'init.
		
		//Les listener vont etre redirigés dans un autre classe dans le future----------------------------------------------------
		Bukkit.getPluginManager().registerEvents(this, this);
		
		//Création du dossier du plugin
		File dossier;		
		dossier = new File (Bukkit.getPluginManager().getPlugin("Gerdet").getDataFolder()+"");
		
		if(dossier.exists())
		{
			getLogger().info("Directory already existed !");
		}
		else
		{
			dossier.mkdirs();
			getLogger().info("Directory succesfully created !");
		}
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) 
	{
		//Variables ici
		
		Player player = (Player)sender;
		
		//Codes ici
		if(sender instanceof Player)
		{
			if(command.getName().equalsIgnoreCase("armory"))
			{
				if(args.length > 1)
				{
					if(args[0].equalsIgnoreCase("show"))
					{
						Utils.sendCustomMessage(player, "show");
						return false;
					}
					if(args[0].equalsIgnoreCase("modify"))
					{
						Utils.sendCustomMessage(player, "modify");
						return false;
					}
					if(args[0].equalsIgnoreCase("select"))
					{
						Utils.sendCustomMessage(player, "select");
						return false;
					}
					if(args[0].equalsIgnoreCase("reset"))
					{
						Utils.sendCustomMessage(player, "reset");
						return false;
					}					
				}
				Bukkit.dispatchCommand(sender, "help " + command.getName());
				return true;
			}
		}
		return false;
	}
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event)
	{
		//Variables ici
		final Player player = event.getPlayer();		
		//Codes ici
			//Message bienvenue
			Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable(){			
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
				getLogger().info("Directory already existed !");
			}
			else
			{
				dossier.mkdirs();
				getLogger().info("Directory succesfully created !");
			}
			//Création des fichier stuff et armure
			File fileArmor, fileStuff;				
			fileArmor = new File(Bukkit.getPluginManager().getPlugin("Gerdet").getDataFolder() +"\\" + player.getName() +"\\"+player.getName()+"_Armor.txt");
			fileStuff = new File(Bukkit.getPluginManager().getPlugin("Gerdet").getDataFolder() +"\\" + player.getName() +"\\"+player.getName()+"_Stuff.txt");
			//armure
			if(!(fileArmor.exists()))
			{
				try
				{
					fileArmor.createNewFile();
				}
				catch(IOException e)
				{
					e.printStackTrace();
				}
			}
			//stuff
			if(!(fileStuff.exists())){
				try
				{
					fileStuff.createNewFile();
				}
				catch(IOException e)
				{
					e.printStackTrace();
				}				
			}
	}

}
