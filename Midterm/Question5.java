public class Question5 {
    public static void main(String[] args) {

    }
}

class Camera {
    private Camera(){}

    public String getCameraName() {
        return cameraName;
    }

    public void setCameraName(String cameraName) {
        this.cameraName = cameraName;
    }

    private static  Camera _instance;
    private static Object obj = new Object();
    private String cameraName = "";
    public static Camera getInstance(){

        if(_instance == null){
            synchronized (obj){
                if(_instance == null){
                    _instance = new Camera();
                }
            }
        }
        return _instance;
    }
}
