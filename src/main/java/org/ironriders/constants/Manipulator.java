package org.ironriders.constants;

public class Manipulator {
    public static final int CURRENT_LIMIT = 20;
    public static final double INTAKE_SPEED = 0.5;
    public static final double DISCHARGE_FOR_SHOOTER_SPEED = 1;
    public static final double DISCHARGE_FOR_AMP_SPEED = 1;
    public static final double DISCHARGE_TIMEOUT = 0.5;
    public static final String DASHBOARD_PREFIX = "manipulator/";

    public enum State {
        GRAB,
        EJECT_TO_SHOOTER,
        EJECT_TO_AMP,
        STOP
    }
}
