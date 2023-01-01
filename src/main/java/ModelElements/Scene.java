package ModelElements;

import java.util.ArrayList;
import java.util.List;

/**
 * Scene with stored information about contained models and flashes.
 */
public class Scene<Type1, Type2> {

    int id;
    List<PolygonalModel> models = new ArrayList<>();
    List<Flash> flashes = new ArrayList<>();
    List<Camera> cameras = new ArrayList<>();

    /**
     * Create a scene with models and flashes (load from file)
     *
     * @param model  List of models
     * @param camera List of cameras
     */
    public Scene(PolygonalModel model, Camera camera) {
        this.models.add(model);
        this.cameras.add(camera);
    }

    /**
     * Create an empty scene
     *
     * @param id Unique id
     */
    public Scene(int id) {
        this.id = id;
    }

    /**
     * Add model to the scene
     *
     * @param model Model to add
     */
    public void addModel(PolygonalModel model) {
        this.models.add(model);
    }

    /**
     * Add flash to the scene
     *
     * @param flash Flash to add
     */
    public void addFlash(Flash flash) {
        this.flashes.add(flash);
    }

    /**
     * Add Camera to the scene
     *
     * @param camera Camera to add
     */
    public void addCamera(Camera camera) {
        this.cameras.add(camera);
    }

    /**
     * dummy
     * @param t --
     * @return --
     */
    public Type1 method1(Type1 t) {
        return t;
    }

    /**
     * dummy
     * @param t1 --
     * @param t2 --
     * @return --
     */
    public Type2 method2(Type1 t1, Type2 t2) {
        return t2;
    }
}
