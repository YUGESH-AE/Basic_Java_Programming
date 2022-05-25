package Java_Fundamentals.Enum.eg1;

public class Bank {

    enum Designations{
        CEO(20),GENERALMANAGER(10),CLERK(1),ACCOUNTANT(5),BRANCHMANAGER(8);

        private int id;
        private Designations(int id){
            this.id=id;
        }

        public int getId() {
            return id;
        }
    }
    public void role(Designations designations){
        switch (designations){
            case CEO:
                System.out.println(Designations.CEO.getId());break;
            case CLERK:
                System.out.println(Designations.CLERK.getId());break;
            case ACCOUNTANT:
                System.out.println(Designations.ACCOUNTANT.getId());break;
            case BRANCHMANAGER:
                System.out.println(Designations.BRANCHMANAGER.getId());break;
            case GENERALMANAGER:
                System.out.println(Designations.GENERALMANAGER.getId());break;
        }
    }
}

class Demo1{
    public static void main(String[] args) {
        Bank a=new Bank();
        a.role(Bank.Designations.CEO);
    }
}