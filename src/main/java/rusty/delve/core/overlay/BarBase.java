package rusty.delve.core.overlay;

import net.minecraft.client.gui.AbstractGui;
import net.minecraft.util.ResourceLocation;

public abstract class BarBase extends AbstractGui 
{
	public static int BAR_WIDTH, BAR_HEIGHT;
	public static ResourceLocation TEXTURE;

	
	
	
	public int getBarWidth() 
	{ 
		return BAR_WIDTH; 
	}
	
	public int getBarHeight() 
	{ 
		return BAR_HEIGHT; 
	}
	
	public ResourceLocation getTexture() 
	{ 
		return TEXTURE; 
	}
}