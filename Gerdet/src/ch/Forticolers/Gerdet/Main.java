package ch.Forticolers.Gerdet;

import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

import ch.Forticolers.Gerdet.Commands.ArmoryCommandExecutor;
import ch.Forticolers.Gerdet.Listeners.PlayerJoinListener;
import ch.Forticolers.Gerdet.StuffInventory.ArmorListener;
import ch.Forticolers.Gerdet.StuffInventory.StuffListener;

public class Main extends JavaPlugin
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
		
		CommandExecutor armoryExecutor = new ArmoryCommandExecutor();
		getCommand("armory").setExecutor(armoryExecutor);
		
		//-----------Instances des Listeners nécessaires au bon fonctionnement du plugin.----------------------
		@SuppressWarnings("unused")
		ArmorListener ArmorLInstance = new ArmorListener(this);
		@SuppressWarnings("unused")
		StuffListener StuffLInstance = new StuffListener(this);		
		@SuppressWarnings("unused")
		PlayerJoinListener PJLInstance = new PlayerJoinListener(this);
	}
}
