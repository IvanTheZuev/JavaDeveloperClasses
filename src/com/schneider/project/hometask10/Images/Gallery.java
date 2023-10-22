package com.schneider.project.hometask10.Images;

public class Gallery implements Drawable{
    private String name;
    private Drawable[] drawables;

    public Gallery(String name, Drawable[] drawables) {
        this.name = name;
        this.drawables = drawables;
    }

    public Drawable[] getImages(){
        return drawables;
    }

    @Override
    public void draw() {
        System.out.println(name);
        for (Drawable drawable : drawables) {
            drawable.draw();
        }
    }
}
