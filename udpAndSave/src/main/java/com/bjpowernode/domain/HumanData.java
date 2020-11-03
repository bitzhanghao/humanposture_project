package com.bjpowernode.domain;

public class HumanData
{
    private Integer id;
    private String time;
    private Float dist_l;
    private Float dist_r;
    private Float roll_l;
    private Float pitch_l;
    private Float yaw_l;
    private Float roll_r;
    private Float pitch_r;
    private Float yaw_r;
    private Float hips_R;
    private Float hips_P;
    private Float hips_Y;
    private Float rightUpLeg_R;
    private Float rightUpLeg_P;
    private Float rightUpLeg_Y;
    private Float rightLeg_R;
    private Float rightLeg_P;
    private Float rightLeg_Y;
    private Float rightFoot_R;
    private Float rightFoot_P;
    private Float rightFoot_Y;
    private Float leftUpLeg_R;
    private Float leftUpLeg_P;
    private Float leftUpLeg_Y;
    private Float leftLeg_R;
    private Float leftLeg_P;
    private Float leftLeg_Y;
    private Float leftFoot_R;
    private Float leftFoot_P;
    private Float leftFoot_Y;
    private Float spine_R;
    private Float spine_P;
    private Float spine_Y;
    private Float head_R;
    private Float head_P;
    private Float head_Y;
    private Float rightShoulder_R;
    private Float rightShoulder_P;
    private Float rightShoulder_Y;
    private Float rightArm_R;
    private Float rightArm_P;
    private Float rightArm_Y;
    private Float rightForeArm_R;
    private Float rightForeArm_P;
    private Float rightForeArm_Y;
    private Float rightHand_R;
    private Float rightHand_P;
    private Float rightHand_Y;
    private Float leftShoulder_R;
    private Float leftShoulder_P;
    private Float leftShoulder_Y;
    private Float leftArm_R;
    private Float leftArm_P;
    private Float leftArm_Y;
    private Float leftForeArm_R;
    private Float leftForeArm_P;
    private Float leftForeArm_Y;
    private Float leftHand_R;
    private Float leftHand_P;
    private Float leftHand_Y;

    // constructor

    public HumanData()
    {
    }

