package mobs.common.animations.Cereberus;

import java.util.HashMap;

import mobs.common.MCACommonLibrary.IMCAnimatedEntity;
import mobs.common.MCACommonLibrary.animation.AnimationHandler;
import mobs.common.MCACommonLibrary.animation.Channel;

public class AnimationHandlerCereberus extends AnimationHandler {
	/** Map with all the animations. */
	public static HashMap<String, Channel> animChannels = new HashMap<String, Channel>();static
{
animChannels.put("Walk", new ChannelWalk("Walk", 1.0F, 3, Channel.LOOP));
}
	public AnimationHandlerCereberus(IMCAnimatedEntity entity) {
		super(entity);
	}

	@Override
	public void activateAnimation(String name, float startingFrame) {
		super.activateAnimation(animChannels, name, startingFrame);
	}

	@Override
	public void stopAnimation(String name) {
		super.stopAnimation(animChannels, name);
	}

	@Override
	public void fireAnimationEventClientSide(Channel anim, Float frame) {
	}

	@Override
	public void fireAnimationEventServerSide(Channel anim, Float frame) {
	}}