package ros_myo;

public interface EmgArray extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "ros_myo/EmgArray";
  static final java.lang.String _DEFINITION = "# EmgArray message for the Thalmic Myo, which has 8 EMG sensors \n# arranged around the arm\n# There is a moving field that\'s unclear what it is looks like a bitmask\n\nint16[8] data\nint16 moving\n";
  static final boolean _IS_SERVICE = false;
  static final boolean _IS_ACTION = false;
  short[] getData();
  void setData(short[] value);
  short getMoving();
  void setMoving(short value);
}
