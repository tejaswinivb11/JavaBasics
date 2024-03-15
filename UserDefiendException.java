public class UserDefiendException extends Exception{
    UserDefiendException(String msg){
        super(msg);
    }
}
class Even{
    public static void main(String[] args) {
        int n = 3;
        try{
            int r =n%2;
            if (r!=0){
                throw new UserDefiendException("its not a even number");
            }
        }
        catch(UserDefiendException e){
            System.out.println(e.getMessage());
        }
    }
}