package kr.gracelove.designpattern.facade;

public class Facade {

    private FacadeSub01 facadeSub01;
    private FacadeSub02 facadeSub02;
    private FacadeSub03 facadeSub03;


    public Facade() {
        facadeSub01 = new FacadeSub01();
        facadeSub02 = new FacadeSub02();
        facadeSub03 = new FacadeSub03();
    }

    public void process() {
        facadeSub01.process();
        facadeSub02.process();
        facadeSub03.process();
    }
}
