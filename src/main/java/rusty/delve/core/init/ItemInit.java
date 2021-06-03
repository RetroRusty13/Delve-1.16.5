package rusty.delve.core.init;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import rusty.delve.Delve;
import rusty.delve.core.tabs.Misc;

public class ItemInit 
{
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Delve.MODID);
	
	// Completed items
	public static final RegistryObject<Item> TEST_ITEM = ITEMS.register("test_item", () -> new Item(new Item.Properties().tab(Misc.misc)));
	
	
	
	/* New item TODO:
	 * 1.) Creation:   ItemInit
	 * 2.) Name:       lang
	 * 3.) Model:      models.item
	 * 4.) Texture:    textures.items */

	// In progress items
	
}