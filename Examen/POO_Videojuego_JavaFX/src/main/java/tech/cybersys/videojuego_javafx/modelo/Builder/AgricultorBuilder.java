package tech.cybersys.videojuego_javafx.modelo.Builder;

import tech.cybersys.videojuego_javafx.modelo.Personaje;

public class AgricultorBuilder implements PersonajeBuilder {
    private Personaje.Builder builder;

    public AgricultorBuilder() {
        this.builder = new Personaje.Builder();
    }

    @Override
    public void buildNombre(String nombre) {
        builder.setNombre(nombre);
    }

    @Override
    public void buildHistoria() {
        String historia = "Un dedicado agricultor de las fértiles llanuras de Verdania, conocido por su habilidad " +
                "en el cultivo de los mejores cultivos de la región. Desde joven, trabajó en los campos, aprendiendo " +
                "los secretos de la tierra de su familia. Con manos fuertes y un corazón lleno de pasión por la naturaleza, " +
                "dedica sus días a sembrar, cosechar y cuidar sus tierras. Su gran conocimiento sobre las plantas y la " +
                "fertilización le ha ganado el respeto de la comunidad, que acude a él en busca de consejo sobre la agricultura. " +
                "A pesar de su vida tranquila, su habilidad para sobrevivir en condiciones adversas lo convierte en un valioso " +
                "aliado para aquellos que necesiten recursos naturales en tiempos de necesidad.";

        builder.setHistoria(historia);
    }

    @Override
    public void buildSalud() {
        builder.setSalud("90");
    }

    @Override
    public void buildFuerza() {
        builder.setFuerza("60");
    }

    @Override
    public void buildInteligencia() {
        builder.setInteligencia("70");
    }

    @Override
    public void buildClase() {
        builder.setClase("Agricultor");
    }

    @Override
    public Personaje getPersonaje() {
        return builder.build();
    }
}
