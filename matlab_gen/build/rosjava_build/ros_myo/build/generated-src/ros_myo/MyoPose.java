package ros_myo;

public interface MyoPose extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "ros_myo/MyoPose";
  static final java.lang.String _DEFINITION = "# Pose message\nuint8 REST = 1\nuint8 FIST = 2\nuint8 WAVE_IN = 3\nuint8 WAVE_OUT = 4\nuint8 FINGERS_SPREAD = 5\nuint8 THUMB_TO_PINKY = 6\nuint8 UNKNOWN = 0\nuint8 pose\n";
  static final boolean _IS_SERVICE = false;
  static final boolean _IS_ACTION = false;
  static final byte REST = 1;
  static final byte FIST = 2;
  static final byte WAVE_IN = 3;
  static final byte WAVE_OUT = 4;
  static final byte FINGERS_SPREAD = 5;
  static final byte THUMB_TO_PINKY = 6;
  static final byte UNKNOWN = 0;
  byte getPose();
  void setPose(byte value);
}
