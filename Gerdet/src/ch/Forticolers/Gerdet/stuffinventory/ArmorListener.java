package ch.Forticolers.Gerdet.stuffinventory;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.plugin.Plugin;

public class ArmorListener implements Listener 
{
	public ArmorListener(Plugin p) 
	{
		Bukkit.getPluginManager().registerEvents(this, p);
	}
	
	@EventHandler
	public void onInventoryClick(final InventoryClickEvent e)
	{		
		if (e.getInventory().getTitle().contains("Armure"))
		{
			e.setCancelled(true);
		}
	}
}
