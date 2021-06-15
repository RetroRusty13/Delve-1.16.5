package rusty.delve.core.init;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import rusty.delve.Delve;
import rusty.delve.core.items.gems.GemCut;
import rusty.delve.core.items.gems.GemUncut;

public class ItemInit 
{
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Delve.MODID);
	
	// Completed items
	public static final RegistryObject<Item> UNCUT_DIAMOND = ITEMS.register("gem/uncut/diamond", () -> new GemUncut());
	public static final RegistryObject<Item> UNCUT_MORGANITE = ITEMS.register("gem/uncut/morganite", () -> new GemUncut());
	public static final RegistryObject<Item> UNCUT_RUBY = ITEMS.register("gem/uncut/ruby", () -> new GemUncut());
	public static final RegistryObject<Item> UNCUT_GARNET = ITEMS.register("gem/uncut/garnet", () -> new GemUncut());
	public static final RegistryObject<Item> UNCUT_TOPAZ = ITEMS.register("gem/uncut/topaz", () -> new GemUncut());
	public static final RegistryObject<Item> UNCUT_EMERALD = ITEMS.register("gem/uncut/emerald", () -> new GemUncut());
	public static final RegistryObject<Item> UNCUT_SAPPHIRE = ITEMS.register("gem/uncut/sapphire", () -> new GemUncut());
	public static final RegistryObject<Item> UNCUT_TANZANITE = ITEMS.register("gem/uncut/tanzanite", () -> new GemUncut());
	public static final RegistryObject<Item> UNCUT_ALEXANDRITE = ITEMS.register("gem/uncut/alexandrite", () -> new GemUncut());
	
	public static final RegistryObject<Item> CUT_DIAMOND = ITEMS.register("gem/cut/diamond", () -> new GemCut());
	public static final RegistryObject<Item> CUT_MORGANITE = ITEMS.register("gem/cut/morganite", () -> new GemCut());
	public static final RegistryObject<Item> CUT_RUBY = ITEMS.register("gem/cut/ruby", () -> new GemCut());
	public static final RegistryObject<Item> CUT_GARNET = ITEMS.register("gem/cut/garnet", () -> new GemCut());
	public static final RegistryObject<Item> CUT_TOPAZ = ITEMS.register("gem/cut/topaz", () -> new GemCut());
	public static final RegistryObject<Item> CUT_EMERALD = ITEMS.register("gem/cut/emerald", () -> new GemCut());
	public static final RegistryObject<Item> CUT_SAPPHIRE = ITEMS.register("gem/cut/sapphire", () -> new GemCut());
	public static final RegistryObject<Item> CUT_TANZANITE = ITEMS.register("gem/cut/tanzanite", () -> new GemCut());
	public static final RegistryObject<Item> CUT_ALEXANDRITE = ITEMS.register("gem/cut/alexandrite", () -> new GemCut());
	
	
	
	/* New item TODO:
	 * 1.) Creation:   ItemInit
	 * 2.) Name:       lang
	 * 3.) Model:      models.item
	 * 4.) Texture:    textures.items */

	// In progress items
	public static final RegistryObject<Item> UNCUT_TOURMALINE = ITEMS.register("gem/uncut/tourmaline", () -> new GemUncut());
	public static final RegistryObject<Item> UNCUT_AMETRINE = ITEMS.register("gem/uncut/ametrine", () -> new GemUncut());
	public static final RegistryObject<Item> UNCUT_NEELAMBARI = ITEMS.register("gem/uncut/neelambari", () -> new GemUncut());

	public static final RegistryObject<Item> CUT_TOURMALINE = ITEMS.register("gem/cut/tourmaline", () -> new GemCut());
	public static final RegistryObject<Item> CUT_AMETRINE = ITEMS.register("gem/cut/ametrine", () -> new GemCut());
	public static final RegistryObject<Item> CUT_NEELAMBARI = ITEMS.register("gem/cut/neelambari", () -> new GemCut());
	
	public static final RegistryObject<Item> UMBER_OPAL = ITEMS.register("gem/opal/umber", () -> new GemCut());
	public static final RegistryObject<Item> EMBER_OPAL = ITEMS.register("gem/opal/ember", () -> new GemCut());
	public static final RegistryObject<Item> CLOUD_OPAL = ITEMS.register("gem/opal/cloud", () -> new GemCut());
	public static final RegistryObject<Item> ENDER_OPAL = ITEMS.register("gem/opal/ender", () -> new GemCut());
}