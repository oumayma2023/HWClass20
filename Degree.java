package HWClass20;

public class Degree {



        void getPrerequisite() {
            System.out.println("To get a high degree you need high diploma");
        }
    }

    class Masters extends Degree{

    }

    class PHD extends Degree {

        @Override
        void getPrerequisite() {
            System.out.println("To get PHD you need to hold Master degree");
        }
    }

