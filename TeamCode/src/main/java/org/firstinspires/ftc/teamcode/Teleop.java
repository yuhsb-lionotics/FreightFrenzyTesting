package org.firstinspires.ftc.teamcode;

public class Teleop extends Hardware {

    @Override
    public void runOpMode() throws InterruptedException {
        telemetry.addData("Status", "Intializing");
        telemetry.update();
        hardwareSetup();
        telemetry.addData("Status", "Waiting for Start");
        telemetry.update();
        //Wait until the play button is pressed
        waitForStart();
        telemetry.addData("Status", "Match in Progress");
        telemetry.update();

        Button gamepad2x = new Button(false);
        Button gamepad2b = new Button(false);
        Button gamepad2y = new Button(false);
        Button gamepad2LeftTrigger = new Button(false);
        Button gamepad2RightTrigger = new Button(false);
//        gamepad2.left
        gamepad2x.update(gamepad2.x);
        gamepad2b.update(gamepad2.b);
        gamepad2y.update(gamepad2.y);
        gamepad2LeftTrigger.update(gamepad2.left_trigger > 0);
        gamepad2RightTrigger.update(gamepad2.right_trigger > 0);
        while (opModeIsActive()) {
            gamepad2x.update(gamepad2.x);
            gamepad2b.update(gamepad2.b);
            gamepad2y.update(gamepad2.y);
            gamepad2LeftTrigger.update(gamepad2.left_trigger > 0);
            gamepad2RightTrigger.update(gamepad2.right_trigger > 0);

            frontLeft.setPower(-gamepad1.left_stick_y);
            backLeft.setPower(-gamepad1.left_stick_y);
            frontRight.setPower(-gamepad1.right_stick_y);
            backRight.setPower(-gamepad1.right_stick_y);
        }
    }
}