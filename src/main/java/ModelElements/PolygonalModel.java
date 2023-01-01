package ModelElements;

import BaseElements.Polygon;
import BaseElements.Texture;

import java.util.ArrayList;
import java.util.List;

/**
 * Polygonal model with any number of polygons and textures
 */
public class PolygonalModel {
    List<Polygon> polygons;
    List<Texture> textures = new ArrayList<>();

    /**
     * Create a polygonal model from array of points.
     * @param polygons array of points (x,y,z)
     */
    public PolygonalModel(List<Polygon> polygons) {
        this.polygons = polygons;
    }

    /**
     * Create a 3D model from array of points and textures
     * @param polygons array of points (x,y,z)
     * @param textures array of textures
     */
    public PolygonalModel(List<Polygon> polygons, List<Texture> textures) {
        this.polygons = polygons;
        this.textures = textures;
    }

    /**
     * Add Texture to object
     * @param texture texture
     */
    public void AddTexture (Texture texture) {
        this.textures.add(texture);
    }
}
