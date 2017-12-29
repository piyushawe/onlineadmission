package utility;

import java.io.File;
import java.util.Collection;

public abstract class GenericClass {
    protected static Collection<String> scenario = null;
    protected static String page = null;
    protected static String pack = null;
    public static File file = null;

    protected ReadFile readFile = new ReadFile();
    protected EventHandler ehandler = new EventHandler();
    protected GetterMethods gm = new GetterMethods();
}
