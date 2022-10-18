package main.java.homework.day2.base;

public class TrainMethodsReturn {
    public int returnNewInt(int incoming) {
        int y = incoming * 3;
        return y;
    }

    public long returnNewLong(long incoming) {
        long y;
        y = incoming - 4;
        return y;
    }

    public String returnNewChar(char incoming) {
        char y;
        y = incoming;
        return y + "" + y;
    }

    public float returnNewFloat(float incoming) {
        float y = incoming / 2;
        return y;
    }

    public double returnNewDouble(double incoming) {
        double y = incoming + 8;
        return y;
    }

    public short returnNewShort(short incoming) {
        short y = (short) (incoming - 1);
        return y;
    }

    public byte returnNewByte(byte incoming) {
        byte y = (byte) (incoming * 1);
        return y;
    }

    public String returnNewBoolean(boolean incoming) {
        String y;
        if (incoming == true) {
            y = "false";
        } else {
            y = "true";
        }
        return y;
    }
}
