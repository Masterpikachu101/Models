package yourModPackage.common.animations.SilverDragon;

import yourModPackage.common.MCACommonLibrary.animation.*;
import yourModPackage.common.MCACommonLibrary.math.*;

public class ChannelFly extends Channel {
	public ChannelFly(String _name, float _fps, int _totalFrames, byte _mode) {
		super(_name, _fps, _totalFrames, _mode);
	}

	@Override
	protected void initializeAllFrames() {
KeyFrame frame0 = new KeyFrame();
frame0.modelRenderersRotations.put("rWing4", new Quaternion(0.0F, 0.0F, -0.1305262F, 0.9914449F));
frame0.modelRenderersRotations.put("lWing4", new Quaternion(0.0F, 0.0F, 0.1305262F, 0.9914449F));
frame0.modelRenderersRotations.put("lWing2", new Quaternion(0.0F, 0.0F, 0.1305262F, 0.9914449F));
frame0.modelRenderersRotations.put("rWing2", new Quaternion(0.0F, 0.0F, -0.1305262F, 0.9914449F));
frame0.modelRenderersRotations.put("lWing1", new Quaternion(0.0F, 0.0F, 0.43837115F, 0.89879405F));
frame0.modelRenderersRotations.put("rWing1", new Quaternion(0.0F, 0.0F, -0.43837115F, 0.89879405F));
frame0.modelRenderersTranslations.put("rWing4", new Vector3f(-29.2F, 0.2F, 0.0F));
frame0.modelRenderersTranslations.put("lWing4", new Vector3f(29.2F, 0.2F, 0.0F));
frame0.modelRenderersTranslations.put("lWing2", new Vector3f(29.2F, -0.2F, 0.0F));
frame0.modelRenderersTranslations.put("rWing2", new Vector3f(-29.2F, 0.2F, 0.0F));
frame0.modelRenderersTranslations.put("lWing1", new Vector3f(3.0F, 2.0F, 13.0F));
frame0.modelRenderersTranslations.put("rWing1", new Vector3f(-9.0F, 2.0F, 13.0F));
keyFrames.put(0, frame0);

KeyFrame frame1 = new KeyFrame();
frame1.modelRenderersRotations.put("rWing4", new Quaternion(0.0F, 0.0F, 0.23344538F, 0.9723699F));
frame1.modelRenderersRotations.put("lWing4", new Quaternion(0.0F, 0.0F, -0.23344538F, 0.9723699F));
frame1.modelRenderersRotations.put("lWing2", new Quaternion(0.0F, 0.0F, -0.23344538F, 0.9723699F));
frame1.modelRenderersRotations.put("rWing2", new Quaternion(0.0F, 0.0F, 0.23344538F, 0.9723699F));
frame1.modelRenderersRotations.put("lWing1", new Quaternion(0.0F, 0.0F, 0.0784591F, 0.9969173F));
frame1.modelRenderersRotations.put("rWing1", new Quaternion(0.0F, 0.0F, 0.0784591F, 0.9969173F));
frame1.modelRenderersTranslations.put("rWing4", new Vector3f(-29.2F, 0.2F, 0.0F));
frame1.modelRenderersTranslations.put("lWing4", new Vector3f(29.2F, 0.2F, 0.0F));
frame1.modelRenderersTranslations.put("lWing2", new Vector3f(29.2F, -0.2F, 0.0F));
frame1.modelRenderersTranslations.put("rWing2", new Vector3f(-29.2F, 0.2F, 0.0F));
frame1.modelRenderersTranslations.put("lWing1", new Vector3f(3.0F, 2.0F, 13.0F));
frame1.modelRenderersTranslations.put("rWing1", new Vector3f(-9.0F, 2.0F, 13.0F));
keyFrames.put(1, frame1);

KeyFrame frame2 = new KeyFrame();
frame2.modelRenderersRotations.put("rWing4", new Quaternion(0.0F, 0.0F, -0.1305262F, 0.9914449F));
frame2.modelRenderersRotations.put("lWing4", new Quaternion(0.0F, 0.0F, 0.1305262F, 0.9914449F));
frame2.modelRenderersRotations.put("lWing2", new Quaternion(0.0F, 0.0F, 0.1305262F, 0.9914449F));
frame2.modelRenderersRotations.put("rWing2", new Quaternion(0.0F, 0.0F, -0.1305262F, 0.9914449F));
frame2.modelRenderersRotations.put("lWing1", new Quaternion(0.0F, 0.0F, 0.43837115F, 0.89879405F));
frame2.modelRenderersRotations.put("rWing1", new Quaternion(0.0F, 0.0F, -0.43837115F, 0.89879405F));
frame2.modelRenderersTranslations.put("rWing4", new Vector3f(-29.2F, 0.2F, 0.0F));
frame2.modelRenderersTranslations.put("lWing4", new Vector3f(29.2F, 0.2F, 0.0F));
frame2.modelRenderersTranslations.put("lWing2", new Vector3f(29.2F, -0.2F, 0.0F));
frame2.modelRenderersTranslations.put("rWing2", new Vector3f(-29.2F, 0.2F, 0.0F));
frame2.modelRenderersTranslations.put("lWing1", new Vector3f(3.0F, 2.0F, 13.0F));
frame2.modelRenderersTranslations.put("rWing1", new Vector3f(-9.0F, 2.0F, 13.0F));
keyFrames.put(2, frame2);

}
}