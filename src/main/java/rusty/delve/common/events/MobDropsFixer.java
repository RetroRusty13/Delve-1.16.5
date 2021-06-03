package rusty.delve.common.events;

import java.util.ArrayList;
import java.util.Set;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import rusty.delve.Delve;

@EventBusSubscriber(modid = Delve.MODID, bus = Bus.FORGE)
public class MobDropsFixer 
{
	@SubscribeEvent
	public static void onLivingDamaged(LivingDamageEvent event)
	{
		// Checks if damage source was a player
		DamageSource source = event.getSource();
		if (!(source.getEntity() instanceof PlayerEntity)) 
		{
			return;
		}
		PlayerEntity player = (PlayerEntity) source.getEntity();
		Entity target = event.getEntity();
		
		// Checks if player has damaged the target before
		Set<String> tags = target.getTags();
		String name = player.getName().getString();
		int index = -1;
		boolean flag = false;
		String tag = "";
		for (String str : tags)
		{
			if(str.indexOf("delvedamage+") == 0)
			{
				tag = str;
				index = str.indexOf(".");
				if (index < -1) str = str.substring(12, index + 1);
				if(str.equals(name)) flag = true;
				if(flag) return;
			}
		}
		
		// Adjusts total damage done by players
		int totalDamage = 0;
		if(flag)
		{
			totalDamage = Integer.parseInt(tag.substring(index + 1));
			target.removeTag(tag);
		}
		totalDamage += event.getAmount();
		target.addTag("delvedamagetotal+" + name + "." + totalDamage);
	}
	
	@SubscribeEvent
	public static void onLivingKilled(LivingDeathEvent event)
	{
		Entity target = event.getEntity();
		Set<String> tags = target.getTags();
		
		// Gets the list of players that damaged the target entity
		ArrayList<String> playersDamagedEntity = new ArrayList<String>();
		for (String str : tags)
		{
			if(str.indexOf("delvedamage+") == 0)
			{
				playersDamagedEntity.add(str);
			}
		}
		
		// Gets the lists of players and damages done to target entity
		ArrayList<String> players = new ArrayList<String>();
		ArrayList<Integer> damages = new ArrayList<Integer>();
		for(int i = 0; i < playersDamagedEntity.size(); i++)
		{
			String str = playersDamagedEntity.get(i);
			players.add(str.substring(12, str.indexOf(".")));
			damages.add(Integer.parseInt(str.substring(str.indexOf(".") + 1)));
		}
		
		// Adds exp or drops to player inventories proportional to the damage they dealt
		for(int i = 0; i < players.size(); i++)
		{
			
		}
	}
}