package mobs.client;

import java.util.HashMap;

import mobs.client.MCAClientLibrary.MCAModelRenderer;
import mobs.common.EntityCereberus;
import mobs.common.MCACommonLibrary.MCAVersionChecker;
import mobs.common.MCACommonLibrary.animation.AnimationHandler;
import mobs.common.MCACommonLibrary.math.Matrix4f;
import mobs.common.MCACommonLibrary.math.Quaternion;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;

public class ModelCereberus extends ModelBase {
public final int MCA_MIN_REQUESTED_VERSION = 1;
public HashMap<String, MCAModelRenderer> parts = new HashMap<String, MCAModelRenderer>();

MCAModelRenderer frontBody;
MCAModelRenderer middleBody;
MCAModelRenderer backBody;
MCAModelRenderer mainNeck;
MCAModelRenderer rightNeck;
MCAModelRenderer leftNeck;
MCAModelRenderer middleNeck;
MCAModelRenderer rightHead;
MCAModelRenderer leftHead;
MCAModelRenderer middleHead;
MCAModelRenderer leftSnout;
MCAModelRenderer middlesnout;
MCAModelRenderer rightsnout;
MCAModelRenderer rightEarRightHead;
MCAModelRenderer leftEarRightHead;
MCAModelRenderer leftEarLeftHead;
MCAModelRenderer rightEarLeftHead;
MCAModelRenderer rightEarMiddleHead;
MCAModelRenderer leftEarMiddleHead;
MCAModelRenderer topTail;
MCAModelRenderer upperMiddleTail;
MCAModelRenderer lowerMiddleTail;
MCAModelRenderer bottomTail;
MCAModelRenderer topFrontLeftLeg;
MCAModelRenderer topFrontRightLeg;
MCAModelRenderer topBackLeftLeg;
MCAModelRenderer topBackRightLeg;
MCAModelRenderer lowerFrontLeftLeg;
MCAModelRenderer lowerFrontRightLeg;
MCAModelRenderer middleBackLeftLeg;
MCAModelRenderer middleBackRightLeg;
MCAModelRenderer frontLeftFoot;
MCAModelRenderer frontRightFoot;
MCAModelRenderer lowerBackLeftLeg;
MCAModelRenderer lowerBackRightLeg;
MCAModelRenderer backLeftFoot;
MCAModelRenderer backRightFoot;
public ModelCereberus()
{
MCAVersionChecker.checkForLibraryVersion(getClass(), MCA_MIN_REQUESTED_VERSION);

textureWidth = 512;
textureHeight = 256;

frontBody = new MCAModelRenderer(this, "frontBody", 106, 105);
frontBody.mirror = false;
frontBody.addBox(-12.0F, -6.2F, -3.5F, 24, 18, 16);
frontBody.setInitialRotationPoint(1.0F, 2.6F, -24.6F);
frontBody.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.17364818F, 0.0F, 0.0F, 0.9848077F)).transpose());
frontBody.setTextureSize(512, 256);
parts.put(frontBody.boxName, frontBody);

middleBody = new MCAModelRenderer(this, "middleBody", -3, 197);
middleBody.mirror = false;
middleBody.addBox(0.0F, -16.0F, -22.0F, 21, 16, 22);
middleBody.setInitialRotationPoint(-9.5F, 11.9F, -25.0F);
middleBody.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.008726203F, 7.615242E-5F, 0.008726203F, 0.9999238F)).transpose());
middleBody.setTextureSize(512, 256);
parts.put(middleBody.boxName, middleBody);

backBody = new MCAModelRenderer(this, "backBody", 100, 139);
backBody.mirror = false;
backBody.addBox(0.0F, -17.0F, -16.0F, 24, 17, 19);
backBody.setInitialRotationPoint(-11.0F, 12.6F, -44.0F);
backBody.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.043617725F, 3.8064612E-4F, 0.00871823F, 0.9990102F)).transpose());
backBody.setTextureSize(512, 256);
parts.put(backBody.boxName, backBody);

