package yourModPackage.common.animations.MCSilverDragon;

import yourModPackage.common.MCACommonLibrary.animation.*;
import yourModPackage.common.MCACommonLibrary.math.*;

public class ChannelFly extends Channel {
	public ChannelFly(String _name, float _fps, int _totalFrames, byte _mode) {
		super(_name, _fps, _totalFrames, _mode);
	}

	@Override
	protected void initializeAllFrames() {
KeyFrame frame0 = new KeyFrame();
frame0.modelRenderersRotations.put("tail2", new Quaternion(0.17364818F, 0.0F, 0.0F, 0.9848077F));
frame0.modelRenderersRotations.put("rWing1", new Quaternion(0.0F, 0.0F, -0.43837115F, 0.89879405F));
frame0.modelRenderersRotations.put("rWing4", new Quaternion(0.0F, 0.0F, -0.1305262F, 0.9914449F));
frame0.modelRenderersRotations.put("rightLeg1", new Quaternion(0.09584575F, 0.0F, 0.0F, 0.9953962F));
frame0.modelRenderersRotations.put("backLeftLeg1", new Quaternion(0.07837721F, -0.008014653F, 0.009383952F, 0.99684733F));
frame0.modelRenderersRotations.put("rWing2", new Quaternion(0.0F, 0.0F, -0.1305262F, 0.9914449F));
frame0.modelRenderersRotations.put("lWing1", new Quaternion(0.0F, 0.0F, 0.43837115F, 0.89879405F));
frame0.modelRenderersRotations.put("lWing4", new Quaternion(0.0F, 0.0F, 0.1305262F, 0.9914449F));
frame0.modelRenderersRotations.put("tail4", new Quaternion(0.17364818F, 0.0F, 0.0F, 0.9848077F));
frame0.modelRenderersRotations.put("tail3", new Quaternion(-0.17364818F, 0.0F, 0.0F, 0.9848077F));
frame0.modelRenderersRotations.put("neck", new Quaternion(-0.25881904F, 0.0F, 0.0F, 0.9659258F));
frame0.modelRenderersRotations.put("tail1", new Quaternion(-0.17364818F, 0.0F, 0.0F, 0.9848077F));
frame0.modelRenderersRotations.put("backRightLeg1", new Quaternion(0.09584575F, 0.0F, 0.0F, 0.9953962F));
frame0.modelRenderersRotations.put("lWing2", new Quaternion(0.0F, 0.0F, 0.1305262F, 0.9914449F));
frame0.modelRenderersRotations.put("leftLeg1", new Quaternion(0.11303034F, 0.006693526F, -0.018327279F, 0.9933999F));
frame0.modelRenderersTranslations.put("tail2", new Vector3f(0.0F, 0.0F, -10.0F));
frame0.modelRenderersTranslations.put("rWing1", new Vector3f(-9.0F, 2.0F, 13.0F));
frame0.modelRenderersTranslations.put("rWing4", new Vector3f(-29.2F, 0.2F, 0.0F));
frame0.modelRenderersTranslations.put("rightLeg1", new Vector3f(-7.5F, -3.5F, 6.8F));
frame0.modelRenderersTranslations.put("backLeftLeg1", new Vector3f(1.5F, -1.0999999F, -26.8F));
frame0.modelRenderersTranslations.put("rWing2", new Vector3f(-29.2F, 0.2F, 0.0F));
frame0.modelRenderersTranslations.put("lWing1", new Vector3f(3.0F, 2.0F, 13.0F));
frame0.modelRenderersTranslations.put("lWing4", new Vector3f(29.2F, 0.2F, 0.0F));
frame0.modelRenderersTranslations.put("tail4", new Vector3f(0.0F, 0.0F, -10.0F));
frame0.modelRenderersTranslations.put("tail3", new Vector3f(0.0F, 0.0F, -10.0F));
frame0.modelRenderersTranslations.put("neck", new Vector3f(-3.0F, -0.5F, 14.0F));
frame0.modelRenderersTranslations.put("tail1", new Vector3f(-3.0F, 0.0F, -28.0F));
frame0.modelRenderersTranslations.put("backRightLeg1", new Vector3f(-7.5F, -1.0999999F, -26.8F));
frame0.modelRenderersTranslations.put("lWing2", new Vector3f(29.2F, -0.2F, 0.0F));
frame0.modelRenderersTranslations.put("leftLeg1", new Vector3f(1.5F, -3.5F, 6.8F));
keyFrames.put(0, frame0);

KeyFrame frame1 = new KeyFrame();
frame1.modelRenderersRotations.put("tail2", new Quaternion(-0.25881904F, 0.0F, 0.0F, 0.9659258F));
frame1.modelRenderersRotations.put("rWing1", new Quaternion(0.0F, 0.0F, 0.0784591F, 0.9969173F));
frame1.modelRenderersRotations.put("rWing4", new Quaternion(0.0F, 0.0F, 0.23344538F, 0.9723699F));
frame1.modelRenderersRotations.put("rightLeg1", new Quaternion(0.07813156F, 0.016026866F, -0.018765045F, 0.9966376F));
frame1.modelRenderersRotations.put("backLeftLeg1", new Quaternion(0.10435711F, 0.016444106F, -0.010501613F, 0.9943485F));
frame1.modelRenderersRotations.put("rWing2", new Quaternion(0.0F, 0.0F, 0.23344538F, 0.9723699F));
frame1.modelRenderersRotations.put("lWing1", new Quaternion(0.0F, 0.0F, -0.0784591F, 0.9969173F));
frame1.modelRenderersRotations.put("lWing4", new Quaternion(0.0F, 0.0F, -0.23344538F, 0.9723699F));
frame1.modelRenderersRotations.put("tail4", new Quaternion(-0.21643962F, 0.0F, 0.0F, 0.976296F));
frame1.modelRenderersRotations.put("tail3", new Quaternion(0.17364818F, 0.0F, 0.0F, 0.9848077F));
frame1.modelRenderersRotations.put("neck", new Quaternion(-0.42261827F, 0.0F, 0.0F, 0.90630776F));
frame1.modelRenderersRotations.put("tail1", new Quaternion(0.17364818F, 0.0F, 0.0F, 0.9848077F));
frame1.modelRenderersRotations.put("backRightLeg1", new Quaternion(0.13000865F, -0.013880912F, 0.028226266F, 0.9910138F));
frame1.modelRenderersRotations.put("lWing2", new Quaternion(0.0F, 0.0F, -0.23344538F, 0.9723699F));
frame1.modelRenderersRotations.put("leftLeg1", new Quaternion(0.08714247F, 0.017385995F, -0.0015210772F, 0.996043F));
frame1.modelRenderersTranslations.put("tail2", new Vector3f(0.0F, 0.0F, -10.0F));
frame1.modelRenderersTranslations.put("rWing1", new Vector3f(-9.0F, 2.0F, 13.0F));
frame1.modelRenderersTranslations.put("rWing4", new Vector3f(-29.2F, 0.2F, 0.0F));
frame1.modelRenderersTranslations.put("rightLeg1", new Vector3f(-7.5F, -3.5F, 6.8F));
frame1.modelRenderersTranslations.put("backLeftLeg1", new Vector3f(1.5F, -1.0999999F, -26.8F));
frame1.modelRenderersTranslations.put("rWing2", new Vector3f(-29.2F, 0.2F, 0.0F));
frame1.modelRenderersTranslations.put("lWing1", new Vector3f(3.0F, 2.0F, 13.0F));
frame1.modelRenderersTranslations.put("lWing4", new Vector3f(29.2F, 0.2F, 0.0F));
frame1.modelRenderersTranslations.put("tail4", new Vector3f(0.0F, 0.0F, -10.0F));
frame1.modelRenderersTranslations.put("tail3", new Vector3f(0.0F, 0.0F, -10.0F));
frame1.modelRenderersTranslations.put("neck", new Vector3f(-3.0F, -0.5F, 14.0F));
frame1.modelRenderersTranslations.put("tail1", new Vector3f(-3.0F, 0.0F, -28.0F));
frame1.modelRenderersTranslations.put("backRightLeg1", new Vector3f(-7.5F, -1.0999999F, -26.8F));
frame1.modelRenderersTranslations.put("lWing2", new Vector3f(29.2F, -0.2F, 0.0F));
frame1.modelRenderersTranslations.put("leftLeg1", new Vector3f(1.5F, -3.5F, 6.8F));
keyFrames.put(1, frame1);

KeyFrame frame2 = new KeyFrame();
frame2.modelRenderersRotations.put("tail2", new Quaternion(0.17364818F, 0.0F, 0.0F, 0.9848077F));
frame2.modelRenderersRotations.put("rWing1", new Quaternion(0.0F, 0.0F, -0.43837115F, 0.89879405F));
frame2.modelRenderersRotations.put("rWing4", new Quaternion(0.0F, 0.0F, -0.1305262F, 0.9914449F));
frame2.modelRenderersRotations.put("rightLeg1", new Quaternion(0.09584575F, 0.0F, 0.0F, 0.9953962F));
frame2.modelRenderersRotations.put("backLeftLeg1", new Quaternion(0.07837721F, -0.008014653F, 0.009383952F, 0.99684733F));
frame2.modelRenderersRotations.put("rWing2", new Quaternion(0.0F, 0.0F, -0.1305262F, 0.9914449F));
frame2.modelRenderersRotations.put("lWing1", new Quaternion(0.0F, 0.0F, 0.43837115F, 0.89879405F));
frame2.modelRenderersRotations.put("lWing4", new Quaternion(0.0F, 0.0F, 0.1305262F, 0.9914449F));
frame2.modelRenderersRotations.put("tail4", new Quaternion(0.17364818F, 0.0F, 0.0F, 0.9848077F));
frame2.modelRenderersRotations.put("tail3", new Quaternion(-0.17364818F, 0.0F, 0.0F, 0.9848077F));
frame2.modelRenderersRotations.put("neck", new Quaternion(-0.25881904F, 0.0F, 0.0F, 0.9659258F));
frame2.modelRenderersRotations.put("tail1", new Quaternion(-0.17364818F, 0.0F, 0.0F, 0.9848077F));
frame2.modelRenderersRotations.put("backRightLeg1", new Quaternion(0.09584575F, 0.0F, 0.0F, 0.9953962F));
frame2.modelRenderersRotations.put("lWing2", new Quaternion(0.0F, 0.0F, 0.1305262F, 0.9914449F));
frame2.modelRenderersRotations.put("leftLeg1", new Quaternion(0.11303034F, 0.006693526F, -0.018327279F, 0.9933999F));
frame2.modelRenderersTranslations.put("tail2", new Vector3f(0.0F, 0.0F, -10.0F));
frame2.modelRenderersTranslations.put("rWing1", new Vector3f(-9.0F, 2.0F, 13.0F));
frame2.modelRenderersTranslations.put("rWing4", new Vector3f(-29.2F, 0.2F, 0.0F));
frame2.modelRenderersTranslations.put("rightLeg1", new Vector3f(-7.5F, -3.5F, 6.8F));
frame2.modelRenderersTranslations.put("backLeftLeg1", new Vector3f(1.5F, -1.0999999F, -26.8F));
frame2.modelRenderersTranslations.put("rWing2", new Vector3f(-29.2F, 0.2F, 0.0F));
frame2.modelRenderersTranslations.put("lWing1", new Vector3f(3.0F, 2.0F, 13.0F));
frame2.modelRenderersTranslations.put("lWing4", new Vector3f(29.2F, 0.2F, 0.0F));
frame2.modelRenderersTranslations.put("tail4", new Vector3f(0.0F, 0.0F, -10.0F));
frame2.modelRenderersTranslations.put("tail3", new Vector3f(0.0F, 0.0F, -10.0F));
frame2.modelRenderersTranslations.put("neck", new Vector3f(-3.0F, -0.5F, 14.0F));
frame2.modelRenderersTranslations.put("tail1", new Vector3f(-3.0F, 0.0F, -28.0F));
frame2.modelRenderersTranslations.put("backRightLeg1", new Vector3f(-7.5F, -1.0999999F, -26.8F));
frame2.modelRenderersTranslations.put("lWing2", new Vector3f(29.2F, -0.2F, 0.0F));
frame2.modelRenderersTranslations.put("leftLeg1", new Vector3f(1.5F, -3.5F, 6.8F));
keyFrames.put(2, frame2);

}
}