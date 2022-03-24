package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

public class Hardware extends LinearOpMode {
    //Wheels
    protected DcMotor frontLeft, frontRight, backLeft, backRight;
    frontLeft = hardwareMap.dcMotor.get("frontLeft");
    frontRight = hardwareMap.dcMotor.get("frontRight");
    backRight = hardwareMap.dcMotor.get("backRight");
    backLeft = hardwareMap.dcMotor.get("backLeft");
    
    @Override
    public void runOpMode() throws InterruptedException {
    }
}
