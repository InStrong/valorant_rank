package com.example.valorant_rank;

import com.example.valorant_rank.Service.MmrService;
import com.example.valorant_rank.rest.Data;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.NotificationVariant;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

import java.util.Collections;

@Route(value = "")
public class MmrList extends VerticalLayout {

    public MmrList(MmrService mmrService) {
        this.setAlignItems(Alignment.CENTER);
        var grid = new Grid<Data>(Data.class);

        HorizontalLayout h = new HorizontalLayout();
        TextField name = new TextField();
        TextField tag = new TextField();
        Button button = new Button("get rank");
        name.setPlaceholder("Riot ID");
        tag.setPlaceholder("Riot tag");
        h.add(name, tag, button);

        add(h);
        add(grid);
        button.addClickListener(e -> {
            if (mmrService.getMmrData(name.getValue(), tag.getValue()) == null) {
                Notification notification = new Notification();
                notification.addThemeVariants(NotificationVariant.LUMO_ERROR);
                notification.setPosition(Notification.Position.MIDDLE);
                notification.setDuration(2000);
                notification.setText("User not found");
                notification.open();
                grid.setItems(Collections.emptyList());
            }
            else {
                Data test = mmrService.getMmrData(name.getValue(), tag.getValue()).getData();
                grid.setItems(test);
            }
        });
    }
}
