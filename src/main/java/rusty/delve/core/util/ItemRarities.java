package rusty.delve.core.util;

import net.minecraft.item.Rarity;
import net.minecraft.util.text.TextFormatting;

public class ItemRarities 
{
	public static Rarity COMMON;
	public static Rarity UNCOMMON;
	public static Rarity RARE;
	public static Rarity EPIC;
	public static Rarity LEGENDARY;
	public static Rarity UNIQUE;
	
	public static void createRarities()
	{
		COMMON = Rarity.create("delve:rarity/common", TextFormatting.WHITE);
		UNCOMMON = Rarity.create("delve:rarity/uncommon", TextFormatting.GREEN);
		RARE = Rarity.create("delve:rarity/rare", TextFormatting.BLUE);
		EPIC = Rarity.create("delve:rarity/epic", TextFormatting.LIGHT_PURPLE);
		LEGENDARY = Rarity.create("delve:rarity/legendary", TextFormatting.GOLD);
		UNIQUE = Rarity.create("delve:rarity/unique", TextFormatting.RED);
	}
}