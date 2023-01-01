package BaseElements;

import java.nio.file.Path;

/**
 * Base Texture with name and Path to it
 */
public class Texture {

    String Name;
    Path path;

    public Texture(String name, Path path) {
        Name = name;
        this.path = path;
    }
}
