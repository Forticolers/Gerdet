package ch.Forticolers.Gerdet.StuffInventory;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class UtilsStuffInventory 
{
	public static ItemStack[] GetArmorFromPlay(Player player)
	{
		ItemStack sep = new ItemStack(Material.STAINED_GLASS_PANE,1,(short)15);
				
		ItemStack[] armor = new ItemStack[36];
		
		armor[0] = sep;
		armor[1] = sep;
		armor[2] = sep;
		armor[3] = sep;
		armor[4] = new ItemStack(Material.DIAMOND_SWORD);
		armor[5] = sep;
		armor[6] = sep;
		armor[7] = sep;
		armor[8] = sep;
		armor[9] = sep;
		armor[10] = sep;
		armor[11] = sep;
		armor[12] = sep;
		armor[13] = new ItemStack(Material.DIAMOND_SWORD);
		armor[14] = sep;
		armor[15] = sep;
		armor[16] = sep;
		armor[17] = sep;
		armor[18] = sep;
		armor[19] = sep;
		armor[20] = sep;
		armor[21] = sep;
		armor[22] = new ItemStack(Material.DIAMOND_SWORD);
		armor[23] = sep;
		armor[24] = sep;
		armor[25] = sep;
		armor[26] = sep;
		armor[27] = sep;
		armor[28] = sep;
		armor[29] = sep;
		armor[30] = sep;
		armor[31] = new ItemStack(Material.DIAMOND_SWORD);
		armor[32] = sep;
		armor[33] = sep;
		armor[34] = sep;
		armor[35] = sep;
		
		
		return armor;		
	}
	public static ItemStack[] GetStuffFromPlay(Player player){
		ItemStack[] stuff = new ItemStack[45];
		
		return stuff;		
	}
}
