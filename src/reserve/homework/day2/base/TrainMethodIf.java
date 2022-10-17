package reserve.homework.day2.base;

public class TrainMethodIf {
    public int returnNewInt(int incoming) {
        int y;
        if (incoming < 8) {
            y = incoming * 7;
        } else {
            y = incoming / 4;
        }
        return y;
    }

    public long returnNewLong(long incoming) {
        long y;
        if (incoming < 300) {
            y = incoming - 300;
        } else {
            y = incoming + 20;
        }
        return y;

    }

    public String returnNewChar(char incoming) {
        String y;
        if (incoming == 'g') {
            y = "go";

            return y;
        } else {
            y = Character.toString(incoming);
        }
        return y;
    }

    public float returnNewFloat(float incoming) {
        float y;
        if (incoming == 0.67f) {
            y = incoming;
        } else {
            y = incoming * 2;
        }
        return y;
    }

    public double returnNewDouble(double incoming) {
        double y;
        if (incoming < 80 &&
                incoming > 30) {
            y = incoming + 87;
        } else if (incoming > 80 &&
                incoming < 400) {
            y = incoming / 4;
        } else {
            y = incoming;
        }
        return y;
    }

    public String returnNewBoolean(boolean incoming) {
        String y;
        if (incoming == true) {
            y = "я получил на вход значение истины";
        } else {
            y = "я получил на вход ложь";
        }
        return y;
    }
}

