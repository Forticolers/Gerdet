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

public class Main extends JavaPlugin implements Listener{

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
	//Variables ici
		//Player player = (Player)sender;
	//Codes ici
		if(sender instanceof Player){
			if(command.getName().equalsIgnoreCase("armory")){
				if(args.length > 1){
					if(args[0].equalsIgnoreCase("show")){
						
						return false;
					}
					else if(args[0].equalsIgnoreCase("modify")){
							
						return false;
					}
					else if(args[0].equalsIgnoreCase("select")){
							
						return false;
					}
					else if(args[0].equalsIgnoreCase("reset")){
							
						return false;
					}					
				}
				Bukkit.dispatchCommand(sender, "help " + command.getName());
				return true;
			}
		}
		return false;
	}

	@Override
	public void onDisable() {
	//Variables ici
		
	//Codes ici
		
	}

	@Override
	public void onEnable() {
	//Variables ici
		
	//Codes ici
		Bukkit.getPluginManager().registerEvents(this, this);
	}

	@Override
	public void onLoad() {
	//Variables ici
		
	//Codes ici
		//Cr�ation du dossier du plugin
		File dossier;		
		dossier = new File (Bukkit.getPluginManager().getPlugin("Gerdet").getDataFolder()+"");
		if(dossier.exists()){
			getLogger().info("Directory already existed !");
		}
		else{
			dossier.mkdirs();
			getLogger().info("Directory succesfully created !");
		}		
	}
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event){
	//Variables ici
		Player player = event.getPlayer();		
	//Codes ici
		//Message bienvenue
			Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable(){			
				public void run(){
					player.sendMessage(ChatColor.AQUA+"Bienvenue, "+ player.getName() + "\nFaite /help pour voir \nles commandes qui vont ont �t� attribu�es");
				}
			}, 10);
		//Cr�ation du dossier inventaire
			File dossier;		
			dossier = new File (Bukkit.getPluginManager().getPlugin("Gerdet").getDataFolder()+"\\"+player.getName());
			if(dossier.exists()){
				getLogger().info("Directory already existed !");
			}
			else{
				dossier.mkdirs();
				getLogger().info("Directory succesfully created !");
			}
		//Cr�ation des fichier stuff et armure
			File fileArmor, fileStuff;				
			fileArmor = new File(Bukkit.getPluginManager().getPlugin("Gerdet").getDataFolder() +"\\" + player.getName() +"\\"+player.getName()+"_Armor.txt");
			fileStuff = new File(Bukkit.getPluginManager().getPlugin("Gerdet").getDataFolder() +"\\" + player.getName() +"\\"+player.getName()+"_Stuff.txt");
		//armure
			if(!(fileArmor.exists())){
				try{
					fileArmor.createNewFile();
				}
				catch(IOException e){
					e.printStackTrace();
				}				
			}
		//stuff
			if(!(fileStuff.exists())){
				try{
					fileStuff.createNewFile();
				}
				catch(IOException e){
					e.printStackTrace();
				}				
			}
	}

}
