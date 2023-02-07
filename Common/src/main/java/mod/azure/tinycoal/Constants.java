package mod.azure.tinycoal;

import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Constants {

	public static final String MODID = "tinycoal";
	public static final String MOD_NAME = "Tiny Coal";
	public static final Logger LOG = LoggerFactory.getLogger(MOD_NAME);

	public static ResourceLocation rl(String name){
		return new ResourceLocation(MODID, name);
	}
}