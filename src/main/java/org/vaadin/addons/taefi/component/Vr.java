package org.vaadin.addons.taefi.component;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;

@CssImport("./addons-styles/vr.css")
public class Vr extends Div {

    public Vr() {
        addClassName("vertical-rule");
    }

    private static Vr create(String elementId, String color, Integer widthInPixels) {
        Vr vr = new Vr();
        if (elementId != null) {
            vr.setId(elementId);
        }
        if (color != null) {
            vr.getStyle().set("background-color", color + " !important");
        }
        if (widthInPixels != null) {
            vr.getStyle().set("width", widthInPixels + "px !important");
            vr.getStyle().set("min-width", widthInPixels + "px !important");
            vr.getStyle().set("max-width", widthInPixels + "px !important");
        }
        return vr;
    }

    public static Vr build() {
        return new Vr();
    }

    public static VrBuilder builder() {
        return new VrBuilder();
    }

    public static Vr withId(String elementId) {
        return new VrBuilder().withId(elementId).build();
    }

    public static Vr withColor(String color) {
        return new VrBuilder().withColor(color).build();
    }

    public static Vr withWidth(int width) {
        return new VrBuilder().withWidth(width).build();
    }

    public static class VrBuilder {

        private String elementId;
        private String color;
        private int width;

        private VrBuilder() {
        }

        public VrBuilder withId(String elementId) {
            this.elementId = elementId;
            return this;
        }

        public VrBuilder withColor(String color) {
            this.color = color;
            return this;
        }

        public VrBuilder withWidth(int pixels) {
            this.width = pixels;
            return this;
        }

        public Vr build() {
            return create(elementId, color, width <= 0 ? null : width);
        }
    }
}
