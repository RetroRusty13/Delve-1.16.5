package rusty.delve.core.init;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import rusty.delve.Delve;

public class BlockInit 
{
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Delve.MODID);
	
	// Completed blocks
	public static final RegistryObject<Block> TEST_BLOCK = BLOCKS.register("test_block", 
			() -> new Block(AbstractBlock.Properties
			.of(Material.STONE, MaterialColor.COLOR_GRAY)
			.strength(0f, 0f)
			.harvestTool(ToolType.PICKAXE)
			.harvestLevel(2)
			.sound(SoundType.METAL)
			.instabreak()));
	
	/* New block TODO
	 * 1.) Creation:      src/main/java/rusty.delve.core.BlockInit
	 * 2.) Name: lang     src/main/resources/assets.delvecore.lang
	 * 3.) Blockstates:   src/main/resources/assets.delvecore.blockstates
	 * 4.) Block model:   src/main/resources/assets.delvecore.models.block
	 * 5.) Item model:    src/main/resources/assets.delvecore.models.item
	 * 6.) Texture:       src/main/resources/assets.delvecore.textures.blocks
	 * 7.) Drops:         src/main/resources/data.delvecore.loot_tables.blocks   */
}