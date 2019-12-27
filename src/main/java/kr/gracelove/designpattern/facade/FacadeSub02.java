package kr.gracelove.designpattern.facade;

public class FacadeSub02 {

    public FacadeSub02() {
        System.out.println("Call Constructor : " + getClass().getSimpleName());
    }

    public void process() {
        System.out.println("Call Process : " + getClass().getSimpleName());
    }
}
