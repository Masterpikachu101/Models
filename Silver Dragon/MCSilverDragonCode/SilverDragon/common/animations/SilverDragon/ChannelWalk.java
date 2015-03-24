package yourModPackage.common.animations.SilverDragon;

import yourModPackage.common.MCACommonLibrary.animation.*;
import yourModPackage.common.MCACommonLibrary.math.*;

public class ChannelWalk extends Channel {
	public ChannelWalk(String _name, float _fps, int _totalFrames, byte _mode) {
		super(_name, _fps, _totalFrames, _mode);
	}

	@Override
	protected void initializeAllFrames() {
KeyFrame frame0 = new KeyFrame();
frame0.modelRenderersRotations.put("leftLeg1", new Quaternion(-0.5F, 0.0F, 0.0F, 0.8660254F));
frame0.modelRenderersRotations.put("rightLeg1", new Quaternion(-0.1305262F, 0.0F, 0.0F, 0.9914449F));
frame0.modelRenderersRotations.put("backRightLeg1", new Quaternion(-0.1305262F, 0.0F, 0.0F, 0.9914449F));
frame0.modelRenderersRotations.put("backLeftLeg1", new Quaternion(-0.5F, 0.0F, 0.0F, 0.8660254F));
frame0.modelRenderersRotations.put("rWing1", new Quaternion(-0.1252769F, -0.14492337F, -0.15664662F, 0.96889865F));
frame0.modelRenderersTranslations.put("leftLeg1", new Vector3f(1.5F, -3.5F, 6.8F));
frame0.modelRenderersTranslations.put("rightLeg1", new Vector3f(-7.5F, -3.5F, 6.8F));
frame0.modelRenderersTranslations.put("backRightLeg1", new Vector3f(-7.5F, -1.0999999F, -26.8F));
frame0.modelRenderersTranslations.put("backLeftLeg1", new Vector3f(1.5F, -1.0999999F, -26.8F));
frame0.modelRenderersTranslations.put("rWing1", new Vector3f(-9.0F, 2.0F, 13.0F));
keyFrames.put(0, frame0);

KeyFrame frame1 = new KeyFrame();
frame1.modelRenderersRotations.put("leftLeg1", new Quaternion(-0.1305262F, 0.0F, 0.0F, 0.9914449F));
frame1.modelRenderersRotations.put("rightLeg1", new Quaternion(-0.5F, 0.0F, 0.0F, 0.8660254F));
frame1.modelRenderersRotations.put("backRightLeg1", new Quaternion(-0.5F, 0.0F, 0.0F, 0.8660254F));
frame1.modelRenderersRotations.put("backLeftLeg1", new Quaternion(-0.1305262F, 0.0F, 0.0F, 0.9914449F));
frame1.modelRenderersRotations.put("rWing1", new Quaternion(-0.1252769F, -0.14492337F, -0.15664662F, 0.96889865F));
frame1.modelRenderersTranslations.put("leftLeg1", new Vector3f(1.5F, -3.5F, 6.8F));
frame1.modelRenderersTranslations.put("rightLeg1", new Vector3f(-7.5F, -3.5F, 6.8F));
frame1.modelRenderersTranslations.put("backRightLeg1", new Vector3f(-7.5F, -1.0999999F, -26.8F));
frame1.modelRenderersTranslations.put("backLeftLeg1", new Vector3f(1.5F, -1.0999999F, -26.8F));
frame1.modelRenderersTranslations.put("rWing1", new Vector3f(-9.0F, 2.0F, 13.0F));
keyFrames.put(1, frame1);

KeyFrame frame2 = new KeyFrame();
frame2.modelRenderersRotations.put("leftLeg1", new Quaternion(-0.5F, 0.0F, 0.0F, 0.8660254F));
frame2.modelRenderersRotations.put("rightLeg1", new Quaternion(-0.1305262F, 0.0F, 0.0F, 0.9914449F));
frame2.modelRenderersRotations.put("backRightLeg1", new Quaternion(-0.1305262F, 0.0F, 0.0F, 0.9914449F));
frame2.modelRenderersRotations.put("backLeftLeg1", new Quaternion(-0.5F, 0.0F, 0.0F, 0.8660254F));
frame2.modelRenderersRotations.put("rWing1", new Quaternion(-0.1252769F, -0.14492337F, -0.15664662F, 0.96889865F));
frame2.modelRenderersTranslations.put("leftLeg1", new Vector3f(1.5F, -3.5F, 6.8F));
frame2.modelRenderersTranslations.put("rightLeg1", new Vector3f(-7.5F, -3.5F, 6.8F));
frame2.modelRenderersTranslations.put("backRightLeg1", new Vector3f(-7.5F, -1.0999999F, -26.8F));
frame2.modelRenderersTranslations.put("backLeftLeg1", new Vector3f(1.5F, -1.0999999F, -26.8F));
frame2.modelRenderersTranslations.put("rWing1", new Vector3f(-9.0F, 2.0F, 13.0F));
keyFrames.put(2, frame2);

}
}