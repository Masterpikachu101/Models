package mobs;

import mobs.common.EntityCereberus;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;

@Mod(modid = Mobs.MODID, version = Mobs.VERSION)
public class Mobs {
	public static final String MODID = "Mianite Mod";
	public static final String VERSION = "1.0";
	
	@Instance(MODID)
	public static Mobs instance;
	
	@SidedProxy(clientSide="mobs.ClientProxy", serverSide="mobs.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler 
	public void preInit(FMLPreInitializationEvent event){
		registerEntity(EntityCereberus.class, "Cerebus", 0x60d9f5, 0x0f5170);
		proxy.registerRenderers();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		}

	@SuppressWarnings("unchecked")
	public static void registerEntity(Class<? extends Entity> entityClass, String entityName, int bkEggColor, int fgEggColor)
	{
	int entityID = EntityRegistry.findGlobalUniqueEntityId();
	
	EntityRegistry.registerGlobalEntityID(entityClass, entityName, entityID);
	EntityRegistry.registerModEntity(entityClass, entityName, entityID, instance, 64, 1, true);
	EntityList.entityEggs.put(Integer.valueOf(entityID), new EntityList.EntityEggInfo(entityID, bkEggColor, fgEggColor));
	}
}
