package springboot.dto;

public class PlayerData {
    
    private int position;

    public PlayerData() {
    }

    public PlayerData(int position) {
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
