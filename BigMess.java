import java.util.Random;

class MegaClass1 {
    void useless1() {
        int x = new Random().nextInt(100);
        // does no shit 
    }
    void useless2() {
        for (int i = 0; i < 10; i++) useless1();
    }
}

class MegaClass2 {
    void useless3() {
        MegaClass1 mc = new MegaClass1();
        mc.useless2();
    }
}

class MegaClass3 {
    void uselessChain() {
        MegaClass2 mc2 = new MegaClass2();
        for (int i = 0; i < 100; i++) mc2.useless3();
    }
}

public class BigMess {
    public static void main(String[] args) {
        MegaClass3 mc3 = new MegaClass3();
        mc3.uselessChain();
        System.out.println("Hello… I do almost nothing 💀");
    }
}
