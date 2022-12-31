package org.vaadin.addons.taefi.component;

import com.vaadin.flow.component.html.testbench.DivElement;
import com.vaadin.flow.component.html.testbench.HrElement;
import org.junit.Assert;
import org.junit.Test;


public class VrIT extends AbstractViewTest {

    @Test
    public void vrIsRenderedProperly() {
        DivElement shortVr = $(DivElement.class).id("short-vr");
        Assert.assertNotNull(shortVr);
        Assert.assertEquals("vertical-rule", shortVr.getClassNames().iterator().next());

        DivElement tallVr = $(DivElement.class).id("tall-vr");
        Assert.assertEquals("Default Vr width should be 1px", "1px", tallVr.getCssValue("width"));
        Assert.assertTrue("Default Vr height should span over its layout",
                tallVr.getSize().height > shortVr.getSize().height);
        HrElement hr = $(HrElement.class).first();
        Assert.assertEquals("Default Vr should have the same color as Hr",
                hr.getCssValue("background-color"), tallVr.getCssValue("background-color"));

        DivElement customVr = $(DivElement.class).id("custom-vr");
        Assert.assertEquals("custom Vr color should be red",
                "rgba(255, 0, 0, 1)", customVr.getCssValue("background-color"));
        Assert.assertEquals("custom Vr width should be 5px",
                "5px", customVr.getCssValue("width"));
    }
}
