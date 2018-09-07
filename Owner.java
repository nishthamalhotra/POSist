import java.util.*;

public class Owner{
    
    int ownerId;
    String ownerName;
    float record;
    
    public Owner(int ownerId,String ownerName){
        this.ownerId=ownerId;
        this.ownerName=ownerName;
    }
    private String Encrypt(String data){
        
        data=data+ownerName.substring(0,3);
        return data;
        
    }
    private String Decrypt(String data){
        
         int l=data.length();
         data=data.substring(0,l-3);
         return data;
    }
    public static void main(String[] args){
        
    }
}
