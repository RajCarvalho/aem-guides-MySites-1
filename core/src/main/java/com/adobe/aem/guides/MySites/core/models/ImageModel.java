package com.mysites.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(
    adaptables = Resource.class,
    defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
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