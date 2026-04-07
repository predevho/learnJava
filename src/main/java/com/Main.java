package com;

public class Main {
    public static void main(String[] args) {
        로봇오리 a로봇오리 = new 로봇오리();
        a로봇오리.날다();
        // 출력 : 저는 못 날아요 ㅠㅠ
        a로봇오리.수영하다();
        // 출력 : 물갈퀴로 수영합니다.

        사이버오리 a사이버오리=new 사이버오리();
        a사이버오리.날다();
        // 출력 : 날아서 이동합니다.
        a사이버오리.수영하다();
        // 출력 : 물에 둥둥뜨다.
    }
}

class 오리 {
    비행아이템 a비행아이템;
    수영아이템 a수영아이템;

    오리(){
        a비행아이템 = new 날다아이템();
        a수영아이템 = new 물갈퀴수영아이템();
    }

    void 날다() {
        a비행아이템.작동();
    }

    void 수영하다() {
        a수영아이템.작동();
    }
}

class 고무오리 extends 오리 {
    고무오리() {
        a비행아이템 = new 못나는아이템();
        a수영아이템 = new 둥둥뜨는수영아이템();
    }
}

class 로봇오리 extends 오리 {
   로봇오리() {
       a비행아이템 = new 못나는아이템();
       a수영아이템 = new 물갈퀴수영아이템();
   }
}

class 사이버오리 extends 오리{
    사이버오리() {
        a비행아이템 = new 날다아이템();
        a수영아이템 = new 둥둥뜨는수영아이템();
    }
}

abstract class 비행아이템{
    abstract void 작동();
}

abstract class 수영아이템{
    abstract void 작동();
}

class 물갈퀴수영아이템 extends 수영아이템{
    @Override
    void 작동() {
        System.out.println("물갈퀴로 수영합니다.");
    }
}
class 둥둥뜨는수영아이템 extends 수영아이템{
    @Override
    void 작동() {
        System.out.println("둥둥 떠서 수영합니다.");
    }
}

class 날다아이템 extends 비행아이템{
    @Override
    void 작동() {
        System.out.println("날아서 이동합니다.");
    }
}
class 못나는아이템 extends 비행아이템{
    @Override
    void 작동() {
        System.out.println("저는 못 날아요 ㅠㅠ");
    }
}