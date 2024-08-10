package tech.cybersys.videojuego_javafx.controlador;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import tech.cybersys.videojuego_javafx.modelo.Builder.PersonajeBuilder;
import tech.cybersys.videojuego_javafx.modelo.Personaje;
import tech.cybersys.videojuego_javafx.modelo.PersonajeDAO;
import tech.cybersys.videojuego_javafx.modelo.PersonajeDAOImpl;

import java.io.IOException;

import static tech.cybersys.videojuego_javafx.controlador.ControladorVentanas.mostrarVentana;

public class ControladorCreacionPersonaje {

    @FXML private TabPane TablaPestanas;
    @FXML private TextArea CampoHistoria;
    @FXML private TextField CampoNombre;
    @FXML private Label EtiquetaErrorNombre;
    @FXML private TextField CampoSalud;
    @FXML private TextField CampoFuerza;
    @FXML private TextField CampoInteligencia;
    @FXML private TextField CampoDinero;
    @FXML private Button BotonCrearPersonaje;

    Personaje PersonajeGuardado;

    @FXML
    public void MostrarAtributosComerciante() throws IOException {
        String historia = "Un astuto comerciante, nacido en el bullicioso puerto de Marvella. " +
                "Desde joven, aprendió el arte del trueque y la negociación de su padre, un renombrado mercader. " +
                "Con un ojo agudo para los tesoros y una lengua de plata, él viaja por tierras lejanas en busca de " +
                "objetos raros y valiosos. Su tienda es conocida por tener los artículos más exóticos y útiles, " +
                "desde pociones mágicas hasta armas legendarias. Aunque su apariencia es modesta, su conocimiento " +
                "y recursos son invaluables para cualquier aventurero que cruce su camino.";

        if (CampoNombre.getText().equals("")) {
            EtiquetaErrorNombre.setVisible(true);
        } else {
            EtiquetaErrorNombre.setVisible(false);
            TablaPestanas.setVisible(true);
            Personaje comerciante = new Personaje.Builder()
                    .setClase("Comerciante")
                    .setFuerza("50")
                    .setHistoria(historia)
                    .setInteligencia("55")
                    .setSalud("200")
                    .setNombre("Rene")
                    .setDinero("1000")
                    .build();
            PersonajeGuardado = comerciante;

            CampoHistoria.setText(comerciante.getHistoria());
            CampoSalud.setText(comerciante.getSalud());
            CampoFuerza.setText(comerciante.getFuerza());
            CampoDinero.setText(comerciante.getDinero());
            CampoInteligencia.setText(comerciante.getInteligencia());
        }
    }

    @FXML
    public void MostrarAtributosSoldado() throws IOException {

        String historia = "Un valiente soldado de la región de Aranthor, conocido por su destreza en el combate " +
                "y su inquebrantable lealtad. Desde joven, entrenó con los mejores guerreros y se convirtió en un " +
                "hábil luchador con una gran maestría en el uso de espadas y escudos. Su vida ha estado marcada por " +
                "batallas épicas y misiones de alto riesgo, defendiendo su patria de invasores y amenazas. A pesar de " +
                "su naturaleza robusta, posee un corazón noble y un fuerte sentido del deber. Sus hazañas en el campo de " +
                "batalla son legendarias, y es respetado por sus compañeros y temido por sus enemigos.";


        if (CampoNombre.getText().equals("")) {
            EtiquetaErrorNombre.setVisible(true);
        } else {
            EtiquetaErrorNombre.setVisible(false);
            TablaPestanas.setVisible(true);
            Personaje Soldado = new Personaje.Builder()
                    .setClase("Soldado")
                    .setFuerza("100")
                    .setHistoria(historia)
                    .setInteligencia("50")
                    .setSalud("300")
                    .setNombre("Juan")
                    .setDinero("100")
                    .build();
            PersonajeGuardado = Soldado;

            CampoHistoria.setText(Soldado.getHistoria());
            CampoSalud.setText(Soldado.getSalud());
            CampoFuerza.setText(Soldado.getFuerza());
            CampoDinero.setText(Soldado.getDinero());
            CampoInteligencia.setText(Soldado.getInteligencia());
        }
    }

    @FXML
    public void MostrarAtributosAgricultor() throws IOException {

        String historia = "Un dedicado agricultor de las fértiles llanuras de Verdania, conocido por su habilidad " +
                "en el cultivo de los mejores cultivos de la región. Desde joven, trabajó en los campos, aprendiendo " +
                "los secretos de la tierra de su familia. Con manos fuertes y un corazón lleno de pasión por la naturaleza, " +
                "dedica sus días a sembrar, cosechar y cuidar sus tierras. Su gran conocimiento sobre las plantas y la " +
                "fertilización le ha ganado el respeto de la comunidad, que acude a él en busca de consejo sobre la agricultura. " +
                "A pesar de su vida tranquila, su habilidad para sobrevivir en condiciones adversas lo convierte en un valioso " +
                "aliado para aquellos que necesiten recursos naturales en tiempos de necesidad.";

        if (CampoNombre.getText().equals("")) {
            EtiquetaErrorNombre.setVisible(true);
        } else {
            EtiquetaErrorNombre.setVisible(false);
            TablaPestanas.setVisible(true);
            Personaje agricultor = new Personaje.Builder()
                    .setClase("Agricultor")
                    .setFuerza("50")
                    .setHistoria(historia)
                    .setInteligencia("80")
                    .setSalud("150")
                    .setNombre("Tony")
                    .setDinero("1000")
                    .build();
            PersonajeGuardado = agricultor;

            CampoHistoria.setText(agricultor.getHistoria());
            CampoSalud.setText(agricultor.getSalud());
            CampoFuerza.setText(agricultor.getFuerza());
            CampoDinero.setText(agricultor.getDinero());
            CampoInteligencia.setText(agricultor.getInteligencia());
        }
    }

    @FXML
    public void CrearPersonaje(ActionEvent event) throws IOException {
        PersonajeDAO personajeDAO = new PersonajeDAOImpl();
        personajeDAO.guardarPersonaje(PersonajeGuardado);
        mostrarVentana(event, null, "Juego-view.fxml", "Pantalla de Juego");
    }

    @FXML
    public void CargarPersonaje(String nombre) throws IOException {
        Personaje personaje1;
        PersonajeDAO personajedao = new PersonajeDAOImpl();
        personaje1 = personajedao.cargarPersonaje(nombre);
    }
}