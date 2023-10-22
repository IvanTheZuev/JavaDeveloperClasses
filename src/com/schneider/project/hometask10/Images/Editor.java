package com.schneider.project.hometask10.Images;

public final class Editor implements Drawable {
    private Drawable drawable;

    public Editor(Gallery[] drawable) {
        setDrawable(drawable);
    }

    public void setDrawable(final Gallery[] drawable) {
        this.drawable = drawable;
    }

    public void show(){
        drawable.draw();
    }

    @Override
    public Editor clone(){
        Gallery[] galleries = new Gallery[galleries.length];
        for (int i = 0; i < galleries.length; i++) {
            galleries[i] = galleries[i].clone();
        }
        return new Editor(galleries);
    }

    @Override
    public void draw() {
        System.out.println(drawable);
    }
}
