package ch.Forticolers.Gerdet.Commands;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import ch.Forticolers.Gerdet.Utils;
import ch.Forticolers.Gerdet.StuffInventory.ArmorVirtualInventory;
import ch.Forticolers.Gerdet.StuffInventory.StuffVirtualInventory;
import ch.Forticolers.Gerdet.StuffInventory.UtilsStuffInventory;

public class ArmoryCommandExecutor implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) 
	{
				//Variables ici
		
				Player player = (Player)sender;
				
				ArmorVirtualInventory VIInstance = new ArmorVirtualInventory();
				
				//Codes ici
				if(sender instanceof Player)
				{
					if(command.getName().equalsIgnoreCase("armory"))
					{
						if(args.length > 0)
						{
							if(args[0].equalsIgnoreCase("show"))
							{
								Inventory inventory = VIInstance.createInventory(UtilsStuffInventory.GetArmorFromPlay(player));
								
								VIInstance.showInventory(player, inventory);
								
								Utils.sendCustomMessage(player, "show");								
								return true;
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
