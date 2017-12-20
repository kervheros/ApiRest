package com.ditmarcastro.apirest.AdvancedList;

/**
 * Created by ditmar on 08-08-17.
 * Basic Structure for item List
 */
public class ItemStructure {
    private String title;
    private String description;
    private String imageResource;
    public ItemStructure (String title, String description, String imageResource) {
        this.title = title;
        this.description = description;
        this.imageResource = imageResource;
    }
    public String getTitle () {
        return this.title;
    }
    public String getDescription () {
        return this.description;
    }
    public String getImageResource() {
        return this.imageResource;
    }
    public void setTitle (String title) {
        this.title = title;
    }
    public void setDescription (String description) {
        this.description = description;
    }
    public void setImageResource(String imageResource) {
        this.imageResource = imageResource;
    }
}