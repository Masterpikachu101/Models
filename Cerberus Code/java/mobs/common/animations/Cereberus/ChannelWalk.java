package mobs.common.animations.Cereberus;

import mobs.common.MCACommonLibrary.animation.Channel;
import mobs.common.MCACommonLibrary.animation.KeyFrame;
import mobs.common.MCACommonLibrary.math.Quaternion;
import mobs.common.MCACommonLibrary.math.Vector3f;

public class ChannelWalk extends Channel {
	public ChannelWalk(String _name, float _fps, int _totalFrames, byte _mode) {
		super(_name, _fps, _totalFrames, _mode);
	}

	@Override
	protected void initializeAllFrames() {
KeyFrame frame0 = new KeyFrame();
frame0.modelRenderersRotations.put("topFrontRightLeg", new Quaternion(0.05233596F, 0.0F, 0.0F, 0.9986295F));
frame0.modelRenderersRotations.put("topBackLeftLeg", new Quaternion(0.05233596F, 0.0F, 0.0F, 0.9986295F));
frame0.modelRenderersRotations.put("topFrontLeftLeg", new Quaternion(-0.32556814F, 0.0F, 0.0F, 0.94551855F));
frame0.modelRenderersRotations.put("topBackRightLeg", new Quaternion(-0.32556814F, 0.0F, 0.0F, 0.94551855F));
frame0.modelRenderersTranslations.put("topFrontRightLeg", new Vector3f(12.0F, -1.3F, -22.0F));
frame0.modelRenderersTranslations.put("topBackLeftLeg", new Vector3f(13.0F, 3.0F, -55.0F));
frame0.modelRenderersTranslations.put("topFrontLeftLeg", new Vector3f(12.0F, -1.3F, -22.0F));
frame0.modelRenderersTranslations.put("topBackRightLeg", new Vector3f(-11.0F, 3.0F, -55.0F));
keyFrames.put(0, frame0);

KeyFrame frame1 = new KeyFrame();
frame1.modelRenderersRotations.put("topFrontRightLeg", new Quaternion(-0.32556814F, 0.0F, 0.0F, 0.94551855F));
frame1.modelRenderersRotations.put("topBackLeftLeg", new Quaternion(-0.32556814F, 0.0F, 0.0F, 0.94551855F));
frame1.modelRenderersRotations.put("topFrontLeftLeg", new Quaternion(0.05233596F, 0.0F, 0.0F, 0.9986295F));
frame1.modelRenderersRotations.put("topBackRightLeg", new Quaternion(0.05233596F, 0.0F, 0.0F, 0.9986295F));
frame1.modelRenderersTranslations.put("topFrontRightLeg", new Vector3f(12.0F, -1.3F, -22.0F));
frame1.modelRenderersTranslations.put("topBackLeftLeg", new Vector3f(13.0F, 3.0F, -55.0F));
frame1.modelRenderersTranslations.put("topFrontLeftLeg", new Vector3f(12.0F, -1.3F, -22.0F));
frame1.modelRenderersTranslations.put("topBackRightLeg", new Vector3f(-11.0F, 3.0F, -55.0F));
keyFrames.put(1, frame1);

KeyFrame frame2 = new KeyFrame();
frame2.modelRenderersRotations.put("topFrontRightLeg", new Quaternion(0.05233596F, 0.0F, 0.0F, 0.9986295F));
frame2.modelRenderersRotations.put("topBackLeftLeg", new Quaternion(0.05233596F, 0.0F, 0.0F, 0.9986295F));
frame2.modelRenderersRotations.put("topFrontLeftLeg", new Quaternion(-0.32556814F, 0.0F, 0.0F, 0.94551855F));
frame2.modelRenderersRotations.put("topBackRightLeg", new Quaternion(-0.32556814F, 0.0F, 0.0F, 0.94551855F));
frame2.modelRenderersTranslations.put("topFrontRightLeg", new Vector3f(12.0F, -1.3F, -22.0F));
frame2.modelRenderersTranslations.put("topBackLeftLeg", new Vector3f(13.0F, 3.0F, -55.0F));
frame2.modelRenderersTranslations.put("topFrontLeftLeg", new Vector3f(12.0F, -1.3F, -22.0F));
frame2.modelRenderersTranslations.put("topBackRightLeg", new Vector3f(-11.0F, 3.0F, -55.0F));
keyFrames.put(2, frame2);

}
}