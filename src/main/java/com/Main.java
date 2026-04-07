package com;

public class Main {
    public static void main(String[] args) {
        로봇오리 a로봇오리 = new 로봇오리();
        a로봇오리.날다();
        // 출력 : 저는 못 날아요 ㅠㅠ
        a로봇오리.수영하다();
        // 출력 : 물갈퀴로 수영합니다.

        // 이런식으로 유연하게 객체의 행동양식을 런타임에 변경할 수 있다.
        a로봇오리.set비행아이템(new 날개비행아이템());
        a로봇오리.날다();
    }
}

interface  아이템 {
     void 작동();
}

interface 비행아이템 extends 아이템 {
}

class 못나는비행아이템 implements 비행아이템 {
    @Override
    public void 작동() {
        System.out.println("저는 못 날아요 ㅠㅠ");
    }
}

class 날개비행아이템 implements 비행아이템 {
    @Override
    public void 작동() {
        System.out.println("날개로 날아갑니다.");
    }
}

interface 수영아이템 extends 아이템 {
}

class 둥둥수영아이템 implements 수영아이템 {
    @Override
    public void 작동() {
        System.out.println("물에 둥둥 뜹니다.");
    }
}

class 물갈퀴수영아이템 implements 수영아이템 {
    @Override
    public void 작동() {
        System.out.println("물갈퀴로 수영합니다.");
    }
}

abstract class 오리 {
    private 비행아이템 a비행아이템;
    private 수영아이템 a수영아이템;

    public 오리(비행아이템 a비행아이템, 수영아이템 a수영아이템) {
        this.a비행아이템 = a비행아이템;
        this.a수영아이템 = a수영아이템;
    }

    public void set비행아이템(비행아이템 a비행아이템) {
        this.a비행아이템 = a비행아이템;
    }

    public void 날다() {
        a비행아이템.작동();
    }

    public void 수영하다() {
        a수영아이템.작동();
    }
}

class 고무오리 extends 오리 {
    public 고무오리() {
        super(new 못나는비행아이템(), new 둥둥수영아이템());
    }
}

class 로봇오리 extends 오리 {
    public 로봇오리() {
        super(new 못나는비행아이템(), new 물갈퀴수영아이템());
    }
}