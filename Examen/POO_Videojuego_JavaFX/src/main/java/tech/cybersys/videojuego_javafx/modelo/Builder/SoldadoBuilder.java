package tech.cybersys.videojuego_javafx.modelo.Builder;

import tech.cybersys.videojuego_javafx.modelo.Personaje;

public class SoldadoBuilder implements PersonajeBuilder {
    private Personaje.Builder builder;

    public SoldadoBuilder() {
        this.builder = new Personaje.Builder();
    }

    @Override
    public void buildNombre(String nombre) {
        builder.setNombre(nombre);
    }

    @Override
    public void buildHistoria() {
        String historia = "Un valiente soldado de la región de Aranthor, conocido por su destreza en el combate " +
                "y su inquebrantable lealtad. Desde joven, entrenó con los mejores guerreros y se convirtió en un " +
                "hábil luchador con una gran maestría en el uso de espadas y escudos. Su vida ha estado marcada por " +
                "batallas épicas y misiones de alto riesgo, defendiendo su patria de invasores y amenazas. A pesar de " +
                "su naturaleza robusta, posee un corazón noble y un fuerte sentido del deber. Sus hazañas en el campo de " +
                "batalla son legendarias, y es respetado por sus compañeros y temido por sus enemigos.";

        builder.setHistoria(historia);
    }

    @Override
    public void buildSalud() {
        builder.setSalud("100");
    }

    @Override
    public void buildFuerza() {
        builder.setFuerza("80");
    }

    @Override
    public void buildInteligencia() {
        builder.setInteligencia("60");
    }

    @Override
    public void buildClase() {
        builder.setClase("Soldado");
    }

    @Override
    public Personaje getPersonaje() {
        return builder.build();
    }
}
