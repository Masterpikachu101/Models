package yourModPackage.common.entities;

import yourModPackage.common.MCACommonLibrary.IMCAnimatedEntity;
import yourModPackage.common.MCACommonLibrary.animation.AnimationHandler;
import yourModPackage.common.animations.SilverDragon.AnimationHandlerSilverDragon;

import net.minecraft.entity.EntityCreature;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class EntitySilverDragon extends EntityCreature implements IMCAnimatedEntity {
	protected AnimationHandler animHandler = new AnimationHandlerSilverDragon(this);
	public EntitySilverDragon(World par1World) {
		super(par1World);
	}

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