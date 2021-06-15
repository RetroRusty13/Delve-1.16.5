package rusty.delve.core.util;

import org.lwjgl.glfw.GLFW;

import net.minecraft.client.Minecraft;
import net.minecraft.client.util.InputMappings;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class KeyPresses 
{
	private static final long KEYBOARD = Minecraft.getInstance().getWindow().getWindow();
	
	@OnlyIn(Dist.CLIENT)
	public static boolean keyShift()
	{
		return InputMappings.isKeyDown(KEYBOARD, GLFW.GLFW_KEY_LEFT_SHIFT) || InputMappings.isKeyDown(KEYBOARD, GLFW.GLFW_KEY_RIGHT_SHIFT);
	}
}