mainNeck = new MCAModelRenderer(this, "mainNeck", 120, 175);
mainNeck.mirror = false;
mainNeck.addBox(0.0F, -18.0F, -9.0F, 30, 18, 9);
mainNeck.setInitialRotationPoint(-14.0F, 18.0F, -8.0F);
mainNeck.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0F, 0.0F, 0.0F, 1.0F)).transpose());
mainNeck.setTextureSize(512, 256);
parts.put(mainNeck.boxName, mainNeck);

rightNeck = new MCAModelRenderer(this, "rightNeck", 128, 0);
rightNeck.mirror = false;
rightNeck.addBox(-3.0F, -6.0F, -8.0F, 10, 10, 25);
rightNeck.setInitialRotationPoint(-10.0F, 12.0F, -8.0F);
rightNeck.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.2961374F, -0.16561121F, -0.052217014F, 0.9392278F)).transpose());
rightNeck.setTextureSize(512, 256);
parts.put(rightNeck.boxName, rightNeck);

leftNeck = new MCAModelRenderer(this, "leftNeck", 128, 70);
leftNeck.mirror = false;
leftNeck.addBox(-5.0F, -5.0F, -5.0F, 10, 10, 25);
leftNeck.setInitialRotationPoint(10.0F, 9.0F, -8.0F);
leftNeck.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.14578229F, 0.1632347F, 0.024395587F, 0.9754521F)).transpose());
leftNeck.setTextureSize(512, 256);
parts.put(leftNeck.boxName, leftNeck);

middleNeck = new MCAModelRenderer(this, "middleNeck", 128, 35);
middleNeck.mirror = false;
middleNeck.addBox(-6.0F, -9.0F, -25.0F, 10, 10, 25);
middleNeck.setInitialRotationPoint(1.5F, 8.0F, 12.0F);
middleNeck.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.1305262F, 0.0F, 0.0F, 0.9914449F)).transpose());
middleNeck.setTextureSize(512, 256);
parts.put(middleNeck.boxName, middleNeck);

rightHead = new MCAModelRenderer(this, "rightHead", 3, 175);
rightHead.mirror = false;
rightHead.addBox(0.0F, -12.0F, -13.0F, 12, 12, 13);
rightHead.setInitialRotationPoint(-19.0F, 26.0F, 14.0F);
rightHead.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0F, 0.0F, 0.0F, 1.0F)).transpose());
rightHead.setTextureSize(512, 256);
parts.put(rightHead.boxName, rightHead);

leftHead = new MCAModelRenderer(this, "leftHead", 9, 126);
leftHead.mirror = false;
leftHead.addBox(0.0F, -12.0F, -13.0F, 12, 12, 13);
leftHead.setInitialRotationPoint(9.5F, 20.0F, 16.0F);
leftHead.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0F, 0.0F, 0.0F, 1.0F)).transpose());
leftHead.setTextureSize(512, 256);
parts.put(leftHead.boxName, leftHead);

middleHead = new MCAModelRenderer(this, "middleHead", 16, 86);
middleHead.mirror = false;
middleHead.addBox(0.0F, -12.0F, -13.0F, 12, 12, 13);
middleHead.setInitialRotationPoint(-5.5F, 11.0F, 18.0F);
middleHead.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0F, 0.0F, 0.0F, 1.0F)).transpose());
middleHead.setTextureSize(512, 256);
parts.put(middleHead.boxName, middleHead);

leftSnout = new MCAModelRenderer(this, "leftSnout", 69, 71);
leftSnout.mirror = false;
leftSnout.addBox(0.0F, -6.0F, -5.0F, 6, 6, 5);
leftSnout.setInitialRotationPoint(12.5F, 14.0F, 21.0F);
leftSnout.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0F, 0.0F, 0.0F, 1.0F)).transpose());
leftSnout.setTextureSize(512, 256);
parts.put(leftSnout.boxName, leftSnout);

middlesnout = new MCAModelRenderer(this, "middlesnout", 68, 87);
middlesnout.mirror = false;
middlesnout.addBox(0.0F, -6.0F, -5.0F, 6, 6, 5);
middlesnout.setInitialRotationPoint(-2.5F, 5.0F, 23.0F);
middlesnout.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0F, 0.0F, 0.0F, 1.0F)).transpose());
middlesnout.setTextureSize(512, 256);
parts.put(middlesnout.boxName, middlesnout);

