package rusty.delve.core.items;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import rusty.delve.core.init.BlockInit;
import rusty.delve.core.init.ItemInit;

public class Tab extends ItemGroup
{
	public static final Tab TAB_MISC = new Tab(ItemGroup.TABS.length, "tab/misc") 
	{
	      @OnlyIn(Dist.CLIENT)
	      public ItemStack makeIcon()
	      {
	         return new ItemStack(BlockInit.TEST_BLOCK.get());
	      }
	};
	
	public static final Tab TAB_GEMSMITHING = new Tab(ItemGroup.TABS.length, "tab/gemsmithing") 
	{
	      @OnlyIn(Dist.CLIENT)
	      public ItemStack makeIcon()
	      {
	         return new ItemStack(ItemInit.UNCUT_DIAMOND.get());
	      }
	};
	
	
	
	public Tab(int index, String label)
	{
		super(index, label);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack makeIcon() 
	{
		return new ItemStack(Items.STICK);
	}
}