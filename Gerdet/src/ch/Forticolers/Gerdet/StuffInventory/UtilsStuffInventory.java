package ch.Forticolers.Gerdet.StuffInventory;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class UtilsStuffInventory {
	public static ItemStack[] GetArmorFromPlay(Player player){
		ItemStack[] armor = new ItemStack[36];
		ItemStack separateur = new ItemStack(Material.THIN_GLASS);
		separateur.setDurability((short)3);
		for(ItemStack i : armor){
			i = separateur;
		}
		
		return armor;		
	}
	public static ItemStack[] GetStuffFromPlay(Player player){
		ItemStack[] stuff = new ItemStack[45];
		
		return stuff;		
	}
}
