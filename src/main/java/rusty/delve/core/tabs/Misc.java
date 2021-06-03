package rusty.delve.core.tabs;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import rusty.delve.core.init.ItemInit;

public class Misc extends ItemGroup
{
	public static final Misc misc = new Misc(ItemGroup.TABS.length, "delvetab/misc");
	
	public Misc(int index, String label)
	{
		super(index, label);
	}

	@Override
	public ItemStack makeIcon() 
	{
		return new ItemStack(ItemInit.TEST_ITEM.get());
	}
}