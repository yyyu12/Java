/*
class Foo {
    private int x;

    public Foo(int x) {
        this.x = x;
    }
}

public class Main {
    public static void main(String[] args) {
        Foo obj = new Foo(0);   (1)
        obj = new Foo(10);      (2)
        Foo obj2 = obj;         (3)
        int i = 1;              (4)
        obj2 = new Foo(20);     (5)
    }
}
*/

/*
The memory map is as follows:
(1) Stack: obj(Foo)=Ref1;
    Heap:  Ref1=Foo(0);

(2) Stack: obj(Foo)=Ref2;
    Heap:  Ref2=Foo(10);

(3) Stack: obj(Foo)=Ref2;
           obj2(Foo)=Ref2;
    Heap:  Ref2=Foo(10)

(4) Stack: obj(Foo)=Ref2;
           obj2(Foo)=Ref2;
           i(int)=1;
    Heap:  Ref2=Foo(10);

(5) Stack: obj(Foo)=Ref2;
           obj2(Foo)=Ref3;
           i(int)=1;
    Heap:  Ref2=Foo(10);
           Ref3=Foo(20);
*/

public class Exercise1 {
    
}
