package rusty.delve.core.overlay;

import static net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType.EXPERIENCE;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.realmsclient.dto.WorldTemplate;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.AbstractGui;
import net.minecraft.client.gui.IngameGui;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import net.minecraftforge.client.gui.ForgeIngameGui;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import rusty.delve.Delve;

@EventBusSubscriber(modid = Delve.MODID, bus = Bus.FORGE)
public class ReplaceOverlay extends IngameGui
{
	public ReplaceOverlay(Minecraft mc) 
	{
		super(mc);
	}

	public final static ResourceLocation HEALTH = new ResourceLocation(Delve.MODID, "textures/gui/bars/health");
	public final static ResourceLocation STAM = new ResourceLocation(Delve.MODID, "textures/gui/bars/stamina");
	public final static ResourceLocation MANA = new ResourceLocation(Delve.MODID, "textures/gui/bars/mana");
	public final static ResourceLocation EXP = new ResourceLocation(Delve.MODID, "textures/gui/bars/exp");
	
	@SubscribeEvent
	public static void cancelElementRenders(RenderGameOverlayEvent event)
	{
		if(  event.getType() == ElementType.HEALTH
		  || event.getType() == ElementType.FOOD
		  || event.getType() == ElementType.ARMOR
		  || event.getType() == ElementType.EXPERIENCE
		   ) event.setCanceled(true);
	}
	
	protected void renderExperience(int x, MatrixStack mStack)
    {
        bind(GUI_ICONS_LOCATION);

        RenderSystem.disableBlend();

        if (minecraft.gameMode.hasExperience())
        {
	        this.minecraft.getProfiler().push("expBar");
	  	    this.minecraft.getTextureManager().bind(AbstractGui.GUI_ICONS_LOCATION);
	  	    int i = this.minecraft.player.getXpNeededForNextLevel();
	  	    if (i > 0) 
	  	    {
	  	    	int j = 182;
	  	        int k = (int)(this.minecraft.player.experienceProgress * 183.0F);
	  	        int l = this.screenHeight - 32 + 3;
	  	        this.blit(mStack, x, l, 0, 64, 182, 5);
	  	        if (k > 0) 
	  	        {
	  	        	this.blit(mStack, x, l, 0, 69, k, 5);
	  	        }
	  	    }

  	      this.minecraft.getProfiler().pop();
  	      if (this.minecraft.player.experienceLevel > 0) {
  	         this.minecraft.getProfiler().push("expLevel");
  	         String s = "" + this.minecraft.player.experienceLevel;
  	         int i1 = (this.screenWidth - this.getFont().width(s)) / 2;
  	         int j1 = this.screenHeight - 31 - 4;
  	         this.getFont().draw(mStack, s, (float)(i1 + 1), (float)j1, 0);
  	         this.getFont().draw(mStack, s, (float)(i1 - 1), (float)j1, 0);
  	         this.getFont().draw(mStack, s, (float)i1, (float)(j1 + 1), 0);
  	         this.getFont().draw(mStack, s, (float)i1, (float)(j1 - 1), 0);
  	         this.getFont().draw(mStack, s, (float)i1, (float)j1, 8453920);
  	         this.minecraft.getProfiler().pop();
  	      }
        }
        RenderSystem.enableBlend();
        
        post(EXPERIENCE, mStack);
        MinecraftForge.EVENT_BUS.post(new RenderGameOverlayEvent.Post(mStack, EXPERIENCE));
    }
}