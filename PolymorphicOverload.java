class TypeA{
    public String toString(){
        return "A";
    }
}

class TypeB extends TypeA{
    public String toString(){
        return "B";
    }
}


class TypeC extends TypeB{
    public String toString(){
        return "C";
    }
}

public class PolymorphicOverload{

    public void foo(TypeA a1, TypeA a2){
        System.out.println("foo1: " + a1 + " " +a2);
    }

    public void foo(TypeA a, TypeB b){
        System.out.println("foo2: " + a + " " +b);
    }

    public static void main(String args[]){
        PolymorphicOverload p = new PolymorphicOverload();

        TypeB a = new TypeC();
        p.foo(new TypeA(), a);
        //foo1 or foo2? 
    }

}
