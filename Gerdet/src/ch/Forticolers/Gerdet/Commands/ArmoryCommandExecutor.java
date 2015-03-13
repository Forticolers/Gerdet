package ch.Forticolers.Gerdet.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import ch.Forticolers.Gerdet.Utils;

public class ArmoryCommandExecutor implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
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

}