rightsnout = new MCAModelRenderer(this, "rightsnout", 31, 75);
rightsnout.mirror = false;
rightsnout.addBox(0.0F, -6.0F, -5.0F, 6, 6, 5);
rightsnout.setInitialRotationPoint(-16.0F, 20.0F, 19.0F);
rightsnout.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0F, 0.0F, 0.0F, 1.0F)).transpose());
rightsnout.setTextureSize(512, 256);
parts.put(rightsnout.boxName, rightsnout);

rightEarRightHead = new MCAModelRenderer(this, "rightEarRightHead", 42, 70);
rightEarRightHead.mirror = false;
rightEarRightHead.addBox(0.0F, -2.0F, -2.0F, 2, 2, 2);
rightEarRightHead.setInitialRotationPoint(-17.0F, 28.0F, 13.0F);
rightEarRightHead.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0F, 0.0F, 0.0F, 1.0F)).transpose());
rightEarRightHead.setTextureSize(512, 256);
parts.put(rightEarRightHead.boxName, rightEarRightHead);

leftEarRightHead = new MCAModelRenderer(this, "leftEarRightHead", 36, 65);
leftEarRightHead.mirror = false;
leftEarRightHead.addBox(0.0F, -2.0F, -2.0F, 2, 2, 2);
leftEarRightHead.setInitialRotationPoint(-11.0F, 28.0F, 13.0F);
leftEarRightHead.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0F, 0.0F, 0.0F, 1.0F)).transpose());
leftEarRightHead.setTextureSize(512, 256);
parts.put(leftEarRightHead.boxName, leftEarRightHead);

leftEarLeftHead = new MCAModelRenderer(this, "leftEarLeftHead", 33, 70);
leftEarLeftHead.mirror = false;
leftEarLeftHead.addBox(0.0F, -2.0F, -2.0F, 2, 2, 2);
leftEarLeftHead.setInitialRotationPoint(17.0F, 22.0F, 15.0F);
leftEarLeftHead.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0F, 0.0F, 0.0F, 1.0F)).transpose());
leftEarLeftHead.setTextureSize(512, 256);
parts.put(leftEarLeftHead.boxName, leftEarLeftHead);

rightEarLeftHead = new MCAModelRenderer(this, "rightEarLeftHead", 54, 72);
rightEarLeftHead.mirror = false;
rightEarLeftHead.addBox(0.0F, -2.0F, -2.0F, 2, 2, 2);
rightEarLeftHead.setInitialRotationPoint(12.0F, 22.0F, 15.0F);
rightEarLeftHead.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0F, 0.0F, 0.0F, 1.0F)).transpose());
rightEarLeftHead.setTextureSize(512, 256);
parts.put(rightEarLeftHead.boxName, rightEarLeftHead);

rightEarMiddleHead = new MCAModelRenderer(this, "rightEarMiddleHead", 27, 65);
rightEarMiddleHead.mirror = false;
rightEarMiddleHead.addBox(0.0F, -2.0F, -2.0F, 2, 2, 2);
rightEarMiddleHead.setInitialRotationPoint(-3.0F, 13.0F, 17.0F);
rightEarMiddleHead.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0F, 0.0F, 0.0F, 1.0F)).transpose());
rightEarMiddleHead.setTextureSize(512, 256);
parts.put(rightEarMiddleHead.boxName, rightEarMiddleHead);

leftEarMiddleHead = new MCAModelRenderer(this, "leftEarMiddleHead", 50, 67);
leftEarMiddleHead.mirror = false;
leftEarMiddleHead.addBox(0.0F, -2.0F, -2.0F, 2, 2, 2);
leftEarMiddleHead.setInitialRotationPoint(3.0F, 13.0F, 17.0F);
leftEarMiddleHead.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0F, 0.0F, 0.0F, 1.0F)).transpose());
leftEarMiddleHead.setTextureSize(512, 256);
parts.put(leftEarMiddleHead.boxName, leftEarMiddleHead);

