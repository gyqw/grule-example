package gyqw.grule.console.example.model;

public class ItemModel {

    private String deviceId;

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    @Override
    public String toString() {
        return "ItemModel{" +
            "deviceId='" + deviceId + '\'' +
            '}';
    }
}
