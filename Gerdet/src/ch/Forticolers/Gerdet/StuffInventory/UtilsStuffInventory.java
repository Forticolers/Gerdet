package ch.Forticolers.Gerdet.StuffInventory;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class UtilsStuffInventory {
	public static ItemStack[] GetArmorFromPlay(Player player){
		ItemStack[] armor = new ItemStack[36];
		
		for(ItemStack i : armor){
			i = new ItemStack(Material.THIN_GLASS);
		}
		
		return armor;		
	}
	public static ItemStack[] GetStuffFromPlay(Player player){
		ItemStack[] stuff = new ItemStack[45];
		
		return stuff;		
	}
}
