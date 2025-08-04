package com.innerclass.memberinnerclass;

class OuterParent
{
    private String name="shubham";
    class InnerParent{
        void show(){
            System.out.println(name);
        }
    }
}
class OuterChild extends OuterParent
{
    class InnerChild extends  InnerParent{

    }
}
public class InheritanceDemo
{
    public static void main(String[] args) {

        OuterParent op=new OuterParent();
        OuterParent.InnerParent ip=op.new InnerParent();

        OuterChild oc=new OuterChild();
        OuterChild.InnerChild ic=oc.new  InnerChild();

        OuterParent.InnerParent ip1=oc.new InnerChild();
        OuterParent op2=new OuterChild();
        OuterChild.InnerParent ip3 = oc.new InnerChild();     // inherited InnerParent referenc


    }
}
