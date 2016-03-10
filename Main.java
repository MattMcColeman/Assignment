import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.*;
import javafx.scene.input.KeyCombination;
import javafx.scene.image.*;
import javafx.collections.*;
import javafx.event.*;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.cell.*;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;

public class Main extends Application {
    private Stage window;
    private Scene scene, sceneIntro;
    private BorderPane layout;
    private TableView<Student> table;
    private TextField sidField, fnameField, lnameField, gpaField;

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Spam Master v1.869.2754");

        /* create the menu (for the top of the user interface) */
        Menu fileMenu = new Menu("File");
        MenuItem newMenuItem = new MenuItem("New", imageFile("images/new.png"));
        newMenuItem.setAccelerator(KeyCombination.keyCombination("Ctrl+N"));
        fileMenu.getItems().add(newMenuItem);
        fileMenu.getItems().add(new SeparatorMenuItem());
        fileMenu.getItems().add(new MenuItem("Open...", imageFile("images/open.png")));
        fileMenu.getItems().add(new SeparatorMenuItem());
        fileMenu.getItems().add(new MenuItem("Save", imageFile("images/save.png")));
        fileMenu.getItems().add(new MenuItem("Save As...", imageFile("images/save_as.png")));
        fileMenu.getItems().add(new SeparatorMenuItem());
        MenuItem exitMenuItem = new MenuItem("Exit", imageFile("images/exit.png"));
        fileMenu.getItems().add(exitMenuItem);
        exitMenuItem.setAccelerator(KeyCombination.keyCombination("Ctrl+Q"));
        exitMenuItem.setOnAction( e -> System.exit(0) );

        Menu editMenu = new Menu("Edit");
        editMenu.getItems().add(new MenuItem("Cut", imageFile("images/cut.png")));
        editMenu.getItems().add(new MenuItem("Copy", imageFile("images/copy.png")));
        editMenu.getItems().add(new MenuItem("Paste", imageFile("images/paste.png")));

        Menu helpMenu = new Menu("Help");
        helpMenu.getItems().add(new MenuItem("About...", imageFile("images/about.png")));
        helpMenu.getItems().add(new SeparatorMenuItem());
        helpMenu.getItems().add(new MenuItem("Help...", imageFile("images/help.png")));

        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().add(fileMenu);
        menuBar.getMenus().add(editMenu);
        menuBar.getMenus().add(helpMenu);

        /* create the table (for the center of the user interface) */
        table = new TableView<>();
        table.setItems(DataSource.getAllStudents());
        table.setEditable(true);

        /* create the table's columns */
        TableColumn<Student,String> sidColumn = null;
        sidColumn = new TableColumn<>("File");
        sidColumn.setMinWidth(250);
        sidColumn.setCellValueFactory(new PropertyValueFactory<>("sid"));

        TableColumn<Student,String> firstNameColumn = null;
        firstNameColumn = new TableColumn<>("Actual Class");
        firstNameColumn.setMinWidth(100);
        firstNameColumn.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        firstNameColumn.setCellFactory(TextFieldTableCell.<Student>forTableColumn());
        firstNameColumn.setOnEditCommit((CellEditEvent<Student, String> event) -> {
            ((Student)event.getTableView().getItems().get(event.getTablePosition().getRow())).setFirstName(event.getNewValue());
        });

        TableColumn<Student,Double> gpaColumn = null;
        gpaColumn = new TableColumn<>("Spam Probability");
        gpaColumn.setMinWidth(250);
        gpaColumn.setCellValueFactory(new PropertyValueFactory<>("gpa"));

        table.getColumns().add(sidColumn);
        table.getColumns().add(firstNameColumn);
        table.getColumns().add(gpaColumn);

        /* create an edit form (for the bottom of the user interface) */
        GridPane editArea = new GridPane();
        editArea.setPadding(new Insets(10, 10, 10, 10));
        editArea.setVgap(10);
        editArea.setHgap(10);

        Label gpaLabel = new Label("Accuracy:");
        editArea.add(gpaLabel, 0,1);
        TextField gpaField = new TextField();
        gpaField.setPromptText("Accuracy");
        editArea.add(gpaField, 1, 1);

        Label accLabel = new Label("Precision");
        editArea.add(accLabel, 0, 2);
        TextField accField = new TextField();
        accField.setPromptText("Precision");
        editArea.add(accField, 1, 2);

        Button addButton = new Button("Add");
        addButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                String sid = sidField.getText();
                String firstName = fnameField.getText();
                double gpa = Double.parseDouble(gpaField.getText());
                double acc = Double.parseDouble(accField.getText());

                table.getItems().add(new Student(sid, firstName, gpa));

                sidField.setText("");
                fnameField.setText("");
                gpaField.setText("");
                accField.setText("");
            }
        });
        editArea.add(addButton, 1, 4);

        /* arrange all components in the main user interface */
        layout = new BorderPane();
        layout.setTop(menuBar);
        layout.setCenter(table);
        layout.setBottom(editArea);

        Label label1 = new Label("Welcome to the first scene!");
        Button button1 = new Button("Go to scene 2");
        button1.setOnAction(e -> primaryStage.setScene(scene));

        //Layout 1 - children are laid out in vertical column
        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label1, button1);
        sceneIntro = new Scene(layout1, 600, 600);


        scene = new Scene(layout, 600, 600);
        primaryStage.setScene(sceneIntro);
        primaryStage.show();
    }

    private ImageView imageFile(String filename) {
        return new ImageView(new Image("file:"+filename));
    }

    public static void main(String[] args) {
        launch(args);
    }
}
