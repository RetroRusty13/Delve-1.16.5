package rusty.delve.core.items.gems;

import java.util.List;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import rusty.delve.core.items.Tab;
import rusty.delve.core.util.ItemRarities;

public class GemCut extends Item
{
	public GemCut() 
	{
		super(new Item.Properties()
				.tab(Tab.TAB_GEMSMITHING)
				.rarity(ItemRarities.RARE)
				.fireResistant()
				.stacksTo(1));
	}
	
	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack stack, World world, List<ITextComponent> text, ITooltipFlag tooltip) 
	{
		CompoundNBT tag = stack.getOrCreateTag();
		text.add(new StringTextComponent("\u00A77Size: \u00A7r" + tag.getInt("size")));
		text.add(new StringTextComponent("\u00A77Color: \u00A7r" + tag.getInt("color")));
		text.add(new StringTextComponent("\u00A77Clarity: \u00A7r" + tag.getInt("clarity")));
		text.add(new StringTextComponent("\u00A77Cut: \u00A7r" + tag.getInt("cut")));
	}
}