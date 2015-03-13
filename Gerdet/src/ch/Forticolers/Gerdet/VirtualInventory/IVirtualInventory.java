package ch.Forticolers.Gerdet.VirtualInventory;

import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public interface IVirtualInventory 
{
	/** 
	 * @return the inventory
	 */
	Inventory getInventory();
	
	/**
	 * 
	 * @return l'owner de l'inventory
	 */
	Player getOwner();
	
	/**
	 * @param items Les items présents dans l'inventory
	 * @param owner L'owner de l'inventory
	 * @return L'inventory créé
	 */
	Inventory createInventory(Player owner, ItemStack[] items);
	
	/**
	 * @param player le player qui va ouvrir l'inventory
	 * @param inventory L'inventory
	 */
	void showInventory(Player player, Inventory inventory);
}
