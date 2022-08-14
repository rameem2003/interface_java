interface Student{
    int roll = 451638;
    void Desplay();
}



class Result implements Student{
    public float Mark;
    public void Desplay(){
        System.out.println("Roll is: " + roll);
    }


    public void Getmark(){
        Mark = 45.45f;
        System.out.println("Mark is: " + Mark);
    }

}

public class App {
    public static void main(String[] args) throws Exception {
        Result obj = new Result();


        obj.Desplay();
        obj.Getmark();

    }
}
