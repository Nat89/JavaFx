package Model;

public class Participant {
    private  int particip_id;
    private String particip_name;
    private  String particip_lastname;

    public Participant(int particip_id, String particip_name, String particip_lastname) {
        this.particip_id = particip_id;
        this.particip_name = particip_name;
        this.particip_lastname = particip_lastname;
    }

    public int getParticip_id() {
        return particip_id;
    }

    public void setParticip_id(int particip_id) {
        this.particip_id = particip_id;
    }

    public String getParticip_name() {
        return particip_name;
    }

    public void setParticip_name(String particip_name) {
        this.particip_name = particip_name;
    }

    public String getParticip_lastname() {
        return particip_lastname;
    }

    public void setParticip_lastname(String particip_lastname) {
        this.particip_lastname = particip_lastname;
    }
}
