package ch.Forticolers.Gerdet.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import ch.Forticolers.Gerdet.Utils;
import ch.Forticolers.Gerdet.stuffinventory.ArmorVirtualInventory;
import ch.Forticolers.Gerdet.stuffinventory.StuffVirtualInventory;
import ch.Forticolers.Gerdet.stuffinventory.UtilsStuffInventory;

public class ArmoryCommandExecutor implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) 
	{
				//Variables ici
		
				Player player = (Player)sender;
				
				ArmorVirtualInventory AVIInstance = new ArmorVirtualInventory();
				StuffVirtualInventory SVIInstance = new StuffVirtualInventory();
				
				//Codes ici
				if(sender instanceof Player)
				{
					if(command.getName().equalsIgnoreCase("armory"))
					{
						if(args.length > 0)
						{
							if(args[0].equalsIgnoreCase("show"))
							{
								if(args.length > 1)
								{
									if (args[1].equalsIgnoreCase("armor"))
									{	
										Inventory inventory = AVIInstance.createInventory(UtilsStuffInventory.GetArmorFromPlay(player));
									
										AVIInstance.showInventory(player, inventory);
									
										return true;
									}
									if (args[1].equalsIgnoreCase("stuff"))
									{
										Inventory inventory = SVIInstance.createInventory(UtilsStuffInventory.GetStuffFromPlay(player));
									
										SVIInstance.showInventory(player, inventory);
										return true;
									}
									
									return false;
								
								}
								
								
								Utils.sendCustomMessage(player, "show");								
								
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

}
