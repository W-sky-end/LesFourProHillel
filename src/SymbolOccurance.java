public class SymbolOccurance {


    public static int findSymbolOccurance(String str, char symbol) {
        int count = 0;
        for(char currentChar : str.toCharArray()){
            if(currentChar == symbol){
                count++;
            }
        }
        return count;
    }
}
