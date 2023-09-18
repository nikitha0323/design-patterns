package Decorator;

import java.util.ArrayList;

public class Paint extends VehicleDecorator {
    private String c;

    public Paint(Vehicle v, String c) {
        super(v);
        this.c = c;
        applyColor();
    }

    private void applyColor() {
        switch (c) {
            case "red":
                lines.replaceAll(line -> "\u001B[31m" + line);
                break;
            case "green":
                lines.replaceAll(line -> "\u001B[32m" + line);
                break;
            case "yellow":
                lines.replaceAll(line -> "\u001B[33m" + line);
                break;
            case "blue":
                lines.replaceAll(line -> "\u001B[34m" + line);
                break;
            case "purple":
                lines.replaceAll(line -> "\u001B[35m" + line);
                break;
            case "cyan":
                lines.replaceAll(line -> "\u001B[36m" + line);
                break;
            case "none":
            default:
                lines.replaceAll(line -> "\u001B[0m" + line);
                break;
        }
    }

    public void integrateDecor(ArrayList<String> d) {
        this.lines.addAll(d);
    }

}