topTail = new MCAModelRenderer(this, "topTail", 30, 0);
topTail.mirror = true;
topTail.addBox(-2.3F, -2.7F, -9.7F, 4, 4, 10);
topTail.setInitialRotationPoint(0.6F, 12.0F, -60.5F);
topTail.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.052208472F, 0.0036507717F, 0.06966087F, 0.9961969F)).transpose());
topTail.setTextureSize(512, 256);
parts.put(topTail.boxName, topTail);

upperMiddleTail = new MCAModelRenderer(this, "upperMiddleTail", 29, 16);
upperMiddleTail.mirror = false;
upperMiddleTail.addBox(0.0F, -4.0F, -10.0F, 4, 4, 10);
upperMiddleTail.setInitialRotationPoint(-2.0F, 13.9F, -70.0F);
upperMiddleTail.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.52088785F, -0.040994767F, 0.06689738F, 0.8500117F)).transpose());
upperMiddleTail.setTextureSize(512, 256);
parts.put(upperMiddleTail.boxName, upperMiddleTail);

lowerMiddleTail = new MCAModelRenderer(this, "lowerMiddleTail", 61, 16);
lowerMiddleTail.mirror = false;
lowerMiddleTail.addBox(0.0F, -4.0F, -10.0F, 4, 4, 10);
lowerMiddleTail.setInitialRotationPoint(-0.6F, 5.2F, -74.6F);
lowerMiddleTail.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.6412218F, -0.044838592F, 0.053436555F, 0.7641784F)).transpose());
lowerMiddleTail.setTextureSize(512, 256);
parts.put(lowerMiddleTail.boxName, lowerMiddleTail);

bottomTail = new MCAModelRenderer(this, "bottomTail", 90, 17);
bottomTail.mirror = false;
bottomTail.addBox(0.0F, -7.0F, -4.0F, 4, 7, 4);
bottomTail.setInitialRotationPoint(0.8F, -4.5F, -72.4F);
bottomTail.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0F, 0.0F, 0.06975647F, 0.9975641F)).transpose());
bottomTail.setTextureSize(512, 256);
parts.put(bottomTail.boxName, bottomTail);

topFrontLeftLeg = new MCAModelRenderer(this, "topFrontLeftLeg", 62, 178);
topFrontLeftLeg.mirror = false;
topFrontLeftLeg.addBox(-4.0F, -9.0F, -4.0F, 9, 9, 9);
topFrontLeftLeg.setInitialRotationPoint(12.0F, -1.3F, -22.0F);
topFrontLeftLeg.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.1305262F, 0.0F, 0.0F, 0.9914449F)).transpose());
topFrontLeftLeg.setTextureSize(512, 256);
parts.put(topFrontLeftLeg.boxName, topFrontLeftLeg);

topFrontRightLeg = new MCAModelRenderer(this, "topFrontRightLeg", 61, 178);
topFrontRightLeg.mirror = false;
topFrontRightLeg.addBox(-27.0F, -9.0F, -4.0F, 9, 9, 9);
topFrontRightLeg.setInitialRotationPoint(12.0F, -1.3F, -22.0F);
topFrontRightLeg.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.1305262F, 0.0F, 0.0F, 0.9914449F)).transpose());
topFrontRightLeg.setTextureSize(512, 256);
parts.put(topFrontRightLeg.boxName, topFrontRightLeg);

topBackLeftLeg = new MCAModelRenderer(this, "topBackLeftLeg", 92, 81);
topBackLeftLeg.mirror = false;
topBackLeftLeg.addBox(-4.0F, -9.0F, -5.0F, 9, 9, 9);
topBackLeftLeg.setInitialRotationPoint(13.0F, 3.0F, -55.0F);
topBackLeftLeg.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0F, 0.0F, 0.0F, 1.0F)).transpose());
topBackLeftLeg.setTextureSize(512, 256);
parts.put(topBackLeftLeg.boxName, topBackLeftLeg);

