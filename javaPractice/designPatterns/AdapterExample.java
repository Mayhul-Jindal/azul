package javaPractice.designPatterns;

interface FiveVolt {
    public int getVolt();
}

class NineVolt {
    public int getVolt() {
        return 9;
    }
}

class NineVoltAdapter implements FiveVolt {
    NineVolt nineVolt;

    public NineVoltAdapter(NineVolt nineVolt) {
        this.nineVolt = nineVolt;
    }

    public int getVolt() {
        int volt = nineVolt.getVolt();
        return volt / 2;
    }
}


public class AdapterExample {
    public static void main(String[] args) {
        NineVolt nineVolt = new NineVolt();
        FiveVolt fiveVolt = new NineVoltAdapter(nineVolt);
        System.out.println("Output: " + fiveVolt.getVolt() + " volts");
    }
}
