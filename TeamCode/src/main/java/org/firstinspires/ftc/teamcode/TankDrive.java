package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp
public class TankDrive extends OpMode {

    private DcMotor leftMotor;
    private DcMotor rightMotor;

    @Override
    public void init() {
        leftMotor = hardwareMap.get(DcMotor.class, "left");
        rightMotor = hardwareMap.get(DcMotor.class, "right");

        leftMotor.setDirection(DcMotorSimple.Direction.REVERSE);

        Dog bluey = new Dog("Bluey", 6, "Blue Heeler", "blue and tan");
        Dog bingo = new Dog("Bingo", 4, "Blue Heeler", "orange and creme");

        bluey.age++;
        bingo.age++;

    }

    @Override
    public void loop() {
        double leftPower = -gamepad1.left_stick_y;
        double rightPower = -gamepad1.right_stick_y;

        leftPower = leftPower * leftPower * leftPower;
        rightPower = rightPower * rightPower * rightPower;

        leftMotor.setPower(leftPower);
        rightMotor.setPower(rightPower);

    }
}
