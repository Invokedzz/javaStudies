package interfaces.interfacesdefault.model.services;

public interface Shape {

    default double area ( double height, double width ) {

        return height * width;

    }

}
