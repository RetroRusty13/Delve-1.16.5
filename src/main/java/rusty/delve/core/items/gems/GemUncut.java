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

public class GemUncut extends Item
{
	public GemUncut() 
	{
		super(new Item.Properties()
				.tab(Tab.TAB_GEMSMITHING)
				.rarity(ItemRarities.UNCOMMON)
				.fireResistant()
				.stacksTo(1));
	}
	
	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack stack, World world, List<ITextComponent> text, ITooltipFlag tooltip) 
	{
		CompoundNBT tag = stack.getOrCreateTag();
		text.add(new StringTextComponent("Size: " + tag.getInt("size")));
		text.add(new StringTextComponent("Color: " + tag.getInt("color")));
		text.add(new StringTextComponent("Clarity: " + tag.getInt("clarity")));
		super.appendHoverText(stack, world, text, tooltip);
	}
}