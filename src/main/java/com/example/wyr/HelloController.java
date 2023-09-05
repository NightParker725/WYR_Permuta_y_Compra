package com.example.wyr;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private Button BTN1;

    @FXML
    private Button BTN2;

    @FXML
    private ImageView IMG1;

    @FXML
    private ImageView IMG2;

    @FXML
    private Label LB1;

    @FXML
    private Label LB2;

    @FXML
    private Label LBScore;

    boolean selection = false;
    Bienes bienes = new Bienes();

    Bien bien1;
    Bien bien2;
    int points = 0;
    int counter = 0;
    @FXML
    void select1(MouseEvent e){
        if(bien1.getValue() >= bien2.getValue() && BTN1.getText().equalsIgnoreCase("Comprar opcion 2")){
            IMG1.setImage(bien2.getImg());
            LB1.setText(bien2.getName());
            bien1 = bien2;
            do { bien2 = bienes.chooseBien();} while (bien2 == null);
            IMG2.setImage(bien2.getImg());
            LB2.setText(bien2.getName());
            BTN1.setText("Comprar opcion 2");
            BTN2.setText("Permutar por opcion 2");
            points++;
            counter++;
            LBScore.setText( "PUNTAJE " + points + "/5");
            return;
        }
        if(bien1.getValue() <= bien2.getValue() && BTN1.getText().equalsIgnoreCase("Comprar opcion 1")){
            IMG1.setImage(bien1.getImg());
            LB1.setText(bien1.getName());
            bien1 = bien1;
            do { bien2 = bienes.chooseBien();} while (bien2 == null);
            IMG2.setImage(bien2.getImg());
            LB2.setText(bien2.getName());
            BTN1.setText("Comprar opcion 2");
            BTN2.setText("Permutar por opcion 2");
            points++;
            counter++;
            LBScore.setText( "PUNTAJE " + points + "/5");
            return;
        }
        if(bien2.getValue() >= bien1.getValue() && BTN1.getText().equalsIgnoreCase("Permutar por opcion 2")){
            IMG1.setImage(bien2.getImg());
            LB1.setText(bien2.getName());
            bien1 = bien2;
            do { bien2 = bienes.chooseBien();} while (bien2 == null);
            IMG2.setImage(bien2.getImg());
            LB2.setText(bien2.getName());
            BTN1.setText("Comprar opcion 2");
            BTN2.setText("Permutar por opcion 2");
            points++;
            counter++;
            LBScore.setText( "PUNTAJE " + points + "/5");
            return;
        }
        if(bien2.getValue() <= bien1.getValue() && BTN1.getText().equalsIgnoreCase("Permutar por opcion 1")){
            IMG1.setImage(bien1.getImg());
            LB1.setText(bien1.getName());
            bien1 = bien1;
            do { bien2 = bienes.chooseBien();} while (bien2 == null);
            IMG2.setImage(bien2.getImg());
            LB2.setText(bien2.getName());
            BTN1.setText("Comprar opcion 2");
            BTN2.setText("Permutar por opcion 2");
            points++;
            counter++;
            LBScore.setText( "PUNTAJE " + points + "/5");
            return;
        }
        else{ points--; LBScore.setText( "PUNTAJE " + points + "/5");
        counter++;}
    }

    @FXML
    void select2(MouseEvent e){
        if (counter == 5) {LBScore.setText("Se ha acabado el juego! Tu puntaje es: " + points); IMG1.setImage(null); IMG2.setImage(null); LB1.setText(""); LB2.setText(""); return;}
        if(bien2.getValue() >= bien1.getValue() && BTN2.getText().equalsIgnoreCase("Comprar opcion 1")){
            IMG2.setImage(bien1.getImg());
            LB2.setText(bien1.getName());
            bien2 = bien1;
            do { bien1 = bienes.chooseBien();} while (bien1 == null);
            IMG1.setImage(bien1.getImg());
            LB1.setText(bien1.getName());
            BTN2.setText("Comprar opcion 1");
            BTN1.setText("Permutar por opcion 1");
            points++;
            counter++;
            LBScore.setText( "PUNTAJE " + points + "/5");
        }
        if(bien2.getValue() <= bien1.getValue() && BTN2.getText().equalsIgnoreCase("Comprar opcion 2")){
            IMG2.setImage(bien2.getImg());
            LB2.setText(bien2.getName());
            bien2 = bien2;
            do { bien1 = bienes.chooseBien();} while (bien1 == null);
            IMG1.setImage(bien1.getImg());
            LB1.setText(bien1.getName());
            BTN2.setText("Comprar opcion 1");
            BTN1.setText("Permutar por opcion 1");
            points++;
            counter++;
            LBScore.setText( "PUNTAJE " + points + "/5");
        }
        if(bien1.getValue() >= bien2.getValue() && BTN2.getText().equalsIgnoreCase("Permutar por opcion 1")){
            IMG2.setImage(bien1.getImg());
            LB2.setText(bien1.getName());
            bien2 = bien1;
            do { bien1 = bienes.chooseBien();} while (bien1 == null);
            IMG1.setImage(bien1.getImg());
            LB1.setText(bien1.getName());
            BTN2.setText("Comprar opcion 1");
            BTN1.setText("Permutar por opcion 1");
            points++;
            counter++;
            LBScore.setText( "PUNTAJE " + points + "/5");
        }
        if(bien1.getValue() <= bien2.getValue() && BTN2.getText().equalsIgnoreCase("Permutar por opcion 2")){
            IMG2.setImage(bien2.getImg());
            LB2.setText(bien2.getName());
            bien2 = bien2;
            do { bien1 = bienes.chooseBien();} while (bien1 == null);
            IMG1.setImage(bien1.getImg());
            LB1.setText(bien1.getName());
            BTN2.setText("Comprar opcion 1");
            BTN1.setText("Permutar por opcion 1");
            points++;
            counter++;
            LBScore.setText( "PUNTAJE " + points + "/5");
        }
        else{ points--; LBScore.setText( "PUNTAJE " + points + "/5");
            counter++;
        }
    }

    @FXML
    void generateImages(){
        do { bien1 = bienes.chooseBien();} while (bien1 == null);
        IMG1.setImage(bien1.getImg());
        LB1.setText(bien1.getName());
        BTN1.setText("Comprar opcion 1");
        if(bienes.getBienes().size() != 0 && bien1 != null) bienes.getBienes().remove(bien1);
        do { bien2 = bienes.chooseBien();} while (bien2 == null);
        IMG2.setImage(bien2.getImg());
        LB2.setText(bien2.getName());
        BTN2.setText("Comprar opcion 2");
        if(bienes.getBienes().size() != 0 && bien1 != null) bienes.getBienes().remove(bien2);

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Image img1 = new Image("https://www.elcarrocolombiano.com/wp-content/uploads/2021/02/Diseno-sin-titulo-3.jpg", 500,500,true,true);
        Bien vehiculo = new Bien(165500000, "Carro Deportivo de lujo", img1);
        bienes.getBienes().add(vehiculo);
        Image img2 = new Image("https://d31dn7nfpuwjnm.cloudfront.net/images/valoraciones/0038/2704/cuanto_es_la_cuota_inicial_de_un_apartamento_en_colombia.jpg?1590571291", 500,500,true,true);
        Bien apartamento = new Bien(297300000, "Apartamento Promedio", img2);
        bienes.getBienes().add(apartamento);
        Image img3 = new Image("https://tauretcomputadores.com/images/products/Product_20221010120554108327882.PS5%20DIG%20Ang.webp", 500,500,true,true);
        Bien consola = new Bien(3250000, "Consola de Juegos actual", img3);
        bienes.getBienes().add(consola);
        Image img4 = new Image("https://www.bienesonline.com/colombia/photos/venta-de-terreno-para-inversionistas-en-sutamarchan-boyaca--LOV2006741679801358-166.jpg", 500,500,true,true);
        Bien lote = new Bien(1450000000,"Lote de +200m^2", img4);
        bienes.getBienes().add(lote);
        Image img5 = new Image("https://www.hogarymoda.com.co/wp-content/uploads/2023/02/Computador-portatil-HP-14-14dq0500la.jpg", 500,500,true,true);
        Bien portatil = new Bien(2700000, "Portatil de trabajo", img5);
        bienes.getBienes().add(portatil);
        generateImages();
    }
}