topBackRightLeg = new MCAModelRenderer(this, "topBackRightLeg", 92, 81);
topBackRightLeg.mirror = false;
topBackRightLeg.addBox(-4.0F, -9.0F, -5.0F, 9, 9, 9);
topBackRightLeg.setInitialRotationPoint(-11.0F, 3.0F, -55.0F);
topBackRightLeg.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0F, 0.0F, 0.0F, 1.0F)).transpose());
topBackRightLeg.setTextureSize(512, 256);
parts.put(topBackRightLeg.boxName, topBackRightLeg);

lowerFrontLeftLeg = new MCAModelRenderer(this, "lowerFrontLeftLeg", 87, 198);
lowerFrontLeftLeg.mirror = false;
lowerFrontLeftLeg.addBox(-1.0F, -19.0F, -7.0F, 7, 20, 7);
lowerFrontLeftLeg.setInitialRotationPoint(-2.0F, -1.0F, 4.0F);
lowerFrontLeftLeg.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.008726535F, 0.0F, 0.0F, 0.9999619F)).transpose());
lowerFrontLeftLeg.setTextureSize(512, 256);
parts.put(lowerFrontLeftLeg.boxName, lowerFrontLeftLeg);
topFrontLeftLeg.addChild(lowerFrontLeftLeg);

lowerFrontRightLeg = new MCAModelRenderer(this, "lowerFrontRightLeg", 7, 30);
lowerFrontRightLeg.mirror = false;
lowerFrontRightLeg.addBox(-1.0F, -19.0F, -7.0F, 7, 20, 7);
lowerFrontRightLeg.setInitialRotationPoint(-25.0F, -1.0F, 4.0F);
lowerFrontRightLeg.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.008726535F, 0.0F, 0.0F, 0.9999619F)).transpose());
lowerFrontRightLeg.setTextureSize(512, 256);
parts.put(lowerFrontRightLeg.boxName, lowerFrontRightLeg);
topFrontRightLeg.addChild(lowerFrontRightLeg);

middleBackLeftLeg = new MCAModelRenderer(this, "middleBackLeftLeg", 66, 133);
middleBackLeftLeg.mirror = false;
middleBackLeftLeg.addBox(0.0F, -15.0F, -7.0F, 7, 15, 7);
middleBackLeftLeg.setInitialRotationPoint(-2.0F, -7.0F, 3.0F);
middleBackLeftLeg.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.15643448F, 0.0F, 0.0F, 0.98768836F)).transpose());
middleBackLeftLeg.setTextureSize(512, 256);
parts.put(middleBackLeftLeg.boxName, middleBackLeftLeg);
topBackLeftLeg.addChild(middleBackLeftLeg);

middleBackRightLeg = new MCAModelRenderer(this, "middleBackRightLeg", 68, 107);
middleBackRightLeg.mirror = false;
middleBackRightLeg.addBox(0.0F, -15.0F, -7.0F, 7, 15, 7);
middleBackRightLeg.setInitialRotationPoint(-2.0F, -7.0F, 3.0F);
middleBackRightLeg.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.15643448F, 0.0F, 0.0F, 0.98768836F)).transpose());
middleBackRightLeg.setTextureSize(512, 256);
parts.put(middleBackRightLeg.boxName, middleBackRightLeg);
topBackRightLeg.addChild(middleBackRightLeg);

frontLeftFoot = new MCAModelRenderer(this, "frontLeftFoot", 61, 0);
frontLeftFoot.mirror = false;
frontLeftFoot.addBox(0.0F, -2.0F, -9.0F, 7, 2, 9);
frontLeftFoot.setInitialRotationPoint(-1.0F, -19.0F, 2.0F);
frontLeftFoot.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.09584575F, 0.0F, 0.0F, 0.9953962F)).transpose());
frontLeftFoot.setTextureSize(512, 256);
parts.put(frontLeftFoot.boxName, frontLeftFoot);
lowerFrontLeftLeg.addChild(frontLeftFoot);

frontRightFoot = new MCAModelRenderer(this, "frontRightFoot", 96, 0);
frontRightFoot.mirror = false;
frontRightFoot.addBox(0.0F, -2.0F, -9.0F, 7, 2, 9);
frontRightFoot.setInitialRotationPoint(-1.0F, -19.0F, 2.0F);
frontRightFoot.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.09584575F, 0.0F, 0.0F, 0.9953962F)).transpose());
frontRightFoot.setTextureSize(512, 256);
parts.put(frontRightFoot.boxName, frontRightFoot);
lowerFrontRightLeg.addChild(frontRightFoot);

