package org.vaadin.addons.taefi.component;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Hr;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class VrView extends VerticalLayout {

    public VrView() {
        add(new HorizontalLayout(
                VaadinIcon.ARROW_CIRCLE_RIGHT.create(),
                Vr.withId("short-vr"),
                VaadinIcon.ARROW_CIRCLE_LEFT.create(),
                new Vr()
        ));

        add(new Hr());

        VerticalLayout leftButtons = new VerticalLayout(
                new Button("Left 1"),
                new Button("Left 2"),
                new Button("Left 3")
        );
        VerticalLayout rightButtons = new VerticalLayout(
                new Button("Right 1"),
                new Button("Right 2"),
                new Button("Right 3")
        );
        add(new HorizontalLayout(leftButtons, Vr.withId("tall-vr"), rightButtons));

        add(new HorizontalLayout(new Button("Foo"), Vr.builder().withId("custom-vr").withColor("rgba(255, 0, 0, 1)").withWidth(5).build(), new Button("Bar")));
    }
}
