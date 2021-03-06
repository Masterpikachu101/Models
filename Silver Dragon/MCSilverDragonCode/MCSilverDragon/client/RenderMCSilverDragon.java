package yourModPackage.client.renders;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import yourModPackage.common.entities.mobs.EntityMCSilverDragon;

public class RenderMCSilverDragon extends RenderLiving {

	public static final ResourceLocation MCSilverDragon_texture = new ResourceLocation("yourAssetsFolder", "textures/models/MCSilverDragon.png");
	public static ModelMCSilverDragon modelMCSilverDragon = new ModelMCSilverDragon();	
	public static float modelHeight = 2F;
	
	public RenderMCSilverDragon()
    {
        super(modelMCSilverDragon, 1F);
    }
	
	@Override
	public void doRender(Entity _entity, double posX, double posY, double posZ, float var8, float var9) {
		EntityMCSilverDragon entity = (EntityMCSilverDragon) _entity;
				
		GL11.glPushMatrix();
		GL11.glDisable(GL11.GL_CULL_FACE);
		super.doRender(_entity, posX, posY, posZ, var8, var9);
		GL11.glEnable(GL11.GL_CULL_FACE);
		GL11.glPopMatrix();
	}
	
	@Override
	protected void preRenderCallback(EntityLivingBase entityliving, float f)
	{
		GL11.glRotatef(180F, 0, 1F, 0F);
		GL11.glRotatef(180F, 0, 0, 1F);
		GL11.glTranslatef(0, modelHeight, 0);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity var1) {
		return MCSilverDragon_texture;
	}
}