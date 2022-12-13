package structural.adapter.monitorProject.devices;

import structural.adapter.monitorProject.interfaces.HDMI;

public class Monitor implements HDMI {


    @Override
    public void setImage(String image) {
        System.out.println(">>> Heeeey video here: " + image);
    }

    @Override
    public void setSound(String sound) {
        System.out.println(">>> Heeeey sound here: " + sound);
    }

}
