package main.java.conversationsChat;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

/**
 * Created by uditha on 3/3/2017.
 */
public class ChatController implements Initializable {
    @FXML private ImageView userImageView;
    @FXML private ListView userList;
    @FXML private Label onlineCountLabel;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            setImageLabel();
            setUserList();
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

    //view the online users in the side bar ----------------------------------------------------------------------------
    public void setUserList() {

        User user = setOnlineUsers();
        List<User> list = new ArrayList<User>();
        list.add(user);

        ObservableList<User> users = FXCollections.observableList(list);
        userList.setItems(users);
        userList.setCellFactory(new UserList());
        setOnlineLabel("1");
    }

    public User setOnlineUsers(){
        User user = new User();
        user.setName("Nina Dobrev");
        user.setPicture("NinaDobrev");
        user.setStatus(Status.ONLINE);

        return  user;
    }

    public void setOnlineLabel(String usercount) {
        Platform.runLater(() -> onlineCountLabel.setText(usercount));
    }
    //------------------------------------------------------------------------------------------------------------------
}
