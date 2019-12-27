package kr.gracelove.designpattern.facade;

public class FacadeSub03 {

    public FacadeSub03() {
        System.out.println("Call Constructor : " + getClass().getSimpleName());
    }

    public void process() {
        System.out.println("Call Process : " + getClass().getSimpleName());
    }
}
