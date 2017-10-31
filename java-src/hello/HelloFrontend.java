package hello;

import clojure.java.api.Clojure;
import clojure.lang.IFn;

public class HelloFrontend {
    private static IFn require = Clojure.var("clojure.core", "require");
    static {
        require.invoke(Clojure.read("hello.core"));
    }
    private static IFn getGreeter = Clojure.var("hello.core", "get-greeter");
    public static Greeter getGreeter(String greeting) {
        return (Greeter) getGreeter.invoke(greeting);
    }
}
