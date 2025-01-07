public class App {
    public static void main(String[] args) throws Exception {
        // This is a 1d array
        int myarray[] = {1,2,3,4,5};
        System.out.println(myarray[2]);

        // for loop to print EVERYTHING from array using index
        for (int i = 0; i < myarray.length; i++){
            System.out.println(myarray[i]);

        }

        int myaraaay2[][] = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(myaraaay2[1][2]);
        System.out.println(myaraaay2[2][1]);


        int myarray3[][][] = {{{1,2,3},{4,5,6}},{{7,8,9},{10,11,12}},{{13,14,15},{16,17,18}}};
        System.out.println(myarray3[1][0][1]);

        //declaring the array with 6 items

        int array4[] = new int[6];
        
        // intializing the array
        array4[0] = 1;
        array4[1] = 2;
        array4[2] = 3;
        array4[3] = 4;
        array4[4] = 5;
        array4[5] = 6;

        for (int i = 0; i<array4.length; i++){
            System.out.println(array4[i]);
            
        }


        
        

    }
}
