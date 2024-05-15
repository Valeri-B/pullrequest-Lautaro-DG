/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package zzjavafx;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.media.AudioClip;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

/**
 * FXML Controller class
 *
 * @author migue
 */
public class VistaController implements Initializable {

    @FXML
    private MediaView video;

    static MediaPlayer reproductorMusica = null;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        File f = new File("src/assets/mundo.mp4");
        MediaPlayer mediaPlayer = new MediaPlayer(new Media(f.toURI().toString()));
        mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
        mediaPlayer.play();
        video.setMediaPlayer(mediaPlayer);
       // reproducirMusica();
        music();

    }

    public void reproducirMusica() {
        File musica = new File("src/assets/undertale.mp3");
        System.out.println(musica.toURI().toString());
        reproductorMusica = new MediaPlayer(new Media(musica.toURI().toString()));
        reproductorMusica.setCycleCount(MediaPlayer.INDEFINITE);
        reproductorMusica.play();
    }

    public void music() {
        File bip =  new File("src/assets/undertale.mp3");
        Media hit = new Media(bip.toURI().toString());
        AudioClip mediaPlayer = new AudioClip(hit.getSource());
        mediaPlayer.play();
    }

    public static void main(String[] args) {
        System.out.println("Carloooos, chivato BOOOM!!");
    }

}
