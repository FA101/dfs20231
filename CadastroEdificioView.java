package com.example.application.views.edificio;

import com.example.application.models.EdificioModel;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

import java.awt.*;

@Route(value = "cadastro-edificio")
public class CadastroEdificioView extends VerticalLayout {
    private TextField edificioNome;
    private TextField enderecoNome;

    public CadastroEdificioView() {
        createForm();
        Button button = new Button("Salvar");
        button.addClickListener(e -> cadastrarEdificio());
        add(button);
    }

    private void cadastrarEdificio(){
        EdificioModel edificioModel = new EdificioModel();
        edificioModel.setName(edificioNome.getValue());
        edificioModel.setAddress(enderecoNome.getValue());
        Notification.show("Edificio salvo" + edificioModel);
    }

    private void createForm(){
        FormLayout formLayout = new FormLayout();
        edificioNome = new TextField("Nome do edificio");
        enderecoNome = new TextField("Endereco do edificio");
        formLayout.add(edificioNome, enderecoNome);
        add(formLayout);
    }

}
