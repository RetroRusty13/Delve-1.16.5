package rusty.delve;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import rusty.delve.core.init.BlockInit;
import rusty.delve.core.init.ItemInit;
import rusty.delve.core.items.Tab;
import rusty.delve.core.util.ItemRarities;

@Mod("delve")
@Mod.EventBusSubscriber(modid = Delve.MODID, bus = Bus.MOD)
public class Delve
{

    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "delve";
    
    public Delve() 
    {
    	IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

    	ItemRarities.createRarities();
    	BlockInit.BLOCKS.register(bus);
    	ItemInit.ITEMS.register(bus);
    	
        MinecraftForge.EVENT_BUS.register(this);
    }
    
    @SubscribeEvent
    public static void onRegisterItems(final RegistryEvent.Register<Item> event)
    {
    	BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> 
    	{ 
    		event.getRegistry().register(new BlockItem(block, new Item.Properties().tab(Tab.TAB_MISC)).setRegistryName(block.getRegistryName())); 
    	});
    }
}