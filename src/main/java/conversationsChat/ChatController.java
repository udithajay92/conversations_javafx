package main.java.conversationsChat;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by uditha on 3/3/2017.
 */
public class ChatController implements Initializable {
    @FXML
    private ImageView userImageView;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            setImageLabel();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    //set the image of the user for default
    public void setImageLabel() throws IOException {
        this.userImageView.setImage(new Image(getClass().getClassLoader().getResource("main/resources/images/default.png").toString()));
    }

    //set the image of the user for a given user
    public void setImageLabel(String imageName) throws IOException {
        this.userImageView.setImage(new Image(getClass().getClassLoader().getResource("main/resources/images/default.png").toString()));
    }
}
