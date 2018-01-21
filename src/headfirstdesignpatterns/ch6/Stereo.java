package headfirstdesignpatterns.ch6;

public class Stereo {
    public void on(){
        System.out.println("Stereo.on()");
    }

    public void setCD(){
        System.out.println("Stereo.setCD()");
    }

    public void setVolume(int volume){
        this.volumn = volume;
    }

    private int volumn;
}
