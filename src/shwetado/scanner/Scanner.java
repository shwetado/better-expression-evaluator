package shwetado.scanner;

public class Scanner {
    String data;
    int index;

    public Scanner(String expression) {
        this.data = expression;
        this.index = -1;
    }

    public char getNext() throws Exception {
        do index++;
        while (isWhiteSpace());
        return this.data.charAt(index);
    }

    private boolean isWhiteSpace ()throws Exception{
        try{
            return this.data.charAt(index) == ' ';
        }
        catch (StringIndexOutOfBoundsException ex){
            throw new StringIndexOutOfBoundsException("");
        }
    }
}