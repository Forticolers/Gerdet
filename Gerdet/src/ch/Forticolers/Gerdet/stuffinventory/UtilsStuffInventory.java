package ch.Forticolers.Gerdet.stuffinventory;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class UtilsStuffInventory 
{
	public static ItemStack[] GetArmorFromPlay(Player player)
	{
		ItemStack sep = new ItemStack(Material.STAINED_GLASS_PANE,1,(short)15);
		ItemMeta sm = sep.getItemMeta();
		sm.setDisplayName(ChatColor.RESET + "");
		sep.setItemMeta(sm);
				
		ItemStack[] armor = new ItemStack[36];
		
		armor[0] = new ItemStack(Material.LEATHER_HELMET);
		armor[1] = sep;
		armor[2] = sep;
		armor[3] = sep;
		armor[4] = sep;
		armor[5] = sep;
		armor[6] = sep;
		armor[7] = sep;
		armor[8] = sep;
		armor[9] = new ItemStack(Material.LEATHER_CHESTPLATE);
		armor[10] = sep;
		armor[11] = sep;
		armor[12] = sep;
		armor[13] = sep;
		armor[14] = sep;
		armor[15] = sep;
		armor[16] = sep;
		armor[17] = sep;
		armor[18] = new ItemStack(Material.LEATHER_LEGGINGS);
		armor[19] = sep;
		armor[20] = sep;
		armor[21] = sep;
		armor[22] = sep;
		armor[23] = sep;
		armor[24] = sep;
		armor[25] = sep;
		armor[26] = sep;
		armor[27] = new ItemStack(Material.LEATHER_BOOTS);
		armor[28] = sep;
		armor[29] = sep;
		armor[30] = sep;
		armor[31] = sep;
		armor[32] = sep;
		armor[33] = sep;
		armor[34] = sep;
		armor[35] = sep;
		
		
		return armor;		
	}
	public static ItemStack[] GetStuffFromPlay(Player player){
		ItemStack sep = new ItemStack(Material.STAINED_GLASS_PANE,1,(short)15), bow = new ItemStack(Material.BOW), air = new ItemStack(Material.AIR);
		ItemMeta sm = sep.getItemMeta();
		sm.setDisplayName(ChatColor.RESET + "");
		sep.setItemMeta(sm);
		bow.addEnchantment(Enchantment.ARROW_INFINITE, 1);
		
		ItemStack[] stuff = new ItemStack[45];
		stuff[0] = new ItemStack(Material.ARROW);
		stuff[1] = air;
		stuff[2] = air;
		stuff[3] = air;
		stuff[4] = air;
		stuff[5] = air;
		stuff[6] = air;
		stuff[7] = air;
		stuff[8] = air;
		stuff[9] = air;
		stuff[10] = air;
		stuff[11] = air;
		stuff[12] = air;
		stuff[13] = air;
		stuff[14] = air;
		stuff[15] = air;
		stuff[16] = air;
		stuff[17] = air;
		stuff[18] = air;
		stuff[19] = air;
		stuff[20] = air;
		stuff[21] = air;
		stuff[22] = air;
		stuff[23] = air;
		stuff[24] = air;
		stuff[25] = air;
		stuff[26] = air;
		//*Separateur**//
		stuff[27] = sep;
		stuff[28] = sep;
		stuff[29] = sep;
		stuff[30] = sep;
		stuff[31] = sep;
		stuff[32] = sep;
		stuff[33] = sep;
		stuff[34] = sep;
		stuff[35] = sep;
		stuff[36] = new ItemStack(Material.STONE_SWORD);
		stuff[37] = bow;
		stuff[38] = new ItemStack(Material.APPLE);
		stuff[39] = new ItemStack(Material.COOKED_MUTTON,32);
		stuff[40] = air;
		stuff[41] = air;
		stuff[42] = air;
		stuff[43] = air;
		stuff[44] = air;
		return stuff;		
	}
}
