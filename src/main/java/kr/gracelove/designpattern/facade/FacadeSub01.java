package kr.gracelove.designpattern.facade;

public class FacadeSub01 {

    public FacadeSub01() {
        System.out.println("Call Constructor : " + getClass().getSimpleName());
    }

    public void process() {
        System.out.println("Call Process : " + getClass().getSimpleName());
    }
}
