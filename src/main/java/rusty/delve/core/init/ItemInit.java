package rusty.delve.core.init;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import rusty.delve.Delve;

public class ItemInit 
{
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Delve.MODID);
	
	/* New Item TODO:
	 * Creation:   ItemInit
	 * Name:       lang
	 * Model:      models.item
	 * Texture:    textures.items */

	public static final RegistryObject<Item> TEST = ITEMS.register("test_item", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)));
}