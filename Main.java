public class Main {
    public static void main(String[] args) {
       Menu TestMenu = new Menu();

       Item[][] test = TestMenu.getMenu();

       for(int i=0; i < 5; i++) {
           for(int j=0; j < 4; j++) {
               System.out.println(test[i][j].getName());
           }
       }



    }
}