    public HumanData(Integer id, String time, Float dist_l, Float dist_r, Float roll_l, Float pitch_l, Float yaw_l, Float roll_r, Float pitch_r, Float yaw_r, Float hips_R, Float hips_P, Float hips_Y, Float rightUpLeg_R, Float rightUpLeg_P, Float rightUpLeg_Y, Float rightLeg_R, Float rightLeg_P, Float rightLeg_Y, Float rightFoot_R, Float rightFoot_P, Float rightFoot_Y, Float leftUpLeg_R, Float leftUpLeg_P, Float leftUpLeg_Y, Float leftLeg_R, Float leftLeg_P, Float leftLeg_Y, Float leftFoot_R, Float leftFoot_P, Float leftFoot_Y, Float spine_R, Float spine_P, Float spine_Y, Float head_R, Float head_P, Float head_Y, Float rightShoulder_R, Float rightShoulder_P, Float rightShoulder_Y, Float rightArm_R, Float rightArm_P, Float rightArm_Y, Float rightForeArm_R, Float rightForeArm_P, Float rightForeArm_Y, Float rightHand_R, Float rightHand_P, Float rightHand_Y, Float leftShoulder_R, Float leftShoulder_P, Float leftShoulder_Y, Float leftArm_R, Float leftArm_P, Float leftArm_Y, Float leftForeArm_R, Float leftForeArm_P, Float leftForeArm_Y, Float leftHand_R, Float leftHand_P, Float leftHand_Y)
    {
        this.id = id;
        this.time = time;
        this.dist_l = dist_l;
        this.dist_r = dist_r;
        this.roll_l = roll_l;
        this.pitch_l = pitch_l;
        this.yaw_l = yaw_l;
        this.roll_r = roll_r;
        this.pitch_r = pitch_r;
        this.yaw_r = yaw_r;
        this.hips_R = hips_R;
        this.hips_P = hips_P;
        this.hips_Y = hips_Y;
        this.rightUpLeg_R = rightUpLeg_R;
        this.rightUpLeg_P = rightUpLeg_P;
        this.rightUpLeg_Y = rightUpLeg_Y;
        this.rightLeg_R = rightLeg_R;
        this.rightLeg_P = rightLeg_P;
        this.rightLeg_Y = rightLeg_Y;
        this.rightFoot_R = rightFoot_R;
        this.rightFoot_P = rightFoot_P;
        this.rightFoot_Y = rightFoot_Y;
        this.leftUpLeg_R = leftUpLeg_R;
        this.leftUpLeg_P = leftUpLeg_P;
        this.leftUpLeg_Y = leftUpLeg_Y;
        this.leftLeg_R = leftLeg_R;
        this.leftLeg_P = leftLeg_P;
        this.leftLeg_Y = leftLeg_Y;
        this.leftFoot_R = leftFoot_R;
        this.leftFoot_P = leftFoot_P;
        this.leftFoot_Y = leftFoot_Y;
        this.spine_R = spine_R;
        this.spine_P = spine_P;
        this.spine_Y = spine_Y;
        this.head_R = head_R;
        this.head_P = head_P;
        this.head_Y = head_Y;
        this.rightShoulder_R = rightShoulder_R;
        this.rightShoulder_P = rightShoulder_P;
        this.rightShoulder_Y = rightShoulder_Y;
        this.rightArm_R = rightArm_R;
        this.rightArm_P = rightArm_P;
        this.rightArm_Y = rightArm_Y;
        this.rightForeArm_R = rightForeArm_R;
        this.rightForeArm_P = rightForeArm_P;
        this.rightForeArm_Y = rightForeArm_Y;
        this.rightHand_R = rightHand_R;
        this.rightHand_P = rightHand_P;
        this.rightHand_Y = rightHand_Y;
        this.leftShoulder_R = leftShoulder_R;
        this.leftShoulder_P = leftShoulder_P;
        this.leftShoulder_Y = leftShoulder_Y;
        this.leftArm_R = leftArm_R;
        this.leftArm_P = leftArm_P;
        this.leftArm_Y = leftArm_Y;
        this.leftForeArm_R = leftForeArm_R;
        this.leftForeArm_P = leftForeArm_P;
        this.leftForeArm_Y = leftForeArm_Y;
        this.leftHand_R = leftHand_R;
        this.leftHand_P = leftHand_P;
        this.leftHand_Y = leftHand_Y;
    }

