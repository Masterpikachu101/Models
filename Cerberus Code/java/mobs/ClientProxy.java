package mobs;

import mobs.client.RenderCereberus;
import mobs.common.EntityCereberus;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy{

@Override
public void registerRenderers() {
RenderingRegistry.registerEntityRenderingHandler(EntityCereberus.class, new RenderCereberus());

}
}