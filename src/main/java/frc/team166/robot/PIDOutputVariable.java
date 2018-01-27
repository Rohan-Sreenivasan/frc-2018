package frc.team166.robot;

import edu.wpi.first.wpilibj.PIDOutput;

public class PIDOutputVariable implements PIDOutput {
    private double value;

    @Override
    public void pidWrite(double output) {
        value = output;
    }

    public double get() {
        return value;

    }
}