lowerBackLeftLeg = new MCAModelRenderer(this, "lowerBackLeftLeg", 74, 157);
lowerBackLeftLeg.mirror = false;
lowerBackLeftLeg.addBox(0.0F, -10.0F, -6.0F, 7, 10, 6);
lowerBackLeftLeg.setInitialRotationPoint(0.0F, -11.0F, -2.5F);
lowerBackLeftLeg.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.34202012F, 0.0F, 0.0F, 0.9396926F)).transpose());
lowerBackLeftLeg.setTextureSize(512, 256);
parts.put(lowerBackLeftLeg.boxName, lowerBackLeftLeg);
middleBackLeftLeg.addChild(lowerBackLeftLeg);

lowerBackRightLeg = new MCAModelRenderer(this, "lowerBackRightLeg", 45, 157);
lowerBackRightLeg.mirror = false;
lowerBackRightLeg.addBox(0.0F, -10.0F, -6.0F, 7, 10, 6);
lowerBackRightLeg.setInitialRotationPoint(0.0F, -11.0F, -2.5F);
lowerBackRightLeg.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.34202012F, 0.0F, 0.0F, 0.9396926F)).transpose());
lowerBackRightLeg.setTextureSize(512, 256);
parts.put(lowerBackRightLeg.boxName, lowerBackRightLeg);
middleBackRightLeg.addChild(lowerBackRightLeg);

backLeftFoot = new MCAModelRenderer(this, "backLeftFoot", 4, 156);
backLeftFoot.mirror = false;
backLeftFoot.addBox(0.0F, -2.0F, -9.0F, 7, 2, 9);
backLeftFoot.setInitialRotationPoint(0.0F, -11.0F, 3.0F);
backLeftFoot.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.15643448F, 0.0F, 0.0F, 0.98768836F)).transpose());
backLeftFoot.setTextureSize(512, 256);
parts.put(backLeftFoot.boxName, backLeftFoot);
lowerBackLeftLeg.addChild(backLeftFoot);

backRightFoot = new MCAModelRenderer(this, "backRightFoot", 5, 112);
backRightFoot.mirror = false;
backRightFoot.addBox(0.0F, -2.0F, -9.0F, 7, 2, 9);
backRightFoot.setInitialRotationPoint(0.0F, -11.0F, 3.0F);
backRightFoot.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.15643448F, 0.0F, 0.0F, 0.98768836F)).transpose());
backRightFoot.setTextureSize(512, 256);
parts.put(backRightFoot.boxName, backRightFoot);
lowerBackRightLeg.addChild(backRightFoot);

}

@Override
public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7) 
{
EntityCereberus entity = (EntityCereberus)par1Entity;

//Render every non-child part
frontBody.render(par7);
middleBody.render(par7);
backBody.render(par7);
mainNeck.render(par7);
rightNeck.render(par7);
leftNeck.render(par7);
middleNeck.render(par7);
rightHead.render(par7);
leftHead.render(par7);
middleHead.render(par7);
leftSnout.render(par7);
middlesnout.render(par7);
rightsnout.render(par7);
rightEarRightHead.render(par7);
leftEarRightHead.render(par7);
leftEarLeftHead.render(par7);
rightEarLeftHead.render(par7);
rightEarMiddleHead.render(par7);
leftEarMiddleHead.render(par7);
topTail.render(par7);
upperMiddleTail.render(par7);
lowerMiddleTail.render(par7);
bottomTail.render(par7);
topFrontLeftLeg.render(par7);
topFrontRightLeg.render(par7);
topBackLeftLeg.render(par7);
topBackRightLeg.render(par7);

AnimationHandler.performAnimationInModel(parts, entity);
}
@Override
public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {}

public MCAModelRenderer getModelRendererFromName(String name)
{
return parts.get(name) != null ? parts.get(name) : null;
}
}