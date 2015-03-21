package mobs.common;

import mobs.common.MCACommonLibrary.IMCAnimatedEntity;
import mobs.common.MCACommonLibrary.animation.AnimationHandler;
import mobs.common.animations.Cereberus.AnimationHandlerCereberus;
import net.minecraft.entity.EntityCreature;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class EntityCereberus extends EntityCreature implements IMCAnimatedEntity {
	protected AnimationHandler animHandler = new AnimationHandlerCereberus(this);
	public EntityCereberus(World par1World) {
		super(par1World);
	}
	
	/**Animation not working
	 * Figure out hitbox
	 * figure out animation 
	 * get texture
	 * try out just using model files from export
	 */

	@Override
	protected void entityInit() {
		super.entityInit();
	}
	
	@Override
	public AnimationHandler getAnimationHandler() {
		return animHandler;
	}

	@Override
	public void onUpdate()
	{
            super.onUpdate();
        }

	@Override
	public void readEntityFromNBT(NBTTagCompound nbttagcompound) {
		super.readEntityFromNBT(nbttagcompound);
	}

	@Override
	public void writeEntityToNBT(NBTTagCompound nbttagcompound) {
		super.writeEntityToNBT(nbttagcompound);
	}
}