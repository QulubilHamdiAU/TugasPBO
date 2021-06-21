package com.Praktikum6;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        primaryStage.setTitle("Praktikum 6 PBO");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Button btn = new Button("Tambah");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_LEFT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 9);

        Scene scene = new Scene(grid, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();

        Text title = new Text("Gaji Perusahaan");
        title.setFont(Font.font("Tahoma", FontWeight.NORMAL, 16));
        grid.add(title, 0, 0, 2, 1);

        Label nomer = new Label("NIM:");
        grid.add(nomer, 0, 1);

        TextField nim = new TextField();
        nim.setPromptText("Masukkan Disini");
        grid.add(nim, 1, 1);

        Label nama = new Label("Nama:");
        grid.add(nama, 0, 2);

        TextField name = new TextField();
        name.setPromptText("Masukkan Disini");
        grid.add(name,1,2);

        Label Fak = new Label("Fakultas:");
        grid.add(Fak, 0, 3);

        TextField fakultas = new TextField();
        fakultas.setPromptText("Masukkan Disini");
        grid.add(fakultas, 1, 3);

        Label Jur = new Label("Jurusan:");
        grid.add(Jur, 0, 4);

        TextField jurusan = new TextField();
        jurusan.setPromptText("Masukkan Disini");
        grid.add(jurusan, 1, 4);

        Label Add = new Label("Alamat:");
        grid.add(Add, 0, 5);

        TextField alamat = new TextField();
        alamat.setPromptText("Masukkan Disini");
        grid.add(alamat, 1, 5);

        Label Kot = new Label("Kota:");
        grid.add(Kot, 0, 6);

        TextField kota = new TextField();
        kota.setPromptText("Masukkan Disini");
        grid.add(kota, 1, 6);

        Label Hob = new Label("Hobby:");
        grid.add(Hob, 0, 7);

        TextField hobi = new TextField();
        hobi.setPromptText("Masukkan Disini");
        grid.add(hobi, 1, 7);

        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                String NIM = nim.getText();
                String NAMA = name.getText();
                String FAKULTAS = fakultas.getText();
                String JURUSAN = jurusan.getText();
                String ALAMAT = alamat.getText();
                String KOTA = kota.getText();
                String HOBBY = hobi.getText();

                if (NIM.matches("[0-9]+")&& NIM.length()==15) {
                    systemInformation("Notification", "Success!", "Data Telah Ditambahkan");
                    GridPane gridPane = new GridPane();
                    gridPane.setAlignment(Pos.CENTER);
                    gridPane.setVgap(10);


                    Text title1 = new Text("Form Biodata");
                    title1.setFont(Font.font("Tahoma", FontWeight.NORMAL, 16));
                    gridPane.add(title1, 0, 0, 2, 1);


                    Label nim1 = new Label("NIM");
                    nim1.setFont(Font.font("Times New Roman", FontWeight.NORMAL,14));
                    gridPane.add(nim1,0,1);
                    Text nim2 =new Text(" :   "+NIM);
                    gridPane.add(nim2,1,1);

                    Label nama1 = new Label("Nama");
                    nama1.setFont(Font.font("Times New Roman", FontWeight.NORMAL,14));
                    gridPane.add(nama1,0,2);
                    Text nama2 =new Text(" :   "+NAMA);
                    gridPane.add(nama2,1,2);

                    Label fakultas1 = new Label("Fakultas");
                    fakultas1.setFont(Font.font("Times New Roman", FontWeight.NORMAL,14));
                    gridPane.add(fakultas1,0,3);
                    Text fakultas2 =new Text(" :   "+FAKULTAS);
                    gridPane.add(fakultas2,1,3);

                    Label jurusan1 = new Label("Jurusan");
                    jurusan1.setFont(Font.font("Times New Roman", FontWeight.NORMAL,14));
                    gridPane.add(jurusan1,0,4);
                    Text jurusan2 =new Text(" :   "+JURUSAN);
                    gridPane.add(jurusan2,1,4);

                    Label alamat1 = new Label("Alamat");
                    alamat1.setFont(Font.font("Times New Roman", FontWeight.NORMAL,14));
                    gridPane.add(alamat1,0,5);
                    Text alamat2 =new Text(" :   "+ALAMAT);
                    gridPane.add(alamat2,1,5);

                    Label kota1 = new Label("Kota");
                    kota1.setFont(Font.font("Times New Roman", FontWeight.NORMAL,14));
                    gridPane.add(kota1,0,6);
                    Text kota2 =new Text(" :   "+KOTA);
                    gridPane.add(kota2,1,6);

                    Label hobby1 = new Label("Hobby");
                    hobby1.setFont(Font.font("Times New Roman", FontWeight.NORMAL,14));
                    gridPane.add(hobby1,0,7);
                    Text hobby2 =new Text(" :   "+HOBBY);
                    gridPane.add(hobby2,1,7);


                    Button Back= new Button("Back");
                    gridPane.add(Back,1,10);

                    Back.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent event) {
                            start(primaryStage);
                        }
                    });

                    Scene scene1 = new Scene(gridPane,500,500);
                    primaryStage.setScene(scene1);
                    primaryStage.show();

                } else {
                    systemWarning("Warning", "ERROR!", "NIM HARUS BERUPA ANGKA & HARUS 15 DIGIT!!");
                }
            }
        });
        primaryStage.show();
    }

    public void systemInformation(String title, String header, String isi) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(isi);
        alert.showAndWait();
    }

    public void systemWarning(String title, String header, String isi) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(isi);
        alert.showAndWait();
    }
}
