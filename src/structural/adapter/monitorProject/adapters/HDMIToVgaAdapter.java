package structural.adapter.monitorProject.adapters;

import structural.adapter.monitorProject.interfaces.HDMI;
import structural.adapter.monitorProject.interfaces.VGA;

public class HDMIToVgaAdapter implements HDMI {

    private VGA vga;

    public HDMIToVgaAdapter(VGA vga) {
        System.out.println("Conecting the HDMI/VGA adapter...");
        this.vga = vga;
    }

    @Override
    public void setImage(String image) {
        System.out.println("Converting the image from HDMI to VGA");
        vga.setImage(image);
    }

    @Override
    public void setSound(String sound) {
        System.out.println("Sorry, We don`t work with sound");
    }
}
