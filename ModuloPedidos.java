package SistemaGestionFarmaPlus;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;

public class ModuloPedidos {

    
    public static Pane obtenerVista() {
        
     
        VBox pedidos = new VBox(20); 
        pedidos.setStyle("-fx-background-color: #ffffff; -fx-padding: 30;");
        
        Label titulo = new Label("Gestión de Pedidos");
        titulo.setFont(new Font("Segoe UI", 24));
        
        TextField campoCliente = new TextField();
        campoCliente.setPromptText("Nombre del Cliente...");
        
        TextField campoProducto = new TextField();
        campoProducto.setPromptText("Código del Producto...");
        
        pedidos.getChildren().addAll(titulo, campoCliente, campoProducto);
        
        return pedidos;
    }
}