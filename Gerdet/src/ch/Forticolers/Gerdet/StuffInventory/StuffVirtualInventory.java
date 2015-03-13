package ch.Forticolers.Gerdet.StuffInventory;

import net.minecraft.server.v1_8_R1.ItemStack;

import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class StuffVirtualInventory 
{	
	public StuffVirtualInventory()
	{
		
	}
	
	public Inventory initOnFirstLogin(Player player)
	{
		return null;	
	}
	public static ItemStack[] GetArmorFromPlay(Player player){
		ItemStack[] armor = new ItemStack[36];
		
		return armor;		
	}
}
