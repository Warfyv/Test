package com.company;

import java.util.Locale;

public class Vector2D {
    double vX, vY, lenght;
    public static int count = 0;


    public Vector2D(){
        count++;
        vX = 1;
        vY = 1;
    }
    public Vector2D(double vX, double vY) {
        count++;
        this.vX = vX;
        this.vY = vY;
    }
    public Vector2D(Vector2D vector2D){
        count++;
        vX = vector2D.vX;
        vY = vector2D.vY;
    }

    public void print(){
        System.out.println("(" + String.format(Locale.US, "%.2f", vX) + ", " + String.format(Locale.US, "%.2f", vY) + ")");
    }

    public String length(){
        lenght = Math.pow(Math.pow(vX, 2) + Math.pow(vY, 2), 0.5);

        return String.format("%.6f", lenght);
    }

    public void add(Vector2D v){
        vX += v.vX;
        vY += v.vY;
    }
    public void sub(Vector2D v){
        vX -= v.vX;
        vY -= v.vY;
    }
    public void scale(double scaleFactor){
        vX *= scaleFactor;
        vY *= scaleFactor;
    }
    public void normalized(){
        double lenght = Math.pow(Math.pow(vX, 2) + Math.pow(vY, 2), 0.5);
        vX = vX / lenght;
        vY = vY / lenght;
    }
    public double dotProduct(Vector2D v){
        double dot = vX * v.vX + vY * v.vY;

        return dot;
    }
}
