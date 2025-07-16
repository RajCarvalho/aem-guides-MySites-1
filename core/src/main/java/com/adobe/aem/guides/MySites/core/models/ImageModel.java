package com.adobe.aem.guides.MySites.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(

    adaptables = SlingHttpServletRequest.class,
    defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,
    resourceType="MySites/components/frame")
@Exporter(name="jackson", extensions="json",
    selector="image")

public class ImageModel {

    @ValueMapValue
    private String description;

    @ValueMapValue
    private String image;

    public String getDescription() {
        return description;
    }

    public String getImage() {
        return image;
    }
}