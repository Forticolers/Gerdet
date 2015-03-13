package ch.Forticolers.Gerdet.StuffInventory;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import ch.Forticolers.Gerdet.VirtualInventory.IVirtualInventory;

public class ArmorVirtualInventory implements IVirtualInventory 
{
	Inventory inventory;
	
	@Override
	public Inventory getInventory() 
	{
		return this.inventory;
	}

	@Override
	public Inventory createInventory(ItemStack[] items) 
	{
		this.inventory = Bukkit.createInventory(null, 36,ChatColor.UNDERLINE + "Armure");
		
		this.inventory.setContents(items);

		return this.inventory;
	}

	@Override
	public void showInventory(Player player, Inventory inventory) 
	{
		player.openInventory(inventory);
	}
	
	public static ItemStack[] GetStuffFromPlay(Player player){
		ItemStack[] stuff = new ItemStack[36];
		
		return stuff;		
	}
}
