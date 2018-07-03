package jp.co.np.logging.sample;

import jp.co.np.logging.sample.child.Child;
import jp.co.np.logging.sample.child.grandson.Grandson;

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.execute();
        Child child = new Child();
        child.execute();
        Grandson grandson = new Grandson();
        grandson.execute();
    }
}
