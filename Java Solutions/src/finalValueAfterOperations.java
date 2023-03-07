public class finalValueAfterOperations {
    public static void main(String[] args) {
        String[] operations = new String[]{"--X","X++","X++"};
        System.out.println(finalValueAfterOperations(operations));
    }

    //solution to Final Value of Variable After Performing Operations
    public static int finalValueAfterOperations(String[] operations){
        int ans = 0;

        for ( int i =0; i < operations.length; i++){
            if ( operations[i].contains("+") ){
                ans++;
            }
            if ( operations[i].contains("-") ) {
                ans--;
            }
        }
        return ans;
    }
}
