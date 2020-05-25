package edu.hust.soict.cbls.entity;

public class Point {

    private int idx;
    private double x;
    private double y;

    public Point(int index, double x, double y){
        this.idx = index;
        this.x = x;
        this.y = y;
    }

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double distance(Point other){
        return Math.sqrt(Math.pow(this.x - other.getX(), 2) + Math.pow(this.y - other.getY(), 2));
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public int getIdx() {
        return idx;
    }

    public localsearch.domainspecific.vehiclerouting.vrp.entities.Point lol(){
        localsearch.domainspecific.vehiclerouting.vrp.entities.Point p = new localsearch.domainspecific.vehiclerouting.vrp.entities.Point();

        return p;
    }
}
