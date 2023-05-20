package com.gabr.corejava;

public class Rectangle {

    private float len;
    private float width;

    public Rectangle(float len, float width) {
        setLen(len);
        setWidth(width);
    }

    public float getLen() {
        return len;
    }

    public float getWidth() {
        return width;
    }

    private void setLen(float len) {
        this.len = len;
    }
    private void setWidth(float width) {
        this.width = width;
    }

    public float square() {
        return len * width;
    }
    public float perimeter() {
        return 2*(len + width);
    }
}
