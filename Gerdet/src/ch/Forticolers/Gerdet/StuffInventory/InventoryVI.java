package ch.Forticolers.Gerdet.StuffInventory;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import ch.Forticolers.Gerdet.VirtualInventory.IVirtualInventory;

public class InventoryVI implements IVirtualInventory 
{
	Inventory inventory;
	Player owner;
	
	@Override
	public Inventory getInventory() 
	{
		return this.inventory;
	}

	@Override
	public Player getOwner() 
	{
		return this.owner;
	}

	@Override
	public Inventory createInventory(Player owner, ItemStack[] items) 
	{
		this.inventory = Bukkit.createInventory(owner, 9,ChatColor.UNDERLINE + "Inv");
		
		this.inventory.setContents(items);
		
		this.owner = owner;
		
		return this.inventory;
	}

	@Override
	public void showInventory(Player player, Inventory inventory) 
	{
		player.openInventory(inventory);
	}
}
