package ros_myo;

public interface MyoArm extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "ros_myo/MyoArm";
  static final java.lang.String _DEFINITION = "# Arm message for the Thalmic Myo. Using firmware > 1.0, \n# Thalmic Gesture Recognition is possible after sync gesture is performed.\n\n# arm represents which arm the device is on\nuint8 UNKNOWN=0\nuint8 RIGHT=1\nuint8 LEFT=2\nuint8 arm\n\n# xdir represents the direction of the x-axis\n# Sharing UNKNOWN=0\nuint8 X_TOWARD_WRIST=11\nuint8 X_TOWARD_ELBOW=12\nuint8 xdir\n";
  static final boolean _IS_SERVICE = false;
  static final boolean _IS_ACTION = false;
  static final byte UNKNOWN = 0;
  static final byte RIGHT = 1;
  static final byte LEFT = 2;
  static final byte X_TOWARD_WRIST = 11;
  static final byte X_TOWARD_ELBOW = 12;
  byte getArm();
  void setArm(byte value);
  byte getXdir();
  void setXdir(byte value);
}