    @Override
    public String toString()
    {
        return "HumanData{" + "id=" + id + ", " +
                "time='" + time + '\'' + ", dist_l=" + dist_l + ", " +
                "dist_r=" + dist_r + ", roll_l=" + roll_l + ", pitch_l=" +
                pitch_l + ", yaw_l=" + yaw_l + ", roll_r=" + roll_r + ", pitch_r=" +
                pitch_r + ", yaw_r=" + yaw_r + ", hips_R=" + hips_R + ", hips_P=" + hips_P +
                ", hips_Y=" + hips_Y + ", rightUpLeg_R=" + rightUpLeg_R + ", rightUpLeg_P=" +
                rightUpLeg_P + ", rightUpLeg_Y=" + rightUpLeg_Y + ", rightLeg_R=" + rightLeg_R + ", " +
                "rightLeg_P=" + rightLeg_P + ", rightLeg_Y=" + rightLeg_Y + ", rightFoot_R=" + rightFoot_R +
                ", rightFoot_P=" + rightFoot_P + ", rightFoot_Y=" + rightFoot_Y + ", leftUpLeg_R=" +
                leftUpLeg_R + ", leftUpLeg_P=" + leftUpLeg_P + ", leftUpLeg_Y=" + leftUpLeg_Y + ", " +
                "leftLeg_R=" + leftLeg_R + ", leftLeg_P=" + leftLeg_P + ", leftLeg_Y=" + leftLeg_Y + ", " +
                "leftFoot_R=" + leftFoot_R + ", leftFoot_P=" + leftFoot_P + ", leftFoot_Y=" + leftFoot_Y +
                ", spine_R=" + spine_R + ", spine_P=" + spine_P + ", spine_Y=" + spine_Y + ", " +
                "head_R=" + head_R + ", head_P=" + head_P + ", head_Y=" + head_Y + ", " +
                "rightShoulder_R=" + rightShoulder_R + ", rightShoulder_P=" + rightShoulder_P + "," +
                " rightShoulder_Y=" + rightShoulder_Y + ", rightArm_R=" + rightArm_R + "," +
                " rightArm_P=" + rightArm_P + ", rightArm_Y=" + rightArm_Y + ", " +
                "rightForeArm_R=" + rightForeArm_R + ", rightForeArm_P=" + rightForeArm_P + "," +
                " rightForeArm_Y=" + rightForeArm_Y + ", rightHand_R=" + rightHand_R + ", rightHand_P=" +
                rightHand_P + ", rightHand_Y=" + rightHand_Y + ", leftShoulder_R=" + leftShoulder_R + ", " +
                "leftShoulder_P=" + leftShoulder_P + ", leftShoulder_Y=" + leftShoulder_Y + ", " +
                "leftArm_R=" + leftArm_R + ", leftArm_P=" + leftArm_P + ", leftArm_Y=" + leftArm_Y + ", " +
                "leftForeArm_R=" + leftForeArm_R + ", leftForeArm_P=" + leftForeArm_P + ", " +
                "leftForeArm_Y=" + leftForeArm_Y + ", leftHand_R=" + leftHand_R + ", leftHand_P=" +
                leftHand_P + ", leftHand_Y=" + leftHand_Y + '}';
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getTime()
    {
        return time;
    }

    public void setTime(String time)
    {
        this.time = time;
    }

    public Float getDist_l()
    {
        return dist_l;
    }

    public void setDist_l(Float dist_l)
    {
        this.dist_l = dist_l;
    }

    public Float getDist_r()
    {
        return dist_r;
    }

    public void setDist_r(Float dist_r)
    {
        this.dist_r = dist_r;
    }

    public Float getRoll_l()
    {
        return roll_l;
    }

    public void setRoll_l(Float roll_l)
    {
        this.roll_l = roll_l;
    }

    public Float getPitch_l()
    {
        return pitch_l;
    }

    public void setPitch_l(Float pitch_l)
    {
        this.pitch_l = pitch_l;
    }

    public Float getYaw_l()
    {
        return yaw_l;
    }

    public void setYaw_l(Float yaw_l)
    {
        this.yaw_l = yaw_l;
    }

    public Float getRoll_r()
    {
        return roll_r;
    }

    public void setRoll_r(Float roll_r)
    {
        this.roll_r = roll_r;
    }

    public Float getPitch_r()
    {
        return pitch_r;
    }

    public void setPitch_r(Float pitch_r)
    {
        this.pitch_r = pitch_r;
    }

    public Float getYaw_r()
    {
        return yaw_r;
    }

    public void setYaw_r(Float yaw_r)
    {
        this.yaw_r = yaw_r;
    }

    public Float getHips_R()
    {
        return hips_R;
    }

    public void setHips_R(Float hips_R)
    {
        this.hips_R = hips_R;
    }

    public Float getHips_P()
    {
        return hips_P;
    }

    public void setHips_P(Float hips_P)
    {
        this.hips_P = hips_P;
    }

    public Float getHips_Y()
    {
        return hips_Y;
    }

    public void setHips_Y(Float hips_Y)
    {
        this.hips_Y = hips_Y;
    }

    public Float getRightUpLeg_R()
    {
        return rightUpLeg_R;
    }

    public void setRightUpLeg_R(Float rightUpLeg_R)
    {
        this.rightUpLeg_R = rightUpLeg_R;
    }

    public Float getRightUpLeg_P()
    {
        return rightUpLeg_P;
    }

    public void setRightUpLeg_P(Float rightUpLeg_P)
    {
        this.rightUpLeg_P = rightUpLeg_P;
    }

    public Float getRightUpLeg_Y()
    {
        return rightUpLeg_Y;
    }

    public void setRightUpLeg_Y(Float rightUpLeg_Y)
    {
        this.rightUpLeg_Y = rightUpLeg_Y;
    }

    public Float getRightLeg_R()
    {
        return rightLeg_R;
    }

    public void setRightLeg_R(Float rightLeg_R)
    {
        this.rightLeg_R = rightLeg_R;
    }

    public Float getRightLeg_P()
    {
        return rightLeg_P;
    }

    public void setRightLeg_P(Float rightLeg_P)
    {
        this.rightLeg_P = rightLeg_P;
    }

    public Float getRightLeg_Y()
    {
        return rightLeg_Y;
    }

    public void setRightLeg_Y(Float rightLeg_Y)
    {
        this.rightLeg_Y = rightLeg_Y;
    }

    public Float getRightFoot_R()
    {
        return rightFoot_R;
    }

    public void setRightFoot_R(Float rightFoot_R)
    {
        this.rightFoot_R = rightFoot_R;
    }

    public Float getRightFoot_P()
    {
        return rightFoot_P;
    }

    public void setRightFoot_P(Float rightFoot_P)
    {
        this.rightFoot_P = rightFoot_P;
    }

    public Float getRightFoot_Y()
    {
        return rightFoot_Y;
    }

    public void setRightFoot_Y(Float rightFoot_Y)
    {
        this.rightFoot_Y = rightFoot_Y;
    }

    public Float getLeftUpLeg_R()
    {
        return leftUpLeg_R;
    }

    public void setLeftUpLeg_R(Float leftUpLeg_R)
    {
        this.leftUpLeg_R = leftUpLeg_R;
    }

    public Float getLeftUpLeg_P()
    {
        return leftUpLeg_P;
    }

    public void setLeftUpLeg_P(Float leftUpLeg_P)
    {
        this.leftUpLeg_P = leftUpLeg_P;
    }

    public Float getLeftUpLeg_Y()
    {
        return leftUpLeg_Y;
    }

    public void setLeftUpLeg_Y(Float leftUpLeg_Y)
    {
        this.leftUpLeg_Y = leftUpLeg_Y;
    }

    public Float getLeftLeg_R()
    {
        return leftLeg_R;
    }

    public void setLeftLeg_R(Float leftLeg_R)
    {
        this.leftLeg_R = leftLeg_R;
    }

    public Float getLeftLeg_P()
    {
        return leftLeg_P;
    }

    public void setLeftLeg_P(Float leftLeg_P)
    {
        this.leftLeg_P = leftLeg_P;
    }

    public Float getLeftLeg_Y()
    {
        return leftLeg_Y;
    }

    public void setLeftLeg_Y(Float leftLeg_Y)
    {
        this.leftLeg_Y = leftLeg_Y;
    }

    public Float getLeftFoot_R()
    {
        return leftFoot_R;
    }

    public void setLeftFoot_R(Float leftFoot_R)
    {
        this.leftFoot_R = leftFoot_R;
    }

    public Float getLeftFoot_P()
    {
        return leftFoot_P;
    }

    public void setLeftFoot_P(Float leftFoot_P)
    {
        this.leftFoot_P = leftFoot_P;
    }

    public Float getLeftFoot_Y()
    {
        return leftFoot_Y;
    }

    public void setLeftFoot_Y(Float leftFoot_Y)
    {
        this.leftFoot_Y = leftFoot_Y;
    }

    public Float getSpine_R()
    {
        return spine_R;
    }

    public void setSpine_R(Float spine_R)
    {
        this.spine_R = spine_R;
    }

    public Float getSpine_P()
    {
        return spine_P;
    }

    public void setSpine_P(Float spine_P)
    {
        this.spine_P = spine_P;
    }

    public Float getSpine_Y()
    {
        return spine_Y;
    }

    public void setSpine_Y(Float spine_Y)
    {
        this.spine_Y = spine_Y;
    }

    public Float getHead_R()
    {
        return head_R;
    }

    public void setHead_R(Float head_R)
    {
        this.head_R = head_R;
    }

    public Float getHead_P()
    {
        return head_P;
    }

    public void setHead_P(Float head_P)
    {
        this.head_P = head_P;
    }

    public Float getHead_Y()
    {
        return head_Y;
    }

    public void setHead_Y(Float head_Y)
    {
        this.head_Y = head_Y;
    }

    public Float getRightShoulder_R()
    {
        return rightShoulder_R;
    }

    public void setRightShoulder_R(Float rightShoulder_R)
    {
        this.rightShoulder_R = rightShoulder_R;
    }

    public Float getRightShoulder_P()
    {
        return rightShoulder_P;
    }

    public void setRightShoulder_P(Float rightShoulder_P)
    {
        this.rightShoulder_P = rightShoulder_P;
    }

    public Float getRightShoulder_Y()
    {
        return rightShoulder_Y;
    }

    public void setRightShoulder_Y(Float rightShoulder_Y)
    {
        this.rightShoulder_Y = rightShoulder_Y;
    }

    public Float getRightArm_R()
    {
        return rightArm_R;
    }

    public void setRightArm_R(Float rightArm_R)
    {
        this.rightArm_R = rightArm_R;
    }

    public Float getRightArm_P()
    {
        return rightArm_P;
    }

    public void setRightArm_P(Float rightArm_P)
    {
        this.rightArm_P = rightArm_P;
    }

    public Float getRightArm_Y()
    {
        return rightArm_Y;
    }

    public void setRightArm_Y(Float rightArm_Y)
    {
        this.rightArm_Y = rightArm_Y;
    }

    public Float getRightForeArm_R()
    {
        return rightForeArm_R;
    }

    public void setRightForeArm_R(Float rightForeArm_R)
    {
        this.rightForeArm_R = rightForeArm_R;
    }

    public Float getRightForeArm_P()
    {
        return rightForeArm_P;
    }

    public void setRightForeArm_P(Float rightForeArm_P)
    {
        this.rightForeArm_P = rightForeArm_P;
    }

    public Float getRightForeArm_Y()
    {
        return rightForeArm_Y;
    }

    public void setRightForeArm_Y(Float rightForeArm_Y)
    {
        this.rightForeArm_Y = rightForeArm_Y;
    }

    public Float getRightHand_R()
    {
        return rightHand_R;
    }

    public void setRightHand_R(Float rightHand_R)
    {
        this.rightHand_R = rightHand_R;
    }

    public Float getRightHand_P()
    {
        return rightHand_P;
    }

    public void setRightHand_P(Float rightHand_P)
    {
        this.rightHand_P = rightHand_P;
    }

    public Float getRightHand_Y()
    {
        return rightHand_Y;
    }

    public void setRightHand_Y(Float rightHand_Y)
    {
        this.rightHand_Y = rightHand_Y;
    }

    public Float getLeftShoulder_R()
    {
        return leftShoulder_R;
    }

    public void setLeftShoulder_R(Float leftShoulder_R)
    {
        this.leftShoulder_R = leftShoulder_R;
    }

    public Float getLeftShoulder_P()
    {
        return leftShoulder_P;
    }

    public void setLeftShoulder_P(Float leftShoulder_P)
    {
        this.leftShoulder_P = leftShoulder_P;
    }

    public Float getLeftShoulder_Y()
    {
        return leftShoulder_Y;
    }

    public void setLeftShoulder_Y(Float leftShoulder_Y)
    {
        this.leftShoulder_Y = leftShoulder_Y;
    }

    public Float getLeftArm_R()
    {
        return leftArm_R;
    }

    public void setLeftArm_R(Float leftArm_R)
    {
        this.leftArm_R = leftArm_R;
    }

    public Float getLeftArm_P()
    {
        return leftArm_P;
    }

    public void setLeftArm_P(Float leftArm_P)
    {
        this.leftArm_P = leftArm_P;
    }

    public Float getLeftArm_Y()
    {
        return leftArm_Y;
    }

    public void setLeftArm_Y(Float leftArm_Y)
    {
        this.leftArm_Y = leftArm_Y;
    }

    public Float getLeftForeArm_R()
    {
        return leftForeArm_R;
    }

    public void setLeftForeArm_R(Float leftForeArm_R)
    {
        this.leftForeArm_R = leftForeArm_R;
    }

    public Float getLeftForeArm_P()
    {
        return leftForeArm_P;
    }

    public void setLeftForeArm_P(Float leftForeArm_P)
    {
        this.leftForeArm_P = leftForeArm_P;
    }

    public Float getLeftForeArm_Y()
    {
        return leftForeArm_Y;
    }

    public void setLeftForeArm_Y(Float leftForeArm_Y)
    {
        this.leftForeArm_Y = leftForeArm_Y;
    }

    public Float getLeftHand_R()
    {
        return leftHand_R;
    }

    public void setLeftHand_R(Float leftHand_R)
    {
        this.leftHand_R = leftHand_R;
    }

    public Float getLeftHand_P()
    {
        return leftHand_P;
    }

    public void setLeftHand_P(Float leftHand_P)
    {
        this.leftHand_P = leftHand_P;
    }

    public Float getLeftHand_Y()
    {
        return leftHand_Y;
    }

    public void setLeftHand_Y(Float leftHand_Y)
    {
        this.leftHand_Y = leftHand_Y;
    }
}
