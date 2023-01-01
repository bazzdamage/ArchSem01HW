package InMemoryModel;

import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.PolygonalModel;
import ModelElements.Scene;

import java.util.ArrayList;
import java.util.List;

public class ModelStore implements iModelChanger {

    public List<PolygonalModel> models = new ArrayList<>();
    public List<Scene> scenes = new ArrayList<>();
    public List<Flash> flashes = new ArrayList<>();
    public List<Camera> cameras = new ArrayList<>();
    private List<iModelChangedObserver> changedObservers = new ArrayList<>();

    /**
     * Generate Scene from arrays of data
     * @param models array of models
     * @param scenes array of scenes
     * @param flashes array of flashes
     * @param cameras array of cameras
     */
    public ModelStore(List<PolygonalModel> models, List<Scene> scenes, List<Flash> flashes, List<Camera> cameras) {
        this.models = models;
        this.scenes = scenes;
        this.flashes = flashes;
        this.cameras = cameras;
    }

    /**
     * Realize method of Interface iModelCHanger
     *
     * @param sender sender of notification
     */
    @Override
    public void noteOfChanges(iModelChanger sender) {
    }

    /**
     * Get Scene by its ID
     *
     * @param sceneId Scene ID
     * @return return Scene
     */
    public Scene getScene(int sceneId) {
        return scenes.get(sceneId);
    }
